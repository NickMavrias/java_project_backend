import java.util.ArrayList;

public class RequestDonationList {

    ArrayList<RequestDonation> rdEntities = new ArrayList<>();

    //methods
     public RequestDonation get(Entity id){
          return rdEntities.get(id.getId());
     }

     public void add(RequestDonation RD){
         rdEntities.add(RD);
         if(rdEntities.contains(RD)){
             RequestDonation RD1 = new RequestDonation();
             rdEntities.add(RD1);
         }
         else try{
         }
         catch(Exception e){
             System.out.println("Ekanes malakia");
         }
     }

     public void remove(RequestDonation RD){
         rdEntities.remove(RD);
     }

     public void modify(RequestDonation RD){
         RD.setQuantity(RD.getQuantity());
     }

     public void monitor(){
         for(RequestDonation i: rdEntities){
             System.out.print(i);
         }
         System.out.println("");
     }

     public void reset(){
         rdEntities.clear();
     }


}