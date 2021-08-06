package InputTest;
import java.util.Scanner;

public class InputTest {
    public static void main(String[] args) {
        System.out.println("Taking inputs from the user:");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number:");
        float a  = sc.nextFloat();
        System.out.print("Enter 2nd number:");
        float b = sc.nextFloat();
        float sum = a+b;
        System.out.println("The sum is:");
        System.out.println(sum);
        sc.close();
       
       
    }
    
}
