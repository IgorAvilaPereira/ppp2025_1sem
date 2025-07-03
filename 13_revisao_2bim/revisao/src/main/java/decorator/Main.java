package decorator;

public class Main {
    public static void main(String[] args) {
        Sanduiche sanduiche = new SanduichePadrao();
        sanduiche = new CarneVermelha(sanduiche);
        sanduiche = new Queijo(sanduiche);

        System.out.println("Sanduiche + Ingredientes:\n"+sanduiche.montar());
        System.out.println("Preço total:"+sanduiche.preco());

        System.out.println("====================");

        Sanduiche sanduicheVegano = new SanduicheVegano();
        sanduicheVegano = new CarneVermelha(sanduicheVegano);
        System.out.println("Sanduiche + Ingredientes:\n"+sanduicheVegano.montar());
        System.out.println("Preço total:"+sanduicheVegano.preco());

    }
}