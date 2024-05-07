import java.util.Scanner;

public class func {
    public static void printNumber(int number){
     System.out.println(number);
     return;
    }

    public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();


    printNumber(number);
    }
}
