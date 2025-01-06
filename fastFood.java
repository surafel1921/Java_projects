import java.util.*;
public class fastFood {




public static void main(String args[]){


boolean shopIsOpen=true;







if (shopIsOpen) {
    Scanner scanner = new Scanner(System.in);
System.out.print("What item Wolds you lick to buy:");
String items=scanner.nextLine();



System.out.print("How many would you likes?:");
int howMach=scanner.nextInt();

System.out.print("What is the price for each ?:");
double price=scanner.nextDouble();

scanner.close();


    String priceMsg=String.format("You Have Bought %s",items);
    System.out.println( priceMsg + " "+"$"+ howMach*price);

  
}else{
    System.out.println("Today is clothed !!!");
}



;
}
   
}