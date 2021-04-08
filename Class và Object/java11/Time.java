package java11;

public class Time {
    private int hour ;
    private int minute;
    private int second;

    public Time(int giay, int phut, int gio){
        hour = giay;
        minute = phut;
        second = gio;
    }

    public int getHour(){
        return hour;
    }
    public int getMinute(){
        return minute;
    }
    public int getSecond(){
        return  second;
    }

    public String getTime(){
        return hour + "/" + minute +"/" + second;
    }

    public void setHour(int hour){
        this.hour= hour;
    }

    public void setMinute(int minute){
        this.minute = minute;
    }

    public void setSecond(int second){
        this.second = second;
    }

    public void setTime(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public String toString(){
        return hour + "/" + minute + "/" + second;
    }



    public static void main(String[] args) {
        Time C = new Time(26,5,7);
        System.out.println("The Hour : " + C.hour);
        System.out.println("The Minute : " + C.minute);
        System.out.println("The Second : " + C.second);
        C.setHour(15);
        System.out.println(C.getHour());
        C.setMinute(6);
        System.out.println(C.getMinute());
        C.setSecond(8);
        System.out.println(C.getSecond());
        C.setTime(15,6,8);
        System.out.println(C.getTime());

        System.out.println(C.toString());
        System.out.println();
    }
}
