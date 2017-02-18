/*
February 19th, 2017
Joshua Pickenpaugh
FINAL PROJECT, JAVA 2
 */

/*

MAIN (Entrypoint)

*/

package final_project_java_02;

import javax.swing.JFrame;

public class Configurator_RUN_ME {

    public static void main(String[] args) {

        //Instantiates the configurator GUI:
        GUI gui = new GUI();
        gui.setTitle("PC Configurator");
        //Centers the GUI on start:
        gui.setLocationRelativeTo(null);
        gui.setVisible(true);
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}