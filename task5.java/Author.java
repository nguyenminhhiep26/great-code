package Task5.java;

public class Author {
    private String name, email;
    private char gender;

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public char getGender() {
        return gender;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toString(){
        return name + " " + (gender) + " " + email;
    }

    public static void main(String[] args) {
        Author TG = new Author("Hiep","Nguyenminhhiep@gmail.com",'f');
        System.out.println(TG);
        System.out.println("The name is : " + TG.getName());
        System.out.println("The email is : " + TG.getEmail());
        TG.setEmail("Minhhiep@gamil.com");
        System.out.println("The email is : " +TG.getEmail());
        System.out.println("The gender is : " + TG.getGender());
        System.out.println(TG.toString());

        System.out.println("=================");


    }
}
