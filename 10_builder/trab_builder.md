# Trabalho - Builder

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
