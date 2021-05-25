
public class Offers extends RequestDonationList{

    //const
    public Offers() {
    }

    //methods
    public void commit(Organization Or, Entity En){
        try{
            Or.addEntity(En);
        }catch (Exception ex){
            System.out.println("Prostethike to Entity sth lista");
        }finally {
            rdEntities.clear();
        }
    }
}

