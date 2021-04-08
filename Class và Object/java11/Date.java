package java11;

public class Date {
    private int day ;
    private int month;
    private int year;

    public Date(int ngay, int thang, int nam){
        day = ngay;
        month = thang;
        year = nam;
    }

    public int getDay(){
        return day;
    }
    public int getMonth(){
        return month;
    }
    public int getYear(){
        return  year;
    }

    public String getDate(){
        return day + "/" + month +"/" + year;
    }

    public void setDay(int day){
        this.day= day;
    }

    public void setMonth(int month){
        this.month = month;
    }

    public void setYear(int year){
        this.year = year;
    }

    public void setDate(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString(){
        return month + "/" + day+ "/" + year;
    }

    public static void main(String[] args) {
        Date C = new Date(26,05,2002);
        System.out.println("The Day : " + C.day);
        System.out.println("The Month : " + C.month);
        System.out.println("The Year : " + C.year);
        C.setDay(15);
        System.out.println(C.getDay());
        C.setMonth(06);
        System.out.println(C.getMonth());
        C.setYear(2001);
        System.out.println(C.getYear());
        C.setDate(15,06,2001);
        System.out.println(C.getDate());

        System.out.println(C.toString());
    }

}
