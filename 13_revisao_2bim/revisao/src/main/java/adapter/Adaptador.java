package adapter;

public class Adaptador implements Leitor {
    private LeitorAntigo leitorAntigo;

    public Adaptador (LeitorAntigo leitorAntigo) {
        this.leitorAntigo = leitorAntigo;
    }

    @Override
    public String leitura() {
        return this.leitorAntigo.leituraAntiga();
    }

}
