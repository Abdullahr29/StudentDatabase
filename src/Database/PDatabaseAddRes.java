package Database;
import java.awt.Color;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
public class PDatabaseAddRes extends javax.swing.JFrame {
    public PDatabaseAddRes() {
        initComponents();
        b2.setVisible(false);
        b3.setVisible(false);
        b4.setVisible(false);
        b5.setVisible(false);
        t2.setVisible(false);
        t3.setVisible(false);
        t4.setVisible(false);
        t5.setVisible(false);
        t6.setVisible(false);
        l1.setVisible(false);
        b7.setVisible(false);
        t8.setVisible(false);
        a1.setVisible(false);
        b9.setVisible(false);
        t9.setVisible(false);
        t10.setVisible(false);
        l2.setVisible(false);  
        t1.setBackground(Color.black);
        t2.setBackground(Color.black);
        t3.setBackground(Color.pink);
        t4.setBackground(Color.black);
        t5.setBackground(Color.black);
        t6.setBackground(Color.black);
        t7.setBackground(Color.black);
        t8.setBackground(Color.pink);
        t9.setBackground(Color.pink);
        t10.setBackground(Color.black);
        t1.setForeground(Color.pink);
        t2.setForeground(Color.pink);
        t3.setForeground(Color.pink);
        t4.setForeground(Color.pink);
        t5.setForeground(Color.pink);
        t6.setForeground(Color.pink);
        t7.setForeground(Color.pink);
        t8.setForeground(Color.pink);
        t9.setForeground(Color.pink);
        t10.setForeground(Color.pink);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        b4 = new javax.swing.JLabel();
        l1 = new javax.swing.JLabel();
        t5 = new javax.swing.JTextField();
        b1 = new javax.swing.JButton();
        t1 = new javax.swing.JTextField();
        b2 = new javax.swing.JButton();
        t2 = new javax.swing.JTextField();
        t4 = new javax.swing.JTextField();
        b5 = new javax.swing.JButton();
        t3 = new javax.swing.JComboBox<>();
        b3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        t6 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        b6 = new javax.swing.JButton();
        t7 = new javax.swing.JTextField();
        b7 = new javax.swing.JButton();
        t8 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        a1 = new javax.swing.JTextArea();
        b9 = new javax.swing.JButton();
        t9 = new javax.swing.JComboBox<>();
        l2 = new javax.swing.JLabel();
        t10 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Results");
        setLocation(new java.awt.Point(700, 250));

        b4.setText("Enter subject score (0-100): ");

        l1.setText("Results added: ");

        t5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t5ActionPerformed(evt);
            }
        });

        b1.setText("Name");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        t1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t1ActionPerformed(evt);
            }
        });

        b2.setText("Num of Subjects");
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });

        b5.setText("Add Result");
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });

        t3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"Subject","Mathematics","Physics","Computer Science","Chemistry","Biology","Psychology","Geography","History","Economics","English","Spanish","French","Arabic","Music","Drama","Art"}));
        t3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t3ActionPerformed(evt);
            }
        });

        b3.setText("Choose a subject to add: ");

        jLabel2.setText("Add Results ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(b3)
                    .addComponent(b4)
                    .addComponent(b1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(t3, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(t2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(t4)
                    .addComponent(t1, javax.swing.GroupLayout.Alignment.TRAILING)))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(l1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(t5, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                .addGap(6, 6, 6))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(189, 189, 189)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(t6)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(b2)
                            .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(b3)
                            .addComponent(t3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(t4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(b5))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(l1)
                        .addComponent(t5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(t6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        t2.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent ev) {
                char c = ev.getKeyChar();
                if ( ((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)) {
                    ev.consume();  // ignore event
                }
            }
        });
        t4.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent ev) {
                char c = ev.getKeyChar();
                if ( ((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)) {
                    ev.consume();  // ignore event
                }
            }
        });

        jTabbedPane2.addTab("Add", jPanel2);

        jLabel4.setText("Edit Results");

        b6.setText("Name");
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });

        b7.setText("Remove a Subject");
        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });

        t8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {}));

        a1.setColumns(20);
        a1.setRows(5);
        jScrollPane1.setViewportView(a1);

        b9.setText("Edit a Subject");
        b9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b9ActionPerformed(evt);
            }
        });

        t9.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {}));
        t9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t9ActionPerformed(evt);
            }
        });

        l2.setText("Score: ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(b7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                            .addComponent(b6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(t7)
                            .addComponent(t8, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(b9)
                        .addGap(18, 18, 18)
                        .addComponent(t9, 0, 174, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(l2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(t10, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(188, 188, 188))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(b6)
                    .addComponent(t7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(t8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b9)
                    .addComponent(t9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l2)
                    .addComponent(t10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        t10.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent ev) {
                char c = ev.getKeyChar();
                if ( ((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)) {
                    ev.consume();  // ignore event
                }
            }
        });

        jTabbedPane2.addTab("Edit", jPanel1);

        jLabel1.setText("Results Editor");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(197, 197, 197)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void t1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t1ActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        try {
            // TODO add your handling code here:
            access();
        } catch (IOException ex) {
            Logger.getLogger(PDatabaseAddRes.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            subAccess();
        } catch (IOException ex) {
            Logger.getLogger(PDatabaseAddRes.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            resAccess();
        } catch (IOException ex) {
            Logger.getLogger(PDatabaseAddRes.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (t1.getText().equals("")) {
            output("Please enter a name or quit the Person Result Adder");
        } else {
            flag = 0;
            for (int count = 0; count < index; count++) {
                if (human[count].getName().equalsIgnoreCase(t1.getText())) {
                    flag = count;
                }
            }
            if (flag != 0) {
                b2.setVisible(true);
                t2.setVisible(true);
            } 
            else if(human[flag].getNum()==7){
                output(human[flag].getName()+" already takes the maximum amount of subject. Please choose someone else or quit the Person Reuslt Adder");
            }
            else{
                output("Enter a valid name or quit the Person Result Adder");
            }
        }
    }//GEN-LAST:event_b1ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        // TODO add your handling code here:
        if (t2.getText().equals(""))
            output("Please enter a number or quit the Person Result Adder");
        else if (Integer.parseInt(t2.getText()) > 8 || Integer.parseInt(t2.getText()) < 1) {
            output("You can not have that many subjects. Please enter another value.");
        }
        else if(Integer.parseInt(t2.getText())+human[flag].getNum()>8){
            output("This person cannot have this many subjects. Please enter another value");
        }
        else {
            subIndex = Integer.parseInt(t2.getText());
            b3.setVisible(true);
            b4.setVisible(true);
            b5.setVisible(true);
            t3.setVisible(true);
            t4.setVisible(true);
            t5.setVisible(true);
            t6.setVisible(true);
            l1.setVisible(true);
            t3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{}));
            t3.addItem("Subject");
            for(int cout=0;cout<subs.length;cout++){
                if(human[flag].subNameSearch(subs[cout].getCode())==false){
                    t3.addItem(subs[cout].getName());
                }    
            }
        }
    }//GEN-LAST:event_b2ActionPerformed

    private void t3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t3ActionPerformed

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
        if(count<subIndex){
            if(t3.getSelectedItem().equals("Subject")){
                output("You have to select a subject");
            }
            else{
                String code="";
                for(int j=0;j<subs.length;j++){
                   if(t3.getSelectedItem().equals(subs[j].getName()))
                       code=subs[j].getCode();
                }
                if(human[flag].subNameSearch(code)==true){
                    output(human[flag].getName()+" has already had his results for "+t3.getSelectedItem()+" added to the database. Please select a valid subject.");
                }
                else{
                    s=s+t3.getSelectedItem()+", ";
                    if(Integer.parseInt(t4.getText())<0||Integer.parseInt(t4.getText())>100){
                        output("The score for "+human[flag].getName()+" is out of range. Please enter a valid score.");
                    }
                    else{
                        int subscore=Integer.parseInt(t4.getText());
                        boolean pf=true;
                        if(subscore>40)
                            pf=true;
                        else if(subscore<=40)
                            pf=false;
                        human[flag].addResult(new Results(code,subscore,pf));
                        t6.setText(s);   
                        try {
                            reWrite();
                        } catch (IOException ex) {
                            Logger.getLogger(PDatabaseAddRes.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        t3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{}));
                        t3.addItem("Subject");
                        for(int cout=0;cout<subs.length;cout++){
                            if(human[flag].subNameSearch(subs[cout].getCode())==false){
                                t3.addItem(subs[cout].getName());
                            }
                        }
                        t5.setText(count+1+"");
                        t4.setText("");
                        if(count+1==subIndex){
                            b2.setVisible(false);
                            b3.setVisible(false);
                            b4.setVisible(false);
                            b5.setVisible(false);
                            t2.setVisible(false);
                            t3.setVisible(false);
                            t4.setVisible(false);
                            t5.setVisible(false);
                            t6.setVisible(false);
                            l1.setVisible(false);
                            t1.setText("");
                            t2.setText("");
                            t5.setText("");
                            t4.setText("");
                            t6.setText("");
                            count=0;
                            s="";
                            try {
                                reWriteRes();
                            } catch (IOException ex) {
                                Logger.getLogger(PDatabaseAddRes.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                        else{
                            count++;
                        }
                    }
                }   
            }    
        }
    }//GEN-LAST:event_b5ActionPerformed

    private void t5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t5ActionPerformed

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ActionPerformed
        // TODO add your handling code here:
        try {
            access();
        } catch (IOException ex) {
            Logger.getLogger(PDatabaseAddRes.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            subAccess();
        } catch (IOException ex) {
            Logger.getLogger(PDatabaseAddRes.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            resAccess();
        } catch (IOException ex) {
            Logger.getLogger(PDatabaseAddRes.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (t7.getText().equals("")) {
            output("Please enter a name or quit the Person Result Adder");
        } else {
            flag1 = 0;
            for (int count = 0; count < index; count++) {
                if (human[count].getName().equalsIgnoreCase(t7.getText())) {
                    flag1 = count;
                }
            }
            if(human[flag1].getNum()==0){
                output(human[flag1].getName()+" does not take any subjects. Please first add results.");
            }
            else if (flag1 != 0) {
                b7.setVisible(true);
                t8.setVisible(true);
                a1.setVisible(true);
                b9.setVisible(true);
                t9.setVisible(true);
                t10.setVisible(true);
                l2.setVisible(true);
                String t="Subject Name\tSubject Score\tPassFail\n__________________________________\n"+human[flag1].dispRes(subs);
                a1.setText(t);
                t8.removeAllItems();
                t9.removeAllItems();
                t8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{}));
                t9.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{}));
                t8.addItem("Subject");
                t9.addItem("Subject");
                for(int k=0;k<human[flag1].getNum();k++){
                    t8.addItem(human[flag1].getsubName(k,subs));
                    t9.addItem(human[flag1].getsubName(k,subs));
                }
            } 
            else{
                output("Enter a valid name or quit the Person Result Adder");
            }
        }
    }//GEN-LAST:event_b6ActionPerformed

    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b7ActionPerformed
        // TODO add your handling code here:
        try {
            resAccess();
        } catch (IOException ex) {
            Logger.getLogger(PDatabaseAddRes.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(t8.getSelectedItem().equals("Subject")){
            output("You must choose a subject to remove");
        }
        else{
            human[flag1].removeSub((t8.getSelectedItem()+""),subs);
            try {
                reWriteRes();
            } catch (IOException ex) {
                Logger.getLogger(PDatabaseAddRes.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                resAccess();
            } catch (IOException ex) {
                Logger.getLogger(PDatabaseAddRes.class.getName()).log(Level.SEVERE, null, ex);
            }
            String t="Subject Name\tSubject Score\tPassFail\n__________________________________\n"+human[flag1].dispRes(subs);
                a1.setText(t);
            t8.removeAllItems();
            t9.removeAllItems();
            t8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{}));
            t9.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{}));
            t8.addItem("Subject");
            t9.addItem("Subject");
            for(int k=0;k<human[flag1].getNum();k++){
                t8.addItem(human[flag1].getsubName(k,subs));
                t9.addItem(human[flag1].getsubName(k,subs));
            }    
        }       
    }//GEN-LAST:event_b7ActionPerformed

    private void b9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b9ActionPerformed
        // TODO add your handling code here:
        try {
            resAccess();
        } catch (IOException ex) {
            Logger.getLogger(PDatabaseAddRes.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(t9.getSelectedItem().equals("Subject")){
            output("You must choose a subject to remove");
        }
        else if(t10.getText().equals("")){
            output("You must enter a score first");
        }
        else{
            human[flag1].changeScore(t9.getSelectedItem()+"", subs, Integer.parseInt(t10.getText()));
            try {
                reWriteRes();
            } catch (IOException ex) {
                Logger.getLogger(PDatabaseAddRes.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                resAccess();
            } catch (IOException ex) {
                Logger.getLogger(PDatabaseAddRes.class.getName()).log(Level.SEVERE, null, ex);
            }
            String t="Subject Name\tSubject Score\tPassFail\n__________________________________\n"+human[flag1].dispRes(subs);
                a1.setText(t);
            t8.removeAllItems();
            t9.removeAllItems();
            t8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{}));
            t9.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{}));
            t8.addItem("Subject");
            t9.addItem("Subject");
            for(int k=0;k<human[flag1].getNum();k++){
                t8.addItem(human[flag1].getsubName(k,subs));
                t9.addItem(human[flag1].getsubName(k,subs));
            }
        }
        t10.setText("");
    }//GEN-LAST:event_b9ActionPerformed

    private void t9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t9ActionPerformed
    Subject subs[] = new Subject[16];
    Person human[]=new Person[100];
    int index = 0;
    int subIndex = 0;
    int count=0;
    int flag;
    int flag1;
    String s="Subjects Added: ";
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PDatabaseAddRes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PDatabaseAddRes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PDatabaseAddRes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PDatabaseAddRes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PDatabaseAddRes().setVisible(true);
            }
        });
    }

    public void access() throws IOException {
        Scanner f = new Scanner(new File("Names.txt"));
        boolean gen = true;
        String name;
        int age;
        String gentemp;
        String text[] = new String[100];
        index = 0;
        while (f.hasNext()) {
            text[index] = f.nextLine();
            index++;
        }
        f.close();
        for (int countest = 0; countest < index; countest++) {
            name = (text[countest].substring(0, text[countest].indexOf(" "))).trim();
            age = Integer.parseInt((text[countest].substring(text[countest].indexOf(" "), (text[countest].indexOf(" ")) + 3)).trim());
            gentemp = (text[countest].substring(text[countest].lastIndexOf(" ")).trim());
            if (gentemp.equalsIgnoreCase("Female")) {
                gen = true;
            } else if (gentemp.equalsIgnoreCase("Male")) {
                gen = false;
            }
            human[countest] = new Person(name, age, gen);
        }
    }
    public void reWrite() throws IOException {
        FileWriter fw = new FileWriter("Names.txt");
        PrintWriter output = new PrintWriter(fw, true);
        for (int est = 0; est < index; est++) {
            if (human[est].getGender() == true) {
                output.println(human[est].getName() + " " + human[est].getAge() + " Female");
            } else {
                output.println(human[est].getName() + " " + human[est].getAge() + " Male");
            }
        }
    }
    public void subAccess() throws IOException {
        Scanner f = new Scanner(new File("Subjects.txt"));
        String code;
        String sName;
        String text[] = new String[100];
        int i = 0;
        while (f.hasNext()) {
            text[i] = f.nextLine();
            i++;
        }
        f.close();
        for (int e = 0; e < i; e++) {
            code = text[e].substring(0, text[e].indexOf("\t"));
            sName = (text[e].substring(text[e].indexOf("\t"))).trim();
            subs[e] = new Subject(code, sName);
        }
    }
    static String input(String prompt) {
        return javax.swing.JOptionPane.showInputDialog(null, prompt);
    }
    static void output(String message) {
        javax.swing.JOptionPane.showMessageDialog(null, message);
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
                if(human[count].subNameSearch(code)==false)
                    human[count].addResult(new Results(code,score,pf));
            }
        }
    }
    public void reWriteRes() throws IOException{
        FileWriter fw = new FileWriter("Results.txt");
        PrintWriter output = new PrintWriter(fw,true);
        for(int countest=0;countest<index;countest++){
            output.print(countest+" ");
            for(int counter=0;counter<human[countest].getNum();counter++){
                output.print(human[countest].retStat(counter));
            }
            output.println("");
        }        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea a1;
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JLabel b3;
    private javax.swing.JLabel b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l2;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t10;
    private javax.swing.JTextField t2;
    private javax.swing.JComboBox<String> t3;
    private javax.swing.JTextField t4;
    private javax.swing.JTextField t5;
    private javax.swing.JTextField t6;
    private javax.swing.JTextField t7;
    private javax.swing.JComboBox<String> t8;
    private javax.swing.JComboBox<String> t9;
    // End of variables declaration//GEN-END:variables
}
