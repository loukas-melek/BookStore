/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookstore.gui;

import bookstore.entities.Book;
import dao.DaoBook;
import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author RBS
 */
public final class SousMain extends javax.swing.JFrame {
     

    static int sel;

    /**
     * Creates new form Aff
     */
    public SousMain() {
        initComponents();
        Displaydata();
        this.setLocationRelativeTo(null);
   

    }
   public void Displaydata(){
           DaoBook db = new DaoBook();
        ArrayList<Book> L = new ArrayList<>();
        try {
            L = db.listBook();
        } catch (SQLException ex) {
            Logger.getLogger(SousMain.class.getName()).log(Level.SEVERE, null, ex);
        }

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        if (validCheck() == true) {
            while (model.getRowCount() > 0) {
                model.removeRow(0);

            }
        }
        Object[] row = new Object[6];
        for (int i = 0; i < L.size(); i++) {
            row[0] = L.get(i).getId();
            row[1] = L.get(i).getTitle();
            row[2] = L.get(i).getPrice();
            row[3] = L.get(i).getAuthor();
            row[4] = L.get(i).getReleaseDate();
            row[5] = L.get(i).getPath();
            model.addRow(row);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        jLabel10 = new javax.swing.JLabel();

        jTable2.setBackground(new java.awt.Color(34, 49, 63));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title ", "Price", "Author", "Release date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(34, 49, 63));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Title ", "Price", "Author", "ReleaseDate", "Path"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        jButton2.setBackground(new java.awt.Color(0, 51, 51));
        jButton2.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Register New Book");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 51, 51));
        jButton3.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Update a Book");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(102, 0, 0));
        jButton4.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Delete a Book");
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jToggleButton1.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jToggleButton1.setText("Back To Menu");
        jToggleButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addGap(10, 10, 10))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addComponent(jButton2)
                                .addGap(33, 33, 33)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(57, 57, 57)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jToggleButton1))
                        .addContainerGap(72, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setFont(new java.awt.Font("Constantia", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(34, 49, 63));
        jLabel1.setText("BookStore Library");

        jLabel7.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("-");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("X");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bookstore/gui/Img/logo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(266, 266, 266)
                .addComponent(filler2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addGap(126, 126, 126)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addComponent(filler2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public int selectRow() {
        int selected = jTable1.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        Object selectedObject = model.getValueAt(selected, 0);
        String s = selectedObject.toString();
        int id = Integer.parseInt(s);
        return id;
    }
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        DaoBook db = new DaoBook();
        int id = selectRow();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

        try {
            db.deleteB(id);
        } catch (SQLException ex) {
            Logger.getLogger(SousMain.class.getName()).log(Level.SEVERE, null, ex);
        }

//        model.removeRow(jTable1.getSelectedRow());
        JOptionPane.showMessageDialog(null, "Book Deleted With Success !");
        Displaydata();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        RegisterForm rgf = new RegisterForm();
        rgf.setVisible(true);
        rgf.pack();
        rgf.setLocationRelativeTo(null);
        rgf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            sel = selectRow();
            int selectedRow=jTable1.getSelectedRow();
            java.sql.Date date = null;
            DaoBook db =new DaoBook();
            /*UpdateForm uod = null;
            try {
            uod = new UpdateForm();
            } catch (ParseException ex) {
            Logger.getLogger(SousMain.class.getName()).log(Level.SEVERE, null, ex);
            }
            uod.setVisible(true);
            uod.pack();
            uod.setLocationRelativeTo(null);
            uod.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);*/
            
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            String title=model.getValueAt(selectedRow, 1).toString();
            String p=model.getValueAt(selectedRow, 2).toString();
            double price=Double.valueOf(p);
            String author=model.getValueAt(selectedRow, 3).toString();
            String d=model.getValueAt(selectedRow, 4).toString();
            System.out.print(d);
            date = Date.valueOf(d);
            
            String path=model.getValueAt(selectedRow, 5).toString();
            
            db.UpdateB(sel, title, price, author, date, path);
        } catch (SQLException ex) {
            Logger.getLogger(SousMain.class.getName()).log(Level.SEVERE, null, ex);
        }
       Displaydata();
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
         Menu co = new Menu();
        co .setVisible(true);
        co .pack();
        co .setLocationRelativeTo(null);
        co .setExtendedState(JFrame.MAXIMIZED_HORIZ);
        this.dispose();
    }//GEN-LAST:event_jToggleButton1ActionPerformed
    public boolean validCheck() {
        if (jTable1.getCellEditor() != null) {
            jTable1.getCellEditor().stopCellEditing();
        }
        for (int i = 0; i < jTable1.getRowCount(); i++) {
            for (int j = 0; j < jTable1.getColumnCount(); j++) {
                String value = jTable1.getValueAt(i, j).toString();
                if (value.trim().length() == 0) {
                    return false;
                } 
            }
        }
        return true;
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
            java.util.logging.Logger.getLogger(SousMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SousMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SousMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SousMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new SousMain().setVisible(true);
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.Box.Filler filler2;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
}
