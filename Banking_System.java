import java.util.*;
public class Banking_System {
 static   Scanner scanner=new Scanner(System.in);

  
  static  double Balance =0;
  

  static void Balances(){
    System.out.printf("$%.2f --- >\n",Balance);
}
static void Diposits(){
    double Diposit=0;
    System.out.println("Enter Amount");
    Diposit=scanner.nextDouble();

    if (Diposit <= 0) {
        System.out.println("empty Amount");
    }else{
        Balance +=Diposit;
        System.out.printf("Current Balance $%.2f --- >\n",Balance);
    }

}


static void Withdraws(){
    double withdraw=0;
    System.out.println("Enter Withdraw Amount");
    withdraw=scanner.nextDouble();
    if (withdraw > Balance) {
    System.out.println("Efficiency Amount");
        
    }else{
        Balance -=withdraw;
        System.out.printf("Current Withdraw amount $%.2f --- > \n",withdraw);
    }
    
}


public static void main(String[] args) {

      boolean isRunning=true;



while (isRunning) {
    System.out.println("***************************");
    System.out.println("Banking System");
    System.out.println("***************************");
    System.out.println("1.Show Balance");
    System.out.println("2.Diposit");
    System.out.println("3.Withdraw");
    System.out.println("4.Exit");
    System.out.println("***************************");
    System.out.println("Enter Your Chooice (1-4)");
    int  Chooice=scanner.nextInt();
    System.out.println("************ Thanks for Using ***************");

 switch (Chooice) {
    case 1:
    Balances();
        break;
    case 2:
    Diposits(); 
         break;

     case 3:
     Withdraws();
           break;
      case 4:
           isRunning=false;   
           break;   
    default:
    System.out.println("Esits");
        break;
 }


}

scanner.close();


}



}
