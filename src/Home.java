import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Sachin&Ayush
 */
public class Home extends javax.swing.JFrame {

    public static int currentQuestionId = 0;

    /**
     * Creates new form Questions
     */
    public Home() {
        initComponents();

        //when frame is opened.
        if (Login.currentUserLoggedIn != 0) {
            signup_btn.setVisible(false);
            jSeparator7.setVisible(false);

            login_btn.setVisible(false);
            jSeparator1.setVisible(false);
        } else {
            user_profile_btn.setVisible(false);
            jSeparator2.setVisible(false);

            logout_btn.setVisible(false);
            jSeparator5.setVisible(false);
        }

        try {
            q = "select que_id, que_title, questions.date, users.user_name from questions join users using(user_id)"
                    + " order by questions.date desc limit 5";
            addQuestions(q);
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }
    Connection conn;
    Statement stmt;
    ResultSet rs;
    String q;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        u1 = new javax.swing.JLabel();
        d1 = new javax.swing.JLabel();
        q1 = new javax.swing.JTextArea();
        jPanel9 = new javax.swing.JPanel();
        q2 = new javax.swing.JTextArea();
        d2 = new javax.swing.JLabel();
        u2 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        q3 = new javax.swing.JTextArea();
        d3 = new javax.swing.JLabel();
        u3 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        q4 = new javax.swing.JTextArea();
        d4 = new javax.swing.JLabel();
        u4 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        q5 = new javax.swing.JTextArea();
        d5 = new javax.swing.JLabel();
        u5 = new javax.swing.JLabel();
        prev_btn = new javax.swing.JButton();
        next_btn = new javax.swing.JButton();
        search_field = new javax.swing.JTextField();
        search_btn = new javax.swing.JButton();
        close_btn = new javax.swing.JButton();
        jToolBar1 = new javax.swing.JToolBar();
        login_btn = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        ask_btn = new javax.swing.JButton();
        jSeparator8 = new javax.swing.JToolBar.Separator();
        user_profile_btn = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        logout_btn = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JToolBar.Separator();
        refresh_btn = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        signup_btn = new javax.swing.JButton();
        jSeparator7 = new javax.swing.JToolBar.Separator();
        aboutus_btn = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JToolBar.Separator();
        help_btn = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JToolBar.Separator();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Cambria Math", 1, 50)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/maxresdefault.jpg"))); // NOI18N
        jLabel1.setText("Q&A");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, -1, 50));

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new java.awt.GridLayout(5, 1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 215));

        u1.setBackground(new java.awt.Color(255, 255, 218));
        u1.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        u1.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        u1.setOpaque(true);

        d1.setBackground(new java.awt.Color(255, 255, 218));
        d1.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        d1.setOpaque(true);

        q1.setEditable(false);
        q1.setBackground(new java.awt.Color(255, 255, 218));
        q1.setColumns(20);
        q1.setFont(new java.awt.Font("Cambria Math", 0, 15)); // NOI18N
        q1.setLineWrap(true);
        q1.setRows(5);
        q1.setWrapStyleWord(true);
        q1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                openQuestion(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(u1, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(d1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(q1)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(q1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(u1, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                    .addComponent(d1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel1.add(jPanel2);

        jPanel9.setBackground(new java.awt.Color(220, 244, 219));

        q2.setEditable(false);
        q2.setBackground(new java.awt.Color(220, 244, 219));
        q2.setColumns(20);
        q2.setFont(new java.awt.Font("Cambria Math", 0, 15)); // NOI18N
        q2.setLineWrap(true);
        q2.setRows(5);
        q2.setWrapStyleWord(true);
        q2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                openQuestion(evt);
            }
        });

        d2.setBackground(new java.awt.Color(220, 244, 219));
        d2.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        d2.setOpaque(true);

        u2.setBackground(new java.awt.Color(220, 244, 219));
        u2.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        u2.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        u2.setOpaque(true);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(u2, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(d2, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(q2)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(q2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(u2, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                    .addComponent(d2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel1.add(jPanel9);

        jPanel10.setBackground(new java.awt.Color(255, 255, 215));

        q3.setEditable(false);
        q3.setBackground(new java.awt.Color(255, 255, 218));
        q3.setColumns(20);
        q3.setFont(new java.awt.Font("Cambria Math", 0, 15)); // NOI18N
        q3.setLineWrap(true);
        q3.setRows(5);
        q3.setWrapStyleWord(true);
        q3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                openQuestion(evt);
            }
        });

        d3.setBackground(new java.awt.Color(255, 255, 218));
        d3.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        d3.setOpaque(true);

        u3.setBackground(new java.awt.Color(255, 255, 218));
        u3.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        u3.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        u3.setOpaque(true);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(u3, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(d3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(q3)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(q3, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(d3, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                    .addComponent(u3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel1.add(jPanel10);

        jPanel11.setBackground(new java.awt.Color(220, 244, 219));

        q4.setEditable(false);
        q4.setBackground(new java.awt.Color(220, 244, 219));
        q4.setColumns(20);
        q4.setFont(new java.awt.Font("Cambria Math", 0, 15)); // NOI18N
        q4.setLineWrap(true);
        q4.setRows(5);
        q4.setWrapStyleWord(true);
        q4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                openQuestion(evt);
            }
        });

        d4.setBackground(new java.awt.Color(220, 244, 219));
        d4.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        d4.setOpaque(true);

        u4.setBackground(new java.awt.Color(220, 244, 219));
        u4.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        u4.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        u4.setOpaque(true);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(u4, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(d4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(q4)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(q4, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(d4, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                    .addComponent(u4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel1.add(jPanel11);

        jPanel12.setBackground(new java.awt.Color(255, 255, 215));

        q5.setEditable(false);
        q5.setBackground(new java.awt.Color(255, 255, 218));
        q5.setColumns(20);
        q5.setFont(new java.awt.Font("Cambria Math", 0, 15)); // NOI18N
        q5.setLineWrap(true);
        q5.setRows(5);
        q5.setWrapStyleWord(true);
        q5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                openQuestion(evt);
            }
        });

        d5.setBackground(new java.awt.Color(255, 255, 218));
        d5.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        d5.setOpaque(true);

        u5.setBackground(new java.awt.Color(255, 255, 218));
        u5.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        u5.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        u5.setOpaque(true);

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addComponent(u5, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(d5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(q5)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addComponent(q5, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(d5, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                    .addComponent(u5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel1.add(jPanel12);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 159, 610, 440));

        prev_btn.setText("<< Previous");
        prev_btn.setEnabled(false);
        prev_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prev_btnActionPerformed(evt);
            }
        });
        getContentPane().add(prev_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 600, -1, 32));

        next_btn.setText("Next >>");
        next_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                next_btnActionPerformed(evt);
            }
        });
        getContentPane().add(next_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 600, -1, 32));

        search_field.setFont(new java.awt.Font("Cambria Math", 0, 24)); // NOI18N
        search_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_fieldActionPerformed(evt);
            }
        });
        getContentPane().add(search_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 530, 30));

        search_btn.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        search_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Capture.PNG"))); // NOI18N
        search_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_btnActionPerformed(evt);
            }
        });
        getContentPane().add(search_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 110, 50, 30));

        close_btn.setBackground(new java.awt.Color(255, 0, 0));
        close_btn.setFont(new java.awt.Font("Cambria Math", 0, 36)); // NOI18N
        close_btn.setForeground(new java.awt.Color(255, 255, 255));
        close_btn.setText("<html>&times;</html>");
        close_btn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        close_btn.setMargin(new java.awt.Insets(2, 0, 14, 6));
        close_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                close_btnclose(evt);
            }
        });
        getContentPane().add(close_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 0, 50, 50));

        jToolBar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);

        login_btn.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        login_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-house-keys-48.png"))); // NOI18N
        login_btn.setToolTipText("Log In");
        login_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_btnActionPerformed(evt);
            }
        });
        jToolBar1.add(login_btn);
        jToolBar1.add(jSeparator1);

        ask_btn.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        ask_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ask icon.png"))); // NOI18N
        ask_btn.setToolTipText("Ask a question");
        ask_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ask_btnActionPerformed(evt);
            }
        });
        jToolBar1.add(ask_btn);
        jToolBar1.add(jSeparator8);

        user_profile_btn.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        user_profile_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/User-Icon.jpg"))); // NOI18N
        user_profile_btn.setToolTipText("User Profile");
        user_profile_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                user_profile_btnActionPerformed(evt);
            }
        });
        jToolBar1.add(user_profile_btn);
        jToolBar1.add(jSeparator2);

        logout_btn.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        logout_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logout_img.png"))); // NOI18N
        logout_btn.setToolTipText("Log Out");
        logout_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logout_btnActionPerformed(evt);
            }
        });
        jToolBar1.add(logout_btn);
        jToolBar1.add(jSeparator5);

        refresh_btn.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        refresh_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Apps-Dialog-Refresh-icon.png"))); // NOI18N
        refresh_btn.setToolTipText("Refresh");
        refresh_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refresh_btnActionPerformed(evt);
            }
        });
        jToolBar1.add(refresh_btn);
        jToolBar1.add(jSeparator3);

        signup_btn.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        signup_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sign_up_img.jpeg"))); // NOI18N
        signup_btn.setToolTipText("Sign Up");
        signup_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signup_btnActionPerformed(evt);
            }
        });
        jToolBar1.add(signup_btn);
        jToolBar1.add(jSeparator7);

        aboutus_btn.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        aboutus_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-user-30.png"))); // NOI18N
        aboutus_btn.setToolTipText("About Us");
        aboutus_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutus_btnActionPerformed(evt);
            }
        });
        jToolBar1.add(aboutus_btn);
        jToolBar1.add(jSeparator6);

        help_btn.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        help_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/help.png"))); // NOI18N
        help_btn.setToolTipText("Help");
        help_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                help_btnActionPerformed(evt);
            }
        });
        jToolBar1.add(help_btn);
        jToolBar1.add(jSeparator4);

        getContentPane().add(jToolBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 630, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gradient.jpg"))); // NOI18N
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 640));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // offset variable
    int n = 0;

    //search button clicked or not
    boolean searchButtonClicked = false;

    //enable and clear all the questionTitle textfields and (user, date)labels
    void enableAndClear() {
        JTextArea[] que = new JTextArea[5];
        que[0] = q1;
        que[1] = q2;
        que[2] = q3;
        que[3] = q4;
        que[4] = q5;

        JLabel[] user = new JLabel[5];
        user[0] = u1;
        user[1] = u2;
        user[2] = u3;
        user[3] = u4;
        user[4] = u5;

        JLabel[] date = new JLabel[5];
        date[0] = d1;
        date[1] = d2;
        date[2] = d3;
        date[3] = d4;
        date[4] = d5;

        for (int i = 0; i < 5; i++) {
            que[i].setEnabled(true);
            user[i].setEnabled(true);
            date[i].setEnabled(true);

            que[i].setText("");
            user[i].setText("");
            date[i].setText("");
        }
    }

    //disabling or enabling next and previous buttons as per situation
    void enableAndDisableNavigation() throws ClassNotFoundException, SQLException {
        Class.forName("java.sql.DriverManager");
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/qAnda", "root", "");
        stmt = conn.createStatement();
        String q;
        if (!searchButtonClicked) {
            q = "select count(que_id) from questions";
        } else {
            q = "select count(que_id) from questions where match(que_title, que_body)"
                    + " against('" + search_field.getText() + "' IN NATURAL LANGUAGE MODE)";
        }
        rs = stmt.executeQuery(q);
        rs.next();
        int totalRows = rs.getInt(1);
        if (n * 5 + 5 >= totalRows) {
            next_btn.setEnabled(false);
        } else {
            next_btn.setEnabled(true);
        }

        if (n == 0) {
            prev_btn.setEnabled(false);
        } else {
            prev_btn.setEnabled(true);
        }
    }

    //adding the questions in the container
    void addQuestions(String q) throws ClassNotFoundException, SQLException {
        enableAndClear();
        JTextArea[] que = new JTextArea[5];
        que[0] = q1;
        que[1] = q2;
        que[2] = q3;
        que[3] = q4;
        que[4] = q5;

        JLabel[] user = new JLabel[5];
        user[0] = u1;
        user[1] = u2;
        user[2] = u3;
        user[3] = u4;
        user[4] = u5;

        JLabel[] date = new JLabel[5];
        date[0] = d1;
        date[1] = d2;
        date[2] = d3;
        date[3] = d4;
        date[4] = d5;

        Class.forName("java.sql.DriverManager");
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/qAnda", "root", "");
        stmt = conn.createStatement();
        rs = stmt.executeQuery(q);

        int i = 0;
        while (rs.next()) {

            // Getting userName from table users by relating user_id of the question.
            que[i].setName(rs.getString("que_id"));
            que[i].setText(rs.getString("que_title"));
            user[i].setText("  " + rs.getString("user_name"));
            date[i].setText(rs.getString("date") + "  ");
            i++;
        }
        while (i < 5) {
            que[i].setEnabled(false);
            i++;
        }
        enableAndDisableNavigation();
    }

    //when next or previous button will be clicked
    void navigationClicked() {
        String q = "";
        if (!searchButtonClicked) {
            q = "select que_id, que_title, questions.date, users.user_name from questions join users using(user_id)"
                    + " order by questions.date desc limit 5 offset " + n * 5;
        } else {
            q = "select que_id, que_title, questions.date, users.user_name from questions join users using(user_id)"
                    + " where match(que_title, que_body) against('" + search_field.getText() + "' IN NATURAL LANGUAGE MODE) limit 5 offset " + n * 5;
        }
        try {
            addQuestions(q);
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }

    private void help_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_help_btnActionPerformed
        new Help().setVisible(true);
        dispose();
    }//GEN-LAST:event_help_btnActionPerformed

    private void aboutus_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutus_btnActionPerformed
        new AboutUs().setVisible(true);
        dispose();
    }//GEN-LAST:event_aboutus_btnActionPerformed

    private void signup_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signup_btnActionPerformed
        new SignUp().setVisible(true);
        dispose();
    }//GEN-LAST:event_signup_btnActionPerformed

    private void refresh_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refresh_btnActionPerformed
        n = 0;
        searchButtonClicked = false;
        try {
            q = "select que_id, que_title, questions.date, users.user_name from questions join users using(user_id)"
                    + " order by questions.date desc limit 5";
            addQuestions(q);
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_refresh_btnActionPerformed

    private void logout_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logout_btnActionPerformed
        Login.currentUserLoggedIn = 0;
        dispose();
        new Home().setVisible(true);
    }//GEN-LAST:event_logout_btnActionPerformed

    private void user_profile_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_user_profile_btnActionPerformed
        new UserProfile().setVisible(true);
        dispose();
    }//GEN-LAST:event_user_profile_btnActionPerformed

    private void ask_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ask_btnActionPerformed
        if (Login.currentUserLoggedIn != 0) {
            //opening AskQuestion and disposing current frame..
            new AskQuestion().setVisible(true);
            dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Please Signup or Login first!");
        }
    }//GEN-LAST:event_ask_btnActionPerformed

    private void login_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login_btnActionPerformed
        new Login().setVisible(true);
        dispose();
    }//GEN-LAST:event_login_btnActionPerformed

    private void close_btnclose(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_close_btnclose
        System.exit(0);
    }//GEN-LAST:event_close_btnclose

    private void search_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_btnActionPerformed
        searchButtonClicked = true;
        //redefining offset variable for search.
        n = 0;
        try {
            String search = search_field.getText();
            String q = "select que_id, que_title, questions.date, users.user_name from questions join users using(user_id)"
                    + " where match(que_title, que_body) against('" + search + "' IN NATURAL LANGUAGE MODE) limit 5";
            addQuestions(q);
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_search_btnActionPerformed

    private void next_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_next_btnActionPerformed
        n++;
        navigationClicked();
    }//GEN-LAST:event_next_btnActionPerformed

    private void prev_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prev_btnActionPerformed
        n--;
        navigationClicked();
    }//GEN-LAST:event_prev_btnActionPerformed

    private void openQuestion(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_openQuestion
        if (evt.getComponent().isEnabled()) {
            currentQuestionId = Integer.parseInt(evt.getComponent().getName());
        
            UserProfile.QUESTIONS_OF_USERPROFILE_CLICKED = false;

            new QuestionWithAnswers().setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_openQuestion

    private void search_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_fieldActionPerformed
        search_btn.doClick();
    }//GEN-LAST:event_search_fieldActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aboutus_btn;
    private javax.swing.JButton ask_btn;
    private javax.swing.JButton close_btn;
    private javax.swing.JLabel d1;
    private javax.swing.JLabel d2;
    private javax.swing.JLabel d3;
    private javax.swing.JLabel d4;
    private javax.swing.JLabel d5;
    private javax.swing.JButton help_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar.Separator jSeparator4;
    private javax.swing.JToolBar.Separator jSeparator5;
    private javax.swing.JToolBar.Separator jSeparator6;
    private javax.swing.JToolBar.Separator jSeparator7;
    private javax.swing.JToolBar.Separator jSeparator8;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JButton login_btn;
    private javax.swing.JButton logout_btn;
    private javax.swing.JButton next_btn;
    private javax.swing.JButton prev_btn;
    private javax.swing.JTextArea q1;
    private javax.swing.JTextArea q2;
    private javax.swing.JTextArea q3;
    private javax.swing.JTextArea q4;
    private javax.swing.JTextArea q5;
    private javax.swing.JButton refresh_btn;
    private javax.swing.JButton search_btn;
    private javax.swing.JTextField search_field;
    private javax.swing.JButton signup_btn;
    private javax.swing.JLabel u1;
    private javax.swing.JLabel u2;
    private javax.swing.JLabel u3;
    private javax.swing.JLabel u4;
    private javax.swing.JLabel u5;
    private javax.swing.JButton user_profile_btn;
    // End of variables declaration//GEN-END:variables
}
