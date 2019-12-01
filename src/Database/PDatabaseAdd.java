package Database;
import java.awt.Color;
import java.io.File;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
public class PDatabaseAdd extends javax.swing.JFrame {
    public PDatabaseAdd() {
        initComponents();
        b1.setVisible(false);
        b1.setEnabled(false);
        t1.setBackground(Color.black);
        t2.setBackground(Color.black);
        t1.setForeground(Color.pink);
        t2.setForeground(Color.pink);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        t2 = new javax.swing.JTextField();
        tb1 = new javax.swing.JToggleButton();
        tb2 = new javax.swing.JToggleButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        b1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add ");
        setLocation(new java.awt.Point(965, 0));

        jLabel1.setText("Add a new person");

        tb1.setText("M");
        tb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tb1ActionPerformed(evt);
            }
        });

        tb2.setText("F");
        tb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tb2ActionPerformed(evt);
            }
        });

        jLabel2.setText("New Name");

        jLabel3.setText("New Age");

        jLabel4.setText("New Gender");

        b1.setText("Enter name");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(b1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tb1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tb2))
                            .addComponent(t2)
                            .addComponent(t1))))
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tb1)
                        .addComponent(tb2))
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(b1)
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

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        try {
            // TODO add your handling code here:
            access();
        } catch (IOException ex) {
            Logger.getLogger(PDatabaseAdd.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            resAccess();
        } catch (IOException ex) {
            Logger.getLogger(PDatabaseAdd.class.getName()).log(Level.SEVERE, null, ex);
        }
        int num=Integer.parseInt(t2.getText());
        if(t1.getText().equals(""))
            output("Please enter a name or quit the Person Adder");
        else if(t2.getText().equals(""))
            output("Please enter an age or quit the Person Adder");
        else{
            String choice="";
            int flag=0;
            for(int count=0;count<index;count++){
                if(human[count].getName().equalsIgnoreCase(t1.getText()))
                    flag=1;
            }
            if(flag==1){
                choice = input("This name already exists, would you like to enter it anyways(\"Yes\" or \"No\")");
            }
            if(choice.equalsIgnoreCase("Yes")||flag==0){
                human[index]=new Person(t1.getText(),num,gen);
                index++;
                output("This Person has been added to the database");
                tb1.setEnabled(true);
                tb2.setEnabled(true);
                b1.setEnabled(false);
                b1.setVisible(false);
                try {
                    reWrite();
                } catch (IOException ex) {
                    Logger.getLogger(PDatabaseAdd.class.getName()).log(Level.SEVERE, null, ex);
                }
                try {
                    reWriteRes();
                } catch (IOException ex) {
                    Logger.getLogger(PDatabaseAdd.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else if(choice.equalsIgnoreCase("No")){
                output("Please enter another name or quit the Person Adder");
                tb1.setEnabled(true);
                tb2.setEnabled(true);
                b1.setEnabled(false);
                b1.setVisible(false);
            }
            else{
                output("This was not a valid option. Please resubmit your request to add another person");
                tb1.setEnabled(true);
                tb2.setEnabled(true);
                b1.setEnabled(false);
                b1.setVisible(false);
            }       
        }      
    }//GEN-LAST:event_b1ActionPerformed

    private void tb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tb1ActionPerformed
        // TODO add your handling code here:
        gen=false;
        tb1.setEnabled(false);
        tb2.setEnabled(false);
        b1.setEnabled(true);
        b1.setVisible(true);
    }//GEN-LAST:event_tb1ActionPerformed

    private void tb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tb2ActionPerformed
        // TODO add your handling code here:
        gen=true;
        tb1.setEnabled(false);
        tb2.setEnabled(false);
        b1.setEnabled(true);
        b1.setVisible(true);
    }//GEN-LAST:event_tb2ActionPerformed
    Person human[]=new Person[100];
    boolean gen = true;
    int index=0;
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(PDatabaseAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PDatabaseAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PDatabaseAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PDatabaseAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PDatabaseAdd().setVisible(true);
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
    public void resAccess() throws IOException{
        Scanner f = new Scanner(new File("Results.txt"));
        String code;
        int score;
        boolean pf=true;
        String text[]=new String[100];
        int i=0;
        while(f.hasNext()){
            text[i]=f.nextLine();
            i++;
        }
        f.close();
        for(int count=0;count<i;count++){
            Scanner sf = new Scanner(text[count]);
            int temp = sf.nextInt();
            while(sf.hasNext()){
                code=sf.next();
                score=sf.nextInt();
                if(score<41){
                    pf=false;
                }
                else{
                    pf=true;
                }
                if(human[count].subNameSearch(code)==false){
                    human[count].addResult(new Results(code,score,pf));
                }    
            }
        }
    }
    public void reWriteRes() throws IOException{
        FileWriter fw = new FileWriter("Results.txt");
        PrintWriter output = new PrintWriter(fw,true);
        for(int count=0;count<index;count++){
            output.print(count+" ");
            for(int counter=0;counter<human[count].getNum();counter++){
                output.print(human[count].retStat(counter));
            }
            output.println("");
        }        
    }
    static String input(String prompt){
        return javax.swing.JOptionPane.showInputDialog(null,prompt); }
    static void output(String message){
        javax.swing.JOptionPane.showMessageDialog(null,message); }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    private javax.swing.JToggleButton tb1;
    private javax.swing.JToggleButton tb2;
    // End of variables declaration//GEN-END:variables
}
