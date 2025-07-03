package decorator;

public class CarneVermelha extends IngredienteDecorator {

    public CarneVermelha(Sanduiche sanduiche) {
        super(sanduiche);
    }

    @Override
    public double preco() {
        return this.sanduiche.preco() + 5.99;
    }
}
