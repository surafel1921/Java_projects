import java.util.Scanner;
public class compound_interest {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter principal amount:");
        double principal=scanner.nextDouble();
        System.out.print("Enter rate of interest:");
        double rate=scanner.nextDouble()/100;
        System.out.print("Enter time in years:");
        double time=scanner.nextDouble();
        System.out.print("Enter number of times interest applied per time period:");
        double period=scanner.nextDouble();


        double amount=principal*Math.pow(1+rate/period,period*time);
            System.out.printf("\nThe amount is $%.2f",amount);


            scanner.close();
    
    }       

       

}
