/*
February 19th, 2017
Joshua Pickenpaugh
FINAL PROJECT, JAVA 2
 */

/*

Upgrades and Add-ons

*/
package final_project_java_02;

public class Upgrades_And_Addons {

    //AMD processor upgrade variables:
    private final String strAmdUpProc01;
    private final double dblAmdUpProc01;
    private final String strAmdUpProc02;
    private final double dblAmdUpProc02;
    private final String strAmdUpProc03;
    private final double dblAmdUpProc03;
    private final String strAmdUpProc04;
    private final double dblAmdUpProc04;

    //Intel processor upgrade variables:
    private final String strIntelUpProc01;
    private final double dblIntelUpProc01;
    private final String strIntelUpProc02;
    private final double dblIntelUpProc02;
    private final String strIntelUpProc03;
    private final double dblIntelUpProc03;
    private final String strIntelUpProc04;
    private final double dblIntelUpProc04;

    //Memory upgrade variables:
    private final String strMemoryUp01;
    private final double dblMemoryUp01;
    private final String strMemoryUp02;
    private final double dblMemoryUp02;
    private final String strMemoryUp03;
    private final double dblMemoryUp03;
    private final String strMemoryUp04;
    private final double dblMemoryUp04;

    //Hard drive upgrade variables:
    private final String strHdUp01;
    private final double dblHdUp01;
    private final String strHdUp02;
    private final double dblHdUp02;
    private final String strHdUp03;
    private final double dblHdUp03;

    //Optical drive upgrade variables:
    private final String strOpticalUp01;
    private final double dblOpticalUp01;
    private final String strOpticalUp02;
    private final double dblOpticalUp02;
    private final String strOpticalUp03;
    private final double dblOpticalUp03;

    //Graphics upgrade variables:
    private final String strGraphicsUp01;
    private final double dblGraphicsUp01;
    private final String strGraphicsUp02;
    private final double dblGraphicsUp02;
    private final String strGraphicsUp03;
    private final double dblGraphicsUp03;

    //OS upgrade variables:
    private final String strOSUp01;
    private final double dblOSUp01;
    private final String strOSUp02;
    private final double dblOSUp02;

    //Application package option variables:
    private final String strPackage01;
    private final double dblPackage01;
    private final String strPackage02;
    private final double dblPackage02;
    private final String strPackage03;
    private final double dblPackage03;
    private final String strPackage04;
    private final double dblPackage04;

    //Constructor:
    public Upgrades_And_Addons() {
        
        //AMD processor upgrades:
        this.strAmdUpProc01 = "AMD FX-8350";
        this.dblAmdUpProc01 = 25.00;
        this.strAmdUpProc02 = "AMD FX-9590";
        this.dblAmdUpProc02 = 90.00;
        this.strAmdUpProc03 = "AMD FX-4100";
        this.dblAmdUpProc03 = 187.00;
        this.strAmdUpProc04 = "AMD FX-4300";
        this.dblAmdUpProc04 = 280.00;

        //Intel processor upgrades:
        this.strIntelUpProc01 = "G1620 2.7GHz";
        this.dblIntelUpProc01 = 50.00;
        this.strIntelUpProc02 = "G1630 2.8GHz";
        this.dblIntelUpProc02 = 90.00;
        this.strIntelUpProc03 = "G1820 2.7GHz";
        this.dblIntelUpProc03 = 105.00;
        this.strIntelUpProc04 = "G1830 2.8GHz";
        this.dblIntelUpProc04 = 130.00;

        //Memory upgrades:
        this.strMemoryUp01 = "6GB memory";
        this.dblMemoryUp01 = 28.00;
        this.strMemoryUp02 = "8GB memory";
        this.dblMemoryUp02 = 58.00;
        this.strMemoryUp03 = "12GB memory";
        this.dblMemoryUp03 = 108.00;
        this.strMemoryUp04 = "16GB memory";
        this.dblMemoryUp04 = 176.00;

        //Hard drive upgrades:
        this.strHdUp01 = "250GB hard drive";
        this.dblHdUp01 = 27.00;
        this.strHdUp02 = "500GB hard drive";
        this.dblHdUp02 = 50.00;
        this.strHdUp03 = "1TB hard drive";
        this.dblHdUp03 = 89.00;

        //Optical drive upgrades:
        this.strOpticalUp01 = "DVD drive";
        this.dblOpticalUp01 = 17.00;
        this.strOpticalUp02 = "Combo drive";
        this.dblOpticalUp02 = 40.00;
        this.strOpticalUp03 = "DVD/CDRW";
        this.dblOpticalUp03 = 79.00;

        //Graphics upgrade:
        this.strGraphicsUp01 = "NVIDA G310";
        this.dblGraphicsUp01 = 80.00;
        this.strGraphicsUp02 = "NVIDA GT620";
        this.dblGraphicsUp02 = 169.00;
        this.strGraphicsUp03 = "NVIDA GT640";
        this.dblGraphicsUp03 = 490.00;

        //OS upgrades:
        this.strOSUp01 = "Windows 8.1 Pro";
        this.dblOSUp01 = 59.00;
        //...subtract this value from subtotal...:
        this.strOSUp02 = "Linux";
        this.dblOSUp02 = 89.00;

        //Software packages:
        this.strPackage01 = "MS Home and Student 2013";
        this.dblPackage01 = 139.00;
        this.strPackage02 = "MS Home and Business 2013";
        this.dblPackage02 = 219.00;
        this.strPackage03 = "Accounting";
        this.dblPackage03 = 399.00;
        this.strPackage04 = "Graphics";
        this.dblPackage04 = 499.00;
    }

    //AMD processor upgrade accessors:
    public String GetStrAmdUpProc01() {
        return strAmdUpProc01;
    }
    public double GetDblAmdUpProc01() {
        return dblAmdUpProc01;
    }

    public String GetStrAmdUpProc02() {
        return strAmdUpProc02;
    }
    public double GetDblAmdUpProc02() {
        return dblAmdUpProc02;
    }

    public String GetStrAmdUpProc03() {
        return strAmdUpProc03;
    }
    public double GetDblAmdUpProc03() {
        return dblAmdUpProc03;
    }

    public String GetStrAmdUpProc04() {
        return strAmdUpProc04;
    }
    public double GetDblAmdUpProc04() {
        return dblAmdUpProc04;
    }

    //Intel processor upgrade accessors:
    public String GetStrIntelUpProc01() {
        return strIntelUpProc01;
    }
    public double GetDblIntelUpProc01() {
        return dblIntelUpProc01;
    }

    public String GetStrIntelUpProc02() {
        return strIntelUpProc02;
    }
    public double GetDblIntelUpProc02() {
        return dblIntelUpProc02;
    }

    public String GetStrIntelUpProc03() {
        return strIntelUpProc03;
    }
    public double GetDblIntelUpProc03() {
        return dblIntelUpProc03;
    }

    public String GetStrIntelUpProc04() {
        return strIntelUpProc04;
    }
    public double GetDblIntelUpProc04() {
        return dblIntelUpProc04;
    }

    //Memory upgrade accessors:
    public String GetStrMemoryUp01() {
        return strMemoryUp01;
    }
    public double GetDblMemoryUp01() {
        return dblMemoryUp01;
    }

    public String GetStrMemoryUp02() {
        return strMemoryUp02;
    }
    public double GetDblMemoryUp02() {
        return dblMemoryUp02;
    }

    public String GetStrMemoryUp03() {
        return strMemoryUp03;
    }
    public double GetDblMemoryUp03() {
        return dblMemoryUp03;
    }

    public String GetStrMemoryUp04() {
        return strMemoryUp04;
    }
    public double GetDblMemoryUp04() {
        return dblMemoryUp04;
    }

    //Hard drive upgrade accessors:
    public String GetStrHdUp01() {
        return strHdUp01;
    }
    public double GetDblHdUp01() {
        return dblHdUp01;
    }

    public String GetStrHdUp02() {
        return strHdUp02;
    }
    public double GetDblHdUp02() {
        return dblHdUp02;
    }

    public String GetStrHdUp03() {
        return strHdUp03;
    }
    public double GetDblHdUp03() {
        return dblHdUp03;
    }

    //Optical drive upgrade accessors:
    public String GetStrOpticalUp01() {
        return strOpticalUp01;
    }
    public double GetDblOpticalUp01() {
        return dblOpticalUp01;
    }

    public String GetStrOpticalUp02() {
        return strOpticalUp02;
    }
    public double GetDblOpticalUp02() {
        return dblOpticalUp02;
    }

    public String GetStrOpticalUp03() {
        return strOpticalUp03;
    }
    public double GetDblOpticalUp03() {
        return dblOpticalUp03;
    }

    //Graphics upgrade accessors:
    public String GetStrGraphicsUp01() {
        return strGraphicsUp01;
    }
    public double GetDblGraphicsUp01() {
        return dblGraphicsUp01;
    }

    public String GetStrGraphicsUp02() {
        return strGraphicsUp02;
    }
    public double GetDblGraphicsUp02() {
        return dblGraphicsUp02;
    }

    public String GetStrGraphicsUp03() {
        return strGraphicsUp03;
    }
    public double GetDblGraphicsUp03() {
        return dblGraphicsUp03;
    }

    //OS upgrade accessors:
    public String GetStrOSUp01() {
        return strOSUp01;
    }
    public double GetDblOSUp01() {
        return dblOSUp01;
    }

    public String GetStrOSUp02() {
        return strOSUp02;
    }
    public double GetDblOSUp02() {
        return dblOSUp02;
    }

    //Software package accessors:
    public String GetStrPackage01() {
        return strPackage01;
    }
    public double GetDblPackage01() {
        return dblPackage01;
    }

    public String GetStrPackage02() {
        return strPackage02;
    }
    public double GetDblPackage02() {
        return dblPackage02;
    }

    public String GetStrPackage03() {
        return strPackage03;
    }
    public double GetDblPackage03() {
        return dblPackage03;
    }

    public String GetStrPackage04() {
        return strPackage04;
    }
    public double GetDblPackage04() {
        return dblPackage04;
    }
}