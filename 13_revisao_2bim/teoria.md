### 🔁 **Padrões Comportamentais**

#### 01 - Strategy

O padrão Strategy permite definir uma família de algoritmos, encapsulá-los e torná-los intercambiáveis em tempo de execução. Ele promove o princípio do "abrir para extensão, fechar para modificação", permitindo alterar o comportamento de uma classe sem modificá-la diretamente.

#### 02 - Observer

O padrão Observer define uma dependência de um-para-muitos entre objetos, de modo que quando um objeto muda de estado, todos os seus dependentes são notificados automaticamente. É muito utilizado em sistemas com notificações, interfaces gráficas e eventos.

#### 03 - Template Method

Esse padrão define a estrutura de um algoritmo em uma classe base abstrata, deixando para as subclasses a implementação de certos passos. O Template Method garante que o algoritmo tenha um esqueleto fixo, promovendo reutilização e padronização.

#### 04 - Command

O padrão Command encapsula uma solicitação como um objeto, permitindo parametrizar clientes com diferentes requisições, enfileirar ou registrar comandos, e suportar operações como desfazer/refazer. É útil para implementar filas de tarefas ou comandos em sistemas.

#### 05 - State

O padrão State permite que um objeto altere seu comportamento quando seu estado interno muda. O objeto parecerá ter mudado de classe. É ideal para sistemas onde o comportamento muda de acordo com o contexto (como máquinas de estado ou fluxos de processo).

---

### 🎨 **Padrões Estruturais**

#### 06 - Decorator

O padrão Decorator adiciona dinamicamente funcionalidades a um objeto, sem alterar sua estrutura. Isso é feito através de "encapsulamento em camadas", permitindo maior flexibilidade do que a herança para adicionar comportamentos.

#### 07 - Proxy

O padrão Proxy fornece um substituto ou representante para outro objeto, a fim de controlar o acesso a ele. Pode ser utilizado para adiar a criação de objetos caros, restringir acesso ou adicionar funcionalidades como cache ou log.

#### 08 - Adapter

Adapter converte a interface de uma classe em outra que o cliente espera. Esse padrão permite que classes com interfaces incompatíveis colaborem entre si, sem alterar seu código-fonte.

#### 09 - Facade

O padrão Facade fornece uma interface simplificada para um conjunto complexo de subsistemas. Ele é usado para reduzir o acoplamento entre o sistema e os clientes, fornecendo uma entrada única e de alto nível.

---

### 🛠 **Padrões Criacionais**

#### 10 - Builder

Builder separa a construção de um objeto complexo da sua representação, permitindo criar diferentes representações com o mesmo processo de construção. É útil quando um objeto tem muitos atributos opcionais ou combinações.

#### 11 - Prototype

O padrão Prototype cria novos objetos clonando uma instância existente, em vez de instanciá-los do zero. Isso é útil para evitar o custo de criação de objetos complexos ou preservar configurações personalizadas.

---

### ✅ **Testes Automatizados**

#### 12 - JUnit 5

JUnit 5 é um framework moderno de testes para Java. Ele introduz uma arquitetura modular e funcionalidades como testes parametrizados, organização por tags, e integração com ferramentas modernas de build (Maven, Gradle). Usando anotações como `@Test`, `@BeforeEach`, `@AfterEach`, permite estruturar testes de forma clara e reutilizável.


