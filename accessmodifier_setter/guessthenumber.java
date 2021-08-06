package accessmodifier_setter;

import java.util.Scanner;
import java.util.Random;

class game{
    int random_number;
    int inputnumber;
    int no_of_guesses=0;
    
    game(){
        Random rn = new Random();
        this.random_number = rn.nextInt(10);
    }
    void takeuserinput(){
        System.out.print("Guess the number:");
        Scanner sc = new Scanner(System.in);
        this.inputnumber = sc.nextInt();
        sc.close();
    }
    public int getno_of_guesses(){
        return no_of_guesses;
    }
    public void setno_of_guesses(int no_of_guesses){
        this.no_of_guesses = no_of_guesses;
    }
    boolean iscorrectnumber(){
        no_of_guesses++;
        if (inputnumber==random_number) {
            System.out.println("You Guessed the correct number");
            
            return true;
        }
        else if(inputnumber<random_number){
            System.out.println("Too low...");
        }
        else if(inputnumber>random_number){
            System.out.println("Too high...");
        }
        return false;
    }
}

public class guessthenumber {
    
    public static void main(String[] args) {
        
        game g = new game();
        boolean b= false;
        while (!b){
            g.takeuserinput();
            b=g.iscorrectnumber();
        }
    }
    // while running the program comment out the sc.close() statement to avoid the warning
}
