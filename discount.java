import java.util.*;

public class discount {



    public static void main(String args[]){

        
        Scanner insertPrice= new Scanner(System.in);
        System.out.println("selling pricing");
        double sellingPricing =insertPrice.nextDouble();
        System.out.println("cost pricing");
        double constPricing =insertPrice.nextDouble();

      
   
        double costPrice=constPricing;
        double sellingPrice=sellingPricing;


  if (sellingPrice >  costPrice) {
         double sub= sellingPrice -costPrice;
         double dev=sub/costPrice;
         double mul=dev*100;
         System.out.printf("prifit percentage %.2f\n",mul);
    System.out.println(".................................\n");

    System.out.printf("%.2f",sellingPrice-costPrice);


  }
   else{
    double sub= costPrice -sellingPrice;
    double dev=sub/costPrice;
    double mul=dev*100;
    System.out.printf("loss percentage %.2f\n",mul);
    System.out.println(".................................\n");
    System.out.printf("%.2f",costPrice-sellingPrice);

   
  }
       
   
 
 

      insertPrice.close();
    
       
    }
    
}
