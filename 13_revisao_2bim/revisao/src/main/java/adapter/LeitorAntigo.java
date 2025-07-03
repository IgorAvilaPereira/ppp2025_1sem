package adapter;

public class LeitorAntigo {

    
    public String leituraAntiga() {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "Realizando a leitura de modo antigo";
    }

}
