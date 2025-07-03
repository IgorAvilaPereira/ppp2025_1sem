package decorator;

public class SanduicheVegano implements Sanduiche {

    @Override
    public String montar() {
        return "Sanduiche Vegano";
    }

    @Override
    public double preco() {
        return 10.0;
    }

}
