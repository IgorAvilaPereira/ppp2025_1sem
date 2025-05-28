# ppp2025_1sem <br>
## [./10_builder](https://github.com/IgorAvilaPereira/ppp2025_1sem/tree/main/./10_builder) <br>
[builder.pdf](https://github.com/IgorAvilaPereira/ppp2025_1sem/blob/main/./10_builder/builder.pdf) <br>
Builder
<!--
[Slides](https://github.com/IgorAvilaPereira/ppp2024_2sem/raw/main/slides/builder.pdf)

[Códigos](https://github.com/IgorAvilaPereira/ppp2024_2sem/tree/main/codigos/Builder)
-->

* Builder1: Classe Builder Interna

* Builder2: Classe Builder Externa

* Builder3: Classe Builder Gerada por Loombok

* Builder4: Classe Builder Gerada por Immutables

<!--https://github.com/IgorAvilaPereira/ppp2024_2sem/tree/main/codigos/builder-->

<!--
**Exemplos:**

[Builder - Na Mão](https://github.com/IgorAvilaPereira/ppp2023_2sem/tree/main/codigos/PizzaBuilder)

[Builder - com uso da IDE](https://github.com/IgorAvilaPereira/ppp2023_2sem/tree/main/codigos/PizzaBuilder2)

[Builder - Loombok (adição de código no código compilado .class)](https://github.com/IgorAvilaPereira/ppp2023_2sem/tree/main/codigos/PizzaBuilder3)

[Builder - Immutables (gerando código)](https://github.com/IgorAvilaPereira/ppp2023_2sem/tree/main/codigos/PizzaBuilder4)

[Código - Interno, Externo, Immutables](https://github.com/IgorAvilaPereira/ppp2023_1sem/tree/main/codigos/builder1)

[Código - Lombok](https://github.com/IgorAvilaPereira/ppp2023_1sem/tree/main/codigos/builder2)

[Exemplo - Builder interno](https://github.com/IgorAvilaPereira/ppp2022_2sem/tree/main/codigos/AulaBuilder081122_0)

[Exemplo - Builder externo](https://github.com/IgorAvilaPereira/ppp2022_2sem/tree/main/codigos/AulaBuilder081122_1)

[Exemplo - Builder gerado pelo Netbeans](https://github.com/IgorAvilaPereira/ppp2022_2sem/tree/main/codigos/AulaBuilder081122_3)

[Exemplo - Builder com Annotations](https://github.com/IgorAvilaPereira/ppp2022_2sem/tree/main/codigos/AulaBuilder081122_4)

* **obs:** @Builder.Construtor (no construtor)

[Exemplo - Projeto JAVA/JDBC com Maven](https://github.com/IgorAvilaPereira/ppp2022_2sem/tree/main/codigos/projetojdbc_maven)

* **obs:** não precisa instalar nada. Somente executar e configurar parâmetros de conexão no projeto.


[Trabalho 9 - Builder](https://github.com/IgorAvilaPereira/ppp2024_2sem/wiki/Trabalhos)
-->

**Vídeos - Padrão Builder:**

* [Playlist](https://youtube.com/playlist?list=PLvT8P1q6jMWdB86pCAuABYqMpIUef2cHx)

* [Teoria](https://youtu.be/vTWUZeibG7Y)

* [Prática](https://youtu.be/GTwGikvZcps)

<!--
* [Código](https://github.com/IgorAvilaPereira/ppp2023_1sem/tree/main/codigos/Builder)
-->

* **annotations** https://mvnrepository.com/artifact/org.immutables/builder/2.9.2
* **annotations** https://mvnrepository.com/artifact/org.immutables/value/2.9.2

```sh
<dependencies>

<!-- https://mvnrepository.com/artifact/org.immutables/builder -->
<dependency>
    <groupId>org.immutables</groupId>
    <artifactId>builder</artifactId>
    <version>2.10.0-rc0</version>
</dependency>

<!-- https://mvnrepository.com/artifact/org.immutables/value -->
<dependency>
    <groupId>org.immutables</groupId>
    <artifactId>value</artifactId>
    <version>2.10.0-rc0</version>
    <scope>provided</scope>
</dependency>

</dependencies>

```

* **compilação** https://projectlombok.org/features/Builder

**Material Complementar:**

* [Vídeo](https://www.youtube.com/watch?v=l-ouMkReapo&ab_channel=Prof.ManoelCampos)
* [Código do Vídeo](https://github.com/manoelcampos/padroes-projetos/tree/master/criacionais/04-builder)
* [Teoria](https://github.com/manoelcampos/padroes-projetos/tree/master/criacionais/04-builder)
* https://howtodoinjava.com/design-patterns/creational/builder-pattern-in-java/

&nbsp;
[trab_builder.md](https://github.com/IgorAvilaPereira/ppp2025_1sem/blob/main/./10_builder/trab_builder.md) <br>
## [./11_prototype](https://github.com/IgorAvilaPereira/ppp2025_1sem/tree/main/./11_prototype) <br>
[prototype.pdf](https://github.com/IgorAvilaPereira/ppp2025_1sem/blob/main/./11_prototype/prototype.pdf) <br>
### Prototype

**Material Complementar:**

* https://www.youtube.com/watch?v=qTYj8au-SOs&ab_channel=FabioKon

* https://www.youtube.com/watch?v=yva9vcZM2tM&ab_channel=RinaldoDev
  
* https://github.com/rinaldodev/design-patterns/tree/main/src/main/java/dev/rinaldo/designpatterns/behavioral

* https://youtu.be/55_TZK2eL3Y?si=YVKEAhrd27tdFfOi

* https://refactoring.guru/pt-br/design-patterns/prototype

***

<!--
[Slides](https://github.com/IgorAvilaPereira/ppp2024_1sem/raw/main/slides/prototype.pdf)

[Trabalho - Prototype](https://github.com/IgorAvilaPereira/ppp2024_1sem/wiki/Trabalhos)

[Código - Aula](https://github.com/IgorAvilaPereira/ppp2024_1sem/tree/main/codigos/prototype)


[Código - Aula](https://github.com/IgorAvilaPereira/ppp2023_2sem/tree/main/codigos/PrototypeLaboratorioClonagem)

**Códigos:**

* [Exemplo 1](https://github.com/IgorAvilaPereira/ppp2023_1sem/tree/main/codigos/prototype1)
* [Exemplo 2](https://github.com/IgorAvilaPereira/ppp2023_1sem/tree/main/codigos/prototype2)
* [Exemplo 3](https://github.com/IgorAvilaPereira/ppp2023_1sem/tree/main/codigos/prototype3)
* [Exemplo 4](https://github.com/IgorAvilaPereira/ppp2023_1sem/tree/main/codigos/prototype4)
-->

[trab_prototype.pdf](https://github.com/IgorAvilaPereira/ppp2025_1sem/blob/main/./11_prototype/trab_prototype.pdf) <br>
## [./1_strategy](https://github.com/IgorAvilaPereira/ppp2025_1sem/tree/main/./1_strategy) <br>
[01_strategy.pdf](https://github.com/IgorAvilaPereira/ppp2025_1sem/blob/main/./1_strategy/01_strategy.pdf) <br>
[bibliografia.png](https://github.com/IgorAvilaPereira/ppp2025_1sem/blob/main/./1_strategy/bibliografia.png) <br>
[designpatternscard.pdf](https://github.com/IgorAvilaPereira/ppp2025_1sem/blob/main/./1_strategy/designpatternscard.pdf) <br>
[introducao.pdf](https://github.com/IgorAvilaPereira/ppp2025_1sem/blob/main/./1_strategy/introducao.pdf) <br>
[rc008-designpatterns_online.pdf](https://github.com/IgorAvilaPereira/ppp2025_1sem/blob/main/./1_strategy/rc008-designpatterns_online.pdf) <br>
* [Vídeo de Introdução](https://www.youtube.com/watch?v=AWOf6Wo6gtg&list=PLuYctAHjg89bBeh25plGraaYiAsryusw6)

Os Padrões de Projeto são soluções já encontradas, experimentadas e testadas e que podem ser aplicadas a projetos sem ter que "reinventar a roda". Vários Padrões de Projeto foram catalogados e são um conjunto de melhores práticas que são seguidos e usados em projetos de software orientado a objetos.

Padrões de Projeto, basicamente, descrevem soluções para problemas recorrentes em sistemas de software orientado a objetos em desenvolvimento.

Além disso, os Padrões de Projeto também definem um vocabulário comum que facilitam o aprendizado e documentação de sistemas de software.

Os padrões de projeto são classificados como:

* Criacional - define a criação de objetos;
* Estrutural - define a composição de classes e objetos;
* Comportamental - define a interação entre classes e objetos.

<!--
[Exemplo - Aula Duck](https://github.com/IgorAvilaPereira/ppp2024_1sem/tree/main/codigos/AulaStrategy)

[Exemplo - Aula Hero](https://github.com/IgorAvilaPereira/ppp2024_1sem/tree/main/codigos/heroi/Heroi)
-->

<!--
**Encontro Síncrono - Strategy - 30/09/21:**

* [Vídeo](https://youtu.be/dKxU3_6VQSI)

* [Código](https://github.com/IgorAvilaPereira/ppp2024_1sem/tree/main/codigos/Strategy300921)
-->

**Padrão Strategy:**

* [Slides](https://github.com/IgorAvilaPereira/ppp2025_1sem/blob/main/1_strategy/01_strategy.pdf)
* [Trabalho 1 - Strategy](https://github.com/IgorAvilaPereira/ppp2025_1sem/blob/main/trabalhos/trabalhos.md#trabalho-1---strategy)

**Vídeos:**

* [Playlist](https://youtube.com/playlist?list=PLvT8P1q6jMWezuKlZteIipLy1nhFNacKG)  
* [Teoria](https://youtu.be/CLT1j26tSug)
* [Prática](https://youtu.be/-imnRJbv1ns)
* [Trabalho](https://youtu.be/p_8G8EMuJxg)
<!--* [Código dos Vídeos](https://github.com/IgorAvilaPereira/ppp2024_1sem/tree/main/codigos/PadraoStrategy)-->

**Conteúdo Complementar:**

* https://youtu.be/rC296hM-S4g
* https://www.youtube.com/watch?v=TfAAGUrUBIQ
* https://www.thiengo.com.br/padrao-de-projeto-strategy-estrategia
* https://refactoring.guru/pt-br/design-patterns/strategy
* https://medium.com/collabcode/strategy-padr%C3%B5es-de-projeto-em-java-43889a3afc5a
[revisao-oo.pdf](https://github.com/IgorAvilaPereira/ppp2025_1sem/blob/main/./1_strategy/revisao-oo.pdf) <br>
[strategy_aplicabilidade.png](https://github.com/IgorAvilaPereira/ppp2025_1sem/blob/main/./1_strategy/strategy_aplicabilidade.png) <br>
[Strategy](https://github.com/IgorAvilaPereira/ppp2025_1sem/blob/main/./1_strategy/Strategy) <br>
## [./2_observer](https://github.com/IgorAvilaPereira/ppp2025_1sem/tree/main/./2_observer) <br>
[observer.pdf](https://github.com/IgorAvilaPereira/ppp2025_1sem/blob/main/./2_observer/observer.pdf) <br>
<!--* [Código - Painel de Supermercado](https://github.com/IgorAvilaPereira/ppp2022_2sem/tree/main/codigos/PainelObserver)

* [Trabalho 2](trabalhos.md) -->

**Vídeos:**

* [Playlist](https://youtube.com/playlist?list=PLvT8P1q6jMWd9b_qg3S5VsPGnNAxODEm_)

* [Teoria](https://youtu.be/ny-4nZj138c)

* [Prática](https://youtu.be/e0_iBUZn26Y)

* [Trabalho](https://youtu.be/-O-PPbFYSxM)

<!--

* [Exemplo 1](
https://github.com/IgorAvilaPereira/ppp2024_1sem/tree/main/codigos/placar_observer/)

* [Exemplo 2](https://github.com/IgorAvilaPereira/ppp2024_1sem/tree/main/codigos/placar_observer2)

<!--[Exemplos de aula](https://github.com/IgorAvilaPereira/ppp2023_1sem/tree/main/codigos/Observer)-->

**Encontro Síncrono - Observer - 03/11/21:**

* [Vídeo](https://youtu.be/mTjJkE2diWQ)

<!--
* [Código](https://github.com/IgorAvilaPereira/aps2022_1sem/tree/main/codigos/encontro-sincrono-111121)
-->


<!--
**Exemplos:**

* [Portal de Notícias](https://github.com/IgorAvilaPereira/aps2022_1sem/tree/main/codigos/PortalDeNoticiasObserver)

* [Placa do Supermercado](https://github.com/IgorAvilaPereira/aps2022_1sem/tree/main/codigos/PlacaSupermercadoObserver)

**Exemplos - Aula:**

* [Portal de notícias](https://github.com/IgorAvilaPereira/ppp2022_2sem/tree/main/codigos/PortalDeNoticias)

* [Painel Supermercado (Observer) + Forma de Notificação (Strategy)](https://github.com/IgorAvilaPereira/ppp2022_2sem/tree/main/codigos/AulaObserver160822)
-->

**Leitura complementar - Observer:**

* https://www.thiengo.com.br/padrao-de-projeto-observer
* https://www.devmedia.com.br/padrao-de-projeto-observer-em-java/26163

**Exemplos:**

Painel Supermercado (Observer) 

* opcional: Forma de Notificação (Strategy)

Estação Climática <!--(https://github.com/IgorAvilaPereira/ppp2023_2sem/tree/main/codigos/ObserverAula)-->

Blog/Portal de Notícias <!--https://github.com/IgorAvilaPereira/ppp2023_2sem/tree/main/codigos/PortalDeNoticias)-->

Controle de Telas - Sistema Financeiro

[Exemplo comentado - Mudança de Temperatura (Ar condicionado)](https://esj.eti.br/Apostilas/Programacao/Java/Java_Exemplo_DesignPatterns_Observer.pdf) <br>
[java](https://github.com/IgorAvilaPereira/ppp2025_1sem/blob/main/./2_observer/java) <br>
[php](https://github.com/IgorAvilaPereira/ppp2025_1sem/blob/main/./2_observer/php) <br>
## [./3_template_method](https://github.com/IgorAvilaPereira/ppp2025_1sem/tree/main/./3_template_method) <br>
**Exemplos:**

* Relatório
* Template
* Algoritmos de Ordenação
* Cálculo do Frete
* Exportação/Conversão de Arquivos CSV
* Extração de dados de documentos de diversos formatos
* Gerador de templates HTML
* Gerador de Relatórios de diversas fontes: csv, banco de dados e etc.
<!--
[Códigos - Aula](https://github.com/IgorAvilaPereira/ppp2024_2sem/tree/main/codigos/TemplateMethod)
-->
[Video - Encontro](https://www.youtube.com/watch?v=e__hzZlWdWU)

<!--
**Presentes:**

* Erick
* Yuri
* Annie
* Jaime
* Ana Clara
* Gabriel
* Gabriel Barela
* Bruno
* Leticia
-->

<!--
* [Código Aula](https://github.com/IgorAvilaPereira/ppp2024_2sem/tree/main/codigos/TemplateMethod)

<!--
**Exemplos - Código:**

* [Dica do Trabalho - Leitura e Gravação de Texto em Java](https://github.com/IgorAvilaPereira/ppp2023_2sem/tree/main/codigos/DicaTrabalho)

  * [produtos.csv](https://github.com/IgorAvilaPereira/ppp2023_2sem/blob/main/produtos.csv)
  
  * [output.txt](https://github.com/IgorAvilaPereira/ppp2023_2sem/blob/main/output.txt)  
  
* [joaoDoBauru.sql](https://github.com/IgorAvilaPereira/ppp2023_2sem/blob/main/joaodobauru250823.sql)

* [Gerador de Páginas HTML](https://github.com/IgorAvilaPereira/ppp2023_2sem/tree/main/codigos/GeradorHTML)

* [Gerador de Relatórios](https://github.com/IgorAvilaPereira/ppp2023_2sem/tree/main/codigos/GeradorRelatorio)

[Código - Aula](https://github.com/IgorAvilaPereira/ppp2023_2sem/tree/main/codigos/AulaTemplateMethod)

[Código - 0.2 Free](https://github.com/IgorAvilaPereira/aps2022_2sem/tree/main/codigos/0.2Free)
-->

<!--
* [Código - Leitura e Escrita de Arquivos em Java](https://github.com/IgorAvilaPereira/aps2021_2sem/blob/main/codigos/Screenshot%20from%202021-10-07%2019-54-36.png)
-->
<!--
**Padrão Template Method:**

**Slides:**

* [Template Method](https://github.com/IgorAvilaPereira/ppp2024_2sem/raw/main/slides/template_method.pdf)

<!--
* [Código Aula - TemplateMethod-RenderPage](https://github.com/IgorAvilaPereira/ppp2022_2sem/tree/main/codigos/TemplateMethod-RenderPage)

* [Código Aula - TemplateMethod-RenderPage com Spark](https://github.com/IgorAvilaPereira/ppp2022_2sem/tree/main/codigos/TemplateMethod-RenderPageSpark)
-->

**Trabalho - Template Method:**

* [Descrição Trabalho - Template Method](https://github.com/IgorAvilaPereira/ppp2024_1sem/wiki/Trabalhos#trabalho-3)

<!--
* [Dica para o Trabalho 3: Leitura e Escrita de Arquivos em Java](https://github.com/IgorAvilaPereira/ppp2023_1sem/tree/main/codigos/exemplocsv)
-->

**Vídeos:**

* [Playlist](https://youtube.com/playlist?list=PLvT8P1q6jMWd3TV0QVZr4McNNRV-f11Kk)

* [Teoria](https://youtu.be/C441294hAd4)

* [Prática](https://youtu.be/n_pe9Z_7iZY)

* [Trabalho](https://youtu.be/a2VvNUx-ZeY)

<!--* [Código](https://github.com/IgorAvilaPereira/ppp2023_1sem/tree/main/codigos/TemplateMethod)-->

<!--
**Encontro Síncrono - Template Method - 06/10/21:**

* [Vídeo](https://youtu.be/aLpjGdDRtrE)
-->

**Material Complementar:**

* https://brizeno.wordpress.com/category/padroes-de-projeto/template-method/

* https://www.devmedia.com.br/padrao-de-projeto-template-method-em-java/26656

* :wave: :camera: https://www.youtube.com/watch?v=UtnQTLXKdeE

* https://www.codingdrills.com/tutorial/design-patterns-tutorial/template-method-pattern



[template_method.pdf](https://github.com/IgorAvilaPereira/ppp2025_1sem/blob/main/./3_template_method/template_method.pdf) <br>
[templatemethod_vs_strategy2.png](https://github.com/IgorAvilaPereira/ppp2025_1sem/blob/main/./3_template_method/templatemethod_vs_strategy2.png) <br>
[templatemethod_vs_strategy.pdf](https://github.com/IgorAvilaPereira/ppp2025_1sem/blob/main/./3_template_method/templatemethod_vs_strategy.pdf) <br>
[template_method](https://github.com/IgorAvilaPereira/ppp2025_1sem/blob/main/./3_template_method/template_method) <br>
[template_method2](https://github.com/IgorAvilaPereira/ppp2025_1sem/blob/main/./3_template_method/template_method2) <br>
## [./4_command](https://github.com/IgorAvilaPereira/ppp2025_1sem/tree/main/./4_command) <br>
[command1.png](https://github.com/IgorAvilaPereira/ppp2025_1sem/blob/main/./4_command/command1.png) <br>
[command2.png](https://github.com/IgorAvilaPereira/ppp2025_1sem/blob/main/./4_command/command2.png) <br>
[command.pdf](https://github.com/IgorAvilaPereira/ppp2025_1sem/blob/main/./4_command/command.pdf) <br>
Ex:

* Controle de Automação Residencial

* Controle de Rotas para Ambiente Web

<!--
[Códigos Aula](https://github.com/IgorAvilaPereira/ppp2024_2sem/tree/main/codigos/Command)

**Códigos:**

[Controle](https://github.com/IgorAvilaPereira/ppp2024_1sem/tree/main/codigos/controle_command)

[Framework Web](https://github.com/IgorAvilaPereira/ppp2024_1sem/tree/main/codigos/spark_command/spark_command)

[Código - Vídeos](https://github.com/IgorAvilaPereira/ppp2024_1sem/tree/main/codigos/Command)

[Código Aula](https://github.com/IgorAvilaPereira/ppp2023_1sem/tree/main/codigos/ControleUniversal)

[Código 1 - Aula](https://github.com/IgorAvilaPereira/ppp2024_1sem/tree/main/codigos/Command260923)

[Código 2 - Aula](https://github.com/IgorAvilaPereira/ppp2024_1sem/tree/main/codigos/Command260923_2)
-->


O padrão de projeto Command possui várias características que o tornam uma escolha valiosa em muitos cenários de desenvolvimento de software:

* **Desacoplamento:** Separa o objeto que solicita a ação (invoker) do objeto que realiza a ação (receiver), promovendo um design mais modular e flexível.
* **Extensibilidade:** Facilita a adição de novos comandos sem alterar o código existente, seguindo o princípio aberto/fechado (Open/Closed Principle).
* **Reversibilidade:** Permite implementar facilmente operações de desfazer (undo) e refazer (redo), armazenando o histórico de comandos executados.
* **Composição:** Comandos podem ser compostos em comandos mais complexos, permitindo a criação de macros ou sequências de operações.
* **Registro e Log:** Facilita o registro e a auditoria de operações, já que cada comando pode ser registrado com detalhes específicos sobre a ação realizada.
* **Flexibilidade:** Permite parametrizar objetos com diferentes solicitações, tornando o sistema mais adaptável a mudanças.


Embora o padrão de projeto Command tenha muitas vantagens, ele também apresenta algumas características negativas que devem ser consideradas:

* **Complexidade Adicional:** A implementação do padrão Command pode adicionar complexidade ao código, especialmente em sistemas simples onde o padrão pode ser desnecessário.
* **Sobrecarga de Objetos:** Pode resultar em um grande número de classes e objetos, já que cada comando geralmente requer sua própria classe concreta.
* **Manutenção:** Com o aumento do número de comandos, a manutenção do código pode se tornar mais difícil, exigindo mais esforço para gerenciar e atualizar os comandos.
* **Desempenho:** Em sistemas com muitos comandos, o armazenamento e a execução de comandos podem impactar o desempenho, especialmente se houver necessidade de registrar ou desfazer muitas operações.
* **Overhead de Memória:** O armazenamento de estados para permitir operações de desfazer (undo) pode consumir uma quantidade significativa de memória, dependendo da complexidade das operações e da frequência com que são realizadas.

Essas desvantagens não anulam os benefícios do padrão Command, mas é importante considerá-las ao decidir se este padrão é adequado para o seu projeto específico.


* [Vídeo Aula Completa (Opção 2)](https://youtu.be/ze1xocE67gE)


**Vídeos - Command:**

* [Playlist](https://youtube.com/playlist?list=PLvT8P1q6jMWfpG66pRqDaeRYncXzP7BEK)

* [Teoria](https://youtu.be/-vtUkJbzbf4)

* [Prática](https://youtu.be/NKWNPbzFO8k)

* [Trabalho](https://youtu.be/bKhafM8rieI)

<!--* [Código Vídeos](https://github.com/IgorAvilaPereira/ppp2024_1sem/tree/main/codigos/Command)

**Material Complementar - Encontro Síncrono - Command - 04/11/21:**

* [Vídeo](https://youtu.be/_BKMkDZkt_g)

* [Código](https://github.com/IgorAvilaPereira/aps2022_1sem/tree/main/codigos/encontro-sincrono-0411211)
-->


**Material Complementar:**

* https://medium.com/xp-inc/design-patterns-parte-16-command-9c73af726c9c
* https://fjp.at/design-patterns/command
* https://www.codeprimers.com/command-design-pattern/




[demo2](https://github.com/IgorAvilaPereira/ppp2025_1sem/blob/main/./4_command/demo2) <br>
[demo3](https://github.com/IgorAvilaPereira/ppp2025_1sem/blob/main/./4_command/demo3) <br>
## [./5_state](https://github.com/IgorAvilaPereira/ppp2025_1sem/tree/main/./5_state) <br>
[2025-04-02_13-35.png](https://github.com/IgorAvilaPereira/ppp2025_1sem/blob/main/./5_state/2025-04-02_13-35.png) <br>
[mario-finite-state-machine.jpg](https://github.com/IgorAvilaPereira/ppp2025_1sem/blob/main/./5_state/mario-finite-state-machine.jpg) <br>
* Divulgação do Trabalhão do bimestre 
    *   Data e Peso estão no SIGAA: assim fechamos 1 bim.

Na volta (2 bim):
* Padrões das demais categorias: criacional e estrutural

**State**

<!--* [Slides](https://github.com/IgorAvilaPereira/ppp2025_1sem/raw/main/slides/state.pdf)-->
* [Trabalho 5 - State](https://github.com/IgorAvilaPereira/ppp2025_1sem/blob/main/trabalhos/trabalhos.md#trabalho-5---state)
<!-- 
* [Exemplo - MárioBros](https://github.com/IgorAvilaPereira/ppp2024_2sem/raw/main/slides/mario-finite-state-machine.jpg)
* [Exemplo - Package](https://github.com/IgorAvilaPereira/ppp2024_2sem/blob/main/state.md)
* [Trabalho 4 (State)](https://github.com/IgorAvilaPereira/ppp2024_2sem/wiki/Trabalhos#trabalho-4)
* [Código - Aula](https://github.com/IgorAvilaPereira/ppp2024_2sem/tree/main/codigos/State)
-->
<!--
* [Código Aula](https://github.com/IgorAvilaPereira/ppp2024_1sem/tree/main/codigos/StateMario)
* [Código - MarioState (Aula)](https://github.com/IgorAvilaPereira/ppp2024_1sem/tree/main/codigos/MarioState)
* [Código - Player (Aula)](https://github.com/IgorAvilaPereira/ppp2024_1sem/tree/main/codigos/PlayerMusic)
-->

**Bom**

* desacopla a lógica de um estado da classe de contexto
* permite a criação de novos estados apenas adicionando novas classes
* elimina condicionais complexas da classe de contexto

**Ruim**

* se você tem apenas poucas condicionais simples, aplicar este padrão pode deixar seu código mais complexo do que o necessário

<!--* [Código - Aula](https://github.com/IgorAvilaPereira/ppp2023_1sem/tree/main/codigos/StateAula)-->

**Vídeos:**

* [Playlist](https://youtube.com/playlist?list=PLvT8P1q6jMWcb2xdiLaQUIjDSDExn_PDA)

* [Teoria](https://youtu.be/6lYoc_rD5ps)

* [Prática](https://youtu.be/OJahQFwk4fo)

* [Trabalho 4 (State)](https://youtu.be/oCuHWQk4mPc)

* [Aula Completa](https://www.youtube.com/watch?v=zcZMVGpipZI&ab_channel=IgorAvilaPereira)

**Códigos:**

<!--* [Código - Aula](https://github.com/IgorAvilaPereira/ppp2022_2sem/tree/main/codigos/Aula300822)-->

<!--* [Código - Vídeos](https://github.com/IgorAvilaPereira/ppp2024_1sem/tree/main/codigos/State)

* [Exemplo - State Mario Bros Completo](https://github.com/IgorAvilaPereira/StateExample)
-->

**Material Complementar:**

**Strategy vs State**
> The State and Strategy Patterns have the same class diagram, but they differ in intent. The Strategy Pattern typically configures Context classes with a behavior or algorithm, which can be done through composition during runtime. State Pattern allows a Context to change its behavior as the state of the Context changes.

https://acervolima.com/diferenca-entre-o-estado-e-o-padrao-de-design-de-estrategia-em-java/

**Links:**

* https://stacktips.com/tutorials/design-patterns/state-design-pattern-in-java
* https://www.codiwan.com/state-design-pattern-real-world-example-java/ 
* https://www.ashishvishwakarma.com/GoF-Design-Patterns-by-Example/State-Pattern/
* https://refactoring.guru/design-patterns/state
* https://refactoring.guru/pt-br/design-patterns/state
* https://medium.com/@gbbigardi/arquitetura-e-desenvolvimento-de-software-parte-16-state-aa998a86277f
* https://www.devmedia.com.br/design-patterns-state-parte-4/16783
* https://pt.wikipedia.org/wiki/State
* https://gist.github.com/rponte/2af6a9ce8b08949e9a88d7dbc58962fd
* https://appmaster.io/pt/glossary/padrao-de-estado
* https://devsubdev.wordpress.com/2010/05/18/state-pattern-parte-1/
* https://web.tecnico.ulisboa.pt/~david.matos/w/pt/index.php/State_Pattern_(padr%C3%A3o_de_desenho)/Porta_Autom%C3%A1tica
* https://web.tecnico.ulisboa.pt/~david.matos/w/pt/index.php/State_Pattern_(padr%C3%A3o_de_desenho)/Exerc%C3%ADcio_01:_Sem%C3%A1foro
* https://web.tecnico.ulisboa.pt/~david.matos/w/pt/index.php/State_Pattern_(padr%C3%A3o_de_desenho)/Exerc%C3%ADcio_02:_M%C3%A1quina_de_Lavar

&nbsp;
[state.md](https://github.com/IgorAvilaPereira/ppp2025_1sem/blob/main/./5_state/state.md) <br>
[state.pdf](https://github.com/IgorAvilaPereira/ppp2025_1sem/blob/main/./5_state/state.pdf) <br>
[trabalhao_ppp2025_1sem_1bim.pdf](https://github.com/IgorAvilaPereira/ppp2025_1sem/blob/main/./5_state/trabalhao_ppp2025_1sem_1bim.pdf) <br>
[exemplo_state](https://github.com/IgorAvilaPereira/ppp2025_1sem/blob/main/./5_state/exemplo_state) <br>
## [./6_decorator](https://github.com/IgorAvilaPereira/ppp2025_1sem/tree/main/./6_decorator) <br>
[decorator.pdf](https://github.com/IgorAvilaPereira/ppp2025_1sem/blob/main/./6_decorator/decorator.pdf) <br>
[decorator.svg](https://github.com/IgorAvilaPereira/ppp2025_1sem/blob/main/./6_decorator/decorator.svg) <br>
[exemplo.png](https://github.com/IgorAvilaPereira/ppp2025_1sem/blob/main/./6_decorator/exemplo.png) <br>
[Trabalho 6](https://github.com/IgorAvilaPereira/ppp2025_1sem/blob/main/trabalhos/trabalhos.md#trabalho-6---decorator)

**Vídeos - Padrão Decorator:**

* [Playlist](https://youtube.com/playlist?list=PLvT8P1q6jMWck6eWAE-llyhvlpj1fDF_y)

* [Teoria](https://youtu.be/__yFHhi5LHQ)

* [Prática](https://youtu.be/QYxcqcIK7bs)

**Leitura Complementar:**

* https://brizeno.wordpress.com/category/padroes-de-projeto/decorator/

* **Como remover:** https://stackoverflow.com/questions/55776160/how-to-remove-decorated-object-from-decorator-pattern
[starbucks.sql](https://github.com/IgorAvilaPereira/ppp2025_1sem/blob/main/./6_decorator/starbucks.sql) <br>
[decorator](https://github.com/IgorAvilaPereira/ppp2025_1sem/blob/main/./6_decorator/decorator) <br>
## [./7_proxy](https://github.com/IgorAvilaPereira/ppp2025_1sem/tree/main/./7_proxy) <br>
[proxy.pdf](https://github.com/IgorAvilaPereira/ppp2025_1sem/blob/main/./7_proxy/proxy.pdf) <br>
<!--* [Slides](https://github.com/IgorAvilaPereira/ppp2024_2sem/raw/main/slides/proxy.pdf)-->

<!--* [Trabalho 8 - Proxy](https://github.com/IgorAvilaPereira/ppp2024_2sem/wiki/Trabalhos#trabalho-8)-->

<!--
* [YouTubeManager (Sem Proxy)](https://github.com/IgorAvilaPereira/YoutubeManager)

tubeManager (com Proxy) - Exemplo Aula](https://github.com/IgorAvilaPereira/ppp2024_2sem/tree/main/codigos/Proxy)

* [Código Aula](https://github.com/IgorAvilaPereira/ppp2024_2sem/tree/main/codigos/proxy)

* [ProxyProduto](https://github.com/IgorAvilaPereira/ppp2024_2sem/tree/main/codigos/ProxyProduto)

* [ProxyTerminal](https://github.com/IgorAvilaPereira/ppp2024_2sem/tree/main/codigos/ProxyTerminal/ProxyTerminal)

* [GaleriaYoutubeProxy](https://github.com/IgorAvilaPereira/ppp2023_1sem/tree/main/codigos/DownloadProxy)

    * **Requisitos:** ter o python 3.10 instalado + pytube

* [EditorTextoProxy](https://github.com/IgorAvilaPereira/ppp2022_2sem/tree/main/codigos/EditorTextoProxy)

* [TerminalProxy](https://github.com/IgorAvilaPereira/ppp2022_2sem/tree/main/codigos/TerminalProxy)
-->

**Vídeos:**

* [Playlist](https://youtube.com/playlist?list=PLvT8P1q6jMWcKXGosOaglNvMM1nBBrU7u)

* [Teoria](https://youtu.be/jWFT7LPoc9g)

* [Prática](https://youtu.be/eaFeDEYeqDA)

* [Trabalho - Proxy](https://youtu.be/TE4MdmVFf7I)

<!--
**Materiais Complementares - Vídeos:**

* [Slides](https://github.com/IgorAvilaPereira/ppp2022_2sem/raw/main/slides/proxy.pdf)

* [Código](https://github.com/IgorAvilaPereira/ppp2022_2sem/tree/main/codigos/Proxy)

* [Trabalho 8 - Proxy](https://github.com/IgorAvilaPereira/ppp2022_2sem/wiki/Trabalhos#trabalho-8)
-->

**Encontro Síncrono - Proxy - 18/11/21:**

* [Playlist](https://youtube.com/playlist?list=PLvT8P1q6jMWfkdkaWccsiOENN7NGLOJTA)
* [Parte 1](https://youtu.be/pNM_dl39YoI)
* [Parte 2](https://youtu.be/iojmChHPacE)
<!--* [Código](https://github.com/IgorAvilaPereira/ppp2022_2sem/tree/main/codigos/encontro-sincrono-181121)-->

**Links Complementares:**

* [Wikipedia](https://pt.wikipedia.org/wiki/Proxy_(padr%C3%B5es_de_projeto))

* [journaldev](http://www.journaldev.com/1572/proxy-design-pattern)

* [javaworld](http://www.javaworld.com/article/2074068/learn-java/take-control-with-the-proxy-design-pattern.html)

* [tutorialspoint](https://www.tutorialspoint.com/design_pattern/proxy_pattern.htm)

* [refactoring.guru](https://refactoring.guru/pt-br/design-patterns/proxy)

* https://diogomoreira.gitbook.io/padroes-de-projeto/padrao-proxy

* https://growthdev.com.br/design-pattern/padrao-de-projeto-proxy-em-php-com-exemplo/

* https://www.tabnews.com.br/santiagosouto/padrao-de-projeto-proxy-intermediando-o-acesso-a-objetos-e-recursos


[tipos_proxy.md](https://github.com/IgorAvilaPereira/ppp2025_1sem/blob/main/./7_proxy/tipos_proxy.md) <br>
[proxy_aula](https://github.com/IgorAvilaPereira/ppp2025_1sem/blob/main/./7_proxy/proxy_aula) <br>
## [./8_adapter](https://github.com/IgorAvilaPereira/ppp2025_1sem/tree/main/./8_adapter) <br>
[adapter_exemplo1.png](https://github.com/IgorAvilaPereira/ppp2025_1sem/blob/main/./8_adapter/adapter_exemplo1.png) <br>
[adapter_exemplo2.png](https://github.com/IgorAvilaPereira/ppp2025_1sem/blob/main/./8_adapter/adapter_exemplo2.png) <br>
[adapter.pdf](https://github.com/IgorAvilaPereira/ppp2025_1sem/blob/main/./8_adapter/adapter.pdf) <br>
[adapter_vs_proxy.png](https://github.com/IgorAvilaPereira/ppp2025_1sem/blob/main/./8_adapter/adapter_vs_proxy.png) <br>

**Exemplos de Adapter:**

* No Simulador de Patos chegou um código legado de Perus

* Criar um exemplo de Adapter para integrar uma API de Digimons à sua API de Pokemons existente.

    * https://digi-api.com/
    * https://digimon-api.vercel.app/

* Imagine que sua aplicação precisa interagir com dados de clientes, mas você tem acesso a informações de clientes armazenadas em um banco de dados relacional (SQL) e também em um sistema NoSQL (como um banco de documentos). Você quer unificar a forma como sua aplicação acessa esses dados.

* Imagine que sua aplicação precisa interagir com arquivos, mas você tem acesso a um serviço de armazenamento na nuvem que possui uma API diferente da interface de sistema de arquivos local que sua aplicação já utiliza.

* Imagine que você está criando uma aplicação de monitoramento do mercado de ações da bolsa. A aplicação baixa os dados as ações de múltiplas fontes em formato XML e então mostra gráficos e diagramas maneiros para o usuário.
    * Em algum ponto, você decide melhorar a aplicação ao integrar uma biblioteca de análise de terceiros. Mas aqui está a pegadinha: a biblioteca só trabalha com dados em formato JSON.

**Trabalho 7 - Adapter:**

* Código legado: envio de sms
* Código legado: envio de email ou de notificação (whatsapp ou telegram)

**Descrição:** adaptar os códigos legados

**Extra:** se enviar corretamente um email, ou se enviar corretamente uma mensagem via whatsapp ou telegram
+0.5

**Entrega:** 29/05


[structure-object-adapter.png](https://github.com/IgorAvilaPereira/ppp2025_1sem/blob/main/./8_adapter/structure-object-adapter.png) <br>
[Adapter](https://github.com/IgorAvilaPereira/ppp2025_1sem/blob/main/./8_adapter/Adapter) <br>
[adapter_duck](https://github.com/IgorAvilaPereira/ppp2025_1sem/blob/main/./8_adapter/adapter_duck) <br>
[adapter_pokemonapi_digimon](https://github.com/IgorAvilaPereira/ppp2025_1sem/blob/main/./8_adapter/adapter_pokemonapi_digimon) <br>
[proxy_aula](https://github.com/IgorAvilaPereira/ppp2025_1sem/blob/main/./8_adapter/proxy_aula) <br>
## [./9_facade](https://github.com/IgorAvilaPereira/ppp2025_1sem/tree/main/./9_facade) <br>
[aula7.sql](https://github.com/IgorAvilaPereira/ppp2025_1sem/blob/main/./9_facade/aula7.sql) <br>
[dao_jdbc.pdf](https://github.com/IgorAvilaPereira/ppp2025_1sem/blob/main/./9_facade/dao_jdbc.pdf) <br>
[facade.pdf](https://github.com/IgorAvilaPereira/ppp2025_1sem/blob/main/./9_facade/facade.pdf) <br>
**Exemplo:**

Subsistema de BD: Medico, Paciente e Consulta >> Disciplina de PBD

* Como eu faria para Marcar uma consulta?

* Como eu faria para facilitar a vida do cliente/colega de trabalho que deseja salvar/registrar uma nova consulta?

**Principais Vantagens do Facade:**

* **Simplificação:** Fornece uma interface mais simples e unificada para um sistema complexo.
* **Acoplamento Reduzido:** Desacopla o cliente do subsistema complexo. O cliente depende apenas da fachada.
* **Legibilidade Aumentada:** O código se torna mais fácil de entender e manter, pois os fluxos de trabalho complexos são encapsulados.
* **Orquestração:** A fachada é responsável por saber quais objetos do subsistema são responsáveis por uma solicitação e por delegar o trabalho.

**Material Complementar:**

* https://www.youtube.com/watch?v=8tyNCznvgW8&ab_channel=C%C3%B3digoFonteTV

* :exclamation: https://medium.com/@andreaspoyias/design-patterns-a-quick-guide-to-facade-pattern-16e3d2f1bfb6

* :exclamation: https://www.baeldung.com/java-facade-pattern

* https://dev.to/mkobuolys/7-facade-215b

* [Facade Design Pattern](https://amitpamecha.wordpress.com/2016/11/14/facade-design-pattern/)

* [Facade - CDOT Wiki](https://wiki.cdot.senecacollege.ca/wiki/Facade)

* [Facade](https://www.design-patterns-stories.com/patterns/Facade/)

* [Facade pattern - Wikipedia](https://en.wikipedia.org/wiki/Facade_pattern)

* [Facade](https://refactoring.guru/pt-br/design-patterns/facade)

* [C# Facade Design Pattern - Dofactory](https://www.dofactory.com/net/facade-design-pattern)

* [Facade Pattern from Head First Design Patterns](https://www.javaguides.net/2018/07/facade-pattern-from-head-first-design-patterns.html)

* [Design patterns: facade » Hello World!](https://blog.lukaszewski.it/2013/08/31/design-patterns-facade/)

&nbsp;


[trab_facade.md](https://github.com/IgorAvilaPereira/ppp2025_1sem/blob/main/./9_facade/trab_facade.md) <br>
[projeto_facade](https://github.com/IgorAvilaPereira/ppp2025_1sem/blob/main/./9_facade/projeto_facade) <br>
## [./trabalhos](https://github.com/IgorAvilaPereira/ppp2025_1sem/tree/main/./trabalhos) <br>
[strategy.png](https://github.com/IgorAvilaPereira/ppp2025_1sem/blob/main/./trabalhos/strategy.png) <br>
[template_method2.png](https://github.com/IgorAvilaPereira/ppp2025_1sem/blob/main/./trabalhos/template_method2.png) <br>
[template_method.png](https://github.com/IgorAvilaPereira/ppp2025_1sem/blob/main/./trabalhos/template_method.png) <br>
[trabalhao_ppp2025_1sem_1bim.pdf](https://github.com/IgorAvilaPereira/ppp2025_1sem/blob/main/./trabalhos/trabalhao_ppp2025_1sem_1bim.pdf) <br>
[trabalhos.md](https://github.com/IgorAvilaPereira/ppp2025_1sem/blob/main/./trabalhos/trabalhos.md) <br>
[trab_command.png](https://github.com/IgorAvilaPereira/ppp2025_1sem/blob/main/./trabalhos/trab_command.png) <br>
[trab_facade.pdf](https://github.com/IgorAvilaPereira/ppp2025_1sem/blob/main/./trabalhos/trab_facade.pdf) <br>
[trab_observer.pdf](https://github.com/IgorAvilaPereira/ppp2025_1sem/blob/main/./trabalhos/trab_observer.pdf) <br>
[trab_proxy.pdf](https://github.com/IgorAvilaPereira/ppp2025_1sem/blob/main/./trabalhos/trab_proxy.pdf) <br>
[trab_state.pdf](https://github.com/IgorAvilaPereira/ppp2025_1sem/blob/main/./trabalhos/trab_state.pdf) <br>
