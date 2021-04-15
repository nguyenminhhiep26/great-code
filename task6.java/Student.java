package Task6.java;

class Student1 extends Person{
    private int numCourses;
    private String[] courses;
    private int[] grades;
    private static final int MaxCourses = 30;

    public Student1(String name, String address) {
        super(name, address);
        numCourses = 0;
        courses = new String[30];
        grades = new int[30];
    }
    public String toString () {
        return "Student : " + super.toString();
    }
    public void addCoursesGrades (String course, int grade) {
        courses[numCourses] = course;
        grades[numCourses] = grade;
        numCourses++;
    }
    public void print () {
        for (int i = 0; i < numCourses; i++) {
            System.out.println("Courses is : " + courses[i] + ", Grades is : " + grades[i]);
        }
    }
    public double getAverrageGrades () {
        int sum = 0;
        for (int i = 0; i < numCourses; i++) {
            sum += grades[i];
        }
        return (double) sum/numCourses;
    }
}
class Teacher extends Person {
    private int numCourses;
    private String[] courses;
    private static final int MaxCourses = 30;

    public Teacher (String name, String address) {
        super(name, address);
        numCourses = 0;
        courses = new String[MaxCourses];
    }
    public String toString () {
        return "Teacher : " + super.toString();
    }
    public boolean addCourses (String course) {
        for (int i = 0; i < numCourses; i++) {
            if (courses[i].equals(course)) {
                return false;
            }
            else {
                courses[numCourses] = course;
                numCourses++;
            }
        }
        return true;
    }
    public boolean removeCourses (String course) {
        boolean found = false;
        int coursesIndex = -1;
        for (int i = 0; i < numCourses; i++) {
            if (courses[i].equals(course)) {
                coursesIndex = i;
                found = true;
                break;
            }
        }
        if (found) {
            for (int i = 0; i < numCourses - 1; i++) {
                courses[i] = courses[i - 1];
            }
            numCourses--;
            return true;
        }
        else {
            return false;
        }
    }

}

public class Student {
    public static void main(String[] args) {
        Student1 p = new Student1("chu duc long", "phu tho");
        System.out.println(p);
        p.addCoursesGrades("Maths", 3);
        p.addCoursesGrades("English", 30);
        p.print();
        System.out.println(p.getAverrageGrades());

        Teacher p1 = new Teacher("bui huy tien", "kinh ke");
        System.out.println(p1);
        String[] courses = {"Maths", "English", "born", "reason"};
        for (String course : courses) {
            if (p1.addCourses(course)) {
                System.out.println(course + " added");
            }
            else {
                System.out.println(course + " can not added");
            }
        }
        for (String course : courses) {
            if (p1.removeCourses(course)) {
                System.out.println(course + " removeCourses");
            }
            else {
                System.out.println(course + " can not removeCourses");
            }
        }


    }
}