
import java.util.StringTokenizer;
public class Tokenizer{


    
    public static void main(String[] args) {

StringTokenizer str1;
String str="Hello World I`m Software Eng.";
str1=new StringTokenizer(str);

while (str1.hasMoreTokens()) {

    System.out.println(str1.nextToken());
    
}

    
    }
}

