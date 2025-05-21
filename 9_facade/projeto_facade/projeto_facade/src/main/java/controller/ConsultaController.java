package controller;

import java.time.LocalDateTime;

import org.json.JSONArray;
import org.json.JSONObject;

import service.ConsultaService;

public class ConsultaController {
    private ConsultaService consultaService;

    public ConsultaController(){
        this.consultaService = new ConsultaService();
    }

    public JSONArray listar(){
        this.consultaService.listar().forEach(p -> System.out.println(p.getId()));
        return new JSONArray(this.consultaService.listar());
    }

    public JSONObject inserir(int medicoID, int pacienteID, LocalDateTime dataHora, String observacao){
        return new JSONObject(this.consultaService.inserir(medicoID, pacienteID, dataHora, observacao));
    }

}
