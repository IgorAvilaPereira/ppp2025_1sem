# Revisão - 2 bim.

## 🔁 Padrões Comportamentais

### ./01\_strategy — **Padrão Strategy**

**Exercício**:
Implemente um sistema de cálculo de frete que possa aplicar diferentes estratégias de cálculo: Frete Normal, Frete Expresso e Frete Econômico.
Crie a interface `FreteStrategy` e implemente 3 classes com estratégias diferentes. O cliente deve poder escolher a estratégia dinamicamente.

---

### ./02\_observer — **Padrão Observer**

**Exercício**:
Simule um sistema de notificações de uma loja online. Quando o estoque de um produto for atualizado, os clientes interessados devem ser notificados.
Implemente a interface `Observer`, uma classe `Produto` como `Subject`, e classes `Cliente` como observadores.

---

### ./03\_template\_method — **Padrão Template Method**

**Exercício**:
Implemente um processo de preparação de bebidas. A classe abstrata `Bebida` deve definir o algoritmo base (`preparar()`) e subclasses como `Café` e `Chá` devem definir os passos específicos.

---

###  **./04\_command — Padrão Command**

**Exercício**:
Implemente um sistema de **agendamento de tarefas domésticas por voz**. O usuário pode dar comandos como:

* “Ligar aspirador”
* “Lavar roupas”
* “Passar pano”

Cada comando deve implementar a interface `Tarefa`, com um método `executar()`.
A classe `AssistenteVoz` recebe os comandos e pode executá-los imediatamente ou agendá-los para depois.

> Extensão opcional: adicionar um botão de “executar tudo” que percorre e executa a lista de tarefas agendadas.

---

###  **./05\_state — Padrão State**

**Exercício**:
Implemente o funcionamento de um **semáforo inteligente** com três estados:

* `Verde`: permite passagem dos veículos
* `Amarelo`: alerta para parada
* `Vermelho`: impede passagem

Crie a interface `EstadoSemaforo` com métodos como `proximoEstado()` e `mostrarCor()`.
A classe `Semaforo` mantém uma referência para o estado atual e delega a ele o comportamento.

**Requisitos**:

* A cada chamada de `proximoEstado()`, o semáforo deve transitar para o próximo estado na ordem correta.
* O método `mostrarCor()` deve retornar o nome da cor atual.

> **Exemplo de uso**:

```java
Semaforo s = new Semaforo();
s.mostrarCor();        // Verde
s.proximoEstado();
s.mostrarCor();        // Amarelo
s.proximoEstado();
s.mostrarCor();        // Vermelho
```


## 🎨 Padrões Estruturais

### ./06\_decorator — **Padrão Decorator**

**Exercício**:
Implemente um sistema de montagem de sanduíches. Comece com um pão básico e adicione ingredientes como queijo, presunto, salada usando o padrão Decorator.

---

###  **./07\_proxy — Padrão Proxy**

**Exercício**:
Implemente um sistema de **acesso a documentos confidenciais**, onde o `DocumentoProxy` verifica se o usuário tem permissão antes de mostrar o conteúdo.

* A interface `Documento` possui um método `exibirConteudo()`.
* `DocumentoReal` contém o conteúdo real.
* `DocumentoProxy` recebe um nível de acesso e controla o uso.

> Exemplo: Usuário com acesso “restrito” não pode visualizar documentos “confidenciais”.

---


### ./08\_adapter — **Padrão Adapter**

**Exercício**:
Você possui um sistema antigo de leitura de cartões com uma interface `LeitorAntigo` e precisa adaptá-lo para funcionar com o novo sistema que usa a interface `LeitorNovo`. Crie um `LeitorAdapter`.

---

### ./09\_facade — **Padrão Facade**

**Exercício**:
Implemente um sistema de compra online com diversas classes (`Pagamento`, `Estoque`, `Entrega`). Crie uma `LojaFacade` que centralize essas operações em um único método `comprar()`.

---

## 🛠 Padrões Criacionais

### ./10\_builder — **Padrão Builder**

**Exercício**:
Construa um sistema de montagem de carros com diferentes características (modelo, cor, tipo de motor, ar-condicionado etc.).
Use o padrão Builder para construir objetos `Carro` com diferentes combinações.

---

### ./11\_prototype — **Padrão Prototype**

**Exercício**:
Implemente um sistema de clonagem de documentos. Crie uma interface `DocumentoPrototype` com um método `clonar()` e classes concretas como `Contrato`, `Relatorio`, etc.

---

##  Testes

### ./12\_testes — **JUnit 5**

**Exercício**:
Implemente testes para a classe `Calculadora` com operações básicas: `somar`, `subtrair`, `multiplicar`, `dividir`.
Use anotações do JUnit 5 como `@BeforeEach`, `@AfterEach`, `@Test`, `@ParameterizedTest`.

---
