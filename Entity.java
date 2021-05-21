abstract class Entity {

    //pedia
    private String name;
    private String description;
    private int id;
    private int posotita;

    //cost
    public Entity(String name, String description, int id, int posotita) {
        this.name = name;
        this.description = description;
        this.id = id;
        this.posotita=posotita;
    }

    //setters
    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPosotita(int posotita) {
        this.posotita = posotita;
    }

    //getters
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getId() {
        return id;
    }

    public int getPosotita() {
        return posotita;
    }

    //methods
    public String getEntityInfo()
    {
        return name + description + id;
    }

    public String getDetails(){
        return getEntityInfo();
    }

    public String toString(){
        return getEntityInfo() + getDetails();
    }

}
