package facade;

public class PedidoFacade {

    private Cliente cliente;
    private Item item;
    private Entrega entrega;
    private Pagamento pagamento;
    private Pedido pedido;

    public PedidoFacade(String nomeCliente, String emailCliente, Produto produto, int quantidade) {
        this.cliente = new Cliente();
        this.cliente.setNome(nomeCliente);
        this.item = new Item();
        this.item.setProduto(produto);
        this.item.setPrecoUnitario(produto.getPrecoUnitario());
        this.item.setQuantidade(quantidade);
        this.entrega = Entrega.CONVENCIONAL;
        this.pagamento = Pagamento.PIX;
        this.pedido = new Pedido();
        this.pedido.setCliente(cliente);
        this.pedido.setEntrega(this.entrega);
        this.pedido.setPagamento(this.pagamento);
        this.pedido.getItens().add(item);
    }

    public Pedido getPedido(){
        return this.pedido;
    }

}
