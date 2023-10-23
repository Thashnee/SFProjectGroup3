/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sfproject3;

/**
 *
 * @author thash
 */
public class StaffHomePage extends javax.swing.JFrame {

    /**
     * Creates new form StaffHomePage
     */
    public StaffHomePage() {
        initComponents();
    }

    StaffHomePage(String un) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        this();
        this.setLocationRelativeTo(null);
        lblAdminWelcome2.setText("Welcome " + un);
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
        lblTitle = new javax.swing.JLabel();
        lblAdminWelcome2 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        pnlRubrikMark = new javax.swing.JPanel();
        pnlReports = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitle.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(153, 0, 0));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("University Allocation System");
        jPanel1.add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 80));

        lblAdminWelcome2.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        lblAdminWelcome2.setText("Welcome");
        jPanel1.add(lblAdminWelcome2, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 30, 210, -1));

        javax.swing.GroupLayout pnlRubrikMarkLayout = new javax.swing.GroupLayout(pnlRubrikMark);
        pnlRubrikMark.setLayout(pnlRubrikMarkLayout);
        pnlRubrikMarkLayout.setHorizontalGroup(
            pnlRubrikMarkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1205, Short.MAX_VALUE)
        );
        pnlRubrikMarkLayout.setVerticalGroup(
            pnlRubrikMarkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Mark", pnlRubrikMark);

        javax.swing.GroupLayout pnlReportsLayout = new javax.swing.GroupLayout(pnlReports);
        pnlReports.setLayout(pnlReportsLayout);
        pnlReportsLayout.setHorizontalGroup(
            pnlReportsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1205, Short.MAX_VALUE)
        );
        pnlReportsLayout.setVerticalGroup(
            pnlReportsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Reports", pnlReports);

        jPanel1.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 1210, 670));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1231, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 758, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(StaffHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StaffHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StaffHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StaffHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StaffHomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblAdminWelcome2;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel pnlReports;
    private javax.swing.JPanel pnlRubrikMark;
    // End of variables declaration//GEN-END:variables
}
