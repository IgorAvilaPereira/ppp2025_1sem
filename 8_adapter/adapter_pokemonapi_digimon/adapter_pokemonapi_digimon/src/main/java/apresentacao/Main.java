package apresentacao;

import java.io.IOException;

import negocio.DigimonAdapter;
import negocio.DigimonApiAdapter;
import negocio.digimon_api.Digimon;
import negocio.digimon_api.DigimonAPI;
import negocio.pokemon_api.PokemonAPI;
import negocio.pokemon_api.API;
import negocio.pokemon_api.Pokemon;


public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        PokemonAPI apiPokemonAPI = new PokemonAPI();
        // System.out.println(apiPokemonAPI.info("pikachu").toString());
        Pokemon pokemon = apiPokemonAPI.getPokemon("pikachu");

        DigimonAPI apiDigimonAPI = new DigimonAPI();
        // System.out.println(apiDigimonAPI.informationResult("Patamon"));
        Digimon digimon = apiDigimonAPI.getDigimon("Patamon");

        System.out.println("Adapter pokemon");
        DigimonAdapter digimonApiAdapter = new DigimonAdapter(digimon);
        if (digimonApiAdapter instanceof Pokemon) {
            System.out.println("OK");
        }



        // System.out.println("Adapter API");
        // API apiDigimonApiAdapter = new DigimonApiAdapter(apiDigimonAPI);
        // System.out.println(apiDigimonApiAdapter.info("Angemon").getJSONArray("images").getJSONObject(0).getString("href"));

        // if (apiDigimonApiAdapter instanceof API){
        //     System.out.println("ok");
        // }


    }
}