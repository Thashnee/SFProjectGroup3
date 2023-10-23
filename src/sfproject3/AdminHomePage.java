/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sfproject3;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javafx.scene.layout.Border;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.border.MatteBorder;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.GroupLayout;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author thash
 */
public final class AdminHomePage extends javax.swing.JFrame {

    /**
     * Creates new form AdminHomePage
     */
    
    //Create borders
    MatteBorder default_border = BorderFactory.createMatteBorder(0, 0, 3, 0, new Color(153,153,153));
    MatteBorder red_border = BorderFactory.createMatteBorder(0, 0, 3, 0, Color.RED);
    
    //create array of buttons
    JButton[] buttons;
    public AdminHomePage() {
        initComponents();
    }

    AdminHomePage(String un) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        this();
        this.setLocationRelativeTo(null);
        lblAdminWelcome2.setText("Welcome " + un);
      
        //add buttons to the array
        buttons = new JButton[6];
        buttons[0] = btnDash;
        buttons[1] = btnPracticals;
        buttons[2] = btnProjects;
        buttons[3] = btnStudents;
        buttons[4] = btnStaff;
        buttons[5] = btnLogOut;
        
        //add default border to buttons
        for(JButton button : buttons){
        button.setBorder(default_border);
        }
        
        addAction();
        try {
            //open the connection
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb?useSSL=false", "root", "root@123");
            //here mydb is database name
            //root is username of mysql
            //root@123 is password
           // JOptionPane.showMessageDialog(null, "Database connection successful");   
            
            //Projects
            String sqlProjects = "Select Project_ID, Project_Title, Description, Group_Project, No_of_members, Module, Available, Due_Date from projects ";
            PreparedStatement pstProjects = con.prepareStatement(sqlProjects);
            ResultSet rsProjects = pstProjects.executeQuery(sqlProjects);
            
            //Practicals
            String sqlPrac = "Select Practical_ID, Practical_Title, Description, Module, Start_Date, End_Date , Available from practicals";
            PreparedStatement pstPrac = con.prepareStatement(sqlPrac);
            ResultSet rsPrac = pstPrac.executeQuery(sqlPrac);
            
            while (rsProjects.next()){
            // data will be added until it gets to the end for projects
                String Project_ID = String.valueOf(rsProjects.getInt("Project_ID"));
                String ProjectTitle = rsProjects.getString("Project_Title");
                String Description = rsProjects.getString("Description");
                //Boolean to string
                boolean gp = (rsProjects.getBoolean("Group_Project"));
                String GroupProject = "Unknown";
                if (gp == true){
                GroupProject = "No";
                }
                else if (gp == false){
                GroupProject = "Yes";
                }
               /* else (gp == null){
                String GroupProjecct = "Unknown";
                 }*/
                String NumMembers = String.valueOf(rsProjects.getInt("No_of_members"));
                String ModuleCode = rsProjects.getString("Module");
                //boolean to string
                boolean available = (rsProjects.getBoolean("Available"));
                String Available = "Unknown";

                if (available == true){
                Available = "No";
                }
                else if (available == false){
                Available = "Yes";
                }
                
                String DueDate = (rsProjects.getDate("Due_Date")).toString(); //YYYY-MM-DD
                 //String array to store data into jTable
                String tbprojData[] = {Project_ID, ProjectTitle, Description, GroupProject, NumMembers, ModuleCode, Available, DueDate };
                DefaultTableModel tblProjModel = (DefaultTableModel)jTable1.getModel();
                 //add String array into jTabel
                tblProjModel.addRow(tbprojData);
            }
            while (rsPrac.next()){
            // data will be added until it gets to the end for practicals
                String Prac_ID = String.valueOf(rsPrac.getInt("Practical_ID"));
                String PracTitle = rsPrac.getString("Practical_Title");
                String PracDescription = rsPrac.getString("Description");
                String PracModuleCode = rsPrac.getString("Module");
                String StartDate = (rsPrac.getDate("Start_Date")).toString(); //YYYY-MM-DD
                String EndDate = (rsPrac.getDate("End_Date")).toString(); //YYYY-MM-DD
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
                String tbPracData[] = {Prac_ID, PracTitle, PracDescription, PracModuleCode, StartDate, EndDate, PracAva};
                DefaultTableModel tblPracModel = (DefaultTableModel)jTable2.getModel();
                //add String array into jTabel
                tblPracModel.addRow(tbPracData);
            }
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
        jPanel2 = new javax.swing.JPanel();
        btnDash = new javax.swing.JButton();
        btnPracticals = new javax.swing.JButton();
        btnProjects = new javax.swing.JButton();
        btnStudents = new javax.swing.JButton();
        btnStaff = new javax.swing.JButton();
        btnLogOut = new javax.swing.JButton();
        lblAdminWelcome2 = new javax.swing.JLabel();
        tblProjects = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tblPracticals = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(153, 153, 153));
        jPanel1.setMinimumSize(new java.awt.Dimension(1000, 625));
        jPanel1.setPreferredSize(new java.awt.Dimension(916, 70));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitle.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(153, 0, 0));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("University Allocation System");
        jPanel1.add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 90));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        btnDash.setBackground(new java.awt.Color(255, 255, 255));
        btnDash.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        btnDash.setForeground(new java.awt.Color(153, 153, 153));
        btnDash.setText("Dashboard");
        btnDash.setBorder(null);
        btnDash.setContentAreaFilled(false);
        btnDash.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDashActionPerformed(evt);
            }
        });

        btnPracticals.setBackground(new java.awt.Color(255, 255, 255));
        btnPracticals.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        btnPracticals.setForeground(new java.awt.Color(153, 153, 153));
        btnPracticals.setText("Practicals");
        btnPracticals.setBorder(null);
        btnPracticals.setContentAreaFilled(false);
        btnPracticals.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPracticals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPracticalsActionPerformed(evt);
            }
        });

        btnProjects.setBackground(new java.awt.Color(255, 255, 255));
        btnProjects.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        btnProjects.setForeground(new java.awt.Color(153, 153, 153));
        btnProjects.setText("Projects");
        btnProjects.setBorder(null);
        btnProjects.setContentAreaFilled(false);
        btnProjects.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProjects.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProjectsActionPerformed(evt);
            }
        });

        btnStudents.setBackground(new java.awt.Color(255, 255, 255));
        btnStudents.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        btnStudents.setForeground(new java.awt.Color(153, 153, 153));
        btnStudents.setText("Students");
        btnStudents.setBorder(null);
        btnStudents.setContentAreaFilled(false);
        btnStudents.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnStudents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStudentsActionPerformed(evt);
            }
        });

        btnStaff.setBackground(new java.awt.Color(255, 255, 255));
        btnStaff.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        btnStaff.setForeground(new java.awt.Color(153, 153, 153));
        btnStaff.setText("Staff");
        btnStaff.setBorder(null);
        btnStaff.setContentAreaFilled(false);
        btnStaff.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnStaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStaffActionPerformed(evt);
            }
        });

        btnLogOut.setBackground(new java.awt.Color(255, 255, 255));
        btnLogOut.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        btnLogOut.setForeground(new java.awt.Color(153, 153, 153));
        btnLogOut.setText("Log out");
        btnLogOut.setBorder(null);
        btnLogOut.setContentAreaFilled(false);
        btnLogOut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnDash, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnPracticals, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnProjects, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnStudents, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnStaff, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(142, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnProjects, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                    .addComponent(btnPracticals, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDash, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnStudents, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnStaff, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLogOut, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, 910, 70));

        lblAdminWelcome2.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        lblAdminWelcome2.setText("Welcome");
        jPanel1.add(lblAdminWelcome2, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 40, 210, -1));

        tblProjects.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N

        jTable1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Project_ID", "Project_Title", "Description", "Group_Project", "No. of members", "Module", "Available", "Due_Date"
            }
        ));
        tblProjects.setViewportView(jTable1);

        jPanel1.add(tblProjects, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 940, 170));

        jLabel1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        jLabel1.setText("Current Projects:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, -1, -1));

        jLabel2.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        jLabel2.setText("Current Practicals:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 390, -1, -1));

        jTable2.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Practical_ID", "Practical_Title", "Description", "Module", "Start_Date", "End_Date", "Available"
            }
        ));
        tblPracticals.setViewportView(jTable2);

        jPanel1.add(tblPracticals, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 430, 950, 180));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1135, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 734, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed
        // TODO add your handling code here:
        // exit program
        System.exit(0);
        
    }//GEN-LAST:event_btnLogOutActionPerformed

    private void btnPracticalsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPracticalsActionPerformed
        // TODO add your handling code here:
        //SetAdminProjForm Visible and close AdminHomePage
        this.toBack();
        AdminPracForm adPrac = new AdminPracForm();
        adPrac.setVisible(true);
        adPrac.toFront();
        //setVisible(false);
    }//GEN-LAST:event_btnPracticalsActionPerformed

    private void btnProjectsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProjectsActionPerformed
        // TODO add your handling code here:
        //Set AdminPracForm Visible and close AdminHomePage
        this.toBack();
        AdminProjForm adProj = new AdminProjForm();
        adProj.setVisible(true);
        adProj.toFront();
        //setVisible(false);
    }//GEN-LAST:event_btnProjectsActionPerformed

    private void btnDashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDashActionPerformed
        // TODO add your handling code here:
        //The dashboard is the AdminHomePage so its not much of a button, more of a Screen title
    }//GEN-LAST:event_btnDashActionPerformed

    private void btnStudentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStudentsActionPerformed
        // TODO add your handling code here:
        //Set StudentHomepage
         this.toBack();
        AdminStudentForm StuHome = new AdminStudentForm();
        StuHome.setVisible(true);
        StuHome.toFront();
    }//GEN-LAST:event_btnStudentsActionPerformed

    private void btnStaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStaffActionPerformed
        // TODO add your handling code here:
        //Set StaffHomepage
         this.toBack();
        AdminStaffForm StaffHome = new AdminStaffForm();
        StaffHome.setVisible(true);
        StaffHome.toFront();
    }//GEN-LAST:event_btnStaffActionPerformed

    //Create a function to add a mouseClick event to all buttons
    public void addAction(){
    for (JButton button: buttons){
    button.addMouseListener(new MouseListener() {

        @Override
        public void mouseClicked(MouseEvent e) {
            setButtonBorder(button);
        }

        @Override
        public void mousePressed(MouseEvent e) {
        }

        @Override
        public void mouseReleased(MouseEvent e) {
         
        }

        @Override
        public void mouseEntered(MouseEvent e) {
          
        }

        @Override
        public void mouseExited(MouseEvent e) {
           
        }
    });
    }
    }
   
    //Create function to set border to selected border item
    public void setButtonBorder(JButton button){
    
        //reset all buttons to default
        for (JButton btn: buttons){
        btn.setBorder(default_border);
        btn.setForeground(new Color(153,153,153));
        }
        
        //change to red border and black text when selected
        button.setBorder(red_border);
        button.setForeground(Color.black);
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
            java.util.logging.Logger.getLogger(AdminHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminHomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDash;
    private javax.swing.JButton btnLogOut;
    private javax.swing.JButton btnPracticals;
    private javax.swing.JButton btnProjects;
    private javax.swing.JButton btnStaff;
    private javax.swing.JButton btnStudents;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel lblAdminWelcome2;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JScrollPane tblPracticals;
    private javax.swing.JScrollPane tblProjects;
    // End of variables declaration//GEN-END:variables
}
