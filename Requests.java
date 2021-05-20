public class Requests extends RequestDonationList{

    //methods
    public boolean validRequestDonation(RequestDonation RD, Beneficiary B, Material M){

        boolean boll=false;

        if(B.getNoPersons()==1){
            if(RD.getQuantity()<=M.getLevel1()) {
                boll=true;
            }
        }
        else if(B.getNoPersons()>=2 && B.getNoPersons()<=4){
            if(RD.getQuantity()<=M.getLevel2()) {
                boll=true;
            }
        }
        else if(B.getNoPersons()>=5) {
            if (RD.getQuantity() <= M.getLevel3()) {
                boll = true;
            }
        }
        return boll;

    }

    public void add(RequestDonation RD, Beneficiary B, Material M) {
        if(validRequestDonation(RD , B, M)){
            super.add(RD);
        }
    }

    public void modify(RequestDonation RD, Beneficiary B, Material M) {
        if(validRequestDonation(RD, B, M)){
            super.modify(RD);
        }
    }

    public void commit(RequestDonation RD, Beneficiary B, Material M){
       try {
           if (validRequestDonation(RD, B, M)) {
                rdEntities.remove(RD);
           }
       }
       catch(Exception e){
           System.out.println("Ekanes malakia");
       }
    }

}