import java.util.ArrayList;
import java.util.Scanner;
public class aa {

    public static void main(String[] args) {
        ArrayList<String>num=new ArrayList<>();
          Scanner scanner= new Scanner(System.in);
     
          System.out.println("count");
        int count= scanner.nextInt();


        for(int i=0;i < count;i++){
            System.out.println("food");
           String food= scanner.next();
           num.add(food);
        }
        System.out.println(num);
     scanner.close();
             
    }
}