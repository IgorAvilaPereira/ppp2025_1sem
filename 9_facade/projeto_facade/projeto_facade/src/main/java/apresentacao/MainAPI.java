package apresentacao;

import java.time.LocalDateTime;

import controller.ConsultaController;
import io.javalin.Javalin;

public class MainAPI {
    public static void main(String[] args) {
        ConsultaController consultaController = new ConsultaController();
        // System.out.println(consultaController.inserir(3, 1, LocalDateTime.now(), null));
        // System.out.println(consultaController.listar().toString());

        var app = Javalin.create(/*config*/)
            // .get("/", ctx -> ctx.result(consultaController.inserir(3, 1, LocalDateTime.now(), null).toString()))
            .get("/", ctx -> ctx.result(consultaController.listar().toString()))
            .start(7070);
    
    }
    
}
