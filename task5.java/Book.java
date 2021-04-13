package Task5.java;

public class Book {
    private String name;
    private Author author;
    private double price;
    private int qty;

    public Book(String name, Author author, double price, int qty) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String toString(){
        return " ' " + name + " ' by " + author;
    }

    public static void main(String[] args) {
        Author TG = new Author("Hiep","Nguyenminhhiep@gmail.com",'f');
        System.out.println(TG);

        Book S = new Book("Toan", TG, 123, 99 );
        System.out.println(S);

        S.setPrice(441);
        S.setQty(100);
        System.out.println("The name is : " + S.getName());
        System.out.println("The price is : " + S.getPrice());
        System.out.println("The qty is : " +S.getQty());
        System.out.println("The author is " + S.getAuthor());
        System.out.println("The author's name is : " +S.getAuthor().getName());
        System.out.println("The author's email is : " + S.getAuthor().getEmail());
        System.out.println("The author's gender is : " + S.getAuthor().getGender());

        Book SA  = new Book("Van", new Author("THAO", "Phuownthao@gamil.com", 'm'),111,222);
        System.out.println(SA);
    }
}
