package negocio;

public class Corrida {
    private Usuario usuario;
    private Carona carona;
    private double valor;
    private boolean pago;

    public Corrida(){
        this.usuario = new Usuario();
        this.carona = new Carona();
    }

    public Usuario getUsuario() {
        return usuario;
    }
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public Carona getCarona() {
        return carona;
    }
    public void setCarona(Carona carona) {
        this.carona = carona;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    public boolean isPago() {
        return pago;
    }
    public void setPago(boolean pago) {
        this.pago = pago;
    }

    

}
