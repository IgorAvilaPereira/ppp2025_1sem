package decorator;

public abstract class IngredienteDecorator implements Sanduiche {
    protected Sanduiche sanduiche;

    public IngredienteDecorator(Sanduiche sanduiche) {
        this.sanduiche = sanduiche;
    }

    @Override
    public String montar() {
        return this.sanduiche.montar() + "\n"+this.getClass().getSimpleName();
    }

    

}
