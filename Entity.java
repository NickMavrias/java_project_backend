abstract class Entity {

    //pedia
    private String name;
    private String description;
    private int id;

    //cost
    public Entity(String name, String description, int id) {
        this.name = name;
        this.description = description;
        this.id = id;
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
