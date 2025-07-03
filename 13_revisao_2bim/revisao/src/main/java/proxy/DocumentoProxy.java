package proxy;

public class DocumentoProxy implements IDocumento {
    private Documento documento;

    public DocumentoProxy(Documento documento, String usuario, String senha){
        if (usuario.equals("admin") && senha.equals("admin")) {
             this.documento = documento;
        } else {
            throw new IllegalAccessError("Deu xabum!");
        }
       
    }

    @Override
    public String getTexto() {
        return this.documento.getTexto();
        
    }

    @Override
    public String getTitulo() {
        return this.documento.getTitulo();

    }

    @Override
    public double getTamanhoBytes() {
        return this.documento.getTamanhoBytes();

    }

    @Override
    public String getDono() {
        return this.getDono();
    }

    @Override
    public String getCaminho() {
        return this.documento.getCaminho();
    }

}
