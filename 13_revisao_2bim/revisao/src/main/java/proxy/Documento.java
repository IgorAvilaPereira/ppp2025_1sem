package proxy;

public class Documento implements Cloneable {
    private String texto;
    private String titulo;
    private double tamanhoBytes;
    private String dono;
    private String caminho;

    public String getTexto() {
        return texto;
    }
    public void setTexto(String texto) {
        this.texto = texto;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public double getTamanhoBytes() {
        return tamanhoBytes;
    }
    public void setTamanhoBytes(double tamanhoBytes) {
        this.tamanhoBytes = tamanhoBytes;
    }
    public String getDono() {
        return dono;
    }
    public void setDono(String dono) {
        this.dono = dono;
    }
    public String getCaminho() {
        return caminho;
    }
    public void setCaminho(String caminho) {
        this.caminho = caminho;
    }

    public Documento clone(){
        try {
            return (Documento) super.clone();
        } catch (CloneNotSupportedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }
    @Override
    public String toString() {
        return "Documento [texto=" + texto + ", titulo=" + titulo + ", tamanhoBytes=" + tamanhoBytes + ", dono=" + dono
                + ", caminho=" + caminho + "]";
    }

    
    

}
