package guessing_game;

import java.util.Scanner;
import java.util.Random;


class game{

    public int number;
    public int inputNumber;
    public int numberOfGuesses=0;
    
    Scanner sc = new Scanner(System.in);
    
    game(){
        Random r = new Random();
        this.number = r.nextInt(100);
    }
    
    public int getNumberOfGuesses() {
        return numberOfGuesses;
    }

    public void setNumberOfGuesses(int numberOfGuesses) {
        this.numberOfGuesses = numberOfGuesses;
    }

    void takeUserInput(){
        
        System.out.println("Enter the number: ");
        inputNumber = sc.nextInt();
        
    }
    
    boolean isCorrectNumber(){
        numberOfGuesses++;
        if(inputNumber==number)
        {
            System.out.println("You have guessed the right number in "+numberOfGuesses+" attempts");
            return true;
        }
        else if(inputNumber>number){
            System.out.println("Too high");
        }
        else if(inputNumber<number){
            System.out.println("Too low");
        }
        return false;
    }
    
}



public class guess_the_number {
    public static void main(String[] args) {
        
        game g = new game();
        boolean b = false;
        while(!b){
            g.takeUserInput();
            b = g.isCorrectNumber();
        }
        
    }   
}
