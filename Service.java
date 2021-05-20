public class Service extends Entity{

    //const
    public Service(String name, String description, int id) {
        super(name, description, id);
    }

    //methods
    public String getDetails(){
        return "The material is Service";
    }
}
