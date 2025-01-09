import java.util.*;

public class convertor {
public static void main(String[] args) {

Scanner weight=new Scanner(System.in);





System.out.println("Choose Options");
System.out.print("1.convert kg to grams\n");
System.out.println("2.convert Gram to Kg");
double chooice=weight.nextDouble();


 if (chooice == 1) {
                 
    System.out.print("insert kg value :");
double kg=weight.nextDouble();
   double kg_grams_convert=kg*1000;

   System.out.printf(kg_grams_convert+" "+"grams");




 }else if(chooice == 2 ){
    System.out.print("insert Grams value :");
    double gram=weight.nextDouble();
       double grams_kg_convert=gram/1000;
    
       System.out.printf(grams_kg_convert+" "+"kg");
 }
 
 
 else{
    System.out.println("invalid Choose");
 }



weight.close();





}    
 

}