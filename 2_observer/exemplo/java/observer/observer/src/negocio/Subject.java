package negocio;

public interface Subject {
    public void addObserver(Observer observer);
    public void removeObserver(int indice);
    public void notifyObservers();
    
}
