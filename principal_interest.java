import java.util.*;;

public class principal_interest {
           
  public static void main(String args[]){
    Scanner scanner = new Scanner(System.in);

          System.out.print("Enter principal amount:");
            double principal=scanner.nextDouble();
            System.out.print("Enter rate of interest:");
            double rate=scanner.nextDouble()/100;

            System.out.print("Enter time in years:");
            double time=scanner.nextDouble();
            double interest=principal*rate*time;
    

            System.out.println("---------------------------------------");

            System.out.printf("\nThe interest is $%.2f",interest);
        
            System.out.println("\n---------------------------------------");
           
            

            System.out.printf("Total amount is $%.2f",principal+interest);



         

          scanner.close();
}
}