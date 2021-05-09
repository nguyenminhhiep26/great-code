package BTarraylist;

public class Contact {
    private String name, sdt;

    public Contact (String name, String sdt) {
        this.name = name;
        this.sdt = sdt;
    }

    public String getName() {
        return name;
    }

    public String getSdt() {
        return sdt;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String toString () {
        return  name + "  ->  " + sdt  ;
    }
}