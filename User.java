abstract class User {

    //pedia
    private String name;
    private String phone;

    //constructor
    public User(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    //getters
    public String getName(){
        return name;
    }

    public String getPhone() {
        return phone;
    }

    //setters
    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}

