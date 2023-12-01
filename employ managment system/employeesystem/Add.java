package employeesystem;

/**
 *
 * @author pande
 */
import java.util.*;
import javax.swing.JOptionPane;
public class Add extends javax.swing.JFrame {

    /**
     * Creates new form Add
     */
    Random random = new Random();
    public Add() {
        initComponents();
        addemployee();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        employeelbl = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        emaillbl = new javax.swing.JTextField();
        namelbl = new javax.swing.JTextField();
        addharlbl = new javax.swing.JTextField();
        desiginationlbl = new javax.swing.JTextField();
        phonelbl = new javax.swing.JTextField();
        salarylbl = new javax.swing.JTextField();
        fnamelbl = new javax.swing.JTextField();
        educationlbl = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        addresslbl = new javax.swing.JTextArea();
        doblbl = new com.toedter.calendar.JDateChooser();
        jLabel12 = new javax.swing.JLabel();
        backbtn = new javax.swing.JButton();
        addbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 59, 59));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Add Empolyee");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, 290, 60));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 120));

        jPanel2.setBackground(new java.awt.Color(0, 152, 152));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Date of Birth :");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Email :");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 3, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Highest Education :");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 3, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Addhar :");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, -1, -1));

        employeelbl.setFont(new java.awt.Font("Segoe UI Semibold", 3, 18)); // NOI18N
        employeelbl.setForeground(new java.awt.Color(51, 0, 51));
        jPanel2.add(employeelbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 360, 240, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI Semibold", 3, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Father Name :");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 40, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI Semibold", 3, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Salary :");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 100, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI Semibold", 3, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Desigination :");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 220, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI Semibold", 3, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Name :");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI Semibold", 3, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Address :");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 290, -1, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI Semibold", 3, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Phone :");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 160, -1, -1));
        jPanel2.add(emaillbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, 240, -1));
        jPanel2.add(namelbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, 240, -1));
        jPanel2.add(addharlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 300, 240, -1));
        jPanel2.add(desiginationlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 220, 240, -1));
        jPanel2.add(phonelbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 160, 240, -1));
        jPanel2.add(salarylbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 100, 240, -1));
        jPanel2.add(fnamelbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 40, 240, -1));

        educationlbl.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "----------------", "BBA", "BCA", "MBA", "MCA", "B-Tech.", "M-Tech.", "MSC", "BSC", "BA", "B.COM", "PHD", "MA", "M.COM", " " }));
        jPanel2.add(educationlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, 240, -1));

        addresslbl.setColumns(20);
        addresslbl.setRows(5);
        jScrollPane1.setViewportView(addresslbl);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 290, -1, 100));
        jPanel2.add(doblbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, 240, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI Semibold", 3, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Employee Id :");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, -1, -1));

        backbtn.setBackground(new java.awt.Color(0, 59, 59));
        backbtn.setForeground(new java.awt.Color(255, 255, 255));
        backbtn.setText("Back");
        backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtnActionPerformed(evt);
            }
        });
        jPanel2.add(backbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 470, 120, 30));

        addbtn.setBackground(new java.awt.Color(0, 59, 59));
        addbtn.setForeground(new java.awt.Color(255, 255, 255));
        addbtn.setText("Add");
        addbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbtnActionPerformed(evt);
            }
        });
        jPanel2.add(addbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 470, 120, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 900, 530));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnActionPerformed
        setVisible(false);
        new Home().setVisible(true);
    }//GEN-LAST:event_backbtnActionPerformed

    private void addbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbtnActionPerformed
        String name= namelbl.getText();
        String fname= fnamelbl.getText();
        String phone= phonelbl.getText();
        String email= emaillbl.getText();
        String desigination= desiginationlbl.getText();
        String salary= salarylbl.getText();
        String dob=((javax.swing.JTextField) doblbl.getDateEditor().getUiComponent()).getText();
        String address= addresslbl.getText();
        String employee= employeelbl.getText(); 
        String addhar= addharlbl.getText();
        String education= ""+educationlbl.getSelectedItem();
        
        
        try {
            Conn c= new Conn();
            
            String query= "insert into employ values('"+name+"', '"+fname+"', '"+dob+"', '"+salary+"', '"+address+"', '"+phone+"', '"+email+"', '"+education+"', '"+desigination+"', '"+addhar+"', '"+employee+"')";
            
            c.s.executeUpdate(query);
             JOptionPane.showMessageDialog(null, "Details added Successfully");
                   setVisible(false);
                   new Home().setVisible(true);
            
            
        }  catch(Exception e) {
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_addbtnActionPerformed

    /**
     * @param args the command line arguments
     */
    
    public void addemployee() {
        
        int value  = random.nextInt(99999);
        employeelbl.setText(""+value);
        
    }
    
    
    
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
            java.util.logging.Logger.getLogger(Add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Add().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addbtn;
    private javax.swing.JTextField addharlbl;
    private javax.swing.JTextArea addresslbl;
    private javax.swing.JButton backbtn;
    private javax.swing.JTextField desiginationlbl;
    private com.toedter.calendar.JDateChooser doblbl;
    private javax.swing.JComboBox<String> educationlbl;
    private javax.swing.JTextField emaillbl;
    private javax.swing.JLabel employeelbl;
    private javax.swing.JTextField fnamelbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField namelbl;
    private javax.swing.JTextField phonelbl;
    private javax.swing.JTextField salarylbl;
    // End of variables declaration//GEN-END:variables
}