import java.util.ArrayList;

public class Organization {


    //const
    public Organization(String name) {
        this.name = name;
    }

    //pedia
    private String name;
    private Admin admin;
    private ArrayList<Entity> entityList = new ArrayList<Entity>();
    private ArrayList<Donator> donatorList = new ArrayList<Donator>();
    private ArrayList<Beneficiary> beneficiaryList = new ArrayList<Beneficiary>();
    private RequestDonationList currentDonations;
    private ArrayList<Service> serviceList=new ArrayList<>();
    private int counter;

    //setters
    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    //getters
    public boolean getAdmin() {
        return admin.getAdmin();
    }

    //methods
    public void addEntity(Entity obj) {
        try {
            entityList.add(obj);
        } catch (Exception e) {
            System.out.print("Exception");
        }
    }

    public void removeEntity(Entity obj) {
        if (getAdmin()) {
            entityList.remove(obj);
        }
    }

    public void insertDonator(Donator donor) {
        try {
            donatorList.add(donor);
        } catch (Exception e) {
            System.out.print("Exception");
        }
    }

    public void removeDonator(Donator donor) {
        donatorList.remove(donor);
    }

    public void insertBeneficiary(Beneficiary benefit) {
        try {
            beneficiaryList.add(benefit);
        } catch (Exception e) {
            System.out.print("Exception");
        }
    }

    public void removeBeneficiary(Beneficiary benefit) {
        beneficiaryList.remove(benefit);
    }

    public void listEntities() {
        counter=0;
        for (Entity i : entityList) {
            System.out.println(++counter + ". " + i.getName() + " " +  i.getDescription() + " " + i.getId() + " (" + i.getPosotita() + ") ");
        }
        System.out.println();
    }

    public void listBeneficiaries() {
        counter=0;
        for (Beneficiary k : beneficiaryList) {
            System.out.println(++counter + ". " + k.getName());
        }
        System.out.println();
    }

    public void listDonators() {
        counter=0;
        for (Donator i : donatorList) {
            System.out.println(++counter + ". " + i.getName());
        }
        System.out.println();
    }

    public void addService(Service S){
        serviceList.add(S);
    }

    public void removeService(Service S){
        serviceList.remove(S);
    }

    public void listServicies(){
        counter=0;
        for(Service i: serviceList){
            System.out.println(++counter + ". " + i.getName() + " " +  i.getDescription() + " " + i.getId() + " (" + i.getPosotita() + ") ");
        }
        System.out.println();
    }
}
