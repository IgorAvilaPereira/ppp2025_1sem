package negocio.digimon_api;



public class Digimon {
    private int id;
    private String name;
    private String level;
    private String urlImage;


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
    public String getLevel() {
        return level;
    }
    public void setLevel(String level) {
        this.level = level;
    }
    public String getUrlImage() {
        return urlImage;
    }
    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }
    @Override
    public String toString() {
        return "Digimon [id=" + id + ", name=" + name + ", level=" + level + ", urlImage=" + urlImage + "]";
    }

    

}
