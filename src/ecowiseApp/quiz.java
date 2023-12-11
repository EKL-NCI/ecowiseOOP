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
    private wordBank dictionary; //instance variable for wordBank class
    
    //initializing wordBank object named dictionary
    public quiz(wordBank dictionary){
        this.dictionary = dictionary; //https://docs.oracle.com/javase/tutorial/java/javaOO/variables.html
    }
    
    //function to get random word from word bank - https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/util/Random.html
    //https://stackoverflow.com/questions/5887709/getting-random-numbers-in-java
    private wordAndDef getRandWord(){
        Random random = new Random();
        int randIndex = random.nextInt(dictionary.getWordBank().size()); //creates an integer "index" that is set to the size of the word bank to generate a random integer between 0 and the size of the word bank (being 15)
        return dictionary.getWordBank().get(randIndex); //retrieves randomly gotten word and definition from arrayList and returns it.
    }
    
    public void startQuiz(){
        wordAndDef randWord = getRandWord(); //Get random word from word bank
        String correct = randWord.getWord().toLowerCase(); //store randWord in variable "correct", as this will be the variable for the correct answer used in the quiz
        String definition = randWord.getDefinition();//gets the definition of the word to be guessed to be displayed to user
        
        
        
        
        //Display random definition to user
        JOptionPane.showMessageDialog(null,("The definition of the word is: " +definition +" What is this word?"));
        
        //Get user input
        String ans = JOptionPane.showInputDialog(null,("Enter the word: "));
        String guess = ans.toLowerCase(); //making sure answer is set to lowercase
        
        //Check if ans is correct
        if(ans.equals(correct)){
            JOptionPane.showMessageDialog(null,("Nicely done! That's absolutely correct"));
        }else{
            JOptionPane.showMessageDialog(null,("You guessed incorrectly, remember that spelling matters! The correct word is: " +randWord.toString()));
        }
    }
    
    
}