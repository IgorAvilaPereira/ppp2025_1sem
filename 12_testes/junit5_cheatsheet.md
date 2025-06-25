# 🧪 JUnit 5 – Cheat Sheet (Folha de Referência)

---

## 🔹 1. **Anotações Básicas**

| Anotação       | Função                                   | Exemplo                         |
| -------------- | ---------------------------------------- | ------------------------------- |
| `@Test`        | Marca o método como teste                | `@Test void meuTeste() {}`      |
| `@DisplayName` | Nome legível para o teste                | `@DisplayName("Teste de soma")` |
| `@Disabled`    | Ignora o teste ou classe temporariamente | `@Disabled("Em manutenção")`    |

---

## 🔹 2. **Ciclo de Vida**

| Anotação                                          | Quando é executada                          | Exemplo                               |
| ------------------------------------------------- | ------------------------------------------- | ------------------------------------- |
| `@BeforeEach`                                     | Antes de cada método `@Test`                | `@BeforeEach void init() {}`          |
| `@AfterEach`                                      | Depois de cada método `@Test`               | `@AfterEach void cleanup() {}`        |
| `@BeforeAll`                                      | Antes de todos os testes (método `static`)  | `@BeforeAll static void setup() {}`   |
| `@AfterAll`                                       | Depois de todos os testes (método `static`) | `@AfterAll static void teardown() {}` |
| `@TestInstance(TestInstance.Lifecycle.PER_CLASS)` | Permite usar `@BeforeAll` não estático      | Usado na classe                       |

---

## 🔹 3. **Testes Parametrizados** (requer `junit-jupiter-params`)

| Anotação             | O que faz                                   | Exemplo                              |
| -------------------- | ------------------------------------------- | ------------------------------------ |
| `@ParameterizedTest` | Permite múltiplos dados de entrada          | `@ParameterizedTest`                 |
| `@ValueSource`       | Lista de valores simples (int, String, etc) | `@ValueSource(strings = {"A", "B"})` |
| `@CsvSource`         | Entradas múltiplas em formato CSV           | `@CsvSource({"1,A", "2,B"})`         |
| `@MethodSource`      | Usa um método para fornecer dados           | `@MethodSource("meusDados")`         |

---

## 🔹 4. **Execução e Comportamento**

| Anotação           | Função                                   | Exemplo                   |
| ------------------ | ---------------------------------------- | ------------------------- |
| `@RepeatedTest(n)` | Repete o teste `n` vezes                 | `@RepeatedTest(5)`        |
| `@Timeout(x)`      | Falha se ultrapassar tempo limite        | `@Timeout(1)` (1 segundo) |
| `@Tag("...")`      | Categoriza testes (ex: `@Tag("rapido")`) | `@Tag("integration")`     |

---

## 🔹 5. **Estrutura e Organização**

| Anotação  | O que faz                                 | Exemplo                         |
| --------- | ----------------------------------------- | ------------------------------- |
| `@Nested` | Cria classe interna para organizar testes | `@Nested class CasosValidos {}` |

---

## ✅ Exemplos rápidos

### Teste Simples

```java
@Test
@DisplayName("Teste de soma")
void deveSomarCorretamente() {
    assertEquals(4, 2 + 2);
}
```

### Setup e Teardown

```java
@BeforeEach
void conectarBD() {}

@AfterEach
void desconectarBD() {}
```

### Teste Parametrizado

```java
@ParameterizedTest
@ValueSource(strings = {"Maria", "João"})
void nomesValidos(String nome) {
    assertNotNull(nome);
}
```

### Teste com Timeout e Repetição

```java
@RepeatedTest(3)
@Timeout(2) // segundos
void testeRapido() {
    // código
}
```

---

## 📦 Dependência no `pom.xml` para parametrizados

```xml
<dependency>
  <groupId>org.junit.jupiter</groupId>
  <artifactId>junit-jupiter-params</artifactId>
  <version>5.10.0</version>
  <scope>test</scope>
</dependency>
```

