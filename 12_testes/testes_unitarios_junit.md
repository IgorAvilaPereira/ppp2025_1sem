## 🧪 O que são Testes Unitários?

**Testes unitários** são testes automatizados que verificam **unidades individuais de código**, como **métodos** ou **funções**, para garantir que funcionam corretamente **isoladamente**.

### 📌 Benefícios dos testes unitários:

* Detectam erros logo no início.
* Ajudam a manter o código limpo e modular.
* Facilitam mudanças e refatorações no código.
* Servem como documentação viva do sistema.
* Permitem o uso de práticas como TDD (Test Driven Development).

---

## 🧰 O que é o JUnit?

**JUnit** é o framework mais popular de testes unitários para Java. Ele fornece anotações, asserções (verificações) e ferramentas para **executar e organizar testes**.

### ✅ Versões:

* **JUnit 4**: ainda amplamente usado.
* **JUnit 5**: mais moderno, modular, com novos recursos. (também chamado de Jupiter)

---

## 🧬 Estrutura de um Teste com JUnit 5

```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {

    @Test
    void testeSoma() {
        Calculadora calc = new Calculadora();
        int resultado = calc.somar(5, 7);
        assertEquals(12, resultado);
    }
}
```

---

## 🔍 Principais **Asserções** em JUnit

| Método                  | Descrição                             |
| ----------------------- | ------------------------------------- |
| `assertEquals(a, b)`    | Verifica se `a == b`                  |
| `assertTrue(condição)`  | Verifica se a condição é verdadeira   |
| `assertFalse(condição)` | Verifica se a condição é falsa        |
| `assertNull(objeto)`    | Verifica se o objeto é `null`         |
| `assertNotNull(objeto)` | Verifica se o objeto **não** é `null` |
| `assertThrows()`        | Verifica se uma exceção é lançada     |

---

## 📌 Ciclo de Vida de Testes (JUnit 5)

| Anotação      | Quando é executada                     |
| ------------- | -------------------------------------- |
| `@BeforeEach` | Antes de **cada** método de teste      |
| `@AfterEach`  | Depois de **cada** método de teste     |
| `@BeforeAll`  | Antes de **todos** os testes (static)  |
| `@AfterAll`   | Depois de **todos** os testes (static) |

---

## 🧪 Exemplo Prático: Classe + Teste

### Classe a ser testada:

```java
public class Calculadora {
    public int somar(int a, int b) {
        return a + b;
    }

    public int dividir(int a, int b) {
        if (b == 0) throw new ArithmeticException("Divisão por zero");
        return a / b;
    }
}
```

### Teste com JUnit:

```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    @Test
    void testSomar() {
        Calculadora calc = new Calculadora();
        assertEquals(7, calc.somar(3, 4));
    }

    @Test
    void testDividirComZero() {
        Calculadora calc = new Calculadora();
        assertThrows(ArithmeticException.class, () -> calc.dividir(10, 0));
    }
}
```

---

## 🧪 Dicas para Testes de Qualidade

1. **Teste apenas uma coisa por método**.
2. Use nomes claros para métodos de teste:
   Ex: `deveLancarExcecaoQuandoDivisaoPorZero()`.
3. Escreva testes tanto para **casos normais** quanto para **casos de erro**.
4. Use ferramentas como **Mockito** para simular objetos externos.
5. Mantenha os testes rápidos, independentes e repetíveis.

---

