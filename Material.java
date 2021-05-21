public class Material extends Entity{

    //pedia
    private final double level1=1;   //1 atomo
    private final double level2=0;   //2-4 atoma
    private final double level3=0;   //5+ atoma

    //getters
    public double getLevel1() {
        return level1;
    }

    public double getLevel2() {
        return level2;
    }

    public double getLevel3() {
        return level3;
    }

    public Material(String name, String description, int id, int posotita) {
        super(name, description, id, posotita);
    }

    public String getDetails(Beneficiary B){
        if(B.getNoPersons()==1){
            return String.valueOf(level1);
        }else if (B.getNoPersons()>=2 && B.getNoPersons()<=4){
            return String.valueOf(level2);
        }else{
            return String.valueOf(level3);
        }
    }
}

