public class Donator extends User{
    //pedia
    private Offers offersList;
    Offers offer = new Offers();

    //const

    public Donator(String name, String phone) {
        super(name, phone);
    }

    public Offers getOffersList() {
        return offersList;
    }

    public void setOffersList(Offers offersList, RequestDonation RD) {
        offersList.add(RD);
    }

    public void remOffersList(Offers offersList, RequestDonation RD){
        offersList.remove(RD);
    }

    public void comOffersList(Offers offersList, Organization Or, Entity En){
        offersList.commit(Or, En);
    }

}
