/*
February 19th, 2017
Joshua Pickenpaugh
FINAL PROJECT, JAVA 2
 */

/*

GUI

*/

package final_project_java_02;

import javax.swing.ButtonGroup;
import java.text.DecimalFormat;
import javax.swing.JFrame;

public class GUI extends javax.swing.JFrame { 
    
        //Initializes base system and upgrades/add-ons objects:
        Intel_System intSys = new Intel_System();
        AMD_System amdSys = new AMD_System();
        Upgrades_And_Addons upANDadd = new Upgrades_And_Addons();
        
        //Instantiates calculator object:
        Calculator calc = new Calculator();
        
        //Instantiates DecimalFormate object to format to currency/decimal 
        //places:
        DecimalFormat dc = new DecimalFormat("$0.00");
        
        //Instantiates a Receipt object:
        Receipt rcpt = new Receipt();
 
    public GUI() {
        initComponents();
        
        //Disables the re-size feature of the JFrame:
        setResizable(false);
        
        //Disable all buttons (except base systems) until user clicks a base 
        //system (rdo buttons pertaining to that particular user-selected 
        //system will become enabled in MAIN):
        rdoFx8350.setEnabled(false);
        rdoFx9590.setEnabled(false);
        rdoFx4100.setEnabled(false);
        rdoFx4300.setEnabled(false);
        rdoAmdNoUpgrade.setEnabled(false);
        rdoG1620.setEnabled(false);
        rdoG1630.setEnabled(false);
        rdoG1820.setEnabled(false);
        rdoG1830.setEnabled(false);
        rdoIntelNoUpgrade.setEnabled(false);
        rdo6GB.setEnabled(false);
        rdo8GB.setEnabled(false);
        rdo12GB.setEnabled(false);
        rdo16GB.setEnabled(false);
        rdoNoUpgradeMemory.setEnabled(false);
        rdo250GBHD.setEnabled(false);
        rdo500GBHardDrive.setEnabled(false);
        rdo1TBHardDrive.setEnabled(false);
        rdoNoUpgradeHardDrive.setEnabled(false);
        rdoDvdDrive.setEnabled(false);
        rdoComboDrive.setEnabled(false);
        rdoDvdCdRw.setEnabled(false);
        rdoNoUpgradeOpticalDrive.setEnabled(false);
        rdoWinPro.setEnabled(false);
        rdoLinux.setEnabled(false);
        rdoNoUpgradeOS.setEnabled(false);
        jRadioButton19.setEnabled(false);
        jRadioButton20.setEnabled(false);
        jRadioButton21.setEnabled(false);
        rdoNoUpgradeGraphicsCards.setEnabled(false);
        jCheckBox1.setEnabled(false);
        jCheckBox2.setEnabled(false);
        jCheckBox3.setEnabled(false);
        jCheckBox4.setEnabled(false);
        
        //Group the buttons into one button group, which allows for only 
        //one button to be selected in a group:
        //Base system group:
        ButtonGroup group1 = new ButtonGroup();
        group1.add(rdoIntel);
        group1.add(rdoAmd);
        group1.clearSelection();
        
        //AMD processor group:
        ButtonGroup group2 = new ButtonGroup();
        group2.add(rdoFx8350);
        group2.add(rdoFx9590);
        group2.add(rdoFx4100);
        group2.add(rdoFx4300);
        group2.add(rdoAmdNoUpgrade);
        group2.clearSelection();
        
        //Intell processor group:
        ButtonGroup group3 = new ButtonGroup();
        group3.add(rdoG1620);
        group3.add(rdoG1630);
        group3.add(rdoG1820);
        group3.add(rdoG1830);
        group3.add(rdoIntelNoUpgrade);
        group3.clearSelection();
        
        //Memory group:
        ButtonGroup group4 = new ButtonGroup();
        group4.add(rdo6GB);
        group4.add(rdo8GB);
        group4.add(rdo12GB);
        group4.add(rdo16GB);
        group4.add(rdoNoUpgradeMemory);
        group4.clearSelection();
        
        //Hard drive group:
        ButtonGroup group5 = new ButtonGroup();
        group5.add(rdo250GBHD);
        group5.add(rdo500GBHardDrive);
        group5.add(rdo1TBHardDrive);
        group5.add(rdoNoUpgradeHardDrive); 
        group5.clearSelection();        
        
        //Optical group:
        ButtonGroup group6 = new ButtonGroup();
        group6.add(rdoDvdDrive);
        group6.add(rdoComboDrive);
        group6.add(rdoDvdCdRw);
        group6.add(rdoNoUpgradeOpticalDrive); 
        group6.clearSelection();
        
        //OS group:
        ButtonGroup group7 = new ButtonGroup();
        group7.add(rdoWinPro);
        group7.add(rdoLinux);
        group7.add(rdoNoUpgradeOS);
        group7.clearSelection();
        
        //Graphics card group:
        ButtonGroup group8 = new ButtonGroup();
        group8.add(jRadioButton19);
        group8.add(jRadioButton20);
        group8.add(jRadioButton21);
        group8.add(rdoNoUpgradeGraphicsCards); 
        group8.clearSelection();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        rdoIntel = new javax.swing.JRadioButton();
        rdoAmd = new javax.swing.JRadioButton();
        btnOrder = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        rdoG1620 = new javax.swing.JRadioButton();
        rdoG1630 = new javax.swing.JRadioButton();
        rdoG1820 = new javax.swing.JRadioButton();
        rdoG1830 = new javax.swing.JRadioButton();
        rdoIntelNoUpgrade = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        rdoFx8350 = new javax.swing.JRadioButton();
        rdoFx9590 = new javax.swing.JRadioButton();
        rdoFx4100 = new javax.swing.JRadioButton();
        rdoFx4300 = new javax.swing.JRadioButton();
        rdoAmdNoUpgrade = new javax.swing.JRadioButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        rdo6GB = new javax.swing.JRadioButton();
        rdo8GB = new javax.swing.JRadioButton();
        rdo12GB = new javax.swing.JRadioButton();
        rdo16GB = new javax.swing.JRadioButton();
        rdoNoUpgradeMemory = new javax.swing.JRadioButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        rdo250GBHD = new javax.swing.JRadioButton();
        rdo500GBHardDrive = new javax.swing.JRadioButton();
        rdo1TBHardDrive = new javax.swing.JRadioButton();
        rdoNoUpgradeHardDrive = new javax.swing.JRadioButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        rdoDvdDrive = new javax.swing.JRadioButton();
        rdoComboDrive = new javax.swing.JRadioButton();
        rdoDvdCdRw = new javax.swing.JRadioButton();
        rdoNoUpgradeOpticalDrive = new javax.swing.JRadioButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jRadioButton19 = new javax.swing.JRadioButton();
        jRadioButton20 = new javax.swing.JRadioButton();
        jRadioButton21 = new javax.swing.JRadioButton();
        rdoNoUpgradeGraphicsCards = new javax.swing.JRadioButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        rdoWinPro = new javax.swing.JRadioButton();
        rdoLinux = new javax.swing.JRadioButton();
        rdoNoUpgradeOS = new javax.swing.JRadioButton();
        jPanel9 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        txtProcessor = new javax.swing.JTextField();
        txtMemory = new javax.swing.JTextField();
        txtHardDrive = new javax.swing.JTextField();
        txtGraphicsCard = new javax.swing.JTextField();
        txtCDRomDrive = new javax.swing.JTextField();
        txtIntegratedAudio = new javax.swing.JTextField();
        txtOS = new javax.swing.JTextField();
        txtPoweredSpeakers = new javax.swing.JTextField();
        txtKeyboard = new javax.swing.JTextField();
        txtMouse = new javax.swing.JTextField();
        txtMsHomeStudent = new javax.swing.JTextField();
        txtMsHomeBusiness = new javax.swing.JTextField();
        txtAccounting = new javax.swing.JTextField();
        txtGraphics = new javax.swing.JTextField();
        txtSubTotal = new javax.swing.JTextField();
        btnClear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Base system:");

        rdoIntel.setText("Intel");
        rdoIntel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoIntelActionPerformed(evt);
            }
        });

        rdoAmd.setText("AMD");
        rdoAmd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoAmdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rdoIntel)
                            .addComponent(rdoAmd))))
                .addGap(0, 3, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rdoIntel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rdoAmd)
                .addContainerGap(61, Short.MAX_VALUE))
        );

        btnOrder.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        btnOrder.setText("ORDER NOW");
        btnOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderActionPerformed(evt);
            }
        });

        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Intel Processor options:");

        rdoG1620.setText("G1620 2.70GHz");
        rdoG1620.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoG1620ActionPerformed(evt);
            }
        });

        rdoG1630.setText("G1630 2.80GHz");
        rdoG1630.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoG1630ActionPerformed(evt);
            }
        });

        rdoG1820.setText("G1820 2.70GHz");
        rdoG1820.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoG1820ActionPerformed(evt);
            }
        });

        rdoG1830.setText("G1830 2.80GHz");
        rdoG1830.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoG1830ActionPerformed(evt);
            }
        });

        rdoIntelNoUpgrade.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        rdoIntelNoUpgrade.setText("No upgrade");
        rdoIntelNoUpgrade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoIntelNoUpgradeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rdoG1620)
                            .addComponent(rdoG1630)
                            .addComponent(rdoG1820)
                            .addComponent(rdoG1830)
                            .addComponent(rdoIntelNoUpgrade))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rdoG1620)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rdoG1630)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rdoG1820)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rdoG1830)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rdoIntelNoUpgrade))
        );

        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("AMD Processor options:");

        rdoFx8350.setText("FX-8350");
        rdoFx8350.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoFx8350ActionPerformed(evt);
            }
        });

        rdoFx9590.setText("FX-9590");
        rdoFx9590.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoFx9590ActionPerformed(evt);
            }
        });

        rdoFx4100.setText("FX-4100");
        rdoFx4100.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoFx4100ActionPerformed(evt);
            }
        });

        rdoFx4300.setText("FX-4300");
        rdoFx4300.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoFx4300ActionPerformed(evt);
            }
        });

        rdoAmdNoUpgrade.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        rdoAmdNoUpgrade.setText("No upgrade");
        rdoAmdNoUpgrade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoAmdNoUpgradeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rdoAmdNoUpgrade)
                    .addComponent(rdoFx8350)
                    .addComponent(rdoFx9590)
                    .addComponent(rdoFx4100)
                    .addComponent(rdoFx4300)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rdoFx8350)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rdoFx9590)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rdoFx4100)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rdoFx4300)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rdoAmdNoUpgrade))
        );

        jPanel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Memory:");

        rdo6GB.setText("6GB");
        rdo6GB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdo6GBActionPerformed(evt);
            }
        });

        rdo8GB.setText("8GB");
        rdo8GB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdo8GBActionPerformed(evt);
            }
        });

        rdo12GB.setText("12GB");
        rdo12GB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdo12GBActionPerformed(evt);
            }
        });

        rdo16GB.setText("16GB");
        rdo16GB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdo16GBActionPerformed(evt);
            }
        });

        rdoNoUpgradeMemory.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        rdoNoUpgradeMemory.setText("No upgrade");
        rdoNoUpgradeMemory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoNoUpgradeMemoryActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(rdo6GB)
                            .addComponent(rdo8GB)
                            .addComponent(rdo12GB)
                            .addComponent(rdo16GB))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(rdoNoUpgradeMemory)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rdo6GB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rdo8GB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rdo12GB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rdo16GB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rdoNoUpgradeMemory)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Hard Drive:");

        rdo250GBHD.setText("250GB");
        rdo250GBHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdo250GBHDActionPerformed(evt);
            }
        });

        rdo500GBHardDrive.setText("500GB");
        rdo500GBHardDrive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdo500GBHardDriveActionPerformed(evt);
            }
        });

        rdo1TBHardDrive.setText("1TB");
        rdo1TBHardDrive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdo1TBHardDriveActionPerformed(evt);
            }
        });

        rdoNoUpgradeHardDrive.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        rdoNoUpgradeHardDrive.setText("No upgrade");
        rdoNoUpgradeHardDrive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoNoUpgradeHardDriveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(rdo250GBHD)
                    .addComponent(rdo500GBHardDrive)
                    .addComponent(rdo1TBHardDrive)
                    .addComponent(rdoNoUpgradeHardDrive))
                .addContainerGap(9, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rdo250GBHD)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rdo500GBHardDrive)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rdo1TBHardDrive)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rdoNoUpgradeHardDrive)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Optical Drive:");

        rdoDvdDrive.setText("DVD Drive");
        rdoDvdDrive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoDvdDriveActionPerformed(evt);
            }
        });

        rdoComboDrive.setText("Combo DVD/CDRW");
        rdoComboDrive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoComboDriveActionPerformed(evt);
            }
        });

        rdoDvdCdRw.setText("DVD and CDRW");
        rdoDvdCdRw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoDvdCdRwActionPerformed(evt);
            }
        });

        rdoNoUpgradeOpticalDrive.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        rdoNoUpgradeOpticalDrive.setText("No upgrade");
        rdoNoUpgradeOpticalDrive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoNoUpgradeOpticalDriveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6)
            .addComponent(rdoDvdDrive)
            .addComponent(rdoComboDrive)
            .addComponent(rdoDvdCdRw)
            .addComponent(rdoNoUpgradeOpticalDrive)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rdoDvdDrive)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rdoComboDrive)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rdoDvdCdRw)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rdoNoUpgradeOpticalDrive)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Graphics Cards:");

        jRadioButton19.setText("NVIDA GeForce G310 512MB DDR3");
        jRadioButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton19ActionPerformed(evt);
            }
        });

        jRadioButton20.setText("NVIDA GeForce GT620 1GB DDR3");
        jRadioButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton20ActionPerformed(evt);
            }
        });

        jRadioButton21.setText("NVIDA GeForce GT640 1GB GDDR5");
        jRadioButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton21ActionPerformed(evt);
            }
        });

        rdoNoUpgradeGraphicsCards.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        rdoNoUpgradeGraphicsCards.setText("No upgrade");
        rdoNoUpgradeGraphicsCards.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoNoUpgradeGraphicsCardsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jLabel7)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton19)
                    .addComponent(jRadioButton20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rdoNoUpgradeGraphicsCards)
                    .addComponent(jRadioButton21))
                .addGap(20, 20, 20))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jRadioButton19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton20))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jRadioButton21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rdoNoUpgradeGraphicsCards)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("OS:");

        rdoWinPro.setText("Windows 8.1 Pro");
        rdoWinPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoWinProActionPerformed(evt);
            }
        });

        rdoLinux.setText("Linux");
        rdoLinux.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoLinuxActionPerformed(evt);
            }
        });

        rdoNoUpgradeOS.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        rdoNoUpgradeOS.setText("No upgrade");
        rdoNoUpgradeOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoNoUpgradeOSActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(rdoWinPro)
                    .addComponent(rdoLinux)
                    .addComponent(rdoNoUpgradeOS))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rdoWinPro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rdoLinux)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rdoNoUpgradeOS)
                .addContainerGap(55, Short.MAX_VALUE))
        );

        jPanel9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Software Bundles:");

        jCheckBox1.setText("Microsoft Office Home and Student 2013");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jCheckBox2.setText("Microsoft Office Home & Business 2013");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });

        jCheckBox3.setText("Accounting package");
        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });

        jCheckBox4.setText("Graphics package");
        jCheckBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox1)
                            .addComponent(jCheckBox2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox4)
                            .addComponent(jCheckBox3))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jLabel9)
                .addGap(4, 4, 4)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox1)
                    .addComponent(jCheckBox3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox2)
                    .addComponent(jCheckBox4))
                .addContainerGap(56, Short.MAX_VALUE))
        );

        txtProcessor.setEditable(false);
        txtProcessor.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtMemory.setEditable(false);
        txtMemory.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtHardDrive.setEditable(false);
        txtHardDrive.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtGraphicsCard.setEditable(false);
        txtGraphicsCard.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtCDRomDrive.setEditable(false);
        txtCDRomDrive.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtIntegratedAudio.setEditable(false);
        txtIntegratedAudio.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtOS.setEditable(false);
        txtOS.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtPoweredSpeakers.setEditable(false);
        txtPoweredSpeakers.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtKeyboard.setEditable(false);
        txtKeyboard.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtMouse.setEditable(false);
        txtMouse.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtMsHomeStudent.setEditable(false);
        txtMsHomeStudent.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtMsHomeBusiness.setEditable(false);
        txtMsHomeBusiness.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtAccounting.setEditable(false);
        txtAccounting.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtGraphics.setEditable(false);
        txtGraphics.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtSubTotal.setEditable(false);
        txtSubTotal.setBackground(new java.awt.Color(240, 240, 100));
        txtSubTotal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtSubTotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnClear.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtProcessor)
                    .addComponent(txtMemory)
                    .addComponent(txtHardDrive)
                    .addComponent(txtGraphicsCard)
                    .addComponent(txtCDRomDrive)
                    .addComponent(txtIntegratedAudio)
                    .addComponent(txtOS)
                    .addComponent(txtPoweredSpeakers)
                    .addComponent(txtKeyboard)
                    .addComponent(txtMouse)
                    .addComponent(txtMsHomeStudent)
                    .addComponent(txtMsHomeBusiness)
                    .addComponent(txtAccounting)
                    .addComponent(txtGraphics)
                    .addComponent(txtSubTotal)
                    .addComponent(btnOrder, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                    .addComponent(btnClear, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtProcessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMemory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtHardDrive, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtGraphicsCard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCDRomDrive, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIntegratedAudio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtOS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPoweredSpeakers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtKeyboard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMouse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMsHomeStudent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMsHomeBusiness, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAccounting, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtGraphics, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSubTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(btnClear)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnOrder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Intel base system rdo button:
    //Displays base system features:
    private void rdoIntelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoIntelActionPerformed
        
        //Sets the text boxes with Intel base features:
        txtProcessor.setText(intSys.GetStrIntelProcessor());
        txtMemory.setText(intSys.GetStrIntelMemory());
        txtHardDrive.setText(intSys.GetStrIntelHardDrive());
        txtGraphicsCard.setText(intSys.GetStrIntelGraphicsCard());
        txtCDRomDrive.setText(intSys.GetStrIntelCdRomDrive());
        txtIntegratedAudio.setText(intSys.GetStrIntelIntegratedAudio());
        txtOS.setText(intSys.GetStrIntelOS());
        txtPoweredSpeakers.setText(intSys.GetStrIntelPoweredSpeakers());
        txtKeyboard.setText(intSys.GetStrIntelKeyboard());
        txtMouse.setText(intSys.GetStrIntelMouse());
                        
        //Enable pertinent rdo buttons for Intel base
        //system:        
        rdoG1620.setEnabled(true);
        rdoG1630.setEnabled(true);
        rdoG1820.setEnabled(true);
        rdoG1830.setEnabled(true);
        rdoIntelNoUpgrade.setEnabled(true);
        rdo6GB.setEnabled(true);
        rdo8GB.setEnabled(true);
        rdo12GB.setEnabled(true);
        rdo16GB.setEnabled(true);
        rdoNoUpgradeMemory.setEnabled(true);
        rdo250GBHD.setEnabled(true);
        rdo500GBHardDrive.setEnabled(true);
        rdo1TBHardDrive.setEnabled(true);
        rdoNoUpgradeHardDrive.setEnabled(true);
        rdoDvdDrive.setEnabled(true);
        rdoComboDrive.setEnabled(true);
        rdoDvdCdRw.setEnabled(true);
        rdoNoUpgradeOpticalDrive.setEnabled(true);
        rdoWinPro.setEnabled(true);
        rdoLinux.setEnabled(true);
        rdoNoUpgradeOS.setEnabled(true);
        jRadioButton19.setEnabled(true);
        jRadioButton20.setEnabled(true);
        jRadioButton21.setEnabled(true);
        rdoNoUpgradeGraphicsCards.setEnabled(true);
        jCheckBox1.setEnabled(true);
        jCheckBox2.setEnabled(true);
        jCheckBox3.setEnabled(true);
        jCheckBox4.setEnabled(true);
        
        //*** Keep these "false" ***:
        rdoFx8350.setEnabled(false);
        rdoFx9590.setEnabled(false);
        rdoFx4100.setEnabled(false);
        rdoFx4300.setEnabled(false);
        rdoAmdNoUpgrade.setEnabled(false);
        
        //Calls the GUI-class Calculate() method:
        this.Calculate(); 
        
    }//GEN-LAST:event_rdoIntelActionPerformed

    //AMD base system rdo button:
    //Displays base system features:
    private void rdoAmdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoAmdActionPerformed
 
        //Sets the text boxes with AMD base system features:
        txtProcessor.setText(amdSys.GetStrAMDProcessor());
        txtMemory.setText(amdSys.GetStrAMDMemory());
        txtHardDrive.setText(amdSys.GetStrAMDHardDrive());
        txtGraphicsCard.setText(amdSys.GetStrAMDGraphicsCard());
        txtCDRomDrive.setText(amdSys.GetStrAMDCdRomDrive());
        txtIntegratedAudio.setText(amdSys.GetStrAMDIntegratedAudio());
        txtOS.setText(amdSys.GetStrAMDOS());
        txtPoweredSpeakers.setText(amdSys.GetStrAMDPoweredSpeakers());
        txtKeyboard.setText(amdSys.GetStrAMDKeyboard());
        txtMouse.setText(amdSys.GetStrAMDMouse());
        
        //Enable pertinent rdo buttons for AMD base system:        
        rdoFx8350.setEnabled(true);
        rdoFx9590.setEnabled(true);
        rdoFx4100.setEnabled(true);
        rdoFx4300.setEnabled(true);
        rdoAmdNoUpgrade.setEnabled(true);
        rdo6GB.setEnabled(true);
        rdo8GB.setEnabled(true);
        rdo12GB.setEnabled(true);
        rdo16GB.setEnabled(true);
        rdoNoUpgradeMemory.setEnabled(true);
        rdo250GBHD.setEnabled(true);
        rdo500GBHardDrive.setEnabled(true);
        rdo1TBHardDrive.setEnabled(true);
        rdoNoUpgradeHardDrive.setEnabled(true);
        rdoDvdDrive.setEnabled(true);
        rdoComboDrive.setEnabled(true);
        rdoDvdCdRw.setEnabled(true);
        rdoNoUpgradeOpticalDrive.setEnabled(true);
        rdoWinPro.setEnabled(true);
        rdoLinux.setEnabled(true);
        rdoNoUpgradeOS.setEnabled(true);
        jRadioButton19.setEnabled(true);
        jRadioButton20.setEnabled(true);
        jRadioButton21.setEnabled(true);
        rdoNoUpgradeGraphicsCards.setEnabled(true);
        jCheckBox1.setEnabled(true);
        jCheckBox2.setEnabled(true);
        jCheckBox3.setEnabled(true);
        jCheckBox4.setEnabled(true);
        
        //*** Keep these "false" ***:     
        rdoG1620.setEnabled(false);
        rdoG1630.setEnabled(false);
        rdoG1820.setEnabled(false);
        rdoG1830.setEnabled(false);
        rdoIntelNoUpgrade.setEnabled(false);
        
        //Calls the GUI-class Calculate() method:
        this.Calculate(); 
    }//GEN-LAST:event_rdoAmdActionPerformed

    //AMD processor upgrade #1:
    private void rdoFx8350ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoFx8350ActionPerformed
 
        txtProcessor.setText(upANDadd.GetStrAmdUpProc01());
        
        //Calls the GUI-class Calculate() method:
        this.Calculate(); 
    }//GEN-LAST:event_rdoFx8350ActionPerformed

    //AMD processor upgrade #2:
    private void rdoFx9590ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoFx9590ActionPerformed
 
        txtProcessor.setText(upANDadd.GetStrAmdUpProc02());
        
        //Calls the GUI-class Calculate() method:
        this.Calculate(); 
    }//GEN-LAST:event_rdoFx9590ActionPerformed

    //AMD processor upgrade #3:
    private void rdoFx4100ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoFx4100ActionPerformed
 
        txtProcessor.setText(upANDadd.GetStrAmdUpProc03());
        
        //Calls the GUI-class Calculate() method:
        this.Calculate(); 
    }//GEN-LAST:event_rdoFx4100ActionPerformed

    //AMD processor upgrade #4:
    private void rdoFx4300ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoFx4300ActionPerformed
        
        txtProcessor.setText(upANDadd.GetStrAmdUpProc04());
        
        //Calls the GUI-class Calculate() method:
        this.Calculate(); 
    }//GEN-LAST:event_rdoFx4300ActionPerformed

    //Intel processor upgrade #1:
    private void rdoG1620ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoG1620ActionPerformed
 
        txtProcessor.setText(upANDadd.GetStrIntelUpProc01());
        
        //Calls the GUI-class Calculate() method:
        this.Calculate(); 
    }//GEN-LAST:event_rdoG1620ActionPerformed

    //Intel processor upgrade #2:
    private void rdoG1630ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoG1630ActionPerformed
 
        txtProcessor.setText(upANDadd.GetStrIntelUpProc02());
        
        //Calls the GUI-class Calculate() method:
        this.Calculate(); 
    }//GEN-LAST:event_rdoG1630ActionPerformed

    //Intel processor upgrade #3:
    private void rdoG1820ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoG1820ActionPerformed

        txtProcessor.setText(upANDadd.GetStrIntelUpProc03());
        
        //Calls the GUI-class Calculate() method:
        this.Calculate(); 
    }//GEN-LAST:event_rdoG1820ActionPerformed

    //Intel processor upgrade #4:
    private void rdoG1830ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoG1830ActionPerformed
 
        txtProcessor.setText(upANDadd.GetStrIntelUpProc04());
        
        //Calls the GUI-class Calculate() method:
        this.Calculate(); 
    }//GEN-LAST:event_rdoG1830ActionPerformed

    //Cancels the AMD processor upgrade option:
    private void rdoAmdNoUpgradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoAmdNoUpgradeActionPerformed
        
        txtProcessor.setText(intSys.GetStrIntelProcessor());
        
        //Calls the GUI-class Calculate() method:
        this.Calculate(); 
    }//GEN-LAST:event_rdoAmdNoUpgradeActionPerformed

    //Cancels the Intel processor upgrade option:
    private void rdoIntelNoUpgradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoIntelNoUpgradeActionPerformed
        
        txtProcessor.setText(amdSys.GetStrAMDProcessor());
        
        //Calls the GUI-class Calculate() method:
        this.Calculate(); 
    }//GEN-LAST:event_rdoIntelNoUpgradeActionPerformed
    //Upgrades the memory to 6GB:
    private void rdo6GBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdo6GBActionPerformed
 
        txtMemory.setText(upANDadd.GetStrMemoryUp01());
        
        //Calls the GUI-class Calculate() method:
        this.Calculate(); 
    }//GEN-LAST:event_rdo6GBActionPerformed

    //Upgrades the memory to 8GB:
    private void rdo8GBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdo8GBActionPerformed
 
        txtMemory.setText(upANDadd.GetStrMemoryUp02());
        
        //Calls the GUI-class Calculate() method:
        this.Calculate(); 
    }//GEN-LAST:event_rdo8GBActionPerformed

    //Upgrades the memory to 12GB:
    private void rdo12GBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdo12GBActionPerformed
       
        txtMemory.setText(upANDadd.GetStrMemoryUp03());
        
        //Calls the GUI-class Calculate() method:
        this.Calculate(); 
    }//GEN-LAST:event_rdo12GBActionPerformed

    //Upgrades the memory to 16GB:
    private void rdo16GBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdo16GBActionPerformed
      
        txtMemory.setText(upANDadd.GetStrMemoryUp04());
        
        //Calls the GUI-class Calculate() method:
        this.Calculate(); 
    }//GEN-LAST:event_rdo16GBActionPerformed

    //Cancels the memeory upgrade:
    private void rdoNoUpgradeMemoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoNoUpgradeMemoryActionPerformed
       
        //Gets the memory listing from the Intel base system as the default:
        txtMemory.setText(intSys.GetStrIntelMemory());
        
        //Calls the GUI-class Calculate() method:
        this.Calculate(); 
    }//GEN-LAST:event_rdoNoUpgradeMemoryActionPerformed

    //Upgrades the hard drive to 250GB:
    private void rdo250GBHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdo250GBHDActionPerformed
       
        txtHardDrive.setText(upANDadd.GetStrHdUp01());
        
        //Calls the GUI-class Calculate() method:
        this.Calculate(); 
    }//GEN-LAST:event_rdo250GBHDActionPerformed

    //Upgrades the hard drive to 500GB:
    private void rdo500GBHardDriveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdo500GBHardDriveActionPerformed
       
        txtHardDrive.setText(upANDadd.GetStrHdUp02());
        
        //Calls the GUI-class Calculate() method:
        this.Calculate(); 
    }//GEN-LAST:event_rdo500GBHardDriveActionPerformed

    //Upgrades the hard drive to 1TB:
    private void rdo1TBHardDriveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdo1TBHardDriveActionPerformed
         
        txtHardDrive.setText(upANDadd.GetStrHdUp03());
        
        //Calls the GUI-class Calculate() method:
        this.Calculate(); 
    }//GEN-LAST:event_rdo1TBHardDriveActionPerformed

    //Cancels the hard drive upgrade:
    private void rdoNoUpgradeHardDriveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoNoUpgradeHardDriveActionPerformed
        
        //Gets the HD listing from the Intel base system as the default:         
        txtHardDrive.setText(intSys.GetStrIntelHardDrive());
        
        //Calls the GUI-class Calculate() method:
        this.Calculate(); 
    }//GEN-LAST:event_rdoNoUpgradeHardDriveActionPerformed

    //Upgrades the optical drive to DVD:
    private void rdoDvdDriveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoDvdDriveActionPerformed
        
        txtCDRomDrive.setText(upANDadd.GetStrOpticalUp01());
        
        //Calls the GUI-class Calculate() method:
        this.Calculate(); 
    }//GEN-LAST:event_rdoDvdDriveActionPerformed

    //Upgrades the optical drive to a combo drive:
    private void rdoComboDriveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoComboDriveActionPerformed
        
        txtCDRomDrive.setText(upANDadd.GetStrOpticalUp02());
        
        //Calls the GUI-class Calculate() method:
        this.Calculate(); 
    }//GEN-LAST:event_rdoComboDriveActionPerformed

    //Upgrades the optical drive to a DVD/CDRW:
    private void rdoDvdCdRwActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoDvdCdRwActionPerformed
         
        txtCDRomDrive.setText(upANDadd.GetStrOpticalUp03());
        
        //Calls the GUI-class Calculate() method:
        this.Calculate(); 
    }//GEN-LAST:event_rdoDvdCdRwActionPerformed

    //Cancels the optical drive upgrade:
    private void rdoNoUpgradeOpticalDriveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoNoUpgradeOpticalDriveActionPerformed
        
        //Gets the optical drive listing from the Intel base system as the default:
        txtCDRomDrive.setText(intSys.GetStrIntelCdRomDrive());
        
        //Calls the GUI-class Calculate() method:
        this.Calculate(); 
    }//GEN-LAST:event_rdoNoUpgradeOpticalDriveActionPerformed

    //Upgrades the OS to Windows Pro:
    private void rdoWinProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoWinProActionPerformed
         
        txtOS.setText(upANDadd.GetStrOSUp01());
        
        //Calls the GUI-class Calculate() method:
        this.Calculate(); 
    }//GEN-LAST:event_rdoWinProActionPerformed

    //Switches OS to Linux:
    private void rdoLinuxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoLinuxActionPerformed
 
        txtOS.setText(upANDadd.GetStrOSUp02());
        
        //Calls the GUI-class Calculate() method:
        this.Calculate(); 
    }//GEN-LAST:event_rdoLinuxActionPerformed

    //Resets the OS to the default Windows 8.1:
    private void rdoNoUpgradeOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoNoUpgradeOSActionPerformed
           
        //Uses the Intel base system OS for the default:
        txtOS.setText(intSys.GetStrIntelOS());
        
        //Calls the GUI-class Calculate() method:
        this.Calculate(); 
    }//GEN-LAST:event_rdoNoUpgradeOSActionPerformed

    //Upgrades the graphics, #1:
    private void jRadioButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton19ActionPerformed

        txtGraphicsCard.setText(upANDadd.GetStrGraphicsUp01());
        
        //Calls the GUI-class Calculate() method:
        this.Calculate(); 
    }//GEN-LAST:event_jRadioButton19ActionPerformed
    
    //Upgrades the graphics, #2:
    private void jRadioButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton20ActionPerformed
       
        txtGraphicsCard.setText(upANDadd.GetStrGraphicsUp02());
        
        //Calls the GUI-class Calculate() method:
        this.Calculate(); 
    }//GEN-LAST:event_jRadioButton20ActionPerformed

    //Upgrades the graphics, #3:
    private void jRadioButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton21ActionPerformed
 
        txtGraphicsCard.setText(upANDadd.GetStrGraphicsUp03());
        
        //Calls the GUI-class Calculate() method:
        this.Calculate(); 
    }//GEN-LAST:event_jRadioButton21ActionPerformed

    //Cancels the upgrade:
    private void rdoNoUpgradeGraphicsCardsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoNoUpgradeGraphicsCardsActionPerformed
      
        //Uses the default graphics card from the Intel base system as the cancel:
        txtGraphicsCard.setText(intSys.GetStrIntelGraphicsCard());
        
        //Calls the GUI-class Calculate() method:
        this.Calculate(); 
    }//GEN-LAST:event_rdoNoUpgradeGraphicsCardsActionPerformed

    //Adds software package #1:
    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        
        this.IsCheckBoxChecked();
        
        //Calls the GUI-class Calculate() method:
        this.Calculate(); 
    }//GEN-LAST:event_jCheckBox1ActionPerformed
    
    //Adds software package #2:
    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
     
        this.IsCheckBoxChecked();
        
        //Calls the GUI-class Calculate() method:
        this.Calculate(); 
    }//GEN-LAST:event_jCheckBox2ActionPerformed
    
    //Adds software package #3:
    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed
 
        this.IsCheckBoxChecked();
        
        //Calls the GUI-class Calculate() method:
        this.Calculate(); 
    }//GEN-LAST:event_jCheckBox3ActionPerformed

    //Adds software package #3:
    private void jCheckBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox4ActionPerformed
        
        this.IsCheckBoxChecked();
        
        //Calls the GUI-class Calculate() method:
        this.Calculate(); 
    }//GEN-LAST:event_jCheckBox4ActionPerformed

    //Clears the text boxes, subtotal, and disables all buttons except the 
    //base system buttons:
    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
       
        //Clears the calculator object:
        calc.ClearCalc();
        
        //Clears the text boxes:
        txtProcessor.setText("");
        txtMemory.setText("");
        txtHardDrive.setText("");
        txtGraphicsCard.setText("");
        txtCDRomDrive.setText("");
        txtIntegratedAudio.setText("");
        txtOS.setText("");
        txtPoweredSpeakers.setText("");
        txtKeyboard.setText("");
        txtMouse.setText("");
        txtMsHomeStudent.setText("");
        txtMsHomeBusiness.setText("");
        txtAccounting.setText("");   
        txtGraphics.setText("");
        txtSubTotal.setText("");
        
        //Disable all buttons (except base systems) until user clicks a base 
        //system (rdo buttons pertaining to that particular user-selected 
        //system will become enabled in MAIN):
        rdoFx8350.setEnabled(false);
        rdoFx9590.setEnabled(false);
        rdoFx4100.setEnabled(false);
        rdoFx4300.setEnabled(false);
        rdoAmdNoUpgrade.setEnabled(false);
        rdoG1620.setEnabled(false);
        rdoG1630.setEnabled(false);
        rdoG1820.setEnabled(false);
        rdoG1830.setEnabled(false);
        rdoIntelNoUpgrade.setEnabled(false);
        rdo6GB.setEnabled(false);
        rdo8GB.setEnabled(false);
        rdo12GB.setEnabled(false);
        rdo16GB.setEnabled(false);
        rdoNoUpgradeMemory.setEnabled(false);
        rdo250GBHD.setEnabled(false);
        rdo500GBHardDrive.setEnabled(false);
        rdo1TBHardDrive.setEnabled(false);
        rdoNoUpgradeHardDrive.setEnabled(false);
        rdoDvdDrive.setEnabled(false);
        rdoComboDrive.setEnabled(false);
        rdoDvdCdRw.setEnabled(false);
        rdoNoUpgradeOpticalDrive.setEnabled(false);
        rdoWinPro.setEnabled(false);
        rdoLinux.setEnabled(false);
        rdoNoUpgradeOS.setEnabled(false);
        jRadioButton19.setEnabled(false);
        jRadioButton20.setEnabled(false);
        jRadioButton21.setEnabled(false);
        rdoNoUpgradeGraphicsCards.setEnabled(false);
        jCheckBox1.setEnabled(false);
        jCheckBox2.setEnabled(false);
        jCheckBox3.setEnabled(false);
        jCheckBox4.setEnabled(false);
        
        //Calling this code again clears the rdo buttons:
        ButtonGroup group1 = new ButtonGroup();
        group1.add(rdoIntel);
        group1.add(rdoAmd);
        group1.clearSelection();
        
        //AMD processor group:
        ButtonGroup group2 = new ButtonGroup();
        group2.add(rdoFx8350);
        group2.add(rdoFx9590);
        group2.add(rdoFx4100);
        group2.add(rdoFx4300);
        group2.add(rdoAmdNoUpgrade);
        group2.clearSelection();
        
        //Intell processor group:
        ButtonGroup group3 = new ButtonGroup();
        group3.add(rdoG1620);
        group3.add(rdoG1630);
        group3.add(rdoG1820);
        group3.add(rdoG1830);
        group3.add(rdoIntelNoUpgrade);
        group3.clearSelection();
        
        //Memory group:
        ButtonGroup group4 = new ButtonGroup();
        group4.add(rdo6GB);
        group4.add(rdo8GB);
        group4.add(rdo12GB);
        group4.add(rdo16GB);
        group4.add(rdoNoUpgradeMemory);
        group4.clearSelection();
        
        //Hard drive group:
        ButtonGroup group5 = new ButtonGroup();
        group5.add(rdo250GBHD);
        group5.add(rdo500GBHardDrive);
        group5.add(rdo1TBHardDrive);
        group5.add(rdoNoUpgradeHardDrive); 
        group5.clearSelection();        
        
        //Optical group:
        ButtonGroup group6 = new ButtonGroup();
        group6.add(rdoDvdDrive);
        group6.add(rdoComboDrive);
        group6.add(rdoDvdCdRw);
        group6.add(rdoNoUpgradeOpticalDrive); 
        group6.clearSelection();
        
        //OS group:
        ButtonGroup group7 = new ButtonGroup();
        group7.add(rdoWinPro);
        group7.add(rdoLinux);
        group7.add(rdoNoUpgradeOS);
        group7.clearSelection();
        
        //Graphics card group:
        ButtonGroup group8 = new ButtonGroup();
        group8.add(jRadioButton19);
        group8.add(jRadioButton20);
        group8.add(jRadioButton21);
        group8.add(rdoNoUpgradeGraphicsCards); 
        group8.clearSelection();
        
        jCheckBox1.setSelected(false);
        jCheckBox2.setSelected(false);
        jCheckBox3.setSelected(false);
        jCheckBox4.setSelected(false);
    }//GEN-LAST:event_btnClearActionPerformed

    //Sends item descriptions and total to a text box in separate window:
    private void btnOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderActionPerformed
        
        String txt;
        
        double dblSubTotal;
        String strSubTotal;
        double dblSalesTax;
        String strSalesTax;
        double dblShipping;
        String strShipping;
        double dblTOTAL;
        String strTOTAL;
        
        //Duplicates the text boxes to text boxes in another form:
        txt = txtProcessor.getText();
        rcpt.SetTextBox01(txt);
        
        txt = txtMemory.getText();
        rcpt.SetTextBox02(txt);
        
        txt = txtHardDrive.getText();
        rcpt.SetTextBox03(txt);
        
        txt = txtGraphicsCard.getText();
        rcpt.SetTextBox04(txt);
        
        txt = txtCDRomDrive.getText();
        rcpt.SetTextBox05(txt);
        
        txt = txtIntegratedAudio.getText();
        rcpt.SetTextBox06(txt);
        
        txt = txtOS.getText();
        rcpt.SetTextBox07(txt);
        
        txt = txtPoweredSpeakers.getText();
        rcpt.SetTextBox08(txt);
        
        txt = txtKeyboard.getText();
        rcpt.SetTextBox09(txt);
        
        txt = txtMouse.getText();
        rcpt.SetTextBox10(txt);
        
        txt = txtMsHomeStudent.getText();
        rcpt.SetTextBox11(txt);
        
        txt = txtMsHomeBusiness.getText();
        rcpt.SetTextBox12(txt);
        
        txt = txtAccounting.getText();
        rcpt.SetTextBox13(txt);
        
        txt = txtGraphics.getText();
        rcpt.SetTextBox14(txt);    
        
        //Get subtotal, sales tax, shipping, and TOTAL double variables 
        //from the calculator:
        dblTOTAL = calc.GetTOTAL();
        dblSubTotal = calc.GetSubTotal();
        dblSalesTax = calc.GetSalesTaxTOTAL();
        dblShipping = calc.GetShippingChargeTOTAL();
        
        //Uses the DecimalFormat object to convert to needed currency/decimal
        //places:
        strTOTAL = dc.format(dblTOTAL);
        strSubTotal = dc.format(dblSubTotal);  
        strSalesTax = dc.format(dblSalesTax);
        strShipping= dc.format(dblShipping);
        
        //Sets the subtotal, sales tax, shipping charge, and TOTAL values 
        //of the receipt:
        rcpt.SetTOTALTextBox(strTOTAL);
        rcpt.SetSubTotalTextBox(strSubTotal);
        rcpt.SetSalesTaxTextBox(strSalesTax);
        rcpt.SetShippingChargeTextBox(strShipping);

        
        //Sets appearance and location/behavoir of receipt: 
        rcpt.setTitle("RECEIPT");
        //Centers the GUI on start:
        rcpt.setLocationRelativeTo(null);
        rcpt.setVisible(true);
        rcpt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }//GEN-LAST:event_btnOrderActionPerformed

    public void Calculate()
    {
        //Clears the calculator object:
        calc.ClearCalc();
        
        //If anything in the text box, clear it:
        txtSubTotal.setText("");
        
        //Local variable to hold subtotal:
        double dblSubTotal;
        String strSubTotal;
        
        //Add base system price to subtotal:
        if (rdoIntel.isSelected())
        {
            calc.AddToSubTotal(intSys.GetDblPriceIntelBase());            
        }
        if (rdoAmd.isSelected())
        {
            calc.AddToSubTotal(amdSys.GetDblPriceAMDBase());   
        }
        
        //Add AMD processor upgrade:
        if (rdoFx8350.isSelected())
        {
            calc.AddToSubTotal(upANDadd.GetDblAmdUpProc01());
        }
        if (rdoFx9590.isSelected())
        {
            calc.AddToSubTotal(upANDadd.GetDblAmdUpProc02());
        }
        if (rdoFx4100.isSelected())
        {
            calc.AddToSubTotal(upANDadd.GetDblAmdUpProc03());
        }
        if (rdoFx4300.isSelected())
        {
            calc.AddToSubTotal(upANDadd.GetDblAmdUpProc04());
        }
        
        //Add Intel processor upgrades:
        if (rdoG1620.isSelected())
        {
            calc.AddToSubTotal(upANDadd.GetDblIntelUpProc01());
        }
        if (rdoG1630.isSelected())
        {
            calc.AddToSubTotal(upANDadd.GetDblIntelUpProc02());
        }
        if (rdoG1820.isSelected())
        {
            calc.AddToSubTotal(upANDadd.GetDblIntelUpProc03());
        }
        if (rdoG1830.isSelected())
        {
            calc.AddToSubTotal(upANDadd.GetDblIntelUpProc04());
        }
        
        //Memory upgrades:
        if (rdo6GB.isSelected())
        {
            calc.AddToSubTotal(upANDadd.GetDblMemoryUp01());
        }
        if (rdo8GB.isSelected())
        {
            calc.AddToSubTotal(upANDadd.GetDblMemoryUp02());
        }
        if (rdo12GB.isSelected())
        {
            calc.AddToSubTotal(upANDadd.GetDblMemoryUp03());
        }
        if (rdo16GB.isSelected())
        {
            calc.AddToSubTotal(upANDadd.GetDblMemoryUp04());
        }
        
        //Hard drive upgrades:
        if (rdo250GBHD.isSelected())
        {
            calc.AddToSubTotal(upANDadd.GetDblHdUp01());
        }
        if (rdo500GBHardDrive.isSelected())
        {
            calc.AddToSubTotal(upANDadd.GetDblHdUp02());
        }
        if (rdo1TBHardDrive.isSelected())
        {
            calc.AddToSubTotal(upANDadd.GetDblHdUp03());
        }
        
        //Optical drive upgrades:
        if (rdoDvdDrive.isSelected())
        {
            calc.AddToSubTotal(upANDadd.GetDblOpticalUp01());
        }
        if (rdoComboDrive.isSelected())
        {
            calc.AddToSubTotal(upANDadd.GetDblOpticalUp02());
        }
        if (rdoDvdCdRw.isSelected())
        {
            calc.AddToSubTotal(upANDadd.GetDblOpticalUp03());
        }
        
        //OS upgrades (and subtractions):
        if (rdoWinPro.isSelected())
        {
            calc.AddToSubTotal(upANDadd.GetDblOSUp01());
        }
        if (rdoLinux.isSelected())
        {
            calc.SubtractFromSubTotal(upANDadd.GetDblOSUp02());
        }
        
        //Graphics upgrades:
        if (jRadioButton19.isSelected())
        {
            calc.AddToSubTotal(upANDadd.GetDblGraphicsUp01());
        }
        if (jRadioButton20.isSelected())
        {
            calc.AddToSubTotal(upANDadd.GetDblGraphicsUp02());
        }
        if (jRadioButton21.isSelected())
        {
            calc.AddToSubTotal(upANDadd.GetDblGraphicsUp03());
        }
        
        //Software package add-ons:
        if (jCheckBox1.isSelected())
        {
            calc.AddToSubTotal(upANDadd.GetDblPackage01());
        }
        if (jCheckBox2.isSelected())
        {
            calc.AddToSubTotal(upANDadd.GetDblPackage02());
        }
        if (jCheckBox3.isSelected())
        {
            calc.AddToSubTotal(upANDadd.GetDblPackage03());
        }
        if (jCheckBox4.isSelected())
        {
            calc.AddToSubTotal(upANDadd.GetDblPackage04());
        }

        //Call calculator object to get subtotal:
        dblSubTotal = calc.GetSubTotal();
        
        //Uses the DecimalFormat object to convert to currency:
        strSubTotal = dc.format(dblSubTotal);        
        
        //Displays in text box:
        txtSubTotal.setText(strSubTotal);
    }
    
    //Checks to see if the check box is checked, and clears the text box
    //if it isn't checked:
    public void IsCheckBoxChecked()
    {
        //Software package #1:
        if (jCheckBox1.isSelected())
        {
            txtMsHomeStudent.setText(upANDadd.GetStrPackage01());
        }
        else
        {
            txtMsHomeStudent.setText("");
        }
        
        //Software package #2:
        if (jCheckBox2.isSelected())
        {
            txtMsHomeBusiness.setText(upANDadd.GetStrPackage02());
        }
        else
        {
            txtMsHomeBusiness.setText("");
        }
        
        //Software package #3:
        if (jCheckBox3.isSelected())
        {
            txtAccounting.setText(upANDadd.GetStrPackage03());
        }
        else
        {
            txtAccounting.setText("");
        }
        
        //Software package #4:
        if (jCheckBox4.isSelected())
        {
            txtGraphics.setText(upANDadd.GetStrPackage04());
        }
        else
        {
            txtGraphics.setText("");
        }       
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnOrder;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JRadioButton jRadioButton19;
    private javax.swing.JRadioButton jRadioButton20;
    private javax.swing.JRadioButton jRadioButton21;
    private javax.swing.JRadioButton rdo12GB;
    private javax.swing.JRadioButton rdo16GB;
    private javax.swing.JRadioButton rdo1TBHardDrive;
    private javax.swing.JRadioButton rdo250GBHD;
    private javax.swing.JRadioButton rdo500GBHardDrive;
    private javax.swing.JRadioButton rdo6GB;
    private javax.swing.JRadioButton rdo8GB;
    private javax.swing.JRadioButton rdoAmd;
    private javax.swing.JRadioButton rdoAmdNoUpgrade;
    private javax.swing.JRadioButton rdoComboDrive;
    private javax.swing.JRadioButton rdoDvdCdRw;
    private javax.swing.JRadioButton rdoDvdDrive;
    private javax.swing.JRadioButton rdoFx4100;
    private javax.swing.JRadioButton rdoFx4300;
    private javax.swing.JRadioButton rdoFx8350;
    private javax.swing.JRadioButton rdoFx9590;
    private javax.swing.JRadioButton rdoG1620;
    private javax.swing.JRadioButton rdoG1630;
    private javax.swing.JRadioButton rdoG1820;
    private javax.swing.JRadioButton rdoG1830;
    private javax.swing.JRadioButton rdoIntel;
    private javax.swing.JRadioButton rdoIntelNoUpgrade;
    private javax.swing.JRadioButton rdoLinux;
    private javax.swing.JRadioButton rdoNoUpgradeGraphicsCards;
    private javax.swing.JRadioButton rdoNoUpgradeHardDrive;
    private javax.swing.JRadioButton rdoNoUpgradeMemory;
    private javax.swing.JRadioButton rdoNoUpgradeOS;
    private javax.swing.JRadioButton rdoNoUpgradeOpticalDrive;
    private javax.swing.JRadioButton rdoWinPro;
    private javax.swing.JTextField txtAccounting;
    private javax.swing.JTextField txtCDRomDrive;
    private javax.swing.JTextField txtGraphics;
    private javax.swing.JTextField txtGraphicsCard;
    private javax.swing.JTextField txtHardDrive;
    private javax.swing.JTextField txtIntegratedAudio;
    private javax.swing.JTextField txtKeyboard;
    private javax.swing.JTextField txtMemory;
    private javax.swing.JTextField txtMouse;
    private javax.swing.JTextField txtMsHomeBusiness;
    private javax.swing.JTextField txtMsHomeStudent;
    private javax.swing.JTextField txtOS;
    private javax.swing.JTextField txtPoweredSpeakers;
    private javax.swing.JTextField txtProcessor;
    private javax.swing.JTextField txtSubTotal;
    // End of variables declaration//GEN-END:variables
}
