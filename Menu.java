import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {

        Scanner scanf=new Scanner(System.in);

        //obj org

        Organization org1=new Organization("MermCef");

        //entities

        Material milk = new Material("milk", "diarkeias", 1, 6);
        Material sugar= new Material("sugar", "leukh", 2, 15);
        Material rice= new Material("rice", "spirwto", 3, 9);

        Service MedicalSupport=new Service("MedicalSupport", "Farmaka", 4, 500);
        Service NurserySupport=new Service("NurserySupport", "Asthenoforo", 5, 20);
        Service BabySitting=new Service("BabySitting", "Mavrias", 6, 69);

        //adding entities

        org1.addEntity(milk);
        org1.addEntity(sugar);
        org1.addEntity(rice);

        org1.addService(MedicalSupport);
        org1.addService(NurserySupport);
        org1.addService(BabySitting);

        //creating Users

        Admin papandreou=new Admin("Papandreou", "123", true);
        Donator merm=new Donator("Merm", "6988888888");
        Beneficiary mavrias=new Beneficiary("Mavrias", "6944444444", 3);
        Beneficiary elonMusk=new Beneficiary("Musk", "6969420420", 5);


        //adding Beneficiaries
        org1.insertBeneficiary(mavrias);
        org1.insertBeneficiary(elonMusk);


        //creating requests & adding

        RequestDonation RD=new RequestDonation();
        Requests R=new Requests();
        R.add(RD, mavrias, milk, 1);

        RequestDonation RD1=new RequestDonation();
        Requests R1=new Requests();
        R1.add(RD1, mavrias, sugar, 5);

        mavrias.requestsAdd(R, RD);
        mavrias.requestsAdd(R1, RD1);

        //creating donations & adding

        Offers prosfora1 = new Offers();
        prosfora1.commit(org1, milk);

        Offers prosfora2 = new Offers();
        prosfora2.commit(org1, sugar);

        // -----------------------------------------------------//

        System.out.println("Dwse to thlefwno sou: ");
        String thlefwno=scanf.nextLine();

        ArrayList<Admin> Admins=new ArrayList<>();
        ArrayList<Donator> Donors=new ArrayList<>();
        ArrayList<Beneficiary> Beneficiaries=new ArrayList<>();

        Admins.add(papandreou);
        Donors.add(merm);
        Beneficiaries.add(mavrias);
        Beneficiaries.add(elonMusk);

        //dokimes tilefwnou

        if(thlefwno.equals(papandreou.getPhone())) {
            System.out.println("Kalwirthate k. " + papandreou.getName() + " ston organismo mas!\nPragmatopoihsate eisodo ws admin. ");
            System.out.println("To thlefwno sas einai: " + papandreou.getPhone() + "\n");

            int choice_geniki;
            System.out.println("Ti tha thelate na kanete ? ");
            System.out.println("1: View\n2: Monitor Organization\n3: Back\n4: Logout\n5: Exit");
            choice_geniki = scanf.nextInt();
            if (choice_geniki == 1) {
                //Leitourgia 1 tou admin
                int choice1;
                System.out.println("Ti thelete na deite ? ");
                System.out.println("1: Materials \n2: Services");
                choice1 = scanf.nextInt();

                if (choice1 == 1) {
                    System.out.println("Materials: ");
                    org1.listEntities();

                } else if (choice1 == 2) {
                    System.out.println("Services: ");
                    org1.listServicies();

                } else {
                    System.out.println("Edwses lathos epilogi.");
                }

            } else if (choice_geniki == 2) {
                //Leitourgia 2 tou admin
                int choice2;
                System.out.println("Ti thelete na deite ? ");
                System.out.println("1: Thn lista me Beneficiaries \n2: Thn lista me tous donators \n3: Reset ths BeneficiariesList ");
                choice2 = scanf.nextInt();

                if (choice2==1) {
                    org1.listBeneficiaries();
                    int choice_beneficiary;
                    System.out.println("Epilekste poion beneficiary thelete na epeksergasteite: ");
                    choice_beneficiary = scanf.nextInt();

                    if (choice_beneficiary == 1) {

                    } else if (choice_beneficiary == 2) {

                    }

                } else if (choice2==2) {


                } else if (choice2==3) {


                } else {

                }
            }
        }


        else if(thlefwno==merm.getPhone()){


        }
        else if(thlefwno==mavrias.getPhone() || thlefwno==elonMusk.getPhone()){


        }
        else{


        }

    }
}
