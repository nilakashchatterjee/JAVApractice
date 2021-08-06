package cbsecalculator;
import java.util.Scanner;

public class cbsecalculator {
    public static void main(String[] args) {
        System.out.println("Enter the marks of five subjects out of 100");
        Scanner sc = new Scanner(System.in);
        float total= 500.0f;
        System.out.print("Subject 1:");
        float s1 = sc.nextFloat();
        System.out.print("Subject 2:");
        float s2 = sc.nextFloat();
        System.out.print("Subject 3:");
        float s3 = sc.nextFloat();
        System.out.print("Subject 4:");
        float s4 = sc.nextFloat();
        System.out.print("Subject 5:");
        float s5 = sc.nextFloat();
        float totalmarks = s1 + s2 + s3 + s4 + s5;
        float percentage = (totalmarks / total) * 100;
        System.out.println("The percentage is "+ percentage+" %");
        sc.close();
    }
}   
