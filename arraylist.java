import java.util.ArrayList;
import java.util.Scanner;

public class arraylist {

    static Scanner scanner=new Scanner(System.in);
     public static void main(String[] args) {
        ArrayList<String> foods= new ArrayList<>();
        System.out.println("Enter Count favorite food");
         int user=scanner.nextInt();
for(int i=1; i<=user;i++){
      System.out.print("enter foods"+i+":");
      String food=scanner.next();
      foods.add(food);
}
System.out.println(foods);
     }
}
