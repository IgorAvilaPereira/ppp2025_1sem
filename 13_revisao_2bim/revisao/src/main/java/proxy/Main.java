package proxy;

public class Main {
    public static void main(String[] args) {
        Documento documento = new Documento();
        documento.setCaminho("/home/iapereira/teste.txt");
        documento.setTitulo("Teste");
        IDocumento doc = new DocumentoProxy(documento, "admin2", "admin");
    }

}
