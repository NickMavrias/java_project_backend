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
            System.out.print("Ekanes malakia");
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
            System.out.print("Ekanes malakia");
        }
    }

    public void removeDonator(Donator donor) {
        donatorList.remove(donor);
    }

    public void insertBeneficiary(Beneficiary benefit) {
        try {
            beneficiaryList.add(benefit);
        } catch (Exception e) {
            System.out.print("Ekanes malakia");
        }
    }

    public void removeBeneficiary(Beneficiary benefit) {
        beneficiaryList.remove(benefit);
    }

    public void listEntities() {
        for (Entity i : entityList) {
            System.out.println(i.getName() + " " +  i.getDescription() + " " + i.getId() + " ");
        }
        System.out.println();
    }

    public void listBeneficiaries() {
        for (Beneficiary k : beneficiaryList) {
            System.out.print(k);
        }
        System.out.println();
    }

    public void listDonators() {
        for (Donator j : donatorList) {
            System.out.print(j);
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
        for(Service i: serviceList){
            System.out.println(i.getName() + " " +  i.getDescription() + " " + i.getId() + " ");
        }
        System.out.println();
    }
}