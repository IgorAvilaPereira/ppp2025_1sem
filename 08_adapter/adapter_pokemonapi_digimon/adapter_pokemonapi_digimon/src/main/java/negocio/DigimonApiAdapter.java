package negocio;

import java.io.IOException;

import org.json.JSONObject;

import negocio.digimon_api.DigimonAPI;
import negocio.pokemon_api.API;

public class DigimonApiAdapter implements API {
    private DigimonAPI digimonAPI;

    public DigimonApiAdapter(DigimonAPI digimonAPI){
        this.digimonAPI = digimonAPI;
    }

    @Override
    public JSONObject info(String pokemonName) throws IOException, InterruptedException {
        return new JSONObject(this.digimonAPI.informationResult(pokemonName));
    }
    
}
