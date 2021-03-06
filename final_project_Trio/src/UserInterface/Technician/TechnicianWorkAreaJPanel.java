/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Technician;

import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Refrigerator.refrigerator;
import Business.UserAccount.UserAccount;
import Business.Workqueue.TechnicianWorkRequest;
import Business.Workqueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 帅的一匹
 */
public class TechnicianWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form TechnicianWorkArea
     */
    JPanel userProcessContainer;
    Enterprise enterprise;
    UserAccount useraccount;
    Organization organization;
    Network city;
    public TechnicianWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise,Network city) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.useraccount=useraccount;
        this.enterprise=enterprise;
        this.organization=organization;
        this.city=city;
        lblValue.setText(enterprise.getName());
        popTbl();
    }
    
    public void popTbl(){
        DefaultTableModel dtm = (DefaultTableModel)tblWork.getModel();
        dtm.setRowCount(0);
        for(WorkRequest wq:this.city.getWorkqueue().getWorkRequestList()){
            if(wq.getWorktype() == WorkRequest.workType.Technician&&wq.getStatus() == "Unmaintained"){
                Object[] row = new Object[5];
                row[0] = wq;
                row[1] = ((TechnicianWorkRequest)wq).getR().getRefrigeratorId();
                row[2] = ((TechnicianWorkRequest)wq).getR();
                row[3] = ((TechnicianWorkRequest)wq).getR().getStatus();
                row[4] = wq.getRequestDate();
                dtm.addRow(row);
            }
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
        tblWork = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        lblAdmin = new javax.swing.JLabel();
        lblEnterprise = new javax.swing.JLabel();
        lblValue = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 153, 153));

        tblWork.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tblWork.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "workId", "RefrigeratorId", "Address", "Status", "Work Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblWork);

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton1.setText("Check and set Status");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lblAdmin.setFont(new java.awt.Font("Times New Roman", 1, 26)); // NOI18N
        lblAdmin.setText("My Work Area -Manager Role");

        lblEnterprise.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblEnterprise.setText("Enterprise: ");

        lblValue.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblValue.setText("<Value>");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(lblAdmin))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblEnterprise)
                                .addGap(80, 80, 80)
                                .addComponent(lblValue))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 633, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblAdmin)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEnterprise)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(lblValue)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(51, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int r = tblWork.getSelectedRow();
        if(r>=0){
            refrigerator refri = (refrigerator)tblWork.getValueAt(r, 2);
            CheckAndSetStatusJPanel c = new CheckAndSetStatusJPanel(refri,userProcessContainer);
            userProcessContainer.add(c);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }else{
            JOptionPane.showMessageDialog(null, "Please select a row first!");
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAdmin;
    private javax.swing.JLabel lblEnterprise;
    private javax.swing.JLabel lblValue;
    private javax.swing.JTable tblWork;
    // End of variables declaration//GEN-END:variables
}
