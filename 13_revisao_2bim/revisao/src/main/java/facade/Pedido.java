package facade;

import java.util.ArrayList;

public class Pedido {
    private ArrayList<Item> itens;
    private Pagamento pagamento;
    private Entrega entrega;
    private Cliente cliente;    

    public Pedido() {
        this.itens = new ArrayList<>();
    }

    public ArrayList<Item> getItens() {
        return itens;
    }
    public void setItens(ArrayList<Item> itens) {
        this.itens = itens;
    }
    public Pagamento getPagamento() {
        return pagamento;
    }
    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }
    public Entrega getEntrega() {
        return entrega;
    }
    public void setEntrega(Entrega entrega) {
        this.entrega = entrega;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Pedido [itens=" + itens + ", pagamento=" + pagamento + ", entrega=" + entrega + ", cliente=" + cliente
                + "]";
    }

    
    

}
