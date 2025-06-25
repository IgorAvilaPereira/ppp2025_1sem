# JUnit 5 + Mockito

---

## 🏗️ Exemplo de Projeto

### Cenário:

Temos um sistema que gerencia usuários.

* `UsuarioService`: contém a lógica de negócios.
* `UsuarioRepository`: interface de acesso aos dados (simulada com Mockito).
* Vamos testar se `UsuarioService` está funcionando corretamente.

---

### 🧩 1. Modelo de Usuário

```java
public class Usuario {
    private Long id;
    private String nome;
    
    // Construtor, Getters e Setters
    public Usuario(Long id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Long getId() { return id; }
    public String getNome() { return nome; }
}
```

---

### 📂 2. Interface de Repositório (mockado)

```java
public interface UsuarioRepository {
    Usuario buscarPorId(Long id);
}
```

---

### 💼 3. Serviço a ser testado

```java
public class UsuarioService {
    private UsuarioRepository repo;

    public UsuarioService(UsuarioRepository repo) {
        this.repo = repo;
    }

    public String buscarNomeDoUsuario(Long id) {
        Usuario usuario = repo.buscarPorId(id);
        if (usuario == null) {
            throw new RuntimeException("Usuário não encontrado");
        }
        return usuario.getNome();
    }
}
```

---

### ✅ 4. Teste com JUnit 5 + Mockito

```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class UsuarioServiceTest {

    @Test
    void deveRetornarNomeDoUsuarioQuandoIdExistir() {
        // Simula o repositório
        UsuarioRepository repoMock = mock(UsuarioRepository.class);
        when(repoMock.buscarPorId(1L)).thenReturn(new Usuario(1L, "João"));

        // Injeta o mock no serviço
        UsuarioService service = new UsuarioService(repoMock);

        String nome = service.buscarNomeDoUsuario(1L);

        assertEquals("João", nome);
    }

    @Test
    void deveLancarExcecaoQuandoUsuarioNaoExistir() {
        UsuarioRepository repoMock = mock(UsuarioRepository.class);
        when(repoMock.buscarPorId(2L)).thenReturn(null);

        UsuarioService service = new UsuarioService(repoMock);

        Exception excecao = assertThrows(RuntimeException.class, () -> {
            service.buscarNomeDoUsuario(2L);
        });

        assertEquals("Usuário não encontrado", excecao.getMessage());
    }
}
```

---

### 🧰 Dependências para usar JUnit 5 e Mockito (Maven)

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
```

---

## 🧠 O que aprendemos aqui?

* Como **mockar** dependências com Mockito.
* Como testar **fluxos positivos e negativos**.
* Como usar `assertThrows()` para testar exceções.
* Como aplicar boas práticas de **testes unitários reais** em serviços com dependências.

---

