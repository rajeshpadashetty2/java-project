
import java.util.Scanner;

public class example {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
         int button = Sc.nextInt();

         if(button == 1){
           System.out.println("HELLO");
         }
         else if(button == 2){
            System.out.println("NAMASTE");
         }
         else if(button == 3){
            System.out.println("BONJURE");
         }
         else{
            System.out.println("INVALID CHOICE");
         }
    }
    
}
