package adapter;

public class Main {
    public static void main(String[] args) {
        Leitor adaptador = new Adaptador(new LeitorAntigo());
        Leitor leitorModerno = new LeitorModerno();        
        // System.out.println(adaptador.leitura());
        // System.out.println(leitorModerno.leitura());
        System.out.println(adaptador instanceof Leitor);
        System.out.println(leitorModerno instanceof Leitor);
        
    }

}
