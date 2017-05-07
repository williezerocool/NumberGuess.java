/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numberguess;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author kendrabooker
 */
public class NumberGuess {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Random r = new Random();
        
        int number, userInput;
        number = 1 + r.nextInt(10);
        
        System.out.print("Pick a number between 1-10\n your guess: ");
        userInput = keyboard.nextInt();
        
        if(userInput == number){
            System.out.println("Thats right! My number was " + number);
        }else{
            System.out.println("Wrong! my number was " + number);
        }
    }
    
}
