package facade;

public class MainComFacade {
    public static void main(String[] args) {
        PedidoFacade pedidoFacade = new PedidoFacade("Igor", "igor.pereira@riogrande.ifrs.edu.br", new Produto("Fender Stratocaster", 1000), 1);
        System.out.println(pedidoFacade.getPedido()); 
    }

}
