package exercise7;
import java.util.Scanner;

public class FlightTicket {
    private Date departureDate = new Date();
    private Time departureTime = new Time();
    private Byte noOfTicket;
    private double price = 1000;
    private double totalPrice;
    private Byte typeOfCabin;

    public FlightTicket () {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter departure date (mm dd yyyy) : ");
        setDepartureDate(sc.nextByte(), sc.nextByte(), sc.nextShort());

        System.out.println("Enter departure time (hh mm) :");
        departureTime.hours = sc.nextByte();
        departureTime.minutes = sc.nextByte();

        System.out.println("Enter type of cabin :");
        System.out.println("1. Business");
        System.out.println("2. First");
        System.out.println("3. Economy");
        typeOfCabin = sc.nextByte();

        System.out.print("Enter number of ticket : ");
        noOfTicket = sc.nextByte();
    }
    public FlightTicket (Date departureDate, Time departureTime, Byte noOfTicket, double totalPrice, Byte typeOfCabin) {
        this.departureDate = departureDate;
        this.departureTime = departureTime;
        this.noOfTicket = noOfTicket;
        this.totalPrice = totalPrice;
        this.typeOfCabin = typeOfCabin;
    }
    public void getDepartureDate () {
        System.out.println("Departure Date : " + departureDate.day + "/" + departureDate.month + "/" + departureDate.year);

    }
    public void getDepartureTime () {
        System.out.println("Departure Time :" + departureTime.hours + ":" + departureTime.minutes);
    }

    public void setDepartureDate(Byte day, Byte month, Short year) {
        this.departureDate.day = day;
        this.departureDate.month = month;
        this.departureDate.year = year;
    }
    public void setDepartureTime (Time departureTime) {
        this.departureTime = departureTime;
    }
    public double getTotalPrice () {
        return price * noOfTicket * typeOfCabin;
    }
    public String getTypeOfCabin (int k) {
        if (k == 1) {
            return "Business class";
        }
        else if (k == 2) {
            return "First class";
        }
        else {
            return "Economy class";
        }
    }
    public void displayTicketInformation() {
        System.out.println("Following is the information about the ticket(s) booked:");
        System.out.println("---------------------------------------------------------");
        getDepartureDate();
        getDepartureTime();
        System.out.println("Number of tickets: " + noOfTicket);
        System.out.println("Type of cabin: " + getTypeOfCabin(typeOfCabin));
        System.out.println("Total of the ticket: $" + getTotalPrice());
    }
}