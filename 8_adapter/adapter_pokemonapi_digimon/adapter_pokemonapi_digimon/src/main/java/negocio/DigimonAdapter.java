package negocio;

import negocio.digimon_api.Digimon;
import negocio.pokemon_api.Pokemon;

public class DigimonAdapter extends Pokemon {
    private Digimon digimon;

    public DigimonAdapter(Digimon digimon) {
        this.digimon = digimon;
    }

    public int getId() {
        return this.digimon.getId();
    }

    public void setId(int id) {
        this.digimon.setId(id);
    }

    public String getName() {
        return this.digimon.getName();
    }

    public void setName(String name) {
        this.digimon.setName(name);
    }

    public String getUrlImage() {
        return this.digimon.getUrlImage();
    }

    public void setUrlImage(String urlImage) {
        this.digimon.setUrlImage(urlImage);
    }

    public String getType() {
        return this.digimon.getLevel();
    }

    public void setType(String type) {
        this.digimon.setLevel(type);
    }

    @Override
    public String toString() {
        return this.digimon.toString();
    }

}
