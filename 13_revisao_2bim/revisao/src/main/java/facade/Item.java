package facade;

public class Item {
    private int quantidade;
    private Produto produto;
    private double precoUnitario;

    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public Produto getProduto() {
        return produto;
    }
    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    public double getPrecoUnitario() {
        return precoUnitario;
    }
    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }
    @Override
    public String toString() {
        return "Item [quantidade=" + quantidade + ", produto=" + produto + ", precoUnitario=" + precoUnitario + "]";
    }

    

}
