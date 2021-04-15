package Task6.java;

public class Person {
    protected String name;
    protected String address;

    public Person (String name, String address) {
        this.name = name;
        this.address = address;
    }
    public String getName () {
        return name;
    }
    public String getAddress () {
        return address;
    }
    public void setName (String name) {
        this.name = name;
    }
    public void setAddress (String address) {
        this.address = address;
    }
    public String toString () {
        return name + " ( " + address + " )";
    }

    public static void main(String[] args) {
        Person p = new Person("chu duc long", "phu tho");
        System.out.println("Name of Person is : " + p.getName());
        System.out.println("Address of Person is : " + p.getAddress());
        System.out.println(p);
        System.out.println("change name and address");
        p.setName("nguyen van tuyen");
        p.setAddress("bac giang");
        System.out.println("Name of Person is : " + p.getName());
        System.out.println("Address of Person is : " + p.getAddress());
        System.out.println(p);
    }
}
