/* * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template */package QuanLyKho.zis246;import javax.swing.table.DefaultTableModel;//test/** * * @author MSI */public class QuanLy_kho extends javax.swing.JFrame {    /**     * Creates new form QuanLiKhoForm     */    public QuanLy_kho() {        initComponents();    }    /**     * This method is called from within the constructor to initialize the form.     * WARNING: Do NOT modify this code. The content of this method is always     * regenerated by the Form Editor.     */    @SuppressWarnings("unchecked")    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents    private void initComponents() {        jInternalFrame1 = new javax.swing.JInternalFrame();        list1 = new java.awt.List();        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();        jLabel1 = new javax.swing.JLabel();        jSeparator1 = new javax.swing.JSeparator();        jSeparator2 = new javax.swing.JSeparator();        jLabel3 = new javax.swing.JLabel();        jLabel2 = new javax.swing.JLabel();        jLabel4 = new javax.swing.JLabel();        jLabel5 = new javax.swing.JLabel();        tenSP = new javax.swing.JTextField();        giaSP = new javax.swing.JTextField();        moTaSanPham = new javax.swing.JTextField();        buttonThem = new javax.swing.JButton();        buttonXoa = new javax.swing.JButton();        buttonSua = new javax.swing.JButton();        buttonTimKiem = new javax.swing.JButton();        jSeparator3 = new javax.swing.JSeparator();        jScrollPane1 = new javax.swing.JScrollPane();        jTable1 = new javax.swing.JTable();        danhMucSP = new javax.swing.JComboBox<>();        jInternalFrame1.setVisible(true);        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);        jInternalFrame1Layout.setHorizontalGroup(                jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)                        .addGap(0, 0, Short.MAX_VALUE)        );        jInternalFrame1Layout.setVerticalGroup(                jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)                        .addGap(0, 0, Short.MAX_VALUE)        );        jCheckBoxMenuItem1.setSelected(true);        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N        jLabel1.setText("Nhập Thông Tin Sản Phẩm");        jLabel3.setText("Ten SP :");        jLabel2.setText("Danh Muc SP :");        jLabel4.setText(" Gia SP : ");        jLabel5.setText(" Mo Ta SP :");        tenSP.addActionListener(new java.awt.event.ActionListener() {            public void actionPerformed(java.awt.event.ActionEvent evt) {                tenSPActionPerformed(evt);            }        });        buttonThem.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N        buttonThem.setText("Them");        buttonThem.addActionListener(new java.awt.event.ActionListener() {            public void actionPerformed(java.awt.event.ActionEvent evt) {                buttonThemActionPerformed(evt);            }        });        buttonXoa.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N        buttonXoa.setText("Xoa");        buttonXoa.addActionListener(new java.awt.event.ActionListener() {            public void actionPerformed(java.awt.event.ActionEvent evt) {                buttonXoaActionPerformed(evt);            }        });        buttonSua.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N        buttonSua.setText("Sua");        buttonSua.addActionListener(new java.awt.event.ActionListener() {            public void actionPerformed(java.awt.event.ActionEvent evt) {                buttonSuaActionPerformed(evt);            }        });        buttonTimKiem.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N        buttonTimKiem.setText("Tim Kiem");        buttonTimKiem.addActionListener(new java.awt.event.ActionListener() {            public void actionPerformed(java.awt.event.ActionEvent evt) {                buttonTimKiemActionPerformed(evt);            }        });        jTable1.setModel(new javax.swing.table.DefaultTableModel(                new Object [][] {                },                new String [] {                        "STT", "TEN", "DANH MUC", "GIA", "MO TA"                }        ) {            Class[] types = new Class [] {                    java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class            };            public Class getColumnClass(int columnIndex) {                return types [columnIndex];            }        });        jScrollPane1.setViewportView(jTable1);        danhMucSP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "San pham loai 1", "San pham loai 2" }));        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());        getContentPane().setLayout(layout);        layout.setHorizontalGroup(                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)                        .addGroup(layout.createSequentialGroup()                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)                                        .addGroup(layout.createSequentialGroup()                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)                                                        .addGroup(layout.createSequentialGroup()                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)                                                                        .addGroup(layout.createSequentialGroup()                                                                                .addGap(45, 45, 45)                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)                                                                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)                                                                                        .addGroup(layout.createSequentialGroup()                                                                                                .addGap(34, 34, 34)                                                                                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))                                                                                        .addGroup(layout.createSequentialGroup()                                                                                                .addGap(27, 27, 27)                                                                                                .addComponent(jLabel4))))                                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()                                                                                .addContainerGap()                                                                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))                                                                .addGap(48, 48, 48)                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)                                                                        .addComponent(moTaSanPham, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE)                                                                        .addComponent(giaSP, javax.swing.GroupLayout.Alignment.LEADING)                                                                        .addComponent(tenSP)                                                                        .addComponent(danhMucSP, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))                                                        .addGroup(layout.createSequentialGroup()                                                                .addGap(116, 116, 116)                                                                .addComponent(buttonThem, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)                                                                .addGap(31, 31, 31)                                                                .addComponent(buttonXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)                                                                .addGap(29, 29, 29)                                                                .addComponent(buttonSua, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)                                                                .addGap(27, 27, 27)                                                                .addComponent(buttonTimKiem))                                                        .addGroup(layout.createSequentialGroup()                                                                .addGap(31, 31, 31)                                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 586, javax.swing.GroupLayout.PREFERRED_SIZE)))                                                .addGap(0, 33, Short.MAX_VALUE))                                        .addComponent(jSeparator3)                                        .addGroup(layout.createSequentialGroup()                                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)                                                .addComponent(jSeparator2)))                                .addContainerGap())        );        layout.setVerticalGroup(                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)                        .addGroup(layout.createSequentialGroup()                                .addGap(14, 14, 14)                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)                                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)                                        .addComponent(jLabel1)                                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE))                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)                                        .addComponent(tenSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))                                .addGap(9, 9, 9)                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)                                        .addComponent(jLabel2)                                        .addComponent(danhMucSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))                                .addGap(26, 26, 26)                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)                                        .addComponent(giaSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)                                        .addComponent(jLabel4))                                .addGap(39, 39, 39)                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)                                        .addComponent(moTaSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)                                        .addComponent(jLabel5))                                .addGap(27, 27, 27)                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)                                        .addComponent(buttonTimKiem)                                        .addComponent(buttonSua)                                        .addComponent(buttonXoa)                                        .addComponent(buttonThem))                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)                                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)                                .addContainerGap(87, Short.MAX_VALUE))        );        pack();    }// </editor-fold>//GEN-END:initComponents    private void tenSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tenSPActionPerformed        // TODO add your handling code here:    }//GEN-LAST:event_tenSPActionPerformed    private int stt = 1; // Biến đếm STT    public void buttonThemActionPerformed(java.awt.event.ActionEvent evt) {        // Lấy thông tin từ các trường nhập liệu        String tenSanPham = tenSP.getText();        String danhMuc = danhMucSP.getSelectedItem().toString();        String gia = giaSP.getText();        String moTa = moTaSanPham.getText();        // Thêm dữ liệu vào bảng với STT        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();        model.addRow(new Object[]{stt++, tenSanPham, danhMuc, gia, moTa});    }    private void buttonSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSuaActionPerformed        // TODO add your handling code here:    }//GEN-LAST:event_buttonSuaActionPerformed    private void buttonTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTimKiemActionPerformed        // TODO add your handling code here:    }//GEN-LAST:event_buttonTimKiemActionPerformed    private void buttonXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonXoaActionPerformed        // TODO add your handling code here:    }//GEN-LAST:event_buttonXoaActionPerformed    /**     * @param args the command line arguments     */    public static void main(String args[]) {        /* Set the Nimbus look and feel */        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html         */        try {            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {                if ("Nimbus".equals(info.getName())) {                    javax.swing.UIManager.setLookAndFeel(info.getClassName());                    break;                }            }        } catch (ClassNotFoundException ex) {            java.util.logging.Logger.getLogger(QuanLy_kho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);        } catch (InstantiationException ex) {            java.util.logging.Logger.getLogger(QuanLy_kho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);        } catch (IllegalAccessException ex) {            java.util.logging.Logger.getLogger(QuanLy_kho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);        } catch (javax.swing.UnsupportedLookAndFeelException ex) {            java.util.logging.Logger.getLogger(QuanLy_kho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);        }        //</editor-fold>        /* Create and display the form */        java.awt.EventQueue.invokeLater(new Runnable() {            public void run() {                new QuanLy_kho().setVisible(true);            }        });    }    // Variables declaration - do not modify//GEN-BEGIN:variables    private javax.swing.JButton buttonSua;    private javax.swing.JButton buttonThem;    private javax.swing.JButton buttonTimKiem;    private javax.swing.JButton buttonXoa;    private javax.swing.JComboBox<String> danhMucSP;    private javax.swing.JTextField giaSP;    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;    private javax.swing.JInternalFrame jInternalFrame1;    private javax.swing.JLabel jLabel1;    private javax.swing.JLabel jLabel2;    private javax.swing.JLabel jLabel3;    private javax.swing.JLabel jLabel4;    private javax.swing.JLabel jLabel5;    private javax.swing.JScrollPane jScrollPane1;    private javax.swing.JSeparator jSeparator1;    private javax.swing.JSeparator jSeparator2;    private javax.swing.JSeparator jSeparator3;    private javax.swing.JTable jTable1;    private java.awt.List list1;    private javax.swing.JTextField moTaSanPham;    private javax.swing.JTextField tenSP;    // End of variables declaration//GEN-END:variables}