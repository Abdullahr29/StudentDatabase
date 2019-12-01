package Database;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.Color;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PDatabaseEdit extends javax.swing.JFrame {
    public PDatabaseEdit() {
        initComponents();
        closer();
        t0.setBackground(Color.black);
        t1.setBackground(Color.black);
        t2.setBackground(Color.black);
        t0.setForeground(Color.pink);
        t1.setForeground(Color.pink);
        t2.setForeground(Color.pink);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        t0 = new javax.swing.JTextField();
        l1 = new javax.swing.JLabel();
        b1 = new javax.swing.JButton();
        l2 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        b2 = new javax.swing.JButton();
        l3 = new javax.swing.JLabel();
        t2 = new javax.swing.JTextField();
        l4 = new javax.swing.JLabel();
        b3 = new javax.swing.JButton();
        tb2 = new javax.swing.JToggleButton();
        tb1 = new javax.swing.JToggleButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Edit");
        setLocation(new java.awt.Point(700, 0));

        jLabel2.setText("Person Editor");

        t0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t0ActionPerformed(evt);
            }
        });

        l1.setText("Select a property you would like to edit:");

        b1.setText("Name");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        l2.setText("to");

        t1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t1ActionPerformed(evt);
            }
        });

        b2.setText("Age");
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });

        l3.setText("to");

        t2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t2ActionPerformed(evt);
            }
        });

        l4.setText("to");

        b3.setText("Gender");
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });

        tb2.setText("F");
        tb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tb2ActionPerformed(evt);
            }
        });

        tb1.setText("M");
        tb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tb1ActionPerformed(evt);
            }
        });

        jButton1.setText("Search the name");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(b1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(b2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(b3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(l2))
                                    .addComponent(l4)
                                    .addComponent(l3))
                                .addGap(17, 17, 17)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(tb1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(tb2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(t2)
                                    .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(l1)))
                        .addGap(0, 8, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(t0)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addComponent(l1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(b1)
                            .addComponent(l2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(b2)
                            .addComponent(l3)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b3)
                    .addComponent(l4)
                    .addComponent(tb2)
                    .addComponent(tb1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        t2.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent ev) {
                char c = ev.getKeyChar();
                if ( ((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)) {
                    ev.consume();  // ignore event
                }
            }
        });

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void t1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t1ActionPerformed

    private void t2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t2ActionPerformed

    private void t0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t0ActionPerformed
        // TODO add your handling code here:      
    }//GEN-LAST:event_t0ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            // TODO add your handling code here:
            access();
        } catch (IOException ex) {
            Logger.getLogger(PDatabaseEdit.class.getName()).log(Level.SEVERE, null, ex);
        }
        for (int count=0;count<index;count++) {
            if ((human[count].getName()).equalsIgnoreCase(t0.getText())) {
                flag=count;
            }
        }
        if(flag!=-1){
            opener();
            t1.setText("");
            t2.setText("");
        }
        else if(t0.getText().equals("")){
            output("Please enter something or quit the Person Editor");
            closer();
        }
        else{
            output("This name does not exist. Type in another or quit the Person Editor");
            closer();
        }  
    }//GEN-LAST:event_jButton1ActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        // TODO add your handling code here:
        if(t1.getText().equals("")){
            output("Please enter something or quit the Person Editor");
        }
        else{
            human[flag].setName(t1.getText());
            output("The name has been changed");
        }
        try {
            reWrite();
        } catch (IOException ex) {
            Logger.getLogger(PDatabaseEdit.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_b1ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        // TODO add your handling code here:
        int num=Integer.parseInt(t2.getText());
        if(t2.getText().equals("")){
            output("Please enter something or quit the Person Editor");
        }
        else{
            human[flag].setAge(num);
            output("The age has been changed");
        }
        try {
            reWrite();
        } catch (IOException ex) {
            Logger.getLogger(PDatabaseEdit.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_b2ActionPerformed

    private void tb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tb1ActionPerformed
        // TODO add your handling code here:
        gen=false;
        tb1.setEnabled(false);
        tb2.setEnabled(false);
        b3.setEnabled(true);
    }//GEN-LAST:event_tb1ActionPerformed

    private void tb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tb2ActionPerformed
        // TODO add your handling code here:
        gen=true;
        tb1.setEnabled(false);
        tb2.setEnabled(false);
        b3.setEnabled(true);
    }//GEN-LAST:event_tb2ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        // TODO add your handling code here:
        human[flag].setGender(gen);
        output("The gender has been changed");
        tb1.setEnabled(true);
        tb2.setEnabled(true);
        b3.setEnabled(false);
        try {
            reWrite();
        } catch (IOException ex) {
            Logger.getLogger(PDatabaseEdit.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_b3ActionPerformed
    Person human[]=new Person[100];
    boolean gen = true;
    int flag=-1;
    int index=0;
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
            java.util.logging.Logger.getLogger(PDatabaseEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PDatabaseEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PDatabaseEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PDatabaseEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PDatabaseEdit().setVisible(true);
            }
        });
    }
    public void access() throws IOException{
        Scanner f = new Scanner(new File("Names.txt"));
        boolean gen=true;
        String name;
        int age;
        String gentemp;
        String text[]=new String[100];
        index=0;
        while(f.hasNext()){
            text[index]=f.nextLine();
            index++;
        }
        f.close();
        for(int count=0;count<index;count++){
            name=(text[count].substring(0,text[count].indexOf(" "))).trim();
            age=Integer.parseInt((text[count].substring(text[count].indexOf(" "), (text[count].indexOf(" "))+3)).trim());
            gentemp=(text[count].substring(text[count].lastIndexOf(" ")).trim());
             if (gentemp.equalsIgnoreCase("Female"))
                gen=true;
            else if (gentemp.equalsIgnoreCase("Male"))
                gen=false;
            human[count]=new Person(name,age,gen);
        }
    }
    public void closer(){
        b1.setVisible(false);
        b2.setVisible(false);
        b3.setVisible(false);
        tb1.setVisible(false);
        tb2.setVisible(false);
        t1.setVisible(false);
        t2.setVisible(false);
        l1.setVisible(false);
        l2.setVisible(false);
        l3.setVisible(false);
        l4.setVisible(false);
        b3.setEnabled(false);
    }
    public void opener(){
        b1.setVisible(true);
        b2.setVisible(true);
        b3.setVisible(true);
        tb1.setVisible(true);
        tb2.setVisible(true);
        t1.setVisible(true);
        t2.setVisible(true);
        l1.setVisible(true);
        l2.setVisible(true);
        l3.setVisible(true);
        l4.setVisible(true);   
    }
    public void reWrite() throws IOException{
        FileWriter fw = new FileWriter("Names.txt");
        PrintWriter output = new PrintWriter(fw,true);
        for(int count=0;count<index;count++){
            if(human[count].getGender()==true)
                output.println(human[count].getName()+" "+human[count].getAge()+" Female");
            else
                output.println(human[count].getName()+" "+human[count].getAge()+" Male");       
        }
    }
    static String input(String prompt){
        return javax.swing.JOptionPane.showInputDialog(null,prompt); }
    static void output(String message){
        javax.swing.JOptionPane.showMessageDialog(null,message); }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel l3;
    private javax.swing.JLabel l4;
    private javax.swing.JTextField t0;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    private javax.swing.JToggleButton tb1;
    private javax.swing.JToggleButton tb2;
    // End of variables declaration//GEN-END:variables
}
