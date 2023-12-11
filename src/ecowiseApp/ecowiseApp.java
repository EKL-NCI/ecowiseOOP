/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ecowiseApp;
import javax.swing.JFrame;
/**
 *
 * @author Erin Lee
 */

//@author Josh McGlynn - We ran into a lot of issues with GitHub during this project, particularly when it came to pulling and pushing files without having conflicts
//Essentially, every time we pushed or pulled files, it would push every single file in the ecowiseOOP project folder, including local files and binary files.
//This would completely break the project for whoever pulled, and stop people from being able to push due to conflicts
//I found that the solution to this would be to use a .gitignore file in order write certain file paths that we want GitHub to ignore when we push or pull files
//The .gitignore file can be found within the project folder, so feel free to take a look, I found a NetBeans gitignore template on GitHub, and added a couple other paths I thought should be ignored
//Initially, we thought this had worked, but the next day we ran into issues with pushing and pulling files again, and so I had to do more research
//I found that we actually needed to untrack the file paths that I wanted the .gitignore to ignore, or else GitHub would continue to push and pull them since it has already recognised them
//Erin and I then played around with GitBash until we found the right commands to untrack the files that we didn't want being pushed or pulled
//The command that worked for us was git rm --cached -r nbproject, and the same for the build folder. 
//Since then, we had no issues with the repository, and things have been pushing and pulling seemlessly
//This took way longer than it should have to figure out, multiple days of searching the internet for our specific issue, but we are all very glad to now have this knowledge for the future

public class ecowiseApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       EcowiseGUI myGUI = new EcowiseGUI();
        myGUI.setVisible(true);
    }
    
}
