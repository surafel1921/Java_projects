import java.io.FileWriter;
import java.io.IOException;

public class writefies {
    




    public static void main(String[] args) {
        


try (FileWriter write=new FileWriter("sura.txt")) {
    write.write("hello world");
    System.out.println("seccessfuly");
} catch (IOException e) {
   System.out.println("not seccessfuly");
}




// try {
//     FileWriter write=new FileWriter("sura.txt");
//     write.write("hello ,worlds");
//     System.out.println("seccessfuly");
//     write.close();
// } catch (IOException e) {
//    System.out.println("not seccessfuly");
// }
    }
}
