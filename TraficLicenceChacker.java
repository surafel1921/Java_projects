import java.util.*;;

public class TraficLicenceChacker {
    
  public static void main(String args[]){

          Scanner scanner = new Scanner(System.in);


            System.out.println("Enter your name:");
            String name=scanner.next();
          System.out.println("Enter your age:");
            int age=scanner.nextInt();
            scanner.close();
            if (age >=18) {
                String format=String.format("Congradulation %s You are eligible for driving licence",name);
              System.out.println(format);
                
            }else{
                String format=String.format("Sorry %s You are not eligible for driving licence",name);
                System.out.println(format);
            }

  }


}
