/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pcbuilder;

import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author USER
 */
public class BuildFrame extends javax.swing.JFrame {

    private Map<String, Integer> motherboardPrices = Map.of(
    "ASUS ROG Maximus Z790 Hero", 33000,
    "MSI MEG Z790 ACE", 37000,
    "Gigabyte Z790 AORUS Master", 34000,
    "ASRock Z790 Taichi", 30000,
    "EVGA Z690 Dark Kingpin", 38000
);


private Map<String, Integer> processorPrices = Map.of(
    "Intel Core i9-14900K", 40000,
    "Intel Core i7-14700K", 33000,
    "AMD Ryzen 9 7950X", 37000,
    "AMD Ryzen 9 7900X3D", 36000,
    "Intel Core i9-13900KS", 39000
);


// Repeat for other parts:
private Map<String, Integer> fanPrices = Map.of(
    "NZXT Kraken Elite 360 RGB", 12000,
    "Corsair iCUE H150i Elite Capellix", 11000,
    "Noctua NH-D15 Chromax", 6000,
    "be quiet! Dark Rock Pro 4", 5500,
    "Lian Li Galahad II Trinity", 9000
);


private Map<String, Integer> storagePrices = Map.of(
    "Samsung 990 Pro 2TB NVMe Gen4", 12000,
    "Western Digital Black SN850X 2TB", 11000,
    "Seagate FireCuda 530 2TB", 13000,
    "Corsair MP700 2TB Gen5", 16000,
    "Sabrent Rocket 4 Plus 4TB", 20000
);


private Map<String, Integer> ramPrices = Map.of(
    "G.SKILL Trident Z5 RGB 32GB DDR5-6400", 12000,
    "Corsair Dominator Platinum RGB 64GB DDR5-6000", 18000,
    "Kingston FURY Beast 32GB DDR5-6000", 11000,
    "TeamGroup T-Force Delta RGB 32GB DDR5-7200", 12500,
    "ADATA XPG Lancer 64GB DDR5-6000", 17000
);


private Map<String, Integer> psuPrices = Map.of(
    "Corsair AX1600i 1600W Titanium", 20000,
    "Seasonic PRIME TX-1300 80+ Titanium", 17000,
    "Cooler Master V1300 Platinum", 16000,
    "ASUS ROG Thor 1200W Platinum II", 15000,
    "EVGA SuperNOVA 1000 G7", 12000
);


private Map<String, Integer> casePrices = Map.of(
    "Lian Li O11 Dynamic EVO XL", 12000,
    "Fractal Design Torrent RGB", 10000,
    "NZXT H9 Flow RGB", 9500,
    "Corsair iCUE 7000X RGB", 13000,
    "Phanteks Enthoo 719", 9000
);


private Map<String, Integer> gpuPrices = Map.of(
    "NVIDIA GeForce RTX 4090 Founders Edition", 115000,
    "ASUS ROG Strix RTX 4090 OC", 125000,
    "MSI SUPRIM X RTX 4090", 123000,
    "Gigabyte AORUS RTX 4080 XTREME", 98000,
    "AMD Radeon RX 7900 XTX", 85000
);


private Map<String, Integer> keyboardPrices = Map.of(
    "Corsair K100 RGB Optical", 10000,
    "SteelSeries Apex Pro TKL Wireless", 11000,
    "Razer Huntsman V2 Analog", 9500,
    "Logitech G915 TKL LIGHTSPEED", 12000,
    "Wooting 60HE", 12500
);


private Map<String, Integer> mousePrices = Map.of(
    "Logitech G Pro X Superlight 2", 8500,
    "Razer DeathAdder V3 Pro", 7000,
    "Glorious Model O Wireless", 4500,
    "SteelSeries Prime Wireless", 6000,
    "Corsair Dark Core RGB Pro SE", 5000
);


private Map<String, Integer> monitorPrices = Map.of(
    "ASUS ROG Swift OLED PG32UCDM 32\" 4K 240Hz", 90000,
    "Samsung Odyssey Neo G9 57\" Dual UHD", 140000,
    "Alienware AW3423DW QD-OLED 34\"", 85000,
    "LG UltraGear 27GR95QE-B 27\" OLED 240Hz", 80000,
    "Acer Predator X32 FP 32\" 4K 160Hz", 95000
);
 

    public BuildFrame() {
        initComponents();
        setLocationRelativeTo(null);
        
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
model.setRowCount(0);

model.addRow(new Object[]{"Motherboard", "", ""});
model.addRow(new Object[]{"Processor", "", ""});
model.addRow(new Object[]{"Cooling Fan", "", ""});
model.addRow(new Object[]{"Storage", "", ""});
model.addRow(new Object[]{"RAM", "", ""});
model.addRow(new Object[]{"Power Supply", "", ""});
model.addRow(new Object[]{"PC Case", "", ""});
model.addRow(new Object[]{"GPU", "", ""});
model.addRow(new Object[]{"Keyboard", "", ""});
model.addRow(new Object[]{"Mouse", "", ""});
model.addRow(new Object[]{"Monitor", "", ""});


jComboBoxMotherboard.addActionListener(e -> {
    String selected = (String) jComboBoxMotherboard.getSelectedItem();
    int price = motherboardPrices.getOrDefault(selected, 0);
    model.setValueAt(selected, 0, 1);
    model.setValueAt("₱" + price, 0, 2);
});

jComboBoxProcessor.addActionListener(e -> {
    String selected = (String) jComboBoxProcessor.getSelectedItem();
    int price = processorPrices.getOrDefault(selected, 0);
    model.setValueAt(selected, 1, 1);
    model.setValueAt("₱" + price, 1, 2);
});

jComboBoxFan.addActionListener(e -> {
    String selected = (String) jComboBoxFan.getSelectedItem();
    int price = fanPrices.getOrDefault(selected, 0);
    model.setValueAt(selected, 2, 1);
    model.setValueAt("₱" + price, 2, 2);
});

jComboBoxStorage.addActionListener(e -> {
    String selected = (String) jComboBoxStorage.getSelectedItem();
    int price = storagePrices.getOrDefault(selected, 0);
    model.setValueAt(selected, 3, 1);
    model.setValueAt("₱" + price, 3, 2);
});

jComboBoxRAM.addActionListener(e -> {
    String selected = (String) jComboBoxRAM.getSelectedItem();
    int price = ramPrices.getOrDefault(selected, 0);
    model.setValueAt(selected, 4, 1);
    model.setValueAt("₱" + price, 4, 2);
});

jComboBoxPSU.addActionListener(e -> {
    String selected = (String) jComboBoxPSU.getSelectedItem();
    int price = psuPrices.getOrDefault(selected, 0);
    model.setValueAt(selected, 5, 1);
    model.setValueAt("₱" + price, 5, 2);
});

jComboBoxCase.addActionListener(e -> {
    String selected = (String) jComboBoxCase.getSelectedItem();
    int price = casePrices.getOrDefault(selected, 0);
    model.setValueAt(selected, 6, 1);
    model.setValueAt("₱" + price, 6, 2);
});

jComboBoxGPU.addActionListener(e -> {
    String selected = (String) jComboBoxGPU.getSelectedItem();
    int price = gpuPrices.getOrDefault(selected, 0);
    model.setValueAt(selected, 7, 1);
    model.setValueAt("₱" + price, 7, 2);
});

jComboBoxKeyboard.addActionListener(e -> {
    String selected = (String) jComboBoxKeyboard.getSelectedItem();
    int price = keyboardPrices.getOrDefault(selected, 0);
    model.setValueAt(selected, 8, 1);
    model.setValueAt("₱" + price, 8, 2);
});

jComboBoxMouse.addActionListener(e -> {
    String selected = (String) jComboBoxMouse.getSelectedItem();
    int price = mousePrices.getOrDefault(selected, 0);
    model.setValueAt(selected, 9, 1);
    model.setValueAt("₱" + price, 9, 2);
});

jComboBoxMonitor.addActionListener(e -> {
    String selected = (String) jComboBoxMonitor.getSelectedItem();
    int price = monitorPrices.getOrDefault(selected, 0);
    model.setValueAt(selected, 10, 1);
    model.setValueAt("₱" + price, 10, 2);
});


    }

   public BuildFrame(DefaultTableModel model) {
    initComponents();
    jTable1.setModel(model); // restores the previous table
    setLocationRelativeTo(null);
    setupListeners(); // only if you use it
}




    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jComboBoxMotherboard = new javax.swing.JComboBox<>();
        jComboBoxProcessor = new javax.swing.JComboBox<>();
        jComboBoxFan = new javax.swing.JComboBox<>();
        jComboBoxStorage = new javax.swing.JComboBox<>();
        jComboBoxRAM = new javax.swing.JComboBox<>();
        jComboBoxPSU = new javax.swing.JComboBox<>();
        jComboBoxCase = new javax.swing.JComboBox<>();
        jComboBoxGPU = new javax.swing.JComboBox<>();
        jComboBoxKeyboard = new javax.swing.JComboBox<>();
        jComboBoxMouse = new javax.swing.JComboBox<>();
        jComboBoxMonitor = new javax.swing.JComboBox<>();
        jButtonBack = new javax.swing.JButton();
        jButtonProceed = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Components", "Choice", "Price"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jComboBoxMotherboard.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ASUS ROG Maximus Z790 Hero", "MSI MEG Z790 ACE", "Gigabyte Z790 AORUS Master", "ASRock Z790 Taichi", "EVGA Z690 Dark Kingpin" }));
        jComboBoxMotherboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxMotherboardActionPerformed(evt);
            }
        });

        jComboBoxProcessor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Intel Core i9-14900K", "Intel Core i7-14700K", "AMD Ryzen 9 7950X", "AMD Ryzen 9 7900X3D", "Intel Core i9-13900KS" }));
        jComboBoxProcessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxProcessorActionPerformed(evt);
            }
        });

        jComboBoxFan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NZXT Kraken Elite 360 RGB", "Corsair iCUE H150i Elite Capellix", "Noctua NH-D15 Chromax", "be quiet! Dark Rock Pro 4", "Lian Li Galahad II Trinity" }));

        jComboBoxStorage.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Samsung 990 Pro 2TB NVMe Gen4", "Western Digital Black SN850X 2TB", "Seagate FireCuda 530 2TB", "Corsair MP700 2TB Gen5", "Sabrent Rocket 4 Plus 4TB" }));
        jComboBoxStorage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxStorageActionPerformed(evt);
            }
        });

        jComboBoxRAM.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "G.SKILL Trident Z5 RGB 32GB DDR5-6400", "Corsair Dominator Platinum RGB 64GB DDR5-6000", "Kingston FURY Beast 32GB DDR5-6000", "TeamGroup T-Force Delta RGB 32GB DDR5-7200", "ADATA XPG Lancer 64GB DDR5-6000" }));
        jComboBoxRAM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxRAMActionPerformed(evt);
            }
        });

        jComboBoxPSU.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Corsair AX1600i 1600W Titanium", "Seasonic PRIME TX-1300 80+ Titanium", "Cooler Master V1300 Platinum", "ASUS ROG Thor 1200W Platinum II", "EVGA SuperNOVA 1000 G7" }));

        jComboBoxCase.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Lian Li O11 Dynamic EVO XL", "Fractal Design Torrent RGB", "NZXT H9 Flow RGB", "Corsair iCUE 7000X RGB", "Phanteks Enthoo 719" }));
        jComboBoxCase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCaseActionPerformed(evt);
            }
        });

        jComboBoxGPU.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NVIDIA GeForce RTX 4090 Founders Edition", "ASUS ROG Strix RTX 4090 OC", "MSI SUPRIM X RTX 4090", "Gigabyte AORUS RTX 4080 XTREME", "AMD Radeon RX 7900 XTX" }));
        jComboBoxGPU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxGPUActionPerformed(evt);
            }
        });

        jComboBoxKeyboard.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Corsair K100 RGB Optical", "SteelSeries Apex Pro TKL Wireless", "Razer Huntsman V2 Analog", "Logitech G915 TKL LIGHTSPEED", "Wooting 60HE" }));
        jComboBoxKeyboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxKeyboardActionPerformed(evt);
            }
        });

        jComboBoxMouse.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Logitech G Pro X Superlight 2", "Razer DeathAdder V3 Pro", "Glorious Model O Wireless", "SteelSeries Prime Wireless", "Corsair Dark Core RGB Pro SE" }));
        jComboBoxMouse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxMouseActionPerformed(evt);
            }
        });

        jComboBoxMonitor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ASUS ROG Swift OLED PG32UCDM 32\" 4K 240Hz", "Samsung Odyssey Neo G9 57\" Dual UHD", "Alienware AW3423DW QD-OLED 34\"", "LG UltraGear 27GR95QE-B 27\" OLED 240Hz", "Acer Predator X32 FP 32\" 4K 160Hz" }));
        jComboBoxMonitor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxMonitorActionPerformed(evt);
            }
        });

        jButtonBack.setText("Back");
        jButtonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBackActionPerformed(evt);
            }
        });

        jButtonProceed.setText("Proceed to Tally");
        jButtonProceed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonProceedActionPerformed(evt);
            }
        });

        jLabel1.setText("Motherboard");

        jLabel2.setText("Processor");

        jLabel3.setText("Power Supply Unit");

        jLabel4.setText("Heatsink");

        jLabel5.setText("Storage");

        jLabel6.setText("RAM");

        jLabel7.setText("PC Case");

        jLabel8.setText("Graphics Card");

        jLabel9.setText("Keyboard");

        jLabel10.setText("Mouse");

        jLabel11.setText("Monitor");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jButtonBack)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonProceed)
                        .addGap(68, 68, 68)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBoxMotherboard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)
                            .addComponent(jComboBoxStorage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxRAM, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxFan, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxProcessor, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxMouse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxGPU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxCase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxPSU, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jComboBoxKeyboard, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jComboBoxMonitor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonBack)
                            .addComponent(jButtonProceed)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jComboBoxMotherboard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBoxPSU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel7))
                                .addGap(2, 2, 2)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jComboBoxProcessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBoxCase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(jLabel1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBoxGPU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxFan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBoxKeyboard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxStorage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBoxMouse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxRAM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jComboBoxMonitor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel11))))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxMotherboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxMotherboardActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxMotherboardActionPerformed

    private void jButtonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBackActionPerformed
new MainFrame().setVisible(true);
this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonBackActionPerformed

    private void jButtonProceedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProceedActionPerformed
DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
boolean hasEmpty = false;

// Check if any 'Choice' or 'Price' cell is empty
for (int i = 0; i < model.getRowCount(); i++) {
    Object choice = model.getValueAt(i, 1); // column 1 = choice
    Object price = model.getValueAt(i, 2);  // column 2 = price

    if (choice == null || choice.toString().isEmpty() ||
        price == null || price.toString().isEmpty()) {
        hasEmpty = true;
        break;
    }
}

if (hasEmpty) {
    // Show warning and STOP here
    JOptionPane.showMessageDialog(this, "Please select all parts before proceeding.", "Incomplete Build", JOptionPane.WARNING_MESSAGE);
    return; // 🔒 STOP — do NOT proceed
}

// If all parts are filled, ask for confirmation
int result = JOptionPane.showConfirmDialog(this, "Are you sure you want to proceed to the summary?", "Confirm", JOptionPane.YES_NO_OPTION);

if (result == JOptionPane.YES_OPTION) {
    new TallyFrame(model).setVisible(true);
    this.dispose();
}
// If NO was selected, do nothing

    }//GEN-LAST:event_jButtonProceedActionPerformed

    private void jComboBoxProcessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxProcessorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxProcessorActionPerformed

    private void jComboBoxCaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCaseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxCaseActionPerformed

    private void jComboBoxGPUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxGPUActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxGPUActionPerformed

    private void jComboBoxKeyboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxKeyboardActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxKeyboardActionPerformed

    private void jComboBoxStorageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxStorageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxStorageActionPerformed

    private void jComboBoxMonitorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxMonitorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxMonitorActionPerformed

    private void jComboBoxMouseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxMouseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxMouseActionPerformed

    private void jComboBoxRAMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxRAMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxRAMActionPerformed

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
            java.util.logging.Logger.getLogger(BuildFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuildFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuildFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuildFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BuildFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBack;
    private javax.swing.JButton jButtonProceed;
    private javax.swing.JComboBox<String> jComboBoxCase;
    private javax.swing.JComboBox<String> jComboBoxFan;
    private javax.swing.JComboBox<String> jComboBoxGPU;
    private javax.swing.JComboBox<String> jComboBoxKeyboard;
    private javax.swing.JComboBox<String> jComboBoxMonitor;
    private javax.swing.JComboBox<String> jComboBoxMotherboard;
    private javax.swing.JComboBox<String> jComboBoxMouse;
    private javax.swing.JComboBox<String> jComboBoxPSU;
    private javax.swing.JComboBox<String> jComboBoxProcessor;
    private javax.swing.JComboBox<String> jComboBoxRAM;
    private javax.swing.JComboBox<String> jComboBoxStorage;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    private void setupListeners() {
    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

    jComboBoxMotherboard.addActionListener(e -> {
        String selected = (String) jComboBoxMotherboard.getSelectedItem();
        int price = motherboardPrices.getOrDefault(selected, 0);
        model.setValueAt(selected, 0, 1);
        model.setValueAt("₱" + price, 0, 2);
    });

    jComboBoxProcessor.addActionListener(e -> {
        String selected = (String) jComboBoxProcessor.getSelectedItem();
        int price = processorPrices.getOrDefault(selected, 0);
        model.setValueAt(selected, 1, 1);
        model.setValueAt("₱" + price, 1, 2);
    });

    jComboBoxFan.addActionListener(e -> {
        String selected = (String) jComboBoxFan.getSelectedItem();
        int price = fanPrices.getOrDefault(selected, 0);
        model.setValueAt(selected, 2, 1);
        model.setValueAt("₱" + price, 2, 2);
    });

    jComboBoxStorage.addActionListener(e -> {
        String selected = (String) jComboBoxStorage.getSelectedItem();
        int price = storagePrices.getOrDefault(selected, 0);
        model.setValueAt(selected, 3, 1);
        model.setValueAt("₱" + price, 3, 2);
    });

    jComboBoxRAM.addActionListener(e -> {
        String selected = (String) jComboBoxRAM.getSelectedItem();
        int price = ramPrices.getOrDefault(selected, 0);
        model.setValueAt(selected, 4, 1);
        model.setValueAt("₱" + price, 4, 2);
    });

    jComboBoxPSU.addActionListener(e -> {
        String selected = (String) jComboBoxPSU.getSelectedItem();
        int price = psuPrices.getOrDefault(selected, 0);
        model.setValueAt(selected, 5, 1);
        model.setValueAt("₱" + price, 5, 2);
    });

    jComboBoxCase.addActionListener(e -> {
        String selected = (String) jComboBoxCase.getSelectedItem();
        int price = casePrices.getOrDefault(selected, 0);
        model.setValueAt(selected, 6, 1);
        model.setValueAt("₱" + price, 6, 2);
    });

    jComboBoxGPU.addActionListener(e -> {
        String selected = (String) jComboBoxGPU.getSelectedItem();
        int price = gpuPrices.getOrDefault(selected, 0);
        model.setValueAt(selected, 7, 1);
        model.setValueAt("₱" + price, 7, 2);
    });

    jComboBoxKeyboard.addActionListener(e -> {
        String selected = (String) jComboBoxKeyboard.getSelectedItem();
        int price = keyboardPrices.getOrDefault(selected, 0);
        model.setValueAt(selected, 8, 1);
        model.setValueAt("₱" + price, 8, 2);
    });

    jComboBoxMouse.addActionListener(e -> {
        String selected = (String) jComboBoxMouse.getSelectedItem();
        int price = mousePrices.getOrDefault(selected, 0);
        model.setValueAt(selected, 9, 1);
        model.setValueAt("₱" + price, 9, 2);
    });

    jComboBoxMonitor.addActionListener(e -> {
        String selected = (String) jComboBoxMonitor.getSelectedItem();
        int price = monitorPrices.getOrDefault(selected, 0);
        model.setValueAt(selected, 10, 1);
        model.setValueAt("₱" + price, 10, 2);
    });
}
} 

