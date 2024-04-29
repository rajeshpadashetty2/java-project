
import java.util.Scanner;

public class elseifcondition{
public static void main(String[] args) {
    Scanner Sc = new Scanner(System.in);
    int a = Sc.nextInt();
    int b= Sc.nextInt();

    // for example ////else is statement//                      // syntax//
    if (a ==b ){
        System.out.println("EQUAL");                       //  if( condition){}
        }
                                                              // else { if(){} & else{}}
    else{
        if( a < b){
            System.out.println("LESSER");
        }
        else {
            System.out.println("grater");
        }
    }
}
}


