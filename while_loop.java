
import java.util.*;

public class while_loop{

    static Scanner scanner=new Scanner(System.in);
public static void main(String[] args)throws InterruptedException {

  // int[] a = {1, 2, 3, 4, 5};
  // String[][]b={{"a"},{"b"},{"c"},{"d"},{"e"}};
  // int[][]d={{1},{2},{3},{4},{5}};


  //        for(int i=0;i<b.length;i++){
  //         System.out.println(b[i]);
  //         for(int j=0;j<d[i].length;j++){
  //           System.out.println(d[i][j]);
  //         }
  //        }


  
int[]a={1,2,3,4,5};
String[][]b={{"a"},{"b"},{"c"},{"d"},{"e"}};

for(int i=0;i<a.length;i++){
  System.out.println(a[i]);
    for(int j=0;j<b[i].length;j++){
               System.out.println(b[i][j]);
    }

    System.out.println("enter");
    scanner.nextInt();
}



}

}