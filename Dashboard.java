
import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;

public class Dashboard extends javax.swing.JFrame {

    // The currently logged-in user — passed in from Login.java
    private UserStore.User currentUser;

    // Labels kept as fields so refreshUserInfo() can update them after edits
    private JLabel fullNameValue;
    private JLabel usernameValue;
    private JLabel emailValue;
    private JLabel welcomeLabel;

    // ── Constructor receives the logged-in User object from Login.java ──
    public Dashboard(UserStore.User user) {
        this.currentUser = user;
        initComponents();
        setLocationRelativeTo(null);
    }

    // ── Builds the entire Dashboard UI ──
    private void initComponents() {
        setTitle("Dashboard");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(820, 540));
        setResizable(false);

        // ── Color palette matching your teal theme ──
        Color teal        = new Color(0, 102, 102);
        Color white       = Color.WHITE;
        Color lightGray   = new Color(245, 245, 245);
        Color textDark    = new Color(40, 40, 40);
        Color textMuted   = new Color(120, 120, 120);
        Color redAccent   = new Color(200, 50, 50);
        Color amberAccent = new Color(180, 120, 0);
        Color greenAccent = new Color(0, 130, 80);

        // ── Root panel ──
        JPanel root = new JPanel(new BorderLayout());
        root.setBackground(lightGray);
        setContentPane(root);

        // ══════════════════════════════════════════════
        // HEADER
        // ══════════════════════════════════════════════
        JPanel header = new JPanel(new BorderLayout());
        header.setBackground(teal);
        header.setBorder(new EmptyBorder(16, 24, 16, 24));

        welcomeLabel = new JLabel("Welcome, " + currentUser.firstName + "!");
        welcomeLabel.setFont(new Font("Segoe UI Black", Font.BOLD, 22));
        welcomeLabel.setForeground(white);

        JLabel badge = new JLabel("  Account Holder  ");
        badge.setFont(new Font("Segoe UI", Font.PLAIN, 11));
        badge.setForeground(new Color(180, 230, 230));
        badge.setBorder(BorderFactory.createLineBorder(new Color(180, 230, 230), 1));

        JPanel headerLeft = new JPanel();
        headerLeft.setLayout(new BoxLayout(headerLeft, BoxLayout.Y_AXIS));
        headerLeft.setBackground(teal);
        headerLeft.add(welcomeLabel);
        headerLeft.add(Box.createVerticalStrut(4));
        headerLeft.add(badge);

        JLabel status = new JLabel("● Online");
        status.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        status.setForeground(new Color(100, 240, 180));

        header.add(headerLeft, BorderLayout.WEST);
        header.add(status, BorderLayout.EAST);
        root.add(header, BorderLayout.NORTH);

        // ══════════════════════════════════════════════
        // BODY — sidebar on left, info card on right
        // ══════════════════════════════════════════════
        JPanel body = new JPanel(new BorderLayout(14, 0));
        body.setBackground(lightGray);
        body.setBorder(new EmptyBorder(20, 20, 20, 20));
        root.add(body, BorderLayout.CENTER);

        // ── SIDEBAR (left) ──
        JPanel sidebar = new JPanel();
        sidebar.setLayout(new BoxLayout(sidebar, BoxLayout.Y_AXIS));
        sidebar.setBackground(white);
        sidebar.setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createLineBorder(new Color(210, 210, 210), 1),
            new EmptyBorder(20, 14, 20, 14)
        ));
        sidebar.setPreferredSize(new Dimension(185, 0));

        JLabel actionsLabel = new JLabel("ACTIONS");
        actionsLabel.setFont(new Font("Segoe UI", Font.BOLD, 10));
        actionsLabel.setForeground(textMuted);
        actionsLabel.setAlignmentX(Component.LEFT_ALIGNMENT);
        sidebar.add(actionsLabel);
        sidebar.add(Box.createVerticalStrut(10));

        sidebar.add(makeSidebarButton("Edit Profile",     teal,        e -> editProfile()));
        sidebar.add(Box.createVerticalStrut(8));
        sidebar.add(makeSidebarButton("Change Password", amberAccent, e -> changePassword()));
        sidebar.add(Box.createVerticalStrut(8));
        sidebar.add(makeSidebarButton("Delete Account",  redAccent,   e -> deleteAccount()));
        sidebar.add(Box.createVerticalGlue());

        JSeparator sep = new JSeparator();
        sep.setMaximumSize(new Dimension(Integer.MAX_VALUE, 1));
        sep.setForeground(new Color(220, 220, 220));
        sep.setAlignmentX(Component.LEFT_ALIGNMENT);
        sidebar.add(sep);
        sidebar.add(Box.createVerticalStrut(8));
        sidebar.add(makeSidebarButton("Logout", greenAccent, e -> logout()));

        body.add(sidebar, BorderLayout.WEST);

        // ── MAIN CONTENT (right) ──
        JPanel main = new JPanel();
        main.setLayout(new BoxLayout(main, BoxLayout.Y_AXIS));
        main.setBackground(lightGray);
        body.add(main, BorderLayout.CENTER);

        // ── User Info Card ──
        JPanel infoCard = new JPanel(new BorderLayout(0, 14));
        infoCard.setBackground(white);
        infoCard.setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createLineBorder(new Color(210, 210, 210), 1),
            new EmptyBorder(18, 20, 18, 20)
        ));
        infoCard.setMaximumSize(new Dimension(Integer.MAX_VALUE, Integer.MAX_VALUE));
        infoCard.setAlignmentX(Component.LEFT_ALIGNMENT);

        JLabel infoTitle = new JLabel("USER INFORMATION");
        infoTitle.setFont(new Font("Segoe UI", Font.BOLD, 10));
        infoTitle.setForeground(textMuted);
        infoCard.add(infoTitle, BorderLayout.NORTH);

        JPanel infoRows = new JPanel(new GridLayout(3, 1, 0, 10));
        infoRows.setBackground(white);

        // These are fields so refreshUserInfo() can update them after edits
        fullNameValue = new JLabel(currentUser.getFullName());
        usernameValue = new JLabel("@" + currentUser.username);
        emailValue    = new JLabel(currentUser.email);

        infoRows.add(makeInfoRow("Full Name", fullNameValue, textMuted, textDark));
        infoRows.add(makeInfoRow("Username",  usernameValue, textMuted, textDark));
        infoRows.add(makeInfoRow("Email",     emailValue,    textMuted, textDark));
        infoCard.add(infoRows, BorderLayout.CENTER);
        main.add(infoCard);

        // ── Footer ──
        JPanel footer = new JPanel(new FlowLayout(FlowLayout.CENTER));
        footer.setBackground(lightGray);
        footer.setBorder(new EmptyBorder(0, 0, 4, 0));
        JLabel footerLabel = new JLabel("Account Management System  •  Session Active");
        footerLabel.setFont(new Font("Segoe UI", Font.PLAIN, 11));
        footerLabel.setForeground(textMuted);
        footer.add(footerLabel);
        root.add(footer, BorderLayout.SOUTH);

        pack();
    }

    // ── Builds a sidebar navigation button ──
    private JButton makeSidebarButton(String text, Color color, ActionListener action) {
        // Create a solid light background by blending the color with white
        Color bgNormal = new Color(
            Math.min(255, 200 + color.getRed()   / 5),
            Math.min(255, 200 + color.getGreen() / 5),
            Math.min(255, 200 + color.getBlue()  / 5)
        );
        Color bgHover = new Color(
            Math.min(255, 180 + color.getRed()   / 4),
            Math.min(255, 180 + color.getGreen() / 4),
            Math.min(255, 180 + color.getBlue()  / 4)
        );

        JButton btn = new JButton(text);
        btn.setFont(new Font("Segoe UI", Font.BOLD, 12));
        btn.setForeground(color.darker());           // solid dark version of the color for text
        btn.setBackground(bgNormal);                 // solid light background — no transparency
        btn.setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createLineBorder(color, 1),
            new EmptyBorder(8, 10, 8, 10)
        ));
        btn.setFocusPainted(false);
        btn.setOpaque(true);                         // must be true for background to show
        btn.setContentAreaFilled(true);              // must be true for background color to paint
        btn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btn.setMaximumSize(new Dimension(Integer.MAX_VALUE, 36));
        btn.setAlignmentX(Component.LEFT_ALIGNMENT);

        // Hover effect using solid colors — no transparency
        btn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                btn.setBackground(bgHover);
            }
            @Override
            public void mouseExited(MouseEvent e) {
                btn.setBackground(bgNormal);
            }
        });

        btn.addActionListener(action);
        return btn;
    }

    // ── Builds one info row with a key label and a value label ──
    private JPanel makeInfoRow(String key, JLabel valueLabel, Color keyColor, Color valColor) {
        JPanel row = new JPanel(new BorderLayout(10, 0));
        row.setBackground(Color.WHITE);
        row.setBorder(new EmptyBorder(6, 0, 6, 0));

        JLabel keyLabel = new JLabel(key);
        keyLabel.setFont(new Font("Segoe UI", Font.BOLD, 13));
        keyLabel.setForeground(keyColor);
        keyLabel.setPreferredSize(new Dimension(100, 20));

        valueLabel.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        valueLabel.setForeground(valColor);

        row.add(keyLabel, BorderLayout.WEST);
        row.add(valueLabel, BorderLayout.CENTER);
        return row;
    }

    // ── Refreshes all displayed labels after any profile edit ──
    private void refreshUserInfo() {
        welcomeLabel.setText("Welcome, " + currentUser.firstName + "!");
        fullNameValue.setText(currentUser.getFullName());
        usernameValue.setText("@" + currentUser.username);
        emailValue.setText(currentUser.email);
    }

    // ══════════════════════════════════════════════
    // ACTION HANDLERS
    // ══════════════════════════════════════════════

    private void editProfile() {
        JTextField firstNameField = new JTextField(currentUser.firstName);
        JTextField lastNameField  = new JTextField(currentUser.lastName);
        JTextField emailField     = new JTextField(currentUser.email);

        JPanel form = new JPanel(new GridLayout(3, 2, 8, 8));
        form.add(new JLabel("First Name:")); form.add(firstNameField);
        form.add(new JLabel("Last Name:"));  form.add(lastNameField);
        form.add(new JLabel("Email:"));      form.add(emailField);

        int result = JOptionPane.showConfirmDialog(this, form, "Edit Profile",
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

        if (result == JOptionPane.OK_OPTION) {
            String fn = firstNameField.getText().trim();
            String ln = lastNameField.getText().trim();
            String em = emailField.getText().trim();

            if (fn.isEmpty() || ln.isEmpty() || em.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Fields cannot be empty.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            UserStore.updateUser(currentUser.username, fn, ln, em);
            currentUser.firstName = fn;
            currentUser.lastName  = ln;
            currentUser.email     = em;
            refreshUserInfo();
            JOptionPane.showMessageDialog(this, "Profile updated successfully!");
        }
    }

    private void changePassword() {
        JPasswordField currentPwd = new JPasswordField(16);
        JPasswordField newPwd     = new JPasswordField(16);
        JPasswordField confirmPwd = new JPasswordField(16);

        JPanel form = new JPanel(new GridLayout(3, 2, 8, 8));
        form.add(new JLabel("Current Password:")); form.add(currentPwd);
        form.add(new JLabel("New Password:"));     form.add(newPwd);
        form.add(new JLabel("Confirm Password:")); form.add(confirmPwd);

        int result = JOptionPane.showConfirmDialog(this, form, "Change Password",
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

        if (result == JOptionPane.OK_OPTION) {
            String current = new String(currentPwd.getPassword());
            String np      = new String(newPwd.getPassword());
            String cp      = new String(confirmPwd.getPassword());

            if (!current.equals(currentUser.password)) {
                JOptionPane.showMessageDialog(this, "Current password is incorrect.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (np.isEmpty() || !np.equals(cp)) {
                JOptionPane.showMessageDialog(this, "New passwords do not match or are empty.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            UserStore.updatePassword(currentUser.username, np);
            currentUser.password = np;
            JOptionPane.showMessageDialog(this, "Password changed successfully!");
        }
    }

    private void deleteAccount() {
        int confirm = JOptionPane.showConfirmDialog(this,
            "Are you sure you want to permanently delete your account?\nThis action cannot be undone.",
            "Delete Account", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);

        if (confirm == JOptionPane.YES_OPTION) {
            String typed = JOptionPane.showInputDialog(this, "Type DELETE to confirm:");
            if ("DELETE".equals(typed)) {
                UserStore.removeUser(currentUser.username);
                JOptionPane.showMessageDialog(this, "Account deleted. Goodbye!");
                goToLogin();
            }
        }
    }

    private void logout() {
        int confirm = JOptionPane.showConfirmDialog(this,
            "Are you sure you want to logout?",
            "Logout", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (confirm == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(this, "You have been logged out successfully.");
            goToLogin();
        }
    }

    // ── Closes Dashboard and returns to the Login screen ──
    private void goToLogin() {
        Login loginFrame = new Login();
        loginFrame.setVisible(true);
        loginFrame.pack();
        loginFrame.setLocationRelativeTo(null);
        this.dispose();
    }
}