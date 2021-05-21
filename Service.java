public class Service extends Entity{

    //const
    public Service(String name, String description, int id, int posotita) {
        super(name, description, id, posotita);
    }

    //methods
    public String getDetails(){
        return "The material is Service";
    }
}
