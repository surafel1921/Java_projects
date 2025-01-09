import java.util.*;
import java.util.Scanner;
public class while_loop {

    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);

             String q="";
          
             while(!q.equals("Q")){
                         System.out.println("Enter Your name");
                         q=scanner.nextLine().toUpperCase();
                       
                       
             }
        System.out.println(q);


scanner.close();
    }

}
