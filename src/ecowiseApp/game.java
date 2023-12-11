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
    
    private wordBank dictionary;
    private  int lives = 5;
    
    
    public game(wordBank dictionary){
        this.dictionary = dictionary;
    }
    
    public void playGame(){
        //Pull a random word from the word bank
        wordAndDef randWord = getRandWord();
        String wordGuess = randWord.getWord().toLowerCase();
        
        //Make the secret word appear with underscores
        StringBuffer secretWord = new StringBuffer(wordGuess.length());
        for (int i = 0; i < wordGuess.length(); i++){
            secretWord.append("_");
        }
        
        
        
        while (lives > 0 && secretWord.indexOf("_") != -1){
            //Displaying the current state of the word
            JOptionPane.showMessageDialog(null,("Word: "+ secretWord));
            JOptionPane.showMessageDialog(null,("Lives: " + lives));
            
            //Get user input
            String input = JOptionPane.showInputDialog(null,("Enter a character: "));
            char guess = input.toLowerCase().charAt(0);
            
            //Check if the character guessed is in the secret word
            boolean correct = false;
            for (int i = 0; i < wordGuess.length(); i++){
                if (wordGuess.charAt(i) == guess){
                    secretWord.setCharAt(i, guess);
                    correct = true;
                }
            }
            
            //lose a life if character is not contained in word
            if(!correct){
                lives--;
                JOptionPane.showMessageDialog(null,("Incorrect guess, you have " +lives + "lives remaining"));
            }
            
        }
        
        //Display the result
        if(lives > 0){
            JOptionPane.showMessageDialog(null,("Well done! You guessed the word: " +wordGuess));
        }else{
            JOptionPane.showMessageDialog(null,("You have no lives remaining, GG. The secret word was: " +wordGuess));
        }
    
    }
    //function in order to get random word from wordbank
    
        private wordAndDef getRandWord(){
        Random random = new Random();
        int randIndex = random.nextInt(dictionary.getWordBank().size());
        return dictionary.getWordBank().get(randIndex);
    }

}