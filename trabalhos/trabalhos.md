# Trabalho 1 - Strategy

Descrição do trabalho está nos últimos slides do padrão strategy

![image](strategy.png)

<!--
* [Slides](https://github.com/IgorAvilaPereira/ppp2024_2sem/raw/main/slides/01_strategy.pdf)

* [Vídeo](https://youtu.be/p_8G8EMuJxg)

**Prazo:** 23/08-->

**Valor:** 1

***

# Trabalho 2 - Observer

[Descrição](trab_observer.pdf)

[Vídeo](https://youtu.be/-O-PPbFYSxM)

<!--**Prazo:** 30/08-->

**Valor:** 1

<!--**Extra:** +0.5 (se for com interface gráfica)-->

***

# Trabalho 3 - Template Method

![template_method](template_method.png)

![template_method2](template_method2.png)

***

# Trabalho 4 - Command

![trab_command](trab_command.png)

[Vídeo](https://youtu.be/bKhafM8rieI)

<!--**Prazo:** 11/10-->

**Valor:** 1

***

# Trabalho 5 - State

[Vídeo](https://youtu.be/oCuHWQk4mPc)


**Valor:** 1


***

# Trabalho 6 - Decorator

Construa um gerador de documentos HTML.

Um documento HTML começa com um corpo básico:

```html
<html>
  <title> {TITULO} </title>
<body>
</body>
{CORPO}
</html>
```

Porém é possível incrementá-lo a fim de acrescentar novas tags como, por exemplo tabelas, quebras de linhas, links, botões, formulários, imagens e etc dentro do corpo do arquivo HTML.

Implemente o padrão Decorator para este problema. Construa, dinamicamente, o arquivo HTML e adicione, em tempo de execução, as demais tags HTML no corpo do arquivo. O processo de construção do arquivo HTML deverá ser semelhante ao trecho abaixo:

```java
Html html = new HTML("Titulo");
html = new Link(html, "Google", "http://www.google.com");
html = new Div(html);
// + tags html
html.build();
```
Construa no mínimo 5 tags html adicionais.

**Valor:** 1

**Desafio:** +0.5 Acrescentar tags aninhadas

***

# Trabalho 7 - Proxy

[Descrição](trab_proxy.pdf)

[Vídeo](https://youtu.be/TE4MdmVFf7I)

<!--**Prazo:** 15/11

**Valor:** 1-->

***

# Trabalho 8 - Adapter


***

# Trabalho 9 - Facade

***

# Trabalho 10 - Builder

Uma empresa de vendas, cria seus pedidos utilizando a seguinte estrutura de código:

```java
// classe de Pessoa
public abstract class Pessoa {
    protected int id;
    protected String nome;

    public Pessoa(int id, String nome){
        this.id = id;
        this.nome = nome;
    }

    public Pessoa(String nome){
        this.nome = nome;
    }

    // getters/setters e toString()

}

// classe de Vendedor
public class Vendedor extends Pessoa {
    private LocalDate inicio;
    private LocalDate fim;
   
    // getters/setters e toString()
}

// classe de Endereço
public class Endereco {
    private int id;
    private String rua;
    private String bairro;
    private String complemento;
    private String nro;

    // getters/setters e toString()
}


// classe de Pessoa
public class Cliente extends Pessoa {
    private String nomeMae;
    private String cpf;
    private Endereco endereco;

    // getters/setters e toString()
}

// classe de Produto
public class Produto {
    private int id;
    private String nome;
    private int qtdeEstoque;
    private double preco;

    // getters/setters e toString()
}

//  classe de Item
public class Item {
    private int id;
    private Produto produto;
    private int qtde;
    private double preco;

    // getters/setters e toString()
}

// classe de Pedido
public class Pedido {
    private int id;
    private Cliente cliente;
    private Vendedor vendedor;
    private ArrayList<Item> items;
    
    // getters/setters e toString()
}

// criação de um Pedido
public class Main{
    public static void main(String args[]) {
        
        Vendedor vendedor = new Vendedor(1, "João", LocalDate.now());
        Cliente cliente = new Cliente(1, "Igor", new Endereco(1, "alfredo huch", "bgv", "1000", "sem complemento"));

        Produto produto1 = new Produto(1, "Produto1", 100, 2);
        Produto produto2 = new Produto(2, "Produto2", 200, 3);

        ArrayList<Item> items = new ArrayList();
        Item item1 = new Item(produto1, 2, produto1.getPreco());
        Item item2 = new Item(produto2, 4, produto2.getPreco());
        items.add(item1);
        items.add(item2);
        
        Pedido pedido = new Pedido(vendedor, cliente, items);        
        System.out.println(pedido);
    }
}
```

Implemente o padrão Builder para facilitar o processo de criação de objetos da classe de Pedidos. 

A implementação proposta deve ser algo parecido com esta abaixo:

```java
// criação de um Pedido
public class Main{
    public static void main(String args[]) {
        
        Vendedor vendedor = new Vendedor(1, "João", LocalDate.now());
        Cliente cliente = new Cliente(1, "Igor", new Endereco(1, "alfredo huch", "bgv", "1000", "sem complemento"));

        Produto produto1 = new Produto(1, "Produto1", 100, 2);
        Produto produto2 = new Produto(2, "Produto2", 200, 3);

        ArrayList<Item> items = new ArrayList();
        Item item1 = new Item(produto1, 2, produto1.getPreco());
        Item item2 = new Item(produto2, 4, produto2.getPreco());
        items.add(item1);
        items.add(item2);
        
        Pedido pedido = new PedidoBuilder().vendedor(vendedor).cliente(cliente).items(items).build();      
        System.out.println(pedido);  
    }
}
```
***

# Trabalho 11 - Prototype

Tema livre

***

# Trabalho 12 - Testes

**1) Implemente o seu próprio objeto `Date` com os seguintes métodos:**

* _equals_

* _toString_

* _before_

* _after_

* _tomorrow_

* _yesterday_

* _construtor vazio_

* _construtor cheio_

* _minusDays_

* _plusDays_

**2) E implemente os seguintes Casos de Teste utilizando a ferramenta JUnit:**

```java
    // construtores vazio
    Date d = new Date();

    // data mínima
    System.out.println(d.day == 1);
    System.out.println(d.month == 1);
    System.out.println(d.year == 1900);

    d = new Date(2000, 12, 25);
    System.out.println(d.day == 25);
    System.out.println(d.month == 12);
    System.out.println(d.year == 2000);

    // as linhas a seguir devem causar exceção na hora de compilar

    // pois o tipo Date deve ser imutável, comente-as após garantir isso
    d.day = 5;
    d.month = 1;
    d.year = 2001;
    // -----------

    // deve ser indiferente a posição do ano, apenas o mês é fixo no meio
    d = new Date(13, 7, 2016);
    System.out.println(d.day == 13);
    System.out.println(d.month == 7);
    System.out.println(d.year == 2016);

    // os construtores a seguir devem lançar IllegalArgumentException
    // após fazer lançar a exceção comente as linhas para não parar a execução

    // inválido (ambíguo)
    d = new Date(1900, 7, 2016);

    // inválido (ano abaixo do mínimo 1900)
    d = new Date(16, 7, 1899);

    // inválido (ano abaixo do mínimo 1900)
    d = new Date(1899, 7, 16);

    // inválido (mês inválido)
    d = new Date(2016, 13, 16);

    // inválido (dia inválido)
    d = new Date(2016, 12, 32);

    // inválido (dia inválido)
    d = new Date(2016, 12, -1);

    // inválido (mês inválido)
    d = new Date(2016, -1, 16);

    // inválido (dia inválido)
    d = new Date(2016, 2, 30);

    // toString
    Date d8 = new Date(5, 5, 2005);
    System.out.println(d8.toString().equals("05/05/2005"));
    d8 = new Date(1, 10, 2001);
    System.out.println(d8.toString().equals("01/10/2001"));


    // comparações
    Date d5 = new Date(1, 7, 2014);
    Date d6 = new Date(1, 7, 2014);
    System.out.println(d5.equals(d6) == true);
    System.out.println(d5.equals(new Date()) == false);

    Date d7 = new Date(23, 4, 2016);
    System.out.println(d5.after(d7) == false);
    System.out.println(d7.after(d5) == true);
    System.out.println(d5.before(d7) == true);
    System.out.println(d7.before(d5) == false);
    System.out.println(d7.before(d7) == false);
    System.out.println(d7.after(d7) == false);

    // plusDays, minusDays, tomorrow e yesterday
    d = new Date(2016, 4, 22);
    Date d2 = d.yesterday();
    System.out.println(d2.day == 21);
    System.out.println(d2.month == 4);
    System.out.println(d2.year == 2016);

    // lembrando que é imutável
    System.out.println(d.day == 22);
    System.out.println(d.month == 4);
    System.out.println(d.year == 2016);

    d2 = d.tomorrow();
    System.out.println(d2.day == 23);
    System.out.println(d2.month == 4);
    System.out.println(d2.year == 2016);

    Date d3 = d2.plusDays(10);
    System.out.println(d3.day == 3);
    System.out.println(d3.month == 5);
    System.out.println(d3.year == 2016);

    Date d4 = d3.minusDays(10);
    System.out.println(d4.day == 23);
    System.out.println(d4.month == 4);
    System.out.println(d4.year == 2016);

    // situações complexas
    Date q = new Date(20, 2, 2016);
    q = q.plusDays(9);
    System.out.println(q.toString().equals("29/02/2016"));
    for (int i = 0; i < 400; i++) q = q.tomorrow();

    System.out.println(q.toString().equals("04/04/2017"));
    q = q.plusDays(365);
    System.out.println(q.toString().equals("04/04/2018"));
```

**Obs:** é obrigatória a implementação do método bissexto
