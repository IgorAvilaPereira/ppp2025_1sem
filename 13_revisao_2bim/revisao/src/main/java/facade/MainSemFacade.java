package facade;

public class MainSemFacade {
    public static void main(String[] args) {
        Produto guitarra = new Produto();
        guitarra.setDescricao("Fender Stratocaster");
        guitarra.setEstoque(100);
        guitarra.setPrecoUnitario(10000);

        Cliente igor = new Cliente();
        igor.setNome("Igor");
        igor.setCpf("11111111111");
        igor.setCep("966666666");
        igor.setEmail("igor.pereira@riogrande.ifrs.edu.br");
        
        Pedido pedido = new Pedido();
        pedido.setCliente(igor);
        pedido.setEntrega(Entrega.SEDEX);
        pedido.setPagamento(Pagamento.CREDITO);
        Item item = new Item();
        item.setProduto(guitarra);
        item.setPrecoUnitario(guitarra.getPrecoUnitario());
        item.setQuantidade(1);
        pedido.getItens().add(item);

        System.out.println(pedido);

    }

}
