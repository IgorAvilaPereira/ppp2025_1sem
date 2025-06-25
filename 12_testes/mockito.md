
## 🧪 O que é o **Mockito**?

**Mockito** é uma **ferramenta (framework)** para **criar objetos falsos (mocks)** em testes unitários, permitindo simular o comportamento de dependências externas (como repositórios, APIs, serviços, etc.) sem precisar usar implementações reais.

---

### 🧱 Por que usar Mockito?

Quando você testa uma classe, como um **serviço**, ela geralmente depende de outras classes (como um **repositório** ou **cliente HTTP**). Em testes unitários, você **não quer testar as dependências**, só a **classe principal**. Com o Mockito, você pode:

* Simular o comportamento das dependências.
* Controlar o retorno de métodos.
* Verificar se métodos foram chamados (ou não).
* Isolar sua lógica de negócio de outras camadas (como banco de dados ou rede).

---

### ✅ Exemplo simples

#### Classe real que queremos testar:

```java
public class CalculadoraService {
    private Logger logger;

    public CalculadoraService(Logger logger) {
        this.logger = logger;
    }

    public int somar(int a, int b) {
        logger.log("Somando " + a + " + " + b);
        return a + b;
    }
}
```

#### Teste com Mockito:

```java
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

public class CalculadoraServiceTest {

    @Test
    void testSomarComLogSimulado() {
        Logger loggerMock = mock(Logger.class); // Cria um "mock"
        CalculadoraService service = new CalculadoraService(loggerMock);

        int resultado = service.somar(2, 3);

        assertEquals(5, resultado);
        verify(loggerMock).log("Somando 2 + 3"); // Verifica se log foi chamado
    }
}
```

---

### 🔧 Principais funções do Mockito

| Função                      | O que faz                                     |
| --------------------------- | --------------------------------------------- |
| `mock(Classe.class)`        | Cria um mock (objeto simulado)                |
| `when(...).thenReturn(...)` | Define o que um método simulado deve retornar |
| `verify(obj).metodo()`      | Verifica se um método foi chamado             |
| `doThrow().when(obj)`       | Simula exceções                               |

---

### 🛠️ Exemplo real com JUnit + Mockito

```java
UsuarioRepository repoMock = mock(UsuarioRepository.class);
when(repoMock.buscarPorId(1L)).thenReturn(new Usuario(1L, "Maria"));

UsuarioService service = new UsuarioService(repoMock);

assertEquals("Maria", service.buscarNomeDoUsuario(1L));
verify(repoMock).buscarPorId(1L); // Verifica se o método foi realmente chamado
```

---

### 📦 Adicionando o Mockito no seu projeto

**Maven:**

```xml
<dependency>
    <groupId>org.mockito</groupId>
    <artifactId>mockito-core</artifactId>
    <version>5.12.0</version>
    <scope>test</scope>
</dependency>
```

---

### 🧠 Resumindo:

* **Mockito** ajuda você a focar no **que a sua classe faz**, e **não no que as dependências fazem**.
* É muito usado em testes de **serviços**, **controladores**, e **classes que acessam o banco ou APIs**.
* Funciona muito bem com **JUnit**.

---


