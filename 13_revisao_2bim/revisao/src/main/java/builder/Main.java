package builder;

public class Main {
    public static void main(String[] args) {
        Carro igorCar = new Carro.CarroBuilder("Uno").cor("vermelha").temArCondicionado(true).builder();
        System.out.println(igorCar.isTemArCondicionado());
    }

}
