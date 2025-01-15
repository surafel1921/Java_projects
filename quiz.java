import java.util.*;

public class quiz {
    static Scanner scanner=new Scanner(System.in);
public static void main(String[] args) {
 String[] quetions={
  "1.The primary purpose of inheritance in Java is:",
  "2.Which principle allows objects of different classes to be treated as objects of a common type?",
  "3.What is the role of a constructor in a Java class?",
  "4.Which access modifier restricts access to a class member to within the same class only?",
  "5.What is the keyword used to declare an interface in Java?"
 };

 String[][] options={
  {
    "\tA.Code reusability",
    "\tB.Data hiding",
    "\tC.Access control",
    "\tD.Memory management\n" 
       
    },
    {
      "\tA.Abstraction",
      "\tB.Encapsulation",
      "\tC.Polymorphism",
      "\tD.Inheritance\n"
   
    },
    {

      "\tA.Define class methods",
      "\tB.Declare class variables",
      "\tC.Initialize object state",
      "\tD.Control access to members\n",
    },
    {

      "\tA.Public",
      "\tB.Protected",
      "\tC.Private",
      "\tD.Default\n",
    },
    {

      "\tA.Interface",
      "\tB.Class",
      "\tC.Abstract",
      "\tD.Extends\n",
    }
 };

 String[]answer={"A","C","C","C","A"};
 int count=0;
String user="";
 for(int i=0;i<quetions.length;i++){
System.out.println(quetions[i]);
for(int j=0;j<options[i].length;j++){
  System.out.println(options[i][j]);
}
 System.out.print("Answer:");
 user=scanner.nextLine().toUpperCase();
if (answer[i].equals(user)) {
  
         System.out.println("Correct Answer");
         count++;
} else{
  System.out.println("Not Correct Answer");

}
 }
    System.out.println(" correct answer"+" "+count+" "+"of"+" "+quetions.length);
}




}




