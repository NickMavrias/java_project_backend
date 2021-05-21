public class  Beneficiary extends User{
    //pedio
    private int noPersons=1;
    private RequestDonationList receivedList;
    
    private Requests requestsList;

    public void setReceivedList(RequestDonationList receivedList) {
        this.receivedList = receivedList;
    }

    //constructor
    public Beneficiary(String name, String phone, int noPersons) {
        super(name, phone);
        this.noPersons = noPersons;
    }

    //getters
    public int getNoPersons() {
        return noPersons;
    }

    //methods
    public void requestsAdd(Requests requestsList, RequestDonation RD){
        requestsList.add(RD);
    }

    public void requestsRemove(Requests requestsList, RequestDonation RD){
        requestsList.remove(RD);
    }

    public void requestsCommit(Requests requestsList, RequestDonation RD, Material M, Beneficiary B){
        requestsList.commit(RD, B, M);
    }

    public void requestsDonationListAdd(RequestDonationList requestDonationList, RequestDonation RD){
        requestDonationList.add(RD);
    }

    public void requestsDonationListRemove(RequestDonationList requestDonationList, RequestDonation RD){
        requestDonationList.remove(RD);
    }

}
