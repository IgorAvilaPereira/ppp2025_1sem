package builder;

public class Carro {
    private String modelo;
    private String cor;
    private String tipoMotor;
    private boolean temArCondicionado;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTipoMotor() {
        return tipoMotor;
    }

    public void setTipoMotor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    public boolean isTemArCondicionado() {
        return temArCondicionado;
    }

    public void setTemArCondicionado(boolean temArCondicionado) {
        this.temArCondicionado = temArCondicionado;
    }

    private Carro(){
        
    }

    public static class CarroBuilder {
        private String modelo;
        private String cor;
        private String tipoMotor;
        private boolean temArCondicionado = true;

        public CarroBuilder(String modelo){
            this.modelo = modelo;


        }
        public CarroBuilder cor(String cor){
            this.cor = cor;
            return this;
        }
        public CarroBuilder tipoMotor(String tipoMotor){
            this.tipoMotor = tipoMotor;
            return this;
        }
        public CarroBuilder temArCondicionado(boolean temArCondicionado){
            this.temArCondicionado = temArCondicionado;
            return this;
        }

        public Carro builder(){
            Carro carro = new Carro();
            carro.setModelo(modelo);
            carro.setCor(cor);
            carro.setTemArCondicionado(temArCondicionado);
            carro.setTipoMotor(tipoMotor);
            return carro;
        }
    }

}
