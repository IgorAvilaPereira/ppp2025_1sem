package decorator;

public class SanduichePadrao implements Sanduiche {

    @Override
    public String montar() {
        return this.getClass().getSimpleName();
    }

    @Override
    public double preco() {
        return 1.99;
    }

}
