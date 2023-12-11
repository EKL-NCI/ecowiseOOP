/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecowiseApp;
import javax.swing.JOptionPane;
import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 
@author joshm*/
public class game{
    
    //instance variable for wordBank class
    private wordBank dictionary;
    private  int lives = 5; //integer lives set to 5, if it reaches 0 the game will end
    
    //initializing wordBank object named dictionary
    public game(wordBank dictionary){
        this.dictionary = dictionary; //https://docs.oracle.com/javase/tutorial/java/javaOO/variables.html
    }
    
    //https://stackoverflow.com/questions/5887709/getting-random-numbers-in-java
    //this code is commented in quiz class
    private wordAndDef getRandWord(){
        Random random = new Random();
        int randIndex = random.nextInt(dictionary.getWordBank().size()); 
        return dictionary.getWordBank().get(randIndex);
    }
    
    public void playGame(){
        //Pull a random word from the word bank
        wordAndDef randWord = getRandWord(); //calling on getRandWord method to obtain random word from word bank 
        String wordGuess = randWord.getWord().toLowerCase(); //takes the random word, sets to lower case and stores it in variable "wordGuess"
        
        //Make the secret word appear with underscores - https://www.geeksforgeeks.org/stringbuffer-class-in-java/
        StringBuffer secretWord = new StringBuffer(wordGuess.length()); //creates new stringBuffer with a capacity equal to the length of the random word
        for (int i = 0; i < wordGuess.length(); i++){ 
            secretWord.append("_"); //fills the secretWord StringBuffer with underscores to replace the actual letters, hiding them from user
        }
        
        
        //https://www.w3schools.com/java/java_while_loop.asp
        while (lives > 0 && secretWord.indexOf("_") != -1){  //while user still has lives and has not yet guessed every letter
            //Displaying the current state of the word 
            JOptionPane.showMessageDialog(null,("Word: "+ secretWord));
            JOptionPane.showMessageDialog(null,("Lives: " + lives));
            
            //Get user input
            String input = JOptionPane.showInputDialog(null,("Word is " + secretWord+ "\n Enter a character: ")); 
            char guess = input.toLowerCase().charAt(0); //store input as char and take the first character inputted as the guess, in case user inputted multiple letters
            
            //Check if the character guessed is in the secret word
            boolean correct = false;
            for (int i = 0; i < wordGuess.length(); i++){ //loop that iterates through each index in the hidden word
                if (wordGuess.charAt(i) == guess){ //checks if character matches - https://www.w3schools.com/java/ref_string_charat.asp
                    secretWord.setCharAt(i, guess); //replaces underscore(s) with the guessed letter
                    correct = true;
                }
            }
            
            //lose a life if guessed character is not contained in word
            if(!correct){ 
                lives--;
                JOptionPane.showMessageDialog(null,("Incorrect guess, you have " +lives + "lives remaining"));
            }
            
        }
        
        //Display the result
        if(lives > 0){ 
            JOptionPane.showMessageDialog(null,("Well done! You guessed the word: " +wordGuess)); //if word is guessed with lives remaining, user wins 
        }else{
            JOptionPane.showMessageDialog(null,("You have no lives remaining, GG. The secret word was: " +wordGuess)); //if all lives are lost, game ends
        }
    
    }
    
    
        

}