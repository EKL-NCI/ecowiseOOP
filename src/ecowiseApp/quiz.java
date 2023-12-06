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
 * @author Josh McGlynn
 */
public class quiz{
    private wordBank dictionary;
    
    public quiz(wordBank dictionary){
        this.dictionary = dictionary;
    }
    
    public void startQuiz(){
        //Get random word from word bank
        wordAndDef randWord = getRandWord();
        String correct = randWord.getWord().toLowerCase();
        String definition = randWord.getDefinition();
        
        
        
        
        //Display random definition to user
        JOptionPane.showMessageDialog(null,("The definition of the word is: " +definition +" What is this word?"));
        
        //Get user input
        String ans = JOptionPane.showInputDialog(null,("Enter the word: "));
        String guess = ans.toLowerCase();
        
        //Check if ans is correct
        if(ans.equals(correct)){
            JOptionPane.showMessageDialog(null,("Nicely done! That's absolutely correct"));
        }else{
            JOptionPane.showMessageDialog(null,("You guessed incorrectly, remember that spelling matters! The correct word is: " +randWord.toString()));
        }
    }
    
    //function to get random word from word bank
    private wordAndDef getRandWord(){
        Random random = new Random();
        int randIndex = random.nextInt(dictionary.getWordBank().size());
        return dictionary.getWordBank().get(randIndex);
    
        
    }
}
    