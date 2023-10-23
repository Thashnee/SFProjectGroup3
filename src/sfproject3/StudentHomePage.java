/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sfproject3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

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
        
        try {
            //open the connection
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb?useSSL=false", "root", "root@123");
            //here mydb is database name
            //root is username of mysql
            //root@123 is password
           // JOptionPane.showMessageDialog(null, "Database connection successful");   
            
            //Practicals
            String sqlPrac = "Select Practical_ID, Practical_Title, Description, Module, Start_Date, End_Date , Booking_Date, Available from practicals";
            PreparedStatement pstPrac = con.prepareStatement(sqlPrac);
            ResultSet rsPrac = pstPrac.executeQuery(sqlPrac);
            
             while (rsPrac.next()){
            // data will be added until it gets to the end for practicals
                String Prac_ID = String.valueOf(rsPrac.getInt("Practical_ID"));
                String PracTitle = rsPrac.getString("Practical_Title");
                String PracDescription = rsPrac.getString("Description");
                String PracModuleCode = rsPrac.getString("Module");
                String StartDate = (rsPrac.getDate("Start_Date")).toString(); //YYYY-MM-DD
                String EndDate = (rsPrac.getDate("End_Date")).toString(); //YYYY-MM-DD
                String BookingDate = (rsPrac.getDate("Booking_Date")).toString(); //YYYY-MM-DD
                //boolean to string
                boolean avaPrac = (rsPrac.getBoolean("Available"));
                String PracAva = "Unknown";

                if (avaPrac == true){
                PracAva = "No";
                }
                else if (avaPrac == false){
                PracAva = "Yes";
                }
               //String array to store data into jTable
                String tbPracData[] = {Prac_ID, PracTitle, PracDescription, PracModuleCode, StartDate, EndDate,BookingDate, PracAva};
                DefaultTableModel tblPracModel = (DefaultTableModel)jTable2.getModel();
                //add String array into jTabel
                tblPracModel.addRow(tbPracData);
            }
             con.close();
        }
        catch(Exception e){
         System.out.println(e.getMessage());
         JOptionPane.showMessageDialog(null, "Error in connecting to database");
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

        jPanel1 = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        lblAdminWelcome2 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        pnlBookPrac = new javax.swing.JPanel();
        lblSearch = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        btnBook = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        spnYear = new javax.swing.JSpinner();
        pnlSubmitPrac = new javax.swing.JPanel();
        btnSubmitPrac = new javax.swing.JButton();
        tblPracSub = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        pnlBookProj = new javax.swing.JPanel();
        lblSearch1 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        btnBook1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtProjectID = new javax.swing.JTextField();
        pnlSubmitProj = new javax.swing.JPanel();
        btnSubmitProj = new javax.swing.JButton();
        tblProjSub = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

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

        pnlBookPrac.setBackground(new java.awt.Color(255, 255, 255));
        pnlBookPrac.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sfproject3/SearchButton.png"))); // NOI18N
        pnlBookPrac.add(lblSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 20, 40, 40));

        jTextField1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        jTextField1.setToolTipText("Search for Module");
        pnlBookPrac.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 20, 160, 40));

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Practical_ID", "Practical_Title", "Description", "Module", "Start_Date", "End_Date", "Booking_Date", "Available"
            }
        ));
        jScrollPane1.setViewportView(jTable3);

        pnlBookPrac.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, 840, 520));

        btnBook.setBackground(new java.awt.Color(255, 255, 255));
        btnBook.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        btnBook.setText("Book");
        btnBook.setToolTipText("Enter a VALID booking date");
        pnlBookPrac.add(btnBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, 90, 40));

        jLabel3.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        jLabel3.setText("Enter Booking Date:");
        jLabel3.setToolTipText("");
        pnlBookPrac.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, -1, -1));

        spnYear.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(1698148800000L), new java.util.Date(1698062400000L), null, java.util.Calendar.DAY_OF_WEEK));
        spnYear.setToolTipText("Highlight the part you want to change and click the arrows");
        pnlBookPrac.add(spnYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, 170, -1));

        jTabbedPane1.addTab("Book Practicals", pnlBookPrac);

        pnlSubmitPrac.setBackground(new java.awt.Color(255, 255, 255));
        pnlSubmitPrac.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSubmitPrac.setText("Submit");
        pnlSubmitPrac.add(btnSubmitPrac, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, 130, 50));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Practical_ID", "Practical_Title", "Module", "Booking_Date", "End_Date", "Submission"
            }
        ));
        tblPracSub.setViewportView(jTable1);

        pnlSubmitPrac.add(tblPracSub, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 100, 730, 400));

        jLabel1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        jLabel1.setText("Your Current Practicals");
        pnlSubmitPrac.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 70, -1, -1));

        jTabbedPane1.addTab("Submit Practicals", pnlSubmitPrac);

        pnlBookProj.setBackground(new java.awt.Color(255, 255, 255));
        pnlBookProj.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblSearch1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sfproject3/SearchButton.png"))); // NOI18N
        pnlBookProj.add(lblSearch1, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 20, 40, 40));

        jTextField2.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        jTextField2.setToolTipText("Search for Module");
        pnlBookProj.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 20, 160, 40));

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Project_ID", "Project_Title", "Description", "Group_Project", "No_of_members", "Module", "Available", "Start_Date", "End_Date"
            }
        ));
        jScrollPane2.setViewportView(jTable4);

        pnlBookProj.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, 840, 520));

        btnBook1.setBackground(new java.awt.Color(255, 255, 255));
        btnBook1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        btnBook1.setText("Book");
        btnBook1.setToolTipText("Enter a VALID Project_ID");
        pnlBookProj.add(btnBook1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, 90, 40));

        jLabel4.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        jLabel4.setText("Enter Project_ID:");
        jLabel4.setToolTipText("");
        pnlBookProj.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, -1, -1));

        txtProjectID.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        txtProjectID.setToolTipText("Enter a VALID Project_ID");
        pnlBookProj.add(txtProjectID, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 160, 30));

        jTabbedPane1.addTab("Book Projects", pnlBookProj);

        pnlSubmitProj.setBackground(new java.awt.Color(255, 255, 255));
        pnlSubmitProj.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSubmitProj.setText("Submit");
        pnlSubmitProj.add(btnSubmitProj, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 550, 130, 50));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Project_ID", "Project_Title", "Module", "Due_Date", "Submission"
            }
        ));
        tblProjSub.setViewportView(jTable2);

        pnlSubmitProj.add(tblProjSub, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 100, 730, 400));

        jLabel2.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        jLabel2.setText("Your Current Projects");
        pnlSubmitProj.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 70, -1, -1));

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
    private javax.swing.JButton btnBook;
    private javax.swing.JButton btnBook1;
    private javax.swing.JButton btnSubmitPrac;
    private javax.swing.JButton btnSubmitProj;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel lblAdminWelcome2;
    private javax.swing.JLabel lblSearch;
    private javax.swing.JLabel lblSearch1;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel pnlBookPrac;
    private javax.swing.JPanel pnlBookProj;
    private javax.swing.JPanel pnlSubmitPrac;
    private javax.swing.JPanel pnlSubmitProj;
    private javax.swing.JSpinner spnYear;
    private javax.swing.JScrollPane tblPracSub;
    private javax.swing.JScrollPane tblProjSub;
    private javax.swing.JTextField txtProjectID;
    // End of variables declaration//GEN-END:variables
}
