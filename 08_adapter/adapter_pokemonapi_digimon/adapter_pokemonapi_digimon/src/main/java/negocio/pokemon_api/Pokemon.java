package negocio.pokemon_api;

public class Pokemon {
    private int id;
    private String name;
    private String urlImage;
    private String type;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getUrlImage() {
        return urlImage;
    }
    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    @Override
    public String toString() {
        return "Pokemon [id=" + id + ", name=" + name + ", urlImage=" + urlImage + ", type=" + type + "]";
    }

    
    
    
}
