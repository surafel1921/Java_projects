import java.util.*;
public class fastFood {




public static void main(String args[]){


boolean shopIsOpen=true;







if (shopIsOpen) {
    Scanner scanner = new Scanner(System.in);
System.out.print("Insert your favorite food:");
String items=scanner.nextLine();



System.out.print("How many would you likes?:");
int howMach=scanner.nextInt();

System.out.print("What is the price for each ?:");
double price=scanner.nextDouble();

scanner.close();


    String priceMsg=String.format("You Have Bought %s",items);
    System.out.println("-----------------------------------------");


    System.out.println( priceMsg + " "+"$"+ howMach*price);
    System.out.println("-----------------------------------------");
    System.out.println("Thank you for using our fast food service");


  
}else{
    System.out.println("Today is clothed !!!");
}



;
}
   
}