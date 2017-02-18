/*
February 19th, 2017
Joshua Pickenpaugh
FINAL PROJECT, JAVA 2
 */

/*

Intel system

*/

package final_project_java_02;

public class Intel_System {
    
    //Private variables:
    private final double dblPriceIntelBase;
    private final String strIntelProcessor;
    private final String strIntelMemory;
    private final String strIntelHardDrive;
    private final String strIntelGraphicsCard;
    private final String strIntelCdRomDrive;
    private final String strIntelIntegratedAudio;
    private final String strIntelOS;
    private final String strIntelPoweredSpeakers;
    private final String strIntelKeyboard;
    private final String strIntelMouse;

    //Constructor:
    public Intel_System() {
        this.dblPriceIntelBase = 499.00;
        this.strIntelMouse = "USB Optical mouse";
        this.strIntelMemory = "4GB memory";
        this.strIntelHardDrive = "125GB hard drive";
        this.strIntelGraphicsCard = "";
        this.strIntelCdRomDrive = "CD-Rom drive";
        this.strIntelIntegratedAudio = "Integrated audio";
        this.strIntelOS = "Windows 8.1 OS";
        this.strIntelPoweredSpeakers = "2-piece powered speakers";
        this.strIntelKeyboard = "USB wired keyboard";
        this.strIntelProcessor = "Intel Celoron G1610";
    }

    //Accesors for private variables:
    public double GetDblPriceIntelBase() {
        return dblPriceIntelBase;
    }
    public String GetStrIntelProcessor() {
        return strIntelProcessor;
    }

    public String GetStrIntelMemory() {
        return strIntelMemory;
    }

    public String GetStrIntelHardDrive() {
        return strIntelHardDrive;
    }

    public String GetStrIntelGraphicsCard() {
        return strIntelGraphicsCard;
    }

    public String GetStrIntelCdRomDrive() {
        return strIntelCdRomDrive;
    }

    public String GetStrIntelIntegratedAudio() {
        return strIntelIntegratedAudio;
    }

    public String GetStrIntelOS() {
        return strIntelOS;
    }

    public String GetStrIntelPoweredSpeakers() {
        return strIntelPoweredSpeakers;
    }

    public String GetStrIntelKeyboard() {
        return strIntelKeyboard;
    }

    public String GetStrIntelMouse() {
        return strIntelMouse;
    }
}