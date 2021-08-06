package gradeDecryption;
import java.util.Scanner;
public class grade {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter your grade:");
        char grade = s.next().charAt(0);
        grade = (char)(grade+8);
        
        System.out.println("Encrypted grade:"+grade); // it is the encrypted grade
        
        // Decrption of the grade
        grade = (char)(grade-8);
        System.out.println("Original Grade:"+grade);
        s.close();
   }
}
