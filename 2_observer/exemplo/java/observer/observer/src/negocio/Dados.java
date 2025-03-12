package negocio;

public class Dados {

    private double temperatura;
    private double umidade;

    

    public Dados(double temperatura, double umidade) {
        this.temperatura = temperatura;
        this.umidade = umidade;
    }
    public double getTemperatura() {
        return temperatura;
    }
    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }
    public double getUmidade() {
        return umidade;
    }
    public void setUmidade(double umidade) {
        this.umidade = umidade;
    }

    

}
