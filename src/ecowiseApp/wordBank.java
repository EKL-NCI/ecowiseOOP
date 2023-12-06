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

//class to represent both word and definition that will be used in array
class wordAndDef {
    private String word;
    private String definition;
    
    public wordAndDef(String word, String definition) {
        this.word = word;
        this.definition = definition;
    }
    
    public String getWord(){
        return word;
    }
    
    public String getDefinition(){
        return definition;
    }
    //allows the word to be displayed as String if user gets the word wrong in quiz, instead of displaying as a file path and hex code for the random word
    @Override
    public String toString(){
        return word;
    }
}
    public class wordBank{
        
        
        
            private ArrayList<wordAndDef> wordBank;
            
            //constructor to initialize word bank
            
            public wordBank(){
                initializeWordBank();
            }
            
            //initialize the word bank with its words and definitions in the ArrayList
            private void initializeWordBank(){
                wordBank = new ArrayList<>();
                wordBank.add(new wordAndDef("Geothermal", "Relating to or produced by the internal heat of the earth."));
                wordBank.add(new wordAndDef("Conservation", "Careful and efficient use of energy resources to minimize waste and reduce environmental impact."));
                wordBank.add(new wordAndDef("Environmentalism", "Concern about and action aimed at protecting the environment."));
                wordBank.add(new wordAndDef("Biofuel", "A fuel derived immediately from living matter."));
                wordBank.add(new wordAndDef("Solar", "The sun's rays as a source of energy from which power for domestic or industrial use may be generated."));
                wordBank.add(new wordAndDef("Photovoltaic", "The production of electric current at the junction of two substances exposed to light."));
                wordBank.add(new wordAndDef("Biomass", "Organic matter used as a fuel, especially in a power station for the generation of electricity."));
                wordBank.add(new wordAndDef("Sustainability", "Avoidance of the depletion of natural resources in order to maintain an ecological balance"));
                wordBank.add(new wordAndDef("Ecofriendly", "Not harmful to the environment."));
                wordBank.add(new wordAndDef("Carbon", "A gaseous compound that gets released into the atmosphere, associated with climate change"));
                wordBank.add(new wordAndDef("Hydropower", "The energy in moving water, which can be used to generate electricity."));
                wordBank.add(new wordAndDef("Renewable", "A natural resource or source of energy that is not depleted by use, such as water, wind, or solar power."));
                wordBank.add(new wordAndDef("Smartgrid", "Electricity network that uses digital technologies, sensors and software to better match the supply and demand of electricity in real time while minimizing costs and maintaining the stability and reliability of the network."));
                wordBank.add(new wordAndDef("Microgrid", "A small network of electricity users with a local source of supply that is usually attached to a centralized national grid but is able to function independently."));
                wordBank.add(new wordAndDef("Cogeneration", "The generation of electricity and useful heat jointly, especially the utilization of the steam left over from electricity generation for heating."));
            }
            
            //return the word bank as an ArrayList of words and definitions
            public ArrayList<wordAndDef> getWordBank(){
                return wordBank;
            }
            
            //get the word bank as a String to display in the wordBankTextArea in GUI
            public String getWordBankAsString(){
                StringBuilder wordBankText = new StringBuilder();
                
                for (wordAndDef pair : wordBank){
                    wordBankText.append(pair.getWord()).append(": ").append(pair.getDefinition()).append("\n");
                }
                
                return wordBankText.toString();
            }
    
}