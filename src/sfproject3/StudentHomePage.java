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
public class StudentHomePage extends javax.swing.JFrame {

    /**
     * Creates new form StudentHomePage
     */
    public StudentHomePage() {
        initComponents();
    }

    StudentHomePage(String un) {
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
        pnlBookPrac = new javax.swing.JPanel();
        pnlSubmitPrac = new javax.swing.JPanel();
        btnSubmitPrac = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        pnlBookProj = new javax.swing.JPanel();
        pnlSubmitProj = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitle.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(153, 0, 0));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("University Allocation System");
        jPanel1.add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 280, 70));

        lblAdminWelcome2.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        lblAdminWelcome2.setText("Welcome");
        jPanel1.add(lblAdminWelcome2, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 14, 220, 40));

        jTabbedPane1.setFont(new java.awt.Font("Microsoft YaHei", 0, 14)); // NOI18N

        javax.swing.GroupLayout pnlBookPracLayout = new javax.swing.GroupLayout(pnlBookPrac);
        pnlBookPrac.setLayout(pnlBookPracLayout);
        pnlBookPracLayout.setHorizontalGroup(
            pnlBookPracLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1175, Short.MAX_VALUE)
        );
        pnlBookPracLayout.setVerticalGroup(
            pnlBookPracLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 657, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Book Practicals", pnlBookPrac);

        pnlSubmitPrac.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSubmitPrac.setText("Submit");
        pnlSubmitPrac.add(btnSubmitPrac, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 550, 130, 50));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        pnlSubmitPrac.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 100, 730, 400));

        jLabel1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        jLabel1.setText("Your Current Practicals");
        pnlSubmitPrac.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 70, -1, -1));

        jTabbedPane1.addTab("Submit Practicals", pnlSubmitPrac);

        javax.swing.GroupLayout pnlBookProjLayout = new javax.swing.GroupLayout(pnlBookProj);
        pnlBookProj.setLayout(pnlBookProjLayout);
        pnlBookProjLayout.setHorizontalGroup(
            pnlBookProjLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1175, Short.MAX_VALUE)
        );
        pnlBookProjLayout.setVerticalGroup(
            pnlBookProjLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 657, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Book Projects", pnlBookProj);

        javax.swing.GroupLayout pnlSubmitProjLayout = new javax.swing.GroupLayout(pnlSubmitProj);
        pnlSubmitProj.setLayout(pnlSubmitProjLayout);
        pnlSubmitProjLayout.setHorizontalGroup(
            pnlSubmitProjLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1175, Short.MAX_VALUE)
        );
        pnlSubmitProjLayout.setVerticalGroup(
            pnlSubmitProjLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 657, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Submit projects", pnlSubmitProj);

        jPanel1.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 1180, 690));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1218, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 774, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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
            java.util.logging.Logger.getLogger(StudentHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentHomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSubmitPrac;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblAdminWelcome2;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel pnlBookPrac;
    private javax.swing.JPanel pnlBookProj;
    private javax.swing.JPanel pnlSubmitPrac;
    private javax.swing.JPanel pnlSubmitProj;
    // End of variables declaration//GEN-END:variables
}
