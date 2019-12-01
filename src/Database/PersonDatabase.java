package Database;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
public class PersonDatabase extends javax.swing.JFrame {
    public PersonDatabase() {
        initComponents();
        l2.setBackground(Color.black);
        l1.setBackground(Color.black);
        t1.setBackground(Color.black);
        t2.setBackground(Color.black);
        t3.setBackground(Color.black);
        t4.setBackground(Color.black);
        t5.setBackground(Color.black);
        t6.setBackground(Color.black);
        t7.setBackground(Color.black);
        t8.setBackground(Color.black);
        t7.setForeground(Color.pink);
        t8.setForeground(Color.pink);
        t9.setForeground(Color.pink);
        t9.setBackground(Color.black);
        t10.setBackground(Color.black);
        t10.setForeground(Color.green);
        t11.setForeground(Color.green);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jButton2 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        b7 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        l1 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        l2 = new javax.swing.JTextArea();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        t3 = new javax.swing.JTextField();
        b9 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        t9 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        t1 = new javax.swing.JTextField();
        b3 = new javax.swing.JButton();
        t2 = new javax.swing.JTextField();
        b4 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        t7 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        t8 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        b10 = new javax.swing.JButton();
        b11 = new javax.swing.JButton();
        b12 = new javax.swing.JButton();
        b13 = new javax.swing.JButton();
        t4 = new javax.swing.JTextField();
        t5 = new javax.swing.JTextField();
        t6 = new javax.swing.JTextField();
        b14 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        b15 = new javax.swing.JButton();
        t10 = new javax.swing.JTextField();
        b16 = new javax.swing.JButton();
        b17 = new javax.swing.JButton();
        b19 = new javax.swing.JButton();
        t11 = new javax.swing.JComboBox<>();
        jPanel6 = new javax.swing.JPanel();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jButton2.setText("jButton2");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jTextField1.setText("jTextField1");

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Person GUI");

        jLabel1.setText("Student Database");

        b7.setText("Display ");
        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });

        l1.setColumns(20);
        l1.setRows(5);
        jScrollPane1.setViewportView(l1);

        l2.setColumns(20);
        l2.setRows(5);
        jScrollPane3.setViewportView(l2);

        b1.setText("Initialise Database");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b2.setText("Edit");
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });

        b8.setText("Add Person");
        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });

        b9.setText("Remove Person");
        b9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b9ActionPerformed(evt);
            }
        });

        jLabel2.setText("Database Functions");

        jLabel7.setText("Average Age: ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(t3, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(b9, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE))
                            .addComponent(b8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(b1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(b2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(117, 117, 117)
                                .addComponent(jLabel2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(t9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(b1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(b2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(b8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b9)
                    .addComponent(t3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(t9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Initialise", jPanel1);

        b3.setText("Search Name");
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });

        b4.setText("Search Age");
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });

        b5.setText("Sort by Name");
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });

        b6.setText("Sort by Age");
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });

        jLabel3.setText("Search And Sort");

        jLabel5.setText("Males:");

        jLabel6.setText("Females: ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(t1, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                            .addComponent(t2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(b3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(b4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(b5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(b6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(t7, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(t8, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 88, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(b5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(b6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(t7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(t8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        jTabbedPane1.addTab("Functions", jPanel2);

        jLabel4.setText("Result Functions");

        b10.setText("Results Editor");
        b10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b10ActionPerformed(evt);
            }
        });

        b11.setText("Calculate Results");
        b11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b11ActionPerformed(evt);
            }
        });

        b12.setText("Display Results");
        b12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b12ActionPerformed(evt);
            }
        });

        b13.setText("Subject Average ");
        b13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b13ActionPerformed(evt);
            }
        });

        b14.setText("Display All Subjects");
        b14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b14ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(t5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                            .addComponent(t4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(t6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(b13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                            .addComponent(b12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(b11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(b14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(b14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(b10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b12)
                    .addComponent(t5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b13))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Results", jPanel3);

        jLabel8.setText("Grade Functions");

        b15.setText("Display Grade Boundaries");
        b15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b15ActionPerformed(evt);
            }
        });

        b16.setText("Search Name");
        b16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b16ActionPerformed(evt);
            }
        });

        b17.setText("Search Subject");
        b17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b17ActionPerformed(evt);
            }
        });

        b19.setText("Total Number of Grades Attained");
        b19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b19ActionPerformed(evt);
            }
        });

        t11.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"Subject","Mathematics","Physics","Computer Science","Chemistry","Biology","Psychology","Geography","History","Economics","English","Spanish","French","Arabic","Music","Drama","Art"}));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(b15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(b19, javax.swing.GroupLayout.DEFAULT_SIZE, 321, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(t10)
                                    .addComponent(t11, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(b17, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                                    .addComponent(b16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(jLabel8)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(b15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b17)
                    .addComponent(t11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(b19)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Grades", jPanel5);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 345, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 196, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Cafeteria", jPanel6);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(123, 123, 123)
                                        .addComponent(jLabel1)))))
                        .addGap(10, 10, 10))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(b7, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        // TODO add your handling code here:
        try {
            access();
        } catch (IOException ex) {
            Logger.getLogger(PersonDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            resAccess();
        } catch (IOException ex) {
            Logger.getLogger(PersonDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            subAccess();
        } catch (IOException ex) {
            Logger.getLogger(PersonDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
        l1.setForeground(Color.pink);
        l2.setForeground(Color.red);
        t1.setForeground(Color.green);
        t2.setForeground(Color.green);
        t3.setForeground(Color.green);
        t4.setForeground(Color.green);
        t5.setForeground(Color.green);
        t6.setForeground(Color.green);
        String s="Name\tAge\tGender\n__________________________________\n";
        for(int count=0;count<index;count++){
            s=s+human[count].toString()+"\n";
        }
        l1.setText(s);    
        l1.setEditable(false);
        l2.setEditable(false);
    }//GEN-LAST:event_b1ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        // TODO add your handling code here:
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PDatabaseEdit().setVisible(true);
            }
        });        
    }//GEN-LAST:event_b2ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        // TODO add your handling code here:
        try {
            access();
        } catch (IOException ex) {
            Logger.getLogger(PersonDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
        int flag=0;
        for(int count=0;count<index;count++){
            if(((human[count].getName()).equalsIgnoreCase(t1.getText()))){
                l2.setText(" "+human[count].toString());
                flag=1;
            }  
        }
        if(t1.getText().equals(""))
            l2.setText("You need to enter a name");
        else if(flag==0)
            l2.setText("This name was not found");
        else{
            l2.insert("Found\n", 1);
            t1.setText("");
        }
        t1.setText("");
    }//GEN-LAST:event_b3ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
        // TODO add your handling code here:
        try {
            access();
        } catch (IOException ex) {
            Logger.getLogger(PersonDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
        l2.setText("");
        int flag=0,counter=0;
        int newage = Integer.parseInt(t2.getText());
        for(int count=0;count<index;count++){
            if(human[count].getAge()==newage){
                l2.insert(("  "+human[count].toString()+"\n"),counter);
                counter++;
                flag=1;
            }
        }
        if(flag==1){
               l2.insert(("These name(s) were of age "+newage+"\n"),counter+1);
            }
        if(flag==0)
            l2.setText("People of this age were not found");
        t2.setText("");
    }//GEN-LAST:event_b4ActionPerformed

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
        // TODO add your handling code here:
        try {
            access();
        } catch (IOException ex) {
            Logger.getLogger(PersonDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            resAccess();
        } catch (IOException ex) {
            Logger.getLogger(PersonDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
        Person temp;
        for(int count=0;count<index;count++){
            for(int counter=0;counter<index-1;counter++){
                if(((human[counter].getName()).compareTo(human[counter+1].getName()))>0){
                    temp=human[counter];
                    human[counter]=human[counter+1];
                    human[counter+1]=temp;
                }
            }
        }
        l2.setText("The people have been sorted by name");
        try {
            reWrite();
        } catch (IOException ex) {
            Logger.getLogger(PersonDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            reWriteRes();
        } catch (IOException ex) {
            Logger.getLogger(PersonDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
        l1.setText("");
        String s="Name\tAge\tGender\n__________________________________\n";
        for(int count=0;count<index;count++){
            s=s+human[count].toString()+"\n";
        }
        l1.setText(s);
    }//GEN-LAST:event_b5ActionPerformed

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ActionPerformed
        // TODO add your handling code here:
        try {
            access();
        } catch (IOException ex) {
            Logger.getLogger(PersonDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            resAccess();
        } catch (IOException ex) {
            Logger.getLogger(PersonDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
        l2.removeAll();
        int i, j, first;
        Person temp;
        for (i = index-1;i > 0;i--){  
            first = 0;  
            for(j = 1;j <= i;j ++){   
                if((human[j].getAge())>(human[first].getAge()))         
                    first = j;
            }
            temp = human[first]; 
            human[first] = human[i];
            human[i] = temp;
        }
        l2.setText("The people have been sorted by age");
        try {
            reWrite();
        } catch (IOException ex) {
            Logger.getLogger(PersonDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            reWriteRes();
        } catch (IOException ex) {
            Logger.getLogger(PersonDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
        l1.setText("");
        String s="Name\tAge\tGender\n__________________________________\n";
        for(int count=0;count<index;count++){
            s=s+human[count].toString()+"\n";
        }
        l1.setText(s);
    }//GEN-LAST:event_b6ActionPerformed

    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b7ActionPerformed
        try {
            access();
        } catch (IOException ex) {
            Logger.getLogger(PersonDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            resAccess();
        } catch (IOException ex) {
            Logger.getLogger(PersonDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
        l1.setText("");
        String s="Name\tAge\tGender\n__________________________________\n";
        for(int count=0;count<index;count++){
            s=s+human[count].toString()+"\n";
        }
        l1.setText(s);
        try {
            reWrite();
        } catch (IOException ex) {
            Logger.getLogger(PersonDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            reWriteRes();
        } catch (IOException ex) {
            Logger.getLogger(PersonDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_b7ActionPerformed

    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b8ActionPerformed
        // TODO add your handling code here:
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PDatabaseAdd().setVisible(true);
            }
        });
        try {
            access();
        } catch (IOException ex) {
            Logger.getLogger(PersonDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            resAccess();
        } catch (IOException ex) {
            Logger.getLogger(PersonDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_b8ActionPerformed

    private void b9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b9ActionPerformed
        // TODO add your handling code here:
        try {
            access();
        } catch (IOException ex) {
            Logger.getLogger(PersonDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            resAccess();
        } catch (IOException ex) {
            Logger.getLogger(PersonDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
        int flag=-1;
        for(int count=0;count<index;count++){
            if(((human[count].getName()).equalsIgnoreCase(t3.getText()))){
                flag=count;
            }        
        }
        if(t3.getText().equals(""))
            l2.setText("You need to enter a name");
        else if(flag==0)
            l2.setText("This name was not found");
        else{
            if(flag!=(index-1))
                human[flag]=human[index-1];  
            else
                human[flag]=null;
            l2.setText("The person has been deleted from the database");
            try {
                reWrite();
            } catch (IOException ex) {
                Logger.getLogger(PersonDatabase.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                reWriteRes();
            } catch (IOException ex) {
                Logger.getLogger(PersonDatabase.class.getName()).log(Level.SEVERE, null, ex);
            }
            index--;
        } 
        t3.setText("");
    }//GEN-LAST:event_b9ActionPerformed

    private void b10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b10ActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PDatabaseAddRes().setVisible(true);
            }
        });
    }//GEN-LAST:event_b10ActionPerformed

    private void b11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b11ActionPerformed
        try {
            resAccess();
        } catch (IOException ex) {
            Logger.getLogger(PersonDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
        int flag=0;
        for(int count=0;count<index;count++){
            if(((human[count].getName()).equalsIgnoreCase(t4.getText()))){
                flag=1;
                if(human[count].getNum()==0){
                    l2.setText("You must first add the results for "+t4.getText()+".");
                    break;
                }
                else
                    l2.setText("The average score for "+t4.getText()+" is: "+human[count].avgScore()+"\n"+t4.getText()+"\'s highest scoring subject was: "+human[count].highScore(subs));
            }        
        }
        if(flag==0)
            l2.setText("This name was not found");  
        t4.setText("");
    }//GEN-LAST:event_b11ActionPerformed

    private void b12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b12ActionPerformed
        try {
            access();
        } catch (IOException ex) {
            Logger.getLogger(PersonDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            resAccess();
        } catch (IOException ex) {
            Logger.getLogger(PersonDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
        int flag=0;
        for(int count=0;count<index;count++){
            if(((human[count].getName()).equalsIgnoreCase(t5.getText()))){
                flag=1;
                if(human[count].getNum()==0){
                    l2.setText("You must first add the results for "+t5.getText()+".");
                    break;
                }
                else{
                    String t="Subject Name\tSubject Score\tPassFail\n__________________________________\n"+human[count].dispRes(subs);
                    l2.setText(t);
                }
            }        
        }
        if(flag==0)
            l2.setText("This name was not found");
        t5.setText("");
    }//GEN-LAST:event_b12ActionPerformed

    private void b13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b13ActionPerformed
        try {
            access();
        } catch (IOException ex) {
            Logger.getLogger(PersonDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            resAccess();
        } catch (IOException ex) {
            Logger.getLogger(PersonDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
        int flg=0,total=0,counter=0;
        String code;
        for(int j=0;j<subs.length;j++){
            if(subs[j].getName().equalsIgnoreCase(t6.getText())){
                code=subs[j].getCode();
                flg=1;
                for(int i=0;i<index;i++){
                    if(human[i].searchRes(code)==true){
                        total=total+human[i].searchResS(code);
                        counter++;
                    }
                }
            }
        }
        if(flg==0)
            l2.setText("This subject name was not found. You must enter a valid subject name.");
        else{
            l2.setText("From the "+counter+" people that passed "+t6.getText()+" the average score was: "+(total/counter));
        }
        t6.setText("");
    }//GEN-LAST:event_b13ActionPerformed

    private void b14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b14ActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            subAccess();
        } catch (IOException ex) {
            Logger.getLogger(PersonDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
        String s="Subject Code\tSubject Name\n_________________________\n";
        for(int i=0;i<subs.length;i++)
            s=s+(subs[i].toString()+"\n");
        l2.setText(s);
    }//GEN-LAST:event_b14ActionPerformed

    private void b15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b15ActionPerformed
        // TODO add your handling code here:
        String s="Grade Boundaries:\n7\t85%\n6\t75%\n5\t65%\n4\t55%\n3\t40%\n2\t30%\n1\t20%";
        l2.setText(s);
    }//GEN-LAST:event_b15ActionPerformed

    private void b16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b16ActionPerformed
        // TODO add your handling code here:
        try {
            access();
        } catch (IOException ex) {
            Logger.getLogger(PersonDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            resAccess();
        } catch (IOException ex) {
            Logger.getLogger(PersonDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
        int flag=-1;
        for(int count=0;count<index;count++){
            if(((human[count].getName()).equalsIgnoreCase(t10.getText()))){
                flag=count;
            }        
        }
        if(t10.getText().equals("")){
            output("You must first enter a name");
        }
        else if(flag==-1){
            output("This name was not found. Please enter a viable name");
        }
        else if(human[flag].getNum()==0){
            output("You must first enter results for "+human[flag].getName());
        }
        else{
            l2.setText(human[flag].dispGrad(subs));
        }
        t10.setText("");
    }//GEN-LAST:event_b16ActionPerformed

    private void b17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b17ActionPerformed
        // TODO add your handling code here:
        try {
            access();
        } catch (IOException ex) {
            Logger.getLogger(PersonDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            resAccess();
        } catch (IOException ex) {
            Logger.getLogger(PersonDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(t11.getSelectedItem().equals("Subject")){
            output("You must select a subject");
        }
        else{
            int a=0,b=0,c=0,d=0,e=0,f=0,g=0,h=0;
            for(int i=0;i<index;i++){
                for(int count=0;count<subs.length;count++){
                    if(subs[count].getName().equals(t11.getSelectedItem())){
                        if((human[i].subNameSearch(subs[count].getCode())==true)){
                            if(human[i].searchResSWF(subs[count].getCode())>84){
                            a++;
                        }
                        else if(human[i].searchResSWF(subs[count].getCode())>74){
                            b++;
                        }
                        else if(human[i].searchResSWF(subs[count].getCode())>64){
                            c++;
                        }
                        else if(human[i].searchResSWF(subs[count].getCode())>54){
                            d++;
                        }
                        else if(human[i].searchResSWF(subs[count].getCode())>39){
                            e++;
                        }
                        else if(human[i].searchResSWF(subs[count].getCode())>29){
                            f++;
                        }
                        else if(human[i].searchResSWF(subs[count].getCode())>19){
                            g++;
                        }
                        else{
                            h++;
                        }
                        }
                    }
                }
            }
            l2.setText("The total number of grades attained for "+t11.getSelectedItem()+" are:\n7\t"+a+"\n6\t"+b+"\n5\t"+c+"\n4\t"+d+"\n3\t"+e+"\n2\t"+f+"\n1\t"+g+"\n0\t"+h);
        }
        t11.resetKeyboardActions();
    }//GEN-LAST:event_b17ActionPerformed

    private void b19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b19ActionPerformed
        // TODO add your handling code here:
        try {
            access();
        } catch (IOException ex) {
            Logger.getLogger(PersonDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            resAccess();
        } catch (IOException ex) {
            Logger.getLogger(PersonDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
        int a=0,b=0,c=0,d=0,e=0,f=0,g=0,h=0;
        for(int i=0;i<index;i++){
            for(int count=0;count<subs.length;count++){
                if((human[i].subNameSearch(subs[count].getCode())==true)){
                    if(human[i].searchResSWF(subs[count].getCode())>84){
                    a++;
                }
                else if(human[i].searchResSWF(subs[count].getCode())>74){
                    b++;
                }
                else if(human[i].searchResSWF(subs[count].getCode())>64){
                    c++;
                }
                else if(human[i].searchResSWF(subs[count].getCode())>54){
                    d++;
                }
                else if(human[i].searchResSWF(subs[count].getCode())>39){
                    e++;
                }
                else if(human[i].searchResSWF(subs[count].getCode())>29){
                    f++;
                }
                else if(human[i].searchResSWF(subs[count].getCode())>19){
                    g++;
                }
                else{
                    h++;
                }
                }
            }
        }
        l2.setText("The total number of grades attained are:\n7\t"+a+"\n6\t"+b+"\n5\t"+c+"\n4\t"+d+"\n3\t"+e+"\n2\t"+f+"\n1\t"+g+"\n0\t"+h);
    }//GEN-LAST:event_b19ActionPerformed
    public static final Person human[]=new Person[100];
    Subject subs[] = new Subject[16];
    int index=0;
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PersonDatabase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PersonDatabase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PersonDatabase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PersonDatabase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run(){
                new PersonDatabase().setVisible(true);
            }
        });
    }
    public void access() throws IOException{
        Scanner f = new Scanner(new File("Names.txt"));
        boolean gen=true;
        String name;
        int age;
        int ageTot=0;
        String gentemp;
        int genNum=0;
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
            ageTot=ageTot+age;
            if (gentemp.equalsIgnoreCase("Female"))
                gen=true;
            else if (gentemp.equalsIgnoreCase("Male")){
                gen=false;
                genNum++;
            }    
            human[count]=new Person(name,age,gen);
        }
        t7.setText(genNum+"");
        t8.setText((index-genNum)+"");
        t9.setText((ageTot/index)+"");
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
    public void subAccess() throws IOException{
        Scanner f = new Scanner(new File("Subjects.txt"));
        String code;
        String sName;
        String text[]=new String[100];
        int i=0;
        while(f.hasNext()){
            text[i]=f.nextLine();
            i++;
        }
        f.close();
        for(int count=0;count<i;count++){
            code=text[count].substring(0,text[count].indexOf("\t"));
            sName=(text[count].substring(text[count].indexOf("\t"))).trim();
            subs[count]=new Subject(code, sName);
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
    private javax.swing.JButton b10;
    private javax.swing.JButton b11;
    private javax.swing.JButton b12;
    private javax.swing.JButton b13;
    private javax.swing.JButton b14;
    private javax.swing.JButton b15;
    private javax.swing.JButton b16;
    private javax.swing.JButton b17;
    private javax.swing.JButton b19;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.JButton b9;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextArea l1;
    private javax.swing.JTextArea l2;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t10;
    private javax.swing.JComboBox<String> t11;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t3;
    private javax.swing.JTextField t4;
    private javax.swing.JTextField t5;
    private javax.swing.JTextField t6;
    private javax.swing.JTextField t7;
    private javax.swing.JTextField t8;
    private javax.swing.JTextField t9;
    // End of variables declaration//GEN-END:variables
}
