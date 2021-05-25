import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {


    public static void main(String[] args) {

        Scanner scanf = new Scanner(System.in);

        //obj org

        Organization org1 = new Organization("MermCef");

        //entities

        Material milk = new Material("milk", "diarkeias", 1, 6);
        Material sugar = new Material("sugar", "leukh", 2, 15);
        Material rice = new Material("rice", "spirwto", 3, 9);

        Service MedicalSupport = new Service("MedicalSupport", "Farmaka", 4, 500);
        Service NurserySupport = new Service("NurserySupport", "Asthenoforo", 5, 20);
        Service BabySitting = new Service("BabySitting", "Mavrias", 6, 69);

        //adding entities

        org1.addEntity(milk);
        org1.addEntity(sugar);
        org1.addEntity(rice);

        org1.addService(MedicalSupport);
        org1.addService(NurserySupport);
        org1.addService(BabySitting);

        //creating Users

        Admin papandreou = new Admin("Papandreou", "123", true);
        Donator merm = new Donator("Merm", "456");
        Beneficiary mavrias = new Beneficiary("Mavrias", "6944444444", 3);
        Beneficiary elonMusk = new Beneficiary("Musk", "6969420420", 5);


        //adding Beneficiaries
        org1.insertBeneficiary(mavrias);
        org1.insertBeneficiary(elonMusk);


        //creating requests & adding

        RequestDonation RD = new RequestDonation();
        Requests R = new Requests();
        R.add(RD, mavrias, milk, 1);

        RequestDonation RD1 = new RequestDonation();
        Requests R1 = new Requests();
        R1.add(RD1, mavrias, sugar, 5);

        mavrias.requestsAdd(R, RD);
        mavrias.requestsAdd(R1, RD1);

        RequestDonation RD2 = new RequestDonation();
        Requests R2 = new Requests();
        R2.add(RD2, elonMusk, milk, 1);
        elonMusk.requestsAdd(R2, RD2);

        RequestDonation RD3 = new RequestDonation();
        Requests R3 = new Requests();
        R3.add(RD3, elonMusk, sugar, 1);
        elonMusk.requestsAdd(R3, RD3);

        //creating donations & adding

        Offers prosfora1 = new Offers();
        prosfora1.commit(org1, milk);

        Offers prosfora2 = new Offers();
        prosfora2.commit(org1, sugar);

        //adding donators & donations
        Offers prosfora = new Offers();
        org1.insertDonator(merm);
        merm.setOffersList(prosfora, RD);
        merm.setOffersList(prosfora, RD1);
        merm.setOffersList(prosfora, RD2);


        // -----------------------------------------------------//

        System.out.println("Dwse to thlefwno sou: ");
        String thlefwno = scanf.nextLine();

        ArrayList<Admin> Admins = new ArrayList<>();
        ArrayList<Donator> Donors = new ArrayList<>();
        ArrayList<Beneficiary> Beneficiaries = new ArrayList<>();

        Admins.add(papandreou);
        Donors.add(merm);
        Beneficiaries.add(mavrias);
        Beneficiaries.add(elonMusk);

        //dokimes tilefwnou
        //ADMIN
        if (thlefwno.equals(papandreou.getPhone())) {
            System.out.println("Kalwirthate k. " + papandreou.getName() + " ston organismo mas!\nPragmatopoihsate eisodo ws admin. ");
            System.out.println("To thlefwno sas einai: " + papandreou.getPhone() + "\n");

            //genikes epiloges

            int choice_geniki;
            System.out.println("Ti tha thelate na kanete ? ");
            System.out.println("1: View\n2: Monitor Organization\n3: Back\n4: Logout\n5: Exit");
            choice_geniki = scanf.nextInt();

            //epilogi 1-View
            switch (choice_geniki) {
                case 1:

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
                    break;

                // epilogi 2 - Monitor

                case 2:
                    int choice2;
                    System.out.println("Ti thelete na deite ? ");
                    System.out.println("1: Thn lista me Beneficiaries \n2: Thn lista me tous donators \n3: Reset ths BeneficiariesList ");
                    choice2 = scanf.nextInt();

                    if (choice2 == 1) {
                        org1.listBeneficiaries();
                        int choice_beneficiary;
                        System.out.println("Epilekste poion beneficiary thelete na epeksergasteite: ");
                        choice_beneficiary = scanf.nextInt();

                        if (choice_beneficiary == 1) {

                            org1.listServicies();
                            int epilogiClear;
                            System.out.println("Thelete na kanete clear th receivedList tou mavria ? ");
                            System.out.println("1. Nai\n2. Oxi");
                            epilogiClear = scanf.nextInt();
                            if (epilogiClear == 1) {
                                mavrias.requestsDonationListRemove(R, RD);
                                mavrias.requestsDonationListRemove(R1, RD1);
                                System.out.println("Egine clear ths receivedList tou mavria! ");
                            } else if (epilogiClear == 2) {
                                System.out.println("Den pragmatopoithike clear sthn receivedList tou mavria! ");
                            }

                            int epilogiDiagrafis;
                            System.out.println("Tha thelate na diagrapsete ton Mavria apo beneficiary ? ");
                            System.out.println("1. Nai\n2. Oxi");
                            epilogiDiagrafis = scanf.nextInt();
                            if (epilogiDiagrafis == 1) {
                                org1.removeBeneficiary(mavrias);
                                System.out.println("Oi neoi benefiaries einai: ");
                                org1.listBeneficiaries();
                            } else if (epilogiDiagrafis == 2) {
                                System.out.println("Den pragmatopoihthike kamia diagrafi! ");
                            }


                        } else if (choice_beneficiary == 2) {

                            org1.listServicies();
                            int epilogiClear;
                            System.out.println("Thelete na kanete clear th receivedList tou Elon Musk ? ");
                            System.out.println("1. Nai\n2. Oxi");
                            epilogiClear = scanf.nextInt();
                            if (epilogiClear == 1) {
                                elonMusk.requestsDonationListRemove(R2, RD2);
                                elonMusk.requestsDonationListRemove(R3, RD3);
                                System.out.println("Egine clear ths receivedList tou Elon Musk! ");
                            } else if (epilogiClear == 2) {
                                System.out.println("Den pragmatopoithike clear sthn receivedList tou Elon Musk! ");
                            }
                            int epilogiDiagrafis;
                            System.out.println("Tha thelate na diagrapsete ton Elon Musk apo beneficiary ? ");
                            System.out.println("1. Nai\n2. Oxi");
                            epilogiDiagrafis = scanf.nextInt();
                            if (epilogiDiagrafis == 1) {
                                org1.removeBeneficiary(elonMusk);
                                System.out.println("Oi neoi benefiaries einai: ");
                                org1.listBeneficiaries();
                            } else if (epilogiDiagrafis == 2) {
                                System.out.println("Den pragmatopoihthike kamia diagrafi! ");
                            }
                        }
                    } else if (choice2 == 2) {
                        org1.listDonators();
                        int epilogiDonator;
                        System.out.println("Poion donator tha thelate na epileksete ? ");
                        org1.listDonators();
                        epilogiDonator = scanf.nextInt();
                        if (epilogiDonator == 1) {

                            org1.listEntities();

                            int epilogiDiagrafi;
                            System.out.println("Tha thelate na diagrapsete ton donator ? ");
                            System.out.println("1. Nai\n2. Oxi");
                            epilogiDiagrafi = scanf.nextInt();
                            if (epilogiDiagrafi == 1) {
                                org1.removeDonator(merm);
                                System.out.println("Egine diagraphh tou donator Merm! ");
                            } else {
                                System.out.println("Den egine kamia diagraphh! ");
                            }

                        } else {
                            System.out.println("Dwsate donator pou den uparxei! ");
                        }

                    } else if (choice2 == 3) {
                        System.out.println("Ginetai katharismos twn receivedList twn Beneficiaries! ");
                        mavrias.requestsDonationListRemove(R, RD);
                        mavrias.requestsDonationListRemove(R1, RD1);
                        elonMusk.requestsDonationListRemove(R2, RD2);
                        elonMusk.requestsDonationListRemove(R3, RD3);
                        System.out.println("Egine katharismos twn receivedList twn Beneficiaries!");

                    } else {
                        System.out.println("Dwsate lanthasmeni epilogh! ");
                    }
                    break;
                //choice geniki 3
                case 3:
                    break;
                case 4:
                    System.out.println("Pragmatopoihsh eksodou! ");

                    int neaSindesi;
                    System.out.println("Thelete na kanete nea sundesi ? ");
                    System.out.println("1. Nai\n2. Oxi");
                    neaSindesi = scanf.nextInt();

                    if (neaSindesi == 1) {
                        System.out.println("Dwse thlefwno: ");
                        thlefwno = scanf.next();
                    } else if (neaSindesi == 2) {
                        System.exit(0);
                    } else if (neaSindesi != 1 && neaSindesi != 2) {
                        System.out.println("Dwsate lanthasmeni epilogi, ginetai eksodos! ");
                        System.exit(0);
                    }
                case 5:
                    System.out.println("Eksodos programmatos! ");
                    System.exit(0);
                default:
                    System.out.println("Dwsate lanthasmeni epilogi! ");
                    break;

                //telos admin
                //arxi toy donator

            }

        //DONATOR
        } else if (thlefwno.equals(merm.getPhone())) {
            System.out.println("Kalwirthate k. " + merm.getName() + " ston organismo mas!\nPragmatopoihsate eisodo ws donator. ");
            System.out.println("To thlefwno sas einai: " + merm.getPhone() + "\n");

            int choice_geniki;
            System.out.println("Ti tha thelate na kanete ? ");
            System.out.println("1: Add Offer\n2: Show Offers\n3: Commit\n4: Back\n5: Logout\n6: Exit ");
            choice_geniki = scanf.nextInt();

            switch (choice_geniki) {
                case 1:
                    System.out.println("Ti tha thelate na deite ? ");
                    System.out.println("1. Materials\n2. Services ");
                    int choice1;
                    choice1 = scanf.nextInt();
                    if (choice1 == 1) {
                        System.out.println("Materials: ");
                        org1.listEntities();
                        System.out.println("Tha thelate na prosferete kapoio material ? (y/n) ");
                        String epilogiAdd = scanf.next();
                        if (epilogiAdd.equals("y")) {
                            System.out.println("Ti tha thelate na prosthesete ? (dwste onomasia Material) ");
                            org1.listEntities();
                            String epilogiMaterial = scanf.next();
                            switch (epilogiMaterial) {
                                case "milk":
                                    System.out.println("Dwste posotita: ");
                                    int posotita = scanf.nextInt();
                                    milk.setPosotita(milk.getPosotita() + posotita);
                                    org1.addEntity(milk);
                                    System.out.println("Egine h prosthikh milk!\nEuxaristoume! ");
                                    break;
                                case "sugar":
                                    System.out.println("Dwste posotita: ");
                                    int posotita1 = scanf.nextInt();
                                    sugar.setPosotita(sugar.getPosotita() + posotita1);
                                    org1.addEntity(sugar);
                                    System.out.println("Egine h prosthikh sugar!\nEuxaristoume! ");
                                    break;
                                case "rice":
                                    System.out.println("Dwste posotita: ");
                                    int posotita2 = scanf.nextInt();
                                    rice.setPosotita(rice.getPosotita() + posotita2);
                                    org1.addEntity(rice);
                                    System.out.println("Egine h prosthikh rice!\nEuxaristoume! ");
                                    break;
                                default:
                                    System.out.println("Dwsate epilogi pou den uparxei! ");
                                    break;
                            }
                        } else if (epilogiAdd.equals("n")) {
                            System.out.println("De pragmatopoieitai kanena add! ");
                        }

                    } else if (choice1 == 2) {
                        System.out.println("Services: ");
                        org1.listServicies();
                        System.out.println("Tha thelate na prosferete kapoio service ? (y/n) ");
                        String epilogiAdd = scanf.next();
                        if (epilogiAdd.equals("y")) {
                            System.out.println("Ti tha thelate na prosthesete ? (Dwste onomasia Service) ");
                            org1.listServicies();
                            String epilogiService = scanf.next();
                            switch (epilogiService) {
                                case "MedicalSupport":
                                    System.out.println("Dwste wres: ");
                                    int posotita = scanf.nextInt();
                                    MedicalSupport.setPosotita(MedicalSupport.getPosotita() + posotita);
                                    org1.addService(MedicalSupport);
                                    System.out.println("Egine h prosthikh MedicalSupport!\nEuxaristoume! ");
                                    break;
                                case "NurserySupport":
                                    System.out.println("Dwste wres: ");
                                    int posotita1 = scanf.nextInt();
                                    NurserySupport.setPosotita(NurserySupport.getPosotita() + posotita1);
                                    org1.addService(NurserySupport);
                                    System.out.println("Egine h prosthikh NurserySupport!\nEuxaristoume! ");
                                    break;
                                case "BabySitting":
                                    System.out.println("Dwste wres: ");
                                    int posotita2 = scanf.nextInt();
                                    BabySitting.setPosotita(BabySitting.getPosotita() + posotita2);
                                    org1.addService(BabySitting);
                                    System.out.println("Egine h prosthikh BabySitting!\nEuxaristoume! ");
                                    break;
                            }
                        }
                    }
                    break;
                case 2:
                    System.out.println("Ta offers tou donator " + merm.getName() + ": ");
                    System.out.println("1. Milk\n2. Sugar\n3. Rice ");
                    System.out.println("Ti tha thelate na kanete ?\n1. Epilogi Paroxis kai Epeksergasia auths\n2. Katharismos Paroxwn\n3. Commit ");
                    int Vasiki;
                    Vasiki = scanf.nextInt();
                    if (Vasiki == 1) {
                        int epilogi;
                        System.out.println("1. Milk\n2. Sugar\n3. Rice ");
                        System.out.println("Epelekse ena offer: (dwse noumero) ");
                        epilogi = scanf.nextInt();
                        switch (epilogi) {
                            case 1:
                                System.out.println("Tha thelate na diagrapsete thn paroxh milk ? (y/n) ");
                                String YN;
                                YN = scanf.next();
                                if (YN.equals("y")) {
                                    merm.remOffersList(prosfora, RD);
                                    System.out.println("Egine diagrafi tou milk apo paroxi! ");
                                } else if (YN.equals("n")) {
                                    System.out.println("Den egine kamia diagrafi paroxis! ");
                                }
                                break;
                            case 2:
                                System.out.println("Tha thelate na diagrapsete thn paroxh sugar ? (y/n) ");
                                String YN1;
                                YN1 = scanf.next();
                                if (YN1.equals("y")) {
                                    merm.remOffersList(prosfora, RD1);
                                    System.out.println("Egine diagrafi tou sugar apo paroxi! ");
                                } else if (YN1.equals("n")) {
                                    System.out.println("Den egine kamia diagrafi paroxis! ");
                                }
                                break;
                            case 3:
                                System.out.println("Tha thelate na diagrapsete thn paroxh sugar ? (y/n) ");
                                String YN2;
                                YN2 = scanf.next();
                                if (YN2.equals("y")) {
                                    merm.remOffersList(prosfora, RD2);
                                    System.out.println("Egine diagrafi tou rice apo paroxi! ");
                                } else if (YN2.equals("n")) {
                                    System.out.println("Den egine kamia diagrafi paroxis! ");
                                }
                                break;
                            default:
                                System.out.println("Dosate paroxi pou den uparxei! ");
                                break;
                        }
                    } else if (Vasiki == 2) {
                        merm.remOffersList(prosfora, RD);
                        merm.remOffersList(prosfora, RD1);
                        merm.remOffersList(prosfora, RD2);
                        System.out.println("Eginan oles oi diagrafes! ");
                    } else if (Vasiki == 3) {
                        prosfora.commit(org1, milk);
                        prosfora.commit(org1, sugar);
                        prosfora.commit(org1, rice);
                        System.out.println("Pragmatopoihthike h commit! ");
                    } else if (Vasiki != 1 && Vasiki != 2 && Vasiki != 3) {
                        System.out.println("Dwsate lanthasmeni epilogi! ");
                    }
                    break;

                case 3:
                    System.out.println("Tha ginei xrisi ths commit! ");
                    prosfora.commit(org1, milk);
                    prosfora.commit(org1, sugar);
                    prosfora.commit(org1, rice);
                    System.out.println("Oloklhrwthke h commit! ");
                    break;
                case 4:
                    break;
                case 5:
                    System.out.println("Pragmatopoihsh eksodou! ");

                    int neaSindesi;
                    System.out.println("Thelete na kanete nea sundesi ? ");
                    System.out.println("1. Nai\n2. Oxi");
                    neaSindesi = scanf.nextInt();

                    if (neaSindesi == 1) {
                        System.out.println("Dwse thlefwno: ");
                        thlefwno = scanf.next();
                    } else if (neaSindesi == 2) {
                        System.exit(0);
                    } else if (neaSindesi != 1 && neaSindesi != 2) {
                        System.out.println("Dwsate lanthasmeni epilogi, ginetai eksodos! ");
                        System.exit(0);
                    }
                case 6:
                    System.out.println("Eksodos programmatos! ");
                    System.exit(0);
                default:
                    System.out.println("Dwsate lanthasmeni epilogi! ");
                    break;
            }

        //BENEFICIARIES
        } else if (thlefwno.equals(mavrias.getPhone())) {
            System.out.println("Kalwirthate k. " + mavrias.getName() + " ston organismo mas!\nPragmatopoihsate eisodo ws donator. ");
            System.out.println("To thlefwno sas einai: " + mavrias.getPhone() + "\n");

        }

    }
}

//telos askisis
