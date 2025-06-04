package negocio;

// import java.util.Observable;
// import java.util.Observer;

public class Estudante implements Observer {
    private int matricula;
    private String nome;

    

    public Estudante(String nome) {
        this.nome = nome;
    }

    


    public int getMatricula() {
        return matricula;
    }




    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }




    public String getNome() {
        return nome;
    }




    public void setNome(String nome) {
        this.nome = nome;
    }




    @Override
    public void update(Dados dados) {
        System.out.println(this.nome);
        System.out.println(dados.getUmidade());
        System.out.println(dados.getTemperatura());
        System.out.println("---------------------");
    }




    // @Override
    // public void update(Observable o, Object arg) {
    //     // TODO Auto-generated method stub
    //     throw new UnsupportedOperationException("Unimplemented method 'update'");
    // }
    
}
