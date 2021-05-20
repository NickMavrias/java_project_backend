public class RequestDonation {

    //pedia
    private Entity entity;
    private double quantity;

    //const
    public RequestDonation(Entity entity, double quantity) {
        this.entity = entity;
        this.quantity = quantity;
    }

    public RequestDonation() {

    }

    //setters
    public void setEntity(Entity entity) {
        this.entity = entity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    //getters
    public Entity getEntity() {
        return entity;
    }

    public double getQuantity() {
        return quantity;
    }

    //methods
    public String checkQuantity(){
        return "This donation includes " + getQuantity();
    }

    public boolean checkID(){
        if(this.entity.getId()==entity.getId()){
            return true;
        }
        else return false;
    }
}
