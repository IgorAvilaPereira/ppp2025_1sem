package decorator;

public class Queijo extends IngredienteDecorator {

    public Queijo(Sanduiche sanduiche) {
        super(sanduiche);
    }

    @Override
    public double preco() {
        return this.sanduiche.preco() + 1.99;
    }

}
