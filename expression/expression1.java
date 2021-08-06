// What will be the result of the following expression: float a = 7/4 * 9/2

package expression;

public class expression1 {
    public static void main(String[] args) {
        float a = 7/4 * 9/2;
        // here the given expression is giving a  wrong result as all the numbers are integer
        System.out.println("Incorrect Answer:"+a);

        float b = 7/4.0f * 9/2.0f;
        // here we are getting correct answer because we are using floating numbers in the expression
        System.out.println("Correct Answer:"+b);

    }
    
}
