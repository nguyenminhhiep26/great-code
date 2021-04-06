package Methods;

public class methods2 {
    public static void main(String[] args) {
        int a = 6, b= 9, max , min;
        max = max(a, b);
        min = min(a, b);
        System.out.println(max + " ," + min);

        System.out.println(max(5,8));
        System.out.println(min(5,8));
    }
    public static int max(int number1 , int number2) {
        if (number1 > number2){
            return number1;
        }else {
            return number2;
        }
    }
    public static int min(int number1, int number2){
        return (number1 < number2) ? number1 : number2;
    }
}
