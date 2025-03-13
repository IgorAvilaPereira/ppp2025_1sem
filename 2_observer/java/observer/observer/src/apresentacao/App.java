package apresentacao;

import negocio.EstacaoMeteorologico;
import negocio.Estudante;
import negocio.Dados;

public class App {
    public static void main(String[] args) throws Exception {
        EstacaoMeteorologico estacaoMeteorologico = new EstacaoMeteorologico();
        Estudante david = new Estudante("David");
        Estudante joao = new Estudante("Joao");
        estacaoMeteorologico.addObserver(david);
        estacaoMeteorologico.addObserver(joao);
        estacaoMeteorologico.changedState(new Dados(32, 70));
        
    }
}
