package prototype;

import proxy.Documento;

public class Main {
    public static void main(String[] args) {
        Documento modelo = new Documento();
        modelo.setTitulo("oioioi!");
        modelo.setDono("igor");
        Documento novoDocumento = modelo.clone();
        System.out.println(modelo.getDono());
        System.out.println(novoDocumento.getDono());
        System.out.println(modelo.hashCode());
        System.out.println(novoDocumento.hashCode());
       
        
        
    }

}
