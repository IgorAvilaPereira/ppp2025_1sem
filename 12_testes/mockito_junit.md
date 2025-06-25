## 📦 Ferramenta: Mockito

**Mockito** é o framework mais usado em Java para criar **mocks**, **stubs** e **verificações** de chamadas.

> Você pode usá-lo com **JUnit 5** sem nenhuma complicação.

---

## 🔧 Dependências no `pom.xml`

```xml
<!-- JUnit 5 -->
<dependency>
    <groupId>org.junit.jupiter</groupId>
    <artifactId>junit-jupiter</artifactId>
    <version>5.10.0</version>
    <scope>test</scope>
</dependency>

<!-- Mockito -->
<dependency>
    <groupId>org.mockito</groupId>
    <artifactId>mockito-core</artifactId>
    <version>5.12.0</version>
    <scope>test</scope>
</dependency>

<!-- Mockito com JUnit 5 -->
<dependency>
    <groupId>org.mockito</groupId>
    <artifactId>mockito-junit-jupiter</artifactId>
    <version>5.12.0</version>
    <scope>test</scope>
</dependency>
```

---

# ✅ EXEMPLO 1 – Testando serviço que depende de repositório

### 🎯 Cenário:

Queremos testar um `UsuarioService`, mas **sem acessar banco de dados real**. Então, **mockamos o repositório**.

---

## 🧩 1. Modelo

```java
public class Usuario {
    private Long id;
    private String nome;

    public Usuario(Long id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Long getId() { return id; }
    public String getNome() { return nome; }
}
```

---

## 🧩 2. Interface do repositório

```java
public interface UsuarioRepository {
    Usuario buscarPorId(Long id);
}
```

---

## 🧩 3. Serviço a ser testado

```java
public class UsuarioService {
    private final UsuarioRepository repo;

    public UsuarioService(UsuarioRepository repo) {
        this.repo = repo;
    }

    public String saudacao(Long id) {
        Usuario usuario = repo.buscarPorId(id);
        if (usuario == null) {
            return "Usuário não encontrado";
        }
        return "Olá, " + usuario.getNome();
    }
}
```

---

## 🧪 4. Teste com Mockito

```java
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class UsuarioServiceTest {

    @Mock
    UsuarioRepository repo;

    @InjectMocks
    UsuarioService service;

    @Test
    void deveRetornarSaudacaoParaUsuarioExistente() {
        // Arrange
        Usuario maria = new Usuario(1L, "Maria");
        when(repo.buscarPorId(1L)).thenReturn(maria);

        // Act
        String resultado = service.saudacao(1L);

        // Assert
        assertEquals("Olá, Maria", resultado);
    }

    @Test
    void deveRetornarMensagemParaUsuarioNaoEncontrado() {
        when(repo.buscarPorId(99L)).thenReturn(null);

        String resultado = service.saudacao(99L);

        assertEquals("Usuário não encontrado", resultado);
    }

    @Test
    void deveVerificarSeMetodoFoiChamado() {
        service.saudacao(1L);
        verify(repo).buscarPorId(1L); // verifica se o método foi chamado
    }
}
```

---

## 🧠 Conceitos usados com Mockito

| Método                      | O que faz                                          |
| --------------------------- | -------------------------------------------------- |
| `@Mock`                     | Cria um mock de uma interface ou classe            |
| `@InjectMocks`              | Injeta os mocks nas dependências da classe testada |
| `when(...).thenReturn(...)` | Define o valor simulado de retorno                 |
| `verify(...)`               | Verifica se um método foi chamado                  |

---

# ✅ EXEMPLO 2 – Mock com exceções

```java
@Test
void deveLancarExcecaoSeRepositorioFalhar() {
    when(repo.buscarPorId(1L)).thenThrow(new RuntimeException("Falha de conexão"));

    RuntimeException e = assertThrows(RuntimeException.class, () -> {
        service.saudacao(1L);
    });

    assertEquals("Falha de conexão", e.getMessage());
}
```

---

## ⚠️ Dica: Quando usar mocks?

Use mocks quando a unidade testada:

* Depende de banco, arquivos ou rede
* Consome serviços externos
* Depende de lógica complexa que já foi testada separadamente
* Precisa simular comportamento fora do seu controle

---

