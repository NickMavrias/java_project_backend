import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {

        Material milk = new Material("milk", "diarkeias", 1);
        Material sugar= new Material("sugar", "leukh", 2);
        Material rice= new Material("rice", "spirwto", 3);

        Service MedicalSupport=new Service("MedicalSupport", "Farmaka", 4);
        Service NurserySupport=new Service("NurserySupport", "Asthenoforo", 5);
        Service BabySitting=new Service("BabyASitting", "Mavrias", 6);

        Organization org1=new Organization("MermCef");
        org1.addEntity(milk);
        org1.addEntity(sugar);
        org1.addEntity(rice);

        org1.addService(MedicalSupport);
        org1.addService(NurserySupport);
        org1.addService(BabySitting);

        Admin papandreou=new Admin("Papandreou", "6948611507", true);
        Donator merm=new Donator("Merm", "6985715680");
        Beneficiary mavrias=new Beneficiary("Mavrias", "6943700507", 3);
        Beneficiary elonMusk=new Beneficiary("Musk", "6969420420", 5);

        RequestDonation RD=new RequestDonation();
        Requests R=new Requests();
        R.add(RD, mavrias, milk);

        RequestDonation RD1=new RequestDonation();
        Requests R1=new Requests();
        R1.add(RD1, mavrias, sugar);

        mavrias.requestsAdd(R, RD);
        mavrias.requestsAdd(R1, RD1);

        org1.listEntities();
        org1.listServicies();

        /*Scanner scanf=new Scanner(System.in);

        System.out.println("Dwse to thlefwno sou: ");
        long thlefwno=scanf.nextLong();*/


    }
}
