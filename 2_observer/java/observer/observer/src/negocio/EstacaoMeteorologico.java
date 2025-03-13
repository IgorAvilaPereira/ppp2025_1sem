package negocio;

import java.util.ArrayList;
import java.util.List;

public class EstacaoMeteorologico implements Subject {

    private List<Observer> vetObservadores;
    private Dados dados;

    

    public EstacaoMeteorologico() {
        this.vetObservadores = new ArrayList<Observer>();
    }

    public void changedState(Dados dados){
        this.dados = dados;
        this.notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        this.vetObservadores.add(observer);
    }

    @Override
    public void removeObserver(int indice) {
        this.vetObservadores.remove(indice);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : vetObservadores) {
            observer.update(dados);
        }
    }
    
}
