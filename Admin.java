public class Admin extends User{
    //pedio
    private Boolean isAdmin=Boolean.TRUE;

    //const
    public Admin(String name, String phone, Boolean isAdmin) {
        super(name, phone);
        this.isAdmin = isAdmin;
    }

    //getter
    public Boolean getAdmin()    {
        return true;
    }
}

