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
}
    public class wordBank{
        public static void main(String[] args) {
        // TODO code application logic here
        
            ArrayList<wordAndDef> wordBank = new ArrayList<>();
                wordBank.add(new wordAndDef("geothermal", "relating to or produced by the internal heat of the earth."));
                wordBank.add(new wordAndDef("conservation", "careful and efficient use of energy resources to minimize waste and reduce environmental impact."));
                wordBank.add(new wordAndDef("environmentalism", "concern about and action aimed at protecting the environment."));
                wordBank.add(new wordAndDef("biofuel", "a fuel derived immediately from living matter."));
                wordBank.add(new wordAndDef("solar", "the sun's rays as a source of energy from which power for domestic or industrial use may be generated."));
                wordBank.add(new wordAndDef("photovoltaic", "the production of electric current at the junction of two substances exposed to light."));
                wordBank.add(new wordAndDef("biomass", "organic matter used as a fuel, especially in a power station for the generation of electricity."));
                wordBank.add(new wordAndDef("sustainability", "avoidance of the depletion of natural resources in order to maintain an ecological balance"));
                wordBank.add(new wordAndDef("eco-friendly", "not harmful to the environment."));
                wordBank.add(new wordAndDef("carbon", "a gaseous compound that gets released into the atmosphere, associated with climate change"));
                wordBank.add(new wordAndDef("hydropower", "the energy in moving water, which can be used to generate electricity."));
                wordBank.add(new wordAndDef("renewable", "a natural resource or source of energy that is not depleted by use, such as water, wind, or solar power."));
                wordBank.add(new wordAndDef("smart-grid", "electricity network that uses digital technologies, sensors and software to better match the supply and demand of electricity in real time while minimizing costs and maintaining the stability and reliability of the network."));
                wordBank.add(new wordAndDef("microgrid", "a small network of electricity users with a local source of supply that is usually attached to a centralized national grid but is able to function independently."));
                wordBank.add(new wordAndDef("cogeneration", "the generation of electricity and useful heat jointly, especially the utilization of the steam left over from electricity generation for heating."));
    
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a word from the word bank");
            String userWord = scanner.nextLine();
            
            boolean wordFound = false;
            for(wordAndDef pair : wordBank){
                if(pair.getWord().equalsIgnoreCase(userWord)){
                System.out.println("Definition: " + pair.getDefinition());
                wordFound = true;
                break;
                }
            }
            
            if (!wordFound){
                System.out.println("Word not found in the word bank");
            }
    }
}