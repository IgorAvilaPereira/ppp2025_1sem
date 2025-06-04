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
