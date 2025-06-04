package negocio.digimon_api;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

import org.json.JSONException;
import org.json.JSONObject;


public class DigimonAPI {
    public static final String URL = "https://digi-api.com/api/v1/digimon/";

    public String informationResult(String name) throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .timeout(Duration.ofSeconds(10))
                .uri(URI.create(URL+name))
                .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        // System.out.println(response.statusCode());
        return response.body();
    }

    public Digimon getDigimon(String name) throws JSONException, IOException, InterruptedException{
        Digimon digimon = new Digimon();
        JSONObject objectResponse = new JSONObject(this.informationResult(name));
        // System.out.println(o);
        digimon.setId(objectResponse.getInt("id"));
        digimon.setName(objectResponse.getString("name"));
        digimon.setLevel(objectResponse.getJSONArray("levels").getJSONObject(0).getString("level"));
        digimon.setUrlImage(objectResponse.getJSONArray("images").getJSONObject(0).getString("href"));
        return digimon;
    }

}
