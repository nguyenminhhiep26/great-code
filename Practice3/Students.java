package Baithi3;



public class Students {
    private String studentID;
    private String name;
    private String address;
    private String phoneNumber;

    public Students(String studentID, String name, String address, String phoneNumber) {
        this.studentID = studentID;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }
    public  static Students createStudent(String studentID,String name,String address,String phoneNumber){
        return new Students(studentID,name,address,phoneNumber);
    }

    public String getStudentID() {
        return studentID;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}