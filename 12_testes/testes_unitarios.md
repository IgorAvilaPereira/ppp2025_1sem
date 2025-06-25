# 🧪 Testes Unitários — Uma Análise Completa

---

## 🔹 O que é um Teste Unitário 

Um **teste unitário** verifica **uma unidade de código isoladamente** — geralmente uma **função, método ou classe** — para garantir que ela se comporta conforme o esperado, **dadas certas entradas e condições**.

> ✅ Ele deve ser **automatizado**, **rápido**, **repetível** e **independente** de qualquer sistema externo (como banco de dados, rede, arquivos, etc.).

---

## 🔍 Estrutura de um Teste Unitário

Todo teste unitário segue geralmente o padrão **AAA**:

1. **Arrange** (Configurar): preparar os dados e objetos
2. **Act** (Agir): executar o código que está sendo testado
3. **Assert** (Afirmar): verificar o resultado

```java
@Test
void deveCalcularTotalComDesconto() {
    // Arrange
    Carrinho carrinho = new Carrinho();
    carrinho.adicionar("produto", 100.0);

    // Act
    double total = carrinho.calcularTotalComDesconto(10); // 10%

    // Assert
    assertEquals(90.0, total);
}
```

---

## ✅ Condições de Teste

São **cenários específicos** que você cria para verificar se a função funciona corretamente.

Exemplo para uma função de desconto:

* Se o desconto é 0%
* Se o desconto é 100%
* Se o desconto é negativo (erro esperado)
* Se o valor é 0
* Se o valor é negativo (erro esperado)

---

## 🧭 Domínio de Teste

O **domínio de teste** representa **todo o espaço possível de entradas válidas e inválidas** para uma função.

> A ideia é testar os **pontos mais relevantes** desse domínio sem precisar testar tudo.

---

## 🔍 Técnicas de Análise do Domínio

### 1. **Partição de Equivalência**

Divide os valores de entrada em **grupos (partições)** onde se espera o mesmo comportamento.

Exemplo — função que valida idades (0 a 150):

| Partição              | Exemplos   |
| --------------------- | ---------- |
| Idade válida          | 25, 0, 150 |
| Idade inválida (< 0)  | -1, -10    |
| Idade inválida (>150) | 151, 999   |

Você escolhe **um valor por grupo** para testar.

---

### 2. **Análise de Valor Limite (Boundary Testing)**

Testa os **limites extremos válidos e inválidos**.

Exemplo: idade entre 0 e 150

* Valores-limite: `-1`, `0`, `1`, `149`, `150`, `151`

---

### 3. **Testes de Caminhos Lógicos**

Você testa **todos os caminhos** de execução possíveis na lógica condicional.

Exemplo:

```java
if (cliente.isPremium() && cliente.getSaldo() > 1000) {
    aplicarDesconto();
}
```

Você deve testar:

* Premium e saldo > 1000 ✅
* Premium e saldo <= 1000 ❌
* Não premium ✅

---

## ⚙️ Tipos de Casos de Teste em Unitários

| Tipo                     | O que testa                                                 |
| ------------------------ | ----------------------------------------------------------- |
| **Casos normais**        | Entradas comuns e esperadas                                 |
| **Casos limites**        | Fronteiras entre entradas válidas e inválidas               |
| **Casos inválidos**      | Erros esperados (exceções, nulls, valores fora do esperado) |
| **Casos nulos/ausentes** | Se a função aceita ou rejeita valores nulos                 |

---

## 🧠 Dicas para Criar Bons Testes Unitários

* Foque em **testar um comportamento por vez**.
* Escolha nomes descritivos para os métodos de teste: `deveCalcularPrecoComDesconto()`.
* **Evite lógica nos testes** — o teste deve ser o mais simples possível.
* Não confie em estado externo — mantenha os testes **determinísticos**.
* Use **mocks** para isolar dependências (com frameworks como Mockito, se necessário).

---

## 🎯 Objetivo: Cobertura de Código

Cobertura de testes mede **quanto do seu código foi executado** durante os testes. Tipos comuns:

| Tipo de Cobertura          | O que verifica                                   |
| -------------------------- | ------------------------------------------------ |
| **Cobertura de instrução** | Se cada linha foi executada                      |
| **Cobertura de decisão**   | Se cada `if/else` foi avaliado nas duas direções |
| **Cobertura de caminho**   | Todos os fluxos possíveis foram testados?        |

> ⚠️ **Cobertura alta não garante qualidade** — é possível ter 100% de cobertura com testes inúteis.

---

## 📌 Exemplo completo com análise de domínio

Vamos supor a função:

```java
public double aplicarDesconto(double valor, int percentual) {
    if (percentual < 0 || percentual > 100) throw new IllegalArgumentException();
    return valor * (1 - percentual / 100.0);
}
```

### Casos de teste:

| Cenário                            | Entrada  | Resultado Esperado |
| ---------------------------------- | -------- | ------------------ |
| Desconto de 0%                     | 100, 0   | 100.0              |
| Desconto de 100%                   | 100, 100 | 0.0                |
| Desconto comum                     | 200, 25  | 150.0              |
| Percentual negativo (inválido)     | 200, -10 | Exceção            |
| Percentual acima de 100 (inválido) | 200, 110 | Exceção            |

---

## ✅ Conclusão

* Testes unitários **verificam a menor parte do sistema** em **isolamento total**.
* Devem cobrir **casos típicos, limites e exceções**.
* Devem ser rápidos, automáticos e confiáveis.
* O objetivo é garantir que **a lógica local funciona antes de integrar com outras partes**.

