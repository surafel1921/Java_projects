import java.util.*;;
public class calculator {
    

      public static void main(String args[]){
      Scanner scanner = new Scanner(System.in);

        System.out.print("Insert First Number:");
            double firstNumber=scanner.nextDouble();

            System.out.print("Insert operators:");
          String op=scanner.next();

            System.out.print("Insert Second Number:");
            double secondNumber=scanner.nextDouble();
            scanner.close();
                     
               double result=0;
      

            if (op.equals("+")) {
         
            result= firstNumber+secondNumber;                
            }
           else if (op.equals("-")) {
            result= firstNumber-secondNumber;                
                
            }
            else if (op.equals("/")) {
                if (secondNumber != 0) {
                    result = firstNumber / secondNumber;
                } else {
                    System.out.println("Error! Division by zero.");
                    return;
                }             
                    
                }
                else if (op.equals("*")) {
                    result= firstNumber*secondNumber;                
                        
                    }
                    else{
                        System.out.println("Invalid operator!");
                        return;
                    }
         System.out.println("result"+result);
           

System.out.println("Thank you for using our calculator");
      }


}
