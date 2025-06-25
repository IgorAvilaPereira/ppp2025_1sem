## JUnit 5 - Principais Anotações

---

## 🔹 **1. Anotações de Teste Básicas**

| Anotação       | O que faz                                                     |
| -------------- | ------------------------------------------------------------- |
| `@Test`        | Marca um método como um **teste**                             |
| `@DisplayName` | Dá um **nome descritivo** ao teste (em vez do nome do método) |
| `@Disabled`    | **Desativa** um teste ou classe temporariamente               |

### 🧪 Exemplo:

```java
@Test
@DisplayName("Deve somar dois números corretamente")
void testSoma() {
    assertEquals(4, 2 + 2);
}
```

---

## 🔹 **2. Ciclo de Vida dos Testes**

| Anotação      | Quando é executada                                                  |
| ------------- | ------------------------------------------------------------------- |
| `@BeforeEach` | Executa **antes de cada** método de teste                           |
| `@AfterEach`  | Executa **depois de cada** método de teste                          |
| `@BeforeAll`  | Executa **uma vez antes de todos** os testes (**método estático**)  |
| `@AfterAll`   | Executa **uma vez depois de todos** os testes (**método estático**) |

### 🔄 Exemplo:

```java
@BeforeAll
static void iniciar() {
    System.out.println("Antes de tudo");
}

@BeforeEach
void antes() {
    System.out.println("Antes de cada teste");
}

@AfterEach
void depois() {
    System.out.println("Depois de cada teste");
}

@AfterAll
static void finalizar() {
    System.out.println("Depois de tudo");
}
```

---

## 🔹 **3. Testes Parametrizados (com JUnit 5 + módulo `junit-jupiter-params`)**

| Anotação                       | O que faz                                           |
| ------------------------------ | --------------------------------------------------- |
| `@ParameterizedTest`           | Permite passar **valores múltiplos** ao mesmo teste |
| `@ValueSource`                 | Define **valores simples** para passar ao teste     |
| `@CsvSource`, `@CsvFileSource` | Permite passar múltiplos argumentos em forma de CSV |
| `@MethodSource`                | Usa um método como **fonte de dados**               |

### 📊 Exemplo:

```java
@ParameterizedTest
@ValueSource(strings = {"Maria", "João", "Ana"})
void testNomeNaoNulo(String nome) {
    assertNotNull(nome);
}
```

---

## 🔹 **4. Outros úteis**

| Anotação           | Para quê serve                                                               |
| ------------------ | ---------------------------------------------------------------------------- |
| `@Tag("nome")`     | Permite categorizar testes (por prioridade, tipo, etc.)                      |
| `@Nested`          | Permite criar classes internas para agrupar testes relacionados              |
| `@TestInstance`    | Controla o ciclo de vida da instância de teste (`PER_CLASS` ou `PER_METHOD`) |
| `@RepeatedTest(n)` | Executa o mesmo teste **n vezes**                                            |
| `@Timeout(x)`      | Fails se o teste demorar mais que **x segundos/milisegundos**                |

---

## ✅ Exemplo completo:

```java
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class MinhaClasseDeTeste {

    @BeforeAll
    void setupGeral() {
        System.out.println("Setup antes de todos os testes");
    }

    @BeforeEach
    void setup() {
        System.out.println("Antes de cada teste");
    }

    @Test
    @DisplayName("Teste de soma simples")
    void testeSoma() {
        assertEquals(5, 2 + 3);
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3})
    void testeMultiplo(int numero) {
        assertTrue(numero > 0);
    }

    @AfterEach
    void teardown() {
        System.out.println("Depois de cada teste");
    }
}
```

---

### ✅ Resumo prático:

| Caso                      | Anotação necessária                                       |
| ------------------------- | --------------------------------------------------------- |
| Teste comum               | `@Test`                                                   |
| Teste com parâmetros      | `@ParameterizedTest`                                      |
| Teste repetido            | `@RepeatedTest`                                           |
| Teste com timeout         | `@Test` + `@Timeout` (ou só `@Timeout` se for suficiente) |
| Qualquer teste executável | **Alguma anotação específica de execução**                |

---

### 🧪 Exemplo obrigatório com `@Test`:

```java
@Test
void deveSomarCorretamente() {
    assertEquals(4, 2 + 2);
}
```

---

### 🧪 Exemplo com `@ParameterizedTest` (não precisa de `@Test`):

```java
@ParameterizedTest
@ValueSource(ints = {1, 2, 3})
void deveSerPositivo(int numero) {
    assertTrue(numero > 0);
}
```

---

### ⚠️ Se esquecer a anotação…

Se você esquecer `@Test` (ou `@ParameterizedTest`, etc.), **o método não será reconhecido como um teste** pelo JUnit — ele simplesmente será ignorado durante a execução.

---

### ✅ Recomendação

Sempre adicione a **anotação correta de execução** (`@Test`, `@ParameterizedTest`, `@RepeatedTest`, etc.) em cada método de teste. Elas **não são herdadas** nem opcionais.

---

