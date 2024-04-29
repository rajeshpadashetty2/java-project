  import java.util.Scanner;
  public class ifelsecondition{
    public static void main(String args[]){
      Scanner Sc = new Scanner(System.in);                //if else ststements//
                                                       //  syntax //
     int x= Sc.nextInt();                            //     if(condition){
                                                              // statement1;  
                                                          // statement2;
                                                          //}
                                                        //    else(condition){
                                                           //    statement1; 
                                                            // statement2;
  
     
     // evan or odd//
     if(x % 2 == 0){
        System.out.println("even");
     }
     else{
      System.out.println("odd");
     }
    }

  }