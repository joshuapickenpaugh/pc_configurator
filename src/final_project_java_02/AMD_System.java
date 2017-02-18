/*
February 19th, 2017
Joshua Pickenpaugh
FINAL PROJECT, JAVA 2
 */

/*

AMD system

*/
package final_project_java_02;

public class AMD_System {

    //Variable declaration:
    private final double dblPriceAMDBase;
    private final String strAMDProcessor;
    private final String strAMDMemory;
    private final String strAMDHardDrive;
    private final String strAMDGraphicsCard;
    private final String strAMDCdRomDrive;
    private final String strAMDIntegratedAudio;
    private final String strAMDOS;
    private final String strAMDPoweredSpeakers;
    private final String strAMDKeyboard;
    private final String strAMDMouse;

    //Constructor:
    public AMD_System() {
        this.dblPriceAMDBase = 599.00;
        this.strAMDProcessor = "AMD FX-2100";
        this.strAMDMemory = "4GB memory";
        this.strAMDHardDrive = "125GB hard drive";
        this.strAMDGraphicsCard = "Integrated 3D graphics";
        this.strAMDCdRomDrive = "CD-Rom drive";
        this.strAMDIntegratedAudio = "Integrated audio";
        this.strAMDOS = "Windows 8.1 OS";
        this.strAMDPoweredSpeakers = "2-piece powered speakers";
        this.strAMDKeyboard = "USB wired keyboard";
        this.strAMDMouse = "USB Optical mouse";
    }

    //Accessors (getters...):
    public double GetDblPriceAMDBase() {
        return dblPriceAMDBase;
    }
    public String GetStrAMDProcessor() {
        return strAMDProcessor;
    }

    public String GetStrAMDMemory() {
        return strAMDMemory;
    }

    public String GetStrAMDHardDrive() {
        return strAMDHardDrive;
    }

    public String GetStrAMDGraphicsCard() {
        return strAMDGraphicsCard;
    }

    public String GetStrAMDCdRomDrive() {
        return strAMDCdRomDrive;
    }

    public String GetStrAMDIntegratedAudio() {
        return strAMDIntegratedAudio;
    }

    public String GetStrAMDOS() {
        return strAMDOS;
    }

    public String GetStrAMDPoweredSpeakers() {
        return strAMDPoweredSpeakers;
    }

    public String GetStrAMDKeyboard() {
        return strAMDKeyboard;
    }

    public String GetStrAMDMouse() {
        return strAMDMouse;
    }
}