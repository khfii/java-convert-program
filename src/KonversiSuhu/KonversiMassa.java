package KonversiSuhu;
import java.beans.Statement; 
import java.sql.Connection; 
import java.sql.DriverManager; 
import javax.swing.JOptionPane; 
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;


public class KonversiMassa extends javax.swing.JFrame {
    DefaultTableModel tabmode; 
    int konversiSatu, konversiDua; 
    double nilai, hasil; 
    String id; 

    /**
     * Creates new form KonversiMassa
     */
    public KonversiMassa() {
        initComponents();
        Object[] row = {
            "Nilai", 
            "Konversi", 
            "Hasil"
            
        }; 
        
        tabmode = new DefaultTableModel(null, row); 
        table_konversi.setModel(tabmode);
        
        tampilkandata(); 
    }
    
    public void tampilkandata(){
        try {
            java.sql.Connection conn = (java.sql.Connection)koneksi.koneksi_db(); 
            String sql = "select * from konversi3"; 
            java.sql.Statement stat = conn.createStatement(); 
            ResultSet hasil = stat.executeQuery(sql); 
            while(hasil.next()){
                String angka = hasil.getString("angka");  
                String nilai = hasil.getString("konvers");  
                String has = hasil.getString("hasil"); 
                String data[] = {
                    angka, 
                    nilai, 
                    has
                    
                }; 
                tabmode.addRow(data);
            }
        } catch (Exception e) {
        }
    }
    
    public void hapustable(){
        int row = tabmode.getRowCount(); 
        for(int i=0; i<row; i++){
            tabmode.removeRow(0);
        }
        
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        jButton12 = new javax.swing.JButton();
        comboKonversiS = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        comboKonversiD = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_konversi = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jButton13 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        fieldNilai = new KonversiSuhu.TextField();
        field_ketKonversi = new KonversiSuhu.TextField();
        fieldHasil = new KonversiSuhu.TextField();

        jCheckBox1.setText("jCheckBox1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Program Konversi Satuan Massa");

        jButton12.setText("Kembali");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        comboKonversiS.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Pilih Satuan Konversi -", "kg", "hg", "dag", "g", "dg", "cg", "mg" }));
        comboKonversiS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboKonversiSActionPerformed(evt);
            }
        });

        jLabel2.setText("DESC KONVERSI");

        jLabel5.setText("KONVERSI DARI");

        comboKonversiD.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Pilih Satuan Konversi -", "kg", "hg", "dag", "g", "dg", "cg", "mg" }));
        comboKonversiD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboKonversiDActionPerformed(evt);
            }
        });

        table_konversi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nilai", "Konversi", "Hasil"
            }
        ));
        jScrollPane1.setViewportView(table_konversi);

        jLabel6.setText("DIKONVERSIKAN KE");

        jButton13.setText("Hitung");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jLabel3.setText("MASUKAN NILAI");

        jLabel4.setText("HASIL");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("KONVERSI SATUAN MASSA");

        jButton10.setText("Simpan");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setText("Reset");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton13))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 656, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(field_ketKonversi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jButton10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton12))
                            .addComponent(comboKonversiS, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(fieldNilai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(fieldHasil, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(comboKonversiD, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fieldNilai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboKonversiS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboKonversiD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton13)
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(field_ketKonversi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fieldHasil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton11)
                            .addComponent(jButton12)
                            .addComponent(jButton10))))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        this.setVisible(false);
        MainMenu show = new MainMenu();
        show.setVisible(true);
    }//GEN-LAST:event_jButton12ActionPerformed

    private void comboKonversiSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboKonversiSActionPerformed
        konversiSatu =  comboKonversiS.getSelectedIndex();
        if(konversiSatu==1){
            id="kg";
        }

        else if(konversiSatu==2){
            id="hg";
        }
        else if(konversiSatu==3){
            id="dag";
        }
        else if(konversiSatu==4){
            id="g";
        }
        else if(konversiSatu==5){
            id="dg";
        }
        else if(konversiSatu==6){
            id="cg";
        }
        else if(konversiSatu==7){
            id="mg";
        }
        else {
            id = "null";
        }

    }//GEN-LAST:event_comboKonversiSActionPerformed

    private void comboKonversiDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboKonversiDActionPerformed

    }//GEN-LAST:event_comboKonversiDActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        konversiSatu =  comboKonversiS.getSelectedIndex();
        konversiDua = comboKonversiD.getSelectedIndex();

        if(konversiSatu + konversiDua == 2 && id=="kg"){
            nilai = Double.valueOf(fieldNilai.getText());
            hasil = nilai * 1;
            field_ketKonversi.setText("Kilogram - Kilogram");
            fieldHasil.setText(String.valueOf(hasil + " Kg"));

        }

        else if(konversiSatu + konversiDua == 3 && id=="kg"){
            nilai = Double.valueOf(fieldNilai.getText());
            hasil = nilai * 10;
            field_ketKonversi.setText("Kilogram - Hektogram");
            fieldHasil.setText(String.valueOf(hasil + " Hg"));

        }
        else if(konversiSatu + konversiDua == 4 && id=="kg"){
            nilai = Double.valueOf(fieldNilai.getText());
            hasil = nilai * 100;
            field_ketKonversi.setText("Kilogram - Dekagram");
            fieldHasil.setText(String.valueOf(hasil + " Dag"));

        }

        else if(konversiSatu + konversiDua == 5 && id=="kg"){
            nilai = Double.valueOf(fieldNilai.getText());
            hasil = nilai * 1000;
            field_ketKonversi.setText("Kilogram - Gram");
            fieldHasil.setText(String.valueOf(hasil + " G"));

        }
        else if(konversiSatu + konversiDua == 6 && id=="kg"){
            nilai = Double.valueOf(fieldNilai.getText());
            hasil = nilai * 10000;
            field_ketKonversi.setText("Kilogram - Desigram");
            fieldHasil.setText(String.valueOf(hasil + " Dg"));

        }

        else if(konversiSatu + konversiDua == 7 && id=="kg"){
            nilai = Double.valueOf(fieldNilai.getText());
            hasil = nilai * 100000;
            field_ketKonversi.setText("Kilogram - Centigram");
            fieldHasil.setText(String.valueOf(hasil + " Cg"));

        }

        else if(konversiSatu + konversiDua == 8 && id=="kg"){
            nilai = Double.valueOf(fieldNilai.getText());
            hasil = nilai * 1000_000;
            field_ketKonversi.setText("Kilogram - Miligram");
            fieldHasil.setText(String.valueOf(hasil + " Mg"));

        }

        else if(konversiSatu + konversiDua == 3 && id=="hg"){
            nilai = Double.valueOf(fieldNilai.getText());
            hasil = nilai / 10;
            field_ketKonversi.setText("Hektogram - Kilogram");
            fieldHasil.setText(String.valueOf(hasil + " Kg"));

        }

        else if(konversiSatu + konversiDua == 4 && id=="hg"){
            nilai = Double.valueOf(fieldNilai.getText());
            hasil = nilai / 1;
            field_ketKonversi.setText("Hektogram - Hektogram");
            fieldHasil.setText(String.valueOf(hasil + " Hg"));

        }

        else if(konversiSatu + konversiDua == 5 && id=="hg"){
            nilai = Double.valueOf(fieldNilai.getText());
            hasil = nilai * 10;
            field_ketKonversi.setText("Hektometer - Dekagram");
            fieldHasil.setText(String.valueOf(hasil + " Dag"));

        }
        else if(konversiSatu + konversiDua == 6 && id=="hg"){
            nilai = Double.valueOf(fieldNilai.getText());
            hasil = nilai * 100;
            field_ketKonversi.setText("Hektogram - Gram");
            fieldHasil.setText(String.valueOf(hasil + " G"));

        }
        else if(konversiSatu + konversiDua == 7 && id=="hg"){
            nilai = Double.valueOf(fieldNilai.getText());
            hasil = nilai * 1000;
            field_ketKonversi.setText("Hektogram - Desigram");
            fieldHasil.setText(String.valueOf(hasil + " Dg"));

        }
        else if(konversiSatu + konversiDua == 8 && id=="hg"){
            nilai = Double.valueOf(fieldNilai.getText());
            hasil = nilai * 10000;
            field_ketKonversi.setText("Hektogram - Centigram");
            fieldHasil.setText(String.valueOf(hasil + " Cg"));

        }
        else if(konversiSatu + konversiDua == 9 && id=="hg"){
            nilai = Double.valueOf(fieldNilai.getText());
            hasil = nilai * 100000;
            field_ketKonversi.setText("Hektogram - Miligram");
            fieldHasil.setText(String.valueOf(hasil + " Mg"));

        }
        else if(konversiSatu + konversiDua == 4 && id=="dag"){
            nilai = Double.valueOf(fieldNilai.getText());
            hasil = nilai / 100;
            field_ketKonversi.setText("Dekagram - Kilogram");
            fieldHasil.setText(String.valueOf(hasil + " Kg"));

        }
        else if(konversiSatu + konversiDua == 5 && id=="dag"){
            nilai = Double.valueOf(fieldNilai.getText());
            hasil = nilai / 10;
            field_ketKonversi.setText("Dekagram - Hektogram");
            fieldHasil.setText(String.valueOf(hasil + " Hg"));

        }
        else if(konversiSatu + konversiDua == 6 && id=="dag"){
            nilai = Double.valueOf(fieldNilai.getText());
            hasil = nilai / 1;
            field_ketKonversi.setText("Dekagram - Dekagram");
            fieldHasil.setText(String.valueOf(hasil + " Dag"));

        }
        else if(konversiSatu + konversiDua == 7 && id=="dag"){
            nilai = Double.valueOf(fieldNilai.getText());
            hasil = nilai * 10;
            field_ketKonversi.setText("Dekagram - Gram");
            fieldHasil.setText(String.valueOf(hasil + " G"));

        }
        else if(konversiSatu + konversiDua == 8 && id=="dag"){
            nilai = Double.valueOf(fieldNilai.getText());
            hasil = nilai * 100;
            field_ketKonversi.setText("Dekagram - Desigram");
            fieldHasil.setText(String.valueOf(hasil + " Dg"));

        }

        else if(konversiSatu + konversiDua == 9 && id=="dag"){
            nilai = Double.valueOf(fieldNilai.getText());
            hasil = nilai * 1000;
            field_ketKonversi.setText("Dekagram - Centigram");
            fieldHasil.setText(String.valueOf(hasil + " Cg"));

        }

        else if(konversiSatu + konversiDua == 10 && id=="dag"){
            nilai = Double.valueOf(fieldNilai.getText());
            hasil = nilai * 10000;
            field_ketKonversi.setText("Dekagram - Miligram");
            fieldHasil.setText(String.valueOf(hasil + " Mg"));

        }
        else if(konversiSatu + konversiDua == 5 && id=="g"){
            nilai = Double.valueOf(fieldNilai.getText());
            hasil = nilai / 1000;
            field_ketKonversi.setText("Gram - Kilogram");
            fieldHasil.setText(String.valueOf(hasil + " Kg"));

        }
        else if(konversiSatu + konversiDua == 6 && id=="g"){
            nilai = Double.valueOf(fieldNilai.getText());
            hasil = nilai / 100;
            field_ketKonversi.setText("Gram - Hektogram");
            fieldHasil.setText(String.valueOf(hasil + " Hektogram"));

        }
        else if(konversiSatu + konversiDua == 7 && id=="g"){
            nilai = Double.valueOf(fieldNilai.getText());
            hasil = nilai / 10;
            field_ketKonversi.setText("Gram - Dekagram");
            fieldHasil.setText(String.valueOf(hasil + " Dag"));

        }

        else if(konversiSatu + konversiDua == 8 && id=="g"){
            nilai = Double.valueOf(fieldNilai.getText());
            hasil = nilai / 1;
            field_ketKonversi.setText("Gram - Gram");
            fieldHasil.setText(String.valueOf(hasil + " G"));

        }
        else if(konversiSatu + konversiDua == 9   && id=="g"){
            nilai = Double.valueOf(fieldNilai.getText());
            hasil = nilai * 10;
            field_ketKonversi.setText("Gram - Desigram");
            fieldHasil.setText(String.valueOf(hasil + " Dg"));

        }

        else if(konversiSatu + konversiDua == 10 && id=="g"){
            nilai = Double.valueOf(fieldNilai.getText());
            hasil = nilai * 100;
            field_ketKonversi.setText("Gram - Centigram");
            fieldHasil.setText(String.valueOf(hasil + " Cg"));

        }
        else if(konversiSatu + konversiDua == 11 && id=="g"){
            nilai = Double.valueOf(fieldNilai.getText());
            hasil = nilai * 1000;
            field_ketKonversi.setText("Gram - Miligram");
            fieldHasil.setText(String.valueOf(hasil + " mg"));

        }
        else if(konversiSatu + konversiDua == 6 && id=="dg"){
            nilai = Double.valueOf(fieldNilai.getText());
            hasil = nilai / 10000;
            field_ketKonversi.setText("Desigram - Kilogram");
            fieldHasil.setText(String.valueOf(hasil + " Kg"));

        }

        else if(konversiSatu + konversiDua == 7 && id=="dg"){
            nilai = Double.valueOf(fieldNilai.getText());
            hasil = nilai / 1000;
            field_ketKonversi.setText("Desigram - Hektogram");
            fieldHasil.setText(String.valueOf(hasil + " Hg"));

        }

        else if(konversiSatu + konversiDua == 8 && id=="dg"){
            nilai = Double.valueOf(fieldNilai.getText());
            hasil = nilai / 100;
            field_ketKonversi.setText("Desigram - Dekagram");
            fieldHasil.setText(String.valueOf(hasil + " Dag"));

        }
        else if(konversiSatu + konversiDua == 9 && id=="dg"){
            nilai = Double.valueOf(fieldNilai.getText());
            hasil = nilai / 10;
            field_ketKonversi.setText("Desigram - Gram");
            fieldHasil.setText(String.valueOf(hasil + " G"));

        }
        else if(konversiSatu + konversiDua == 10 && id=="dg"){
            nilai = Double.valueOf(fieldNilai.getText());
            hasil = nilai / 1;
            field_ketKonversi.setText("Desigram - Desigram");
            fieldHasil.setText(String.valueOf(hasil + " Dg"));

        }
        else if(konversiSatu + konversiDua == 11 && id=="dg"){
            nilai = Double.valueOf(fieldNilai.getText());
            hasil = nilai * 10;
            field_ketKonversi.setText("Desigram - Centigram");
            fieldHasil.setText(String.valueOf(hasil + " Cg"));

        }

        else if(konversiSatu + konversiDua == 12 && id=="dg"){
            nilai = Double.valueOf(fieldNilai.getText());
            hasil = nilai * 100;
            field_ketKonversi.setText("Desigram - Miligram");
            fieldHasil.setText(String.valueOf(hasil + " Mg"));

        }

        else if(konversiSatu + konversiDua == 7 && id=="cg"){
            nilai = Double.valueOf(fieldNilai.getText());
            hasil = nilai / 100000;
            field_ketKonversi.setText("Centigram - Kilogram");
            fieldHasil.setText(String.valueOf(hasil + " Kg"));

        }

        else if(konversiSatu + konversiDua == 8 && id=="cg"){
            nilai = Double.valueOf(fieldNilai.getText());
            hasil = nilai / 10000;
            field_ketKonversi.setText("Centigram - Hektogram");
            fieldHasil.setText(String.valueOf(hasil + " Hg"));

        }

        else if(konversiSatu + konversiDua == 9 && id=="cg"){
            nilai = Double.valueOf(fieldNilai.getText());
            hasil = nilai / 1000;
            field_ketKonversi.setText("Centigram - Dekagram");
            fieldHasil.setText(String.valueOf(hasil + " Dag"));

        }
        else if(konversiSatu + konversiDua == 10 && id=="cg"){
            nilai = Double.valueOf(fieldNilai.getText());
            hasil = nilai / 100;
            field_ketKonversi.setText("Centigram - Gram");
            fieldHasil.setText(String.valueOf(hasil + " G"));

        }
        else if(konversiSatu + konversiDua == 11 && id=="cg"){
            nilai = Double.valueOf(fieldNilai.getText());
            hasil = nilai / 10;
            field_ketKonversi.setText("Centigram - Desigram");
            fieldHasil.setText(String.valueOf(hasil + " Dg"));

        }
        else if(konversiSatu + konversiDua == 12 && id=="cg"){
            nilai = Double.valueOf(fieldNilai.getText());
            hasil = nilai / 1;
            field_ketKonversi.setText("Centigram - Centigram");
            fieldHasil.setText(String.valueOf(hasil + " Cm"));

        }
        else if(konversiSatu + konversiDua == 13 && id=="cg"){
            nilai = Double.valueOf(fieldNilai.getText());
            hasil = nilai * 10;
            field_ketKonversi.setText("Centigram - Miligram");
            fieldHasil.setText(String.valueOf(hasil + " Mg"));

        }

        else if(konversiSatu + konversiDua == 8 && id=="mg"){
            nilai = Double.valueOf(fieldNilai.getText());
            hasil = nilai / 1000000;
            field_ketKonversi.setText("Miligram - Kilogram");
            fieldHasil.setText(String.valueOf(hasil + " Kg"));

        }
        else if(konversiSatu + konversiDua == 9 && id=="mg"){
            nilai = Double.valueOf(fieldNilai.getText());
            hasil = nilai / 100000;
            field_ketKonversi.setText("Miligram - Hektogram");
            fieldHasil.setText(String.valueOf(hasil + " Hg"));

        }
        else if(konversiSatu + konversiDua == 10 && id=="mg"){
            nilai = Double.valueOf(fieldNilai.getText());
            hasil = nilai / 10000;
            field_ketKonversi.setText("Miligram - Dekagram");
            fieldHasil.setText(String.valueOf(hasil + " Dag"));

        }
        else if(konversiSatu + konversiDua == 11 && id=="mg"){
            nilai = Double.valueOf(fieldNilai.getText());
            hasil = nilai / 1000;
            field_ketKonversi.setText("Miligram - Gram");
            fieldHasil.setText(String.valueOf(hasil + " Gram"));

        }
        else if(konversiSatu + konversiDua == 12 && id=="mg"){
            nilai = Double.valueOf(fieldNilai.getText());
            hasil = nilai / 100;
            field_ketKonversi.setText("Miligram - Desigram");
            fieldHasil.setText(String.valueOf(hasil + " Dg"));

        }
        else if(konversiSatu + konversiDua == 13 && id=="mg"){
            nilai = Double.valueOf(fieldNilai.getText());
            hasil = nilai / 10;
            field_ketKonversi.setText("Miligram - Centigram");
            fieldHasil.setText(String.valueOf(hasil + " cg"));

        }

        else if(konversiSatu + konversiDua == 14 && id=="mg"){
            nilai = Double.valueOf(fieldNilai.getText());
            hasil = nilai / 1;
            field_ketKonversi.setText("Miligram - Miligram");
            fieldHasil.setText(String.valueOf(hasil + " Mg"));

        }

    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        hapustable();
        try {

            String nilai, ketKonversi, hasil;
            nilai = fieldNilai.getText();
            ketKonversi = field_ketKonversi.getText();
            hasil = fieldHasil.getText();
            String sql = "insert into konversi3 (angka, konvers, hasil) values('" + nilai + "','" + ketKonversi + "','" + hasil + "')";
            java.sql.Connection conn = (java.sql.Connection)koneksi.koneksi_db();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

        tampilkandata();
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        fieldNilai.setText("");
        field_ketKonversi.setText("");
        fieldHasil.setText("");
        comboKonversiS.setSelectedIndex(0);
        comboKonversiD.setSelectedIndex(0);
    }//GEN-LAST:event_jButton11ActionPerformed

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
            java.util.logging.Logger.getLogger(KonversiMassa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KonversiMassa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KonversiMassa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KonversiMassa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KonversiMassa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comboKonversiD;
    private javax.swing.JComboBox<String> comboKonversiS;
    private KonversiSuhu.TextField fieldHasil;
    private KonversiSuhu.TextField fieldNilai;
    private KonversiSuhu.TextField field_ketKonversi;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table_konversi;
    // End of variables declaration//GEN-END:variables
}
