package com.budaslounge.gui;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.util.Arrays;
import javax.swing.JFileChooser;
import javax.swing.JCheckBox;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.GroupLayout;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jbuda
 */
public class gui extends javax.swing.JFrame {

    String SourceLoc = "";
    String OutputLoc = "";
    /**
     * Creates new form com.budaslounge.gui.gui
     */
    public gui() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jfcSourceFile = new javax.swing.JFileChooser();
        jfcOutput = new javax.swing.JFileChooser();
        btnGrpTools = new javax.swing.ButtonGroup();
        btnGrpMode = new javax.swing.ButtonGroup();
        txtSourceLoc = new javax.swing.JTextField();
        btnSourceLoc = new javax.swing.JButton();
        txtOutputLoc = new javax.swing.JTextField();
        btnOutputLoc = new javax.swing.JButton();
        jrbBec = new javax.swing.JRadioButton();
        jrbPak = new javax.swing.JRadioButton();
        jrbTok = new javax.swing.JRadioButton();
        jrbZlib = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        btnRunTool = new javax.swing.JButton();
        jrbUnpack = new javax.swing.JRadioButton();
        jrbPack = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lblOutput = new javax.swing.JTextArea();
        chbGC = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtSourceLoc.setText("Source file location here");
        txtSourceLoc.setEnabled(false);

        btnSourceLoc.setText("Find file to be extracted");
        btnSourceLoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSourceLocActionPerformed(evt);
            }
        });

        txtOutputLoc.setText("Output folder here");
        txtOutputLoc.setEnabled(false);
        txtOutputLoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOutputLocActionPerformed(evt);
            }
        });

        btnOutputLoc.setText("Choose output folder");
        btnOutputLoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOutputLocActionPerformed(evt);
            }
        });

        btnGrpTools.add(jrbBec);
        jrbBec.setSelected(true);
        jrbBec.setText("bec-tool");

        btnGrpTools.add(jrbPak);
        jrbPak.setText("pak-tool");
        jrbPak.setEnabled(false);

        btnGrpTools.add(jrbTok);
        jrbTok.setText("tok-tool");
        jrbTok.setEnabled(false);

        btnGrpTools.add(jrbZlib);
        jrbZlib.setText("zlib-tool");
        jrbZlib.setEnabled(false);

        jLabel1.setText("Select a tool below:");

        btnRunTool.setText("Run tool");
        btnRunTool.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRunToolActionPerformed(evt);
            }
        });

        btnGrpMode.add(jrbUnpack);
        jrbUnpack.setSelected(true);
        jrbUnpack.setText("Unpack Mode");
        jrbUnpack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbUnpackActionPerformed(evt);
            }
        });

        btnGrpMode.add(jrbPack);
        jrbPack.setText("Pack Mode");
        jrbPack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbPackActionPerformed(evt);
            }
        });

        jLabel2.setText("Select a mode below:");

        lblOutput.setColumns(20);
        lblOutput.setRows(5);
        jScrollPane1.setViewportView(lblOutput);
        
        chbGC = new JCheckBox("Check if GC ISO");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addGroup(layout.createSequentialGroup()
        							.addComponent(jrbBec)
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(jrbPak))
        						.addGroup(layout.createSequentialGroup()
        							.addComponent(jrbTok)
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(jrbZlib))
        						.addComponent(jLabel1)
        						.addComponent(btnRunTool, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE))
        					.addGap(18)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(jLabel2)
        						.addComponent(jrbPack)
        						.addGroup(layout.createSequentialGroup()
        							.addComponent(jrbUnpack)
        							.addGap(50)
        							.addComponent(chbGC))
        						.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 270, GroupLayout.PREFERRED_SIZE))
        					.addGap(20))
        				.addGroup(layout.createSequentialGroup()
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(txtSourceLoc, 428, 428, 428)
        						.addComponent(btnSourceLoc, GroupLayout.DEFAULT_SIZE, 428, Short.MAX_VALUE)
        						.addComponent(txtOutputLoc, 428, 428, 428)
        						.addComponent(btnOutputLoc, GroupLayout.DEFAULT_SIZE, 428, Short.MAX_VALUE))
        					.addContainerGap())))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(txtSourceLoc, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(btnSourceLoc)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(txtOutputLoc, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(btnOutputLoc)
        			.addGap(18)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel1)
        				.addComponent(jLabel2))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jrbBec)
        				.addComponent(jrbPak)
        				.addComponent(jrbUnpack)
        				.addComponent(chbGC))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jrbTok)
        				.addComponent(jrbZlib)
        				.addComponent(jrbPack))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(btnRunTool, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE))
        			.addContainerGap())
        );
        getContentPane().setLayout(layout);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtOutputLocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOutputLocActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOutputLocActionPerformed

   
    private void btnSourceLocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSourceLocActionPerformed
        if(jrbUnpack.isSelected()){
            jfcSourceFile.setFileSelectionMode(JFileChooser.FILES_ONLY);
            int returnVal = jfcSourceFile.showOpenDialog(this);
            File file = jfcSourceFile.getSelectedFile();
            txtSourceLoc.setText(file.getAbsolutePath());
            SourceLoc = file.getAbsolutePath();
        } else if(jrbPack.isSelected()){
            jfcSourceFile.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
            int returnVal = jfcSourceFile.showOpenDialog(this);
            File directory = jfcSourceFile.getSelectedFile();
            txtSourceLoc.setText(directory.getAbsolutePath());
            if(System.getProperty("os.name").contains("Windows")){
                SourceLoc = directory.getAbsolutePath()+"\\";
            }else{
                SourceLoc = directory.getAbsolutePath()+"/";
            }
        }
    }//GEN-LAST:event_btnSourceLocActionPerformed

    private void btnOutputLocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOutputLocActionPerformed
        jfcOutput.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int returnVal = jfcOutput.showOpenDialog(this);
        File directory = jfcOutput.getSelectedFile();
        txtOutputLoc.setText(directory.getAbsolutePath());
        if(System.getProperty("os.name").contains("Windows")){
            OutputLoc = directory.getAbsolutePath()+"\\";
        }else{
            OutputLoc = directory.getAbsolutePath()+"/";
        }
    }//GEN-LAST:event_btnOutputLocActionPerformed

    private void btnRunToolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRunToolActionPerformed
        if(jrbUnpack.isSelected()){
            unpackBec(SourceLoc, OutputLoc);
        }else if(jrbPack.isSelected()){
            packBec(SourceLoc, OutputLoc);
        }
    }//GEN-LAST:event_btnRunToolActionPerformed

    private void jrbPackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbPackActionPerformed
        btnOutputLoc.setText("Choose bec output folder");
        btnSourceLoc.setText("Find unpacked bec folder");
    }//GEN-LAST:event_jrbPackActionPerformed

    private void jrbUnpackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbUnpackActionPerformed
        btnSourceLoc.setText("Find file to be extracted");
        btnOutputLoc.setText("Choose output folder");
    }//GEN-LAST:event_jrbUnpackActionPerformed
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
            java.util.logging.Logger.getLogger(gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new gui().setVisible(true);
            }
        });
    }
    
    public void unpackBec(String SourceLoc, String OutputLoc){
        try{
            String location = gui.class.getProtectionDomain().getCodeSource().getLocation().getPath();
            int lastSlash = location.lastIndexOf("/");
            if(System.getProperty("os.name").contains("Windows")){
                location = location.substring(1, lastSlash+1);
                SourceLoc = SourceLoc.replaceAll("/", "\\\\");
                OutputLoc = OutputLoc.replaceAll("/", "\\\\");
                location = location.replaceAll("/", "\\\\");
            } else {
                location = location.substring(0, lastSlash+1);
            }
            System.out.println(location);
            String[] cmdArray = new String[7];
            cmdArray[0] = "python";
            cmdArray[1] = location + "bec-tool.py";
            cmdArray[2] = "-unpack";
            cmdArray[3] = SourceLoc;
            cmdArray[4] = OutputLoc;
            cmdArray[5] = "gladius_bec_FileList.txt";
            boolean GC = chbGC.isSelected();
            if (GC) {
            	cmdArray[6] = "--gc";
            } else {
                cmdArray = Arrays.copyOf(cmdArray, 6);
            }
            Process process = Runtime.getRuntime().exec(cmdArray);
            BufferedReader stdInput = new BufferedReader(new
             InputStreamReader(process.getInputStream()));

             BufferedReader stdError = new BufferedReader(new
                  InputStreamReader(process.getErrorStream()));

             // Read the output from the command
            System.out.println("Here is the standard output of the command:\n");
            String s;
            while ((s = stdInput.readLine()) != null) {
                System.out.println(s);
            }
            lblOutput.append("Finished unpacking!\n");

            // Read any errors from the attempted command
            System.out.println("Here is the standard error of the command (if any):\n");
            while ((s = stdError.readLine()) != null) {
                lblOutput.append(s);
            }
        } catch (Exception ex) {
           ex.printStackTrace();
       }
    }
    
    public void packBec(String SourceLoc, String OutputLoc){
        try{
            String location = gui.class.getProtectionDomain().getCodeSource().getLocation().getPath();
            int lastSlash = location.lastIndexOf("/");
            if(System.getProperty("os.name").contains("Windows")){
                location = location.substring(1, lastSlash+1);
                SourceLoc = SourceLoc.replaceAll("/", "\\\\");
                OutputLoc = OutputLoc.replaceAll("/", "\\\\");
                location = location.replaceAll("/", "\\\\");
            } else {
                location = location.substring(0, lastSlash+1);
            }
            System.out.println(location);
            String[] cmdArray = new String[7];
            cmdArray[0] = "python";
            cmdArray[1] = location + "bec-tool.py";
            cmdArray[2] = "-pack";
            cmdArray[3] = SourceLoc;
            cmdArray[4] = OutputLoc+"/DATA.BEC";
            cmdArray[5] = SourceLoc+"gladius_bec_FileList.txt";
            boolean GC = chbGC.isSelected();
            if (GC) {
            	cmdArray[6] = "--gc";
            } else {
                cmdArray = Arrays.copyOf(cmdArray, 6);
            }
            Process process = Runtime.getRuntime().exec(cmdArray);
            BufferedReader stdInput = new BufferedReader(new 
             InputStreamReader(process.getInputStream()));

             BufferedReader stdError = new BufferedReader(new 
                  InputStreamReader(process.getErrorStream()));

             // Read the output from the command
            System.out.println("Here is the standard output of the command:\n");
            String s;
            while ((s = stdInput.readLine()) != null) {
                System.out.println(s);
            }
            lblOutput.append("Finished repacking bec!\n");

            // Read any errors from the attempted command
            System.out.println("Here is the standard error of the command (if any):\n");
            while ((s = stdError.readLine()) != null) {
                lblOutput.append(s);
            }
        } catch (Exception ex){
            ex.printStackTrace();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btnGrpMode;
    private javax.swing.ButtonGroup btnGrpTools;
    private javax.swing.JButton btnOutputLoc;
    private javax.swing.JButton btnRunTool;
    private javax.swing.JButton btnSourceLoc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JFileChooser jfcOutput;
    private javax.swing.JFileChooser jfcSourceFile;
    private javax.swing.JRadioButton jrbBec;
    private javax.swing.JRadioButton jrbPack;
    private javax.swing.JRadioButton jrbPak;
    private javax.swing.JRadioButton jrbTok;
    private javax.swing.JRadioButton jrbUnpack;
    private javax.swing.JRadioButton jrbZlib;
    private javax.swing.JTextArea lblOutput;
    private javax.swing.JTextField txtOutputLoc;
    private javax.swing.JTextField txtSourceLoc;
    private javax.swing.JCheckBox chbGC;
}
