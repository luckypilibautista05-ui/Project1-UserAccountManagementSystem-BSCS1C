

public class Registration extends javax.swing.JFrame {

    public Registration() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPasswordField2 = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registration");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Lucky\\OneDrive\\Documents\\NetBeansProjects\\UserManagementSystemJava\\src\\Icon\\logo.jpg")); // NOI18N

        jLabel2.setFont(new java.awt.Font("Showcard Gothic", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("LAMPARA");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("copyright © LAMPARA All rights reserved");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(110, 110, 110))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(0, 25, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(172, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jLabel2)
                .addGap(147, 147, 147)
                .addComponent(jLabel3)
                .addGap(125, 125, 125))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 420, 760);

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 1, 36));
        jLabel4.setForeground(new java.awt.Color(0, 102, 102));
        jLabel4.setText("SIGN UP");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(580, 40, 160, 32);

        jLabel5.setText("First Name");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(500, 110, 100, 16);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) { }
        });
        jPanel1.add(jTextField1);
        jTextField1.setBounds(500, 140, 310, 30);

        jLabel6.setText("Last Name");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(500, 180, 110, 16);
        jPanel1.add(jTextField2);
        jTextField2.setBounds(500, 210, 310, 30);

        jLabel7.setText("Email");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(500, 260, 100, 16);

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) { }
        });
        jPanel1.add(jTextField3);
        jTextField3.setBounds(500, 290, 310, 30);

        jLabel8.setText("Username");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(500, 340, 90, 16);

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) { }
        });
        jPanel1.add(jTextField4);
        jTextField4.setBounds(500, 370, 310, 30);

        jLabel9.setText("Password");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(500, 420, 80, 16);

        jLabel10.setText("Confirm Password");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(500, 490, 120, 16);

        jButton1.setBackground(new java.awt.Color(0, 102, 102));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Sign Up");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(500, 580, 90, 40);

        jLabel11.setText("I have an account");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(500, 670, 120, 16);

        jButton2.setForeground(new java.awt.Color(255, 51, 51));
        jButton2.setText("Login");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(610, 660, 90, 40);

        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) { }
        });
        jPanel1.add(jPasswordField1);
        jPasswordField1.setBounds(500, 450, 310, 30);

        jPasswordField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) { }
        });
        jPanel1.add(jPasswordField2);
        jPasswordField2.setBounds(500, 520, 310, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 896, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 752, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // "Login" button — goes back to Login screen
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        Login LoginFrame = new Login();
        LoginFrame.setVisible(true);
        LoginFrame.pack();
        LoginFrame.setLocationRelativeTo(null);
        this.dispose();
    }

    // "Sign Up" button — validates all fields then saves the user to UserStore
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        // Collect all input fields
        String firstName  = jTextField1.getText().trim();
        String lastName   = jTextField2.getText().trim();
        String email      = jTextField3.getText().trim();
        String username   = jTextField4.getText().trim();
        String pass       = new String(jPasswordField1.getPassword());
        String confirmPass = new String(jPasswordField2.getPassword());

        // 1. Check all fields are filled
        if (firstName.isEmpty() || lastName.isEmpty() || email.isEmpty()
                || username.isEmpty() || pass.isEmpty() || confirmPass.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Please fill up all fields!", "Error", javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }

        // 2. Check email format
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        if (!email.matches(emailRegex)) {
            javax.swing.JOptionPane.showMessageDialog(this, "Please enter a valid email address!", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }

        // 3. Check password strength
        String passRegex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=_!])(?=\\S+$).{8,}$";
        if (!pass.matches(passRegex)) {
            javax.swing.JOptionPane.showMessageDialog(this,
                "Weak password! Must be 8+ chars with uppercase, lowercase, number, and special character (@#$%^&+=_!).",
                "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }

        // 4. Check passwords match
        if (!pass.equals(confirmPass)) {
            javax.swing.JOptionPane.showMessageDialog(this, "Passwords do not match!", "Error", javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }

        // 5. Check if username is already taken in UserStore
        if (UserStore.usernameExists(username)) {
            javax.swing.JOptionPane.showMessageDialog(this, "Username already exists! Please choose another.", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }

        // 6. All validations passed — save the new user to UserStore
        UserStore.addUser(new UserStore.User(firstName, lastName, email, username, pass));

        // 7. Show success and redirect to Login
        javax.swing.JOptionPane.showMessageDialog(this, "Registration Successful!", "Success", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        Login LoginFrame = new Login();
        LoginFrame.setVisible(true);
        LoginFrame.pack();
        LoginFrame.setLocationRelativeTo(null);
        this.dispose();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}