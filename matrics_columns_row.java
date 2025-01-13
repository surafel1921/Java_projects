import java.util.*;

public class matrics_columns_row {
    public static void main(String[] args) {
          
        Scanner scanner =new Scanner(System.in);
           int column;
           int row;
           System.out.println("Intert Columns");
   column=scanner.nextInt();
           System.out.println("Intert Row");
   row=scanner.nextInt();
               

        for (int i = 0; i < column; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
