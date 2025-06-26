package negocio;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Carona {
    private int id;
    private LocalDateTime dataHora;
    private ArrayList<Corrida> vetCorrida;

    public Carona(){
        this.vetCorrida = new ArrayList<>();
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public LocalDateTime getDataHora() {
        return dataHora;
    }
    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }
    public ArrayList<Corrida> getVetCorrida() {
        return vetCorrida;
    }
    public void setVetCorrida(ArrayList<Corrida> vetCorrida) {
        this.vetCorrida = vetCorrida;
    }


    


}
