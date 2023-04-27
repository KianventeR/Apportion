public class About extends javax.swing.JPanel {
    public About() {
        initComponents();
    }

    private void initComponents() {
        exit = new javax.swing.JButton();
        minimize = new javax.swing.JButton();
        about_return = new javax.swing.JButton();
        about_bg = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(1080, 720));
        setMinimumSize(new java.awt.Dimension(1080, 720));
        setPreferredSize(new java.awt.Dimension(1080, 720));
        setLayout(null);

        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/buttons/close_before.png"))); 
        exit.setBorder(null);
        exit.setBorderPainted(false);
        exit.setContentAreaFilled(false);
        exit.setFocusPainted(false);
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitMouseExited(evt);
            }
        });
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        add(exit);
        exit.setBounds(1030, 10, 40, 30);

        minimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/buttons/min_before.png"))); 
        minimize.setBorder(null);
        minimize.setBorderPainted(false);
        minimize.setContentAreaFilled(false);
        minimize.setFocusPainted(false);
        minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                minimizeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                minimizeMouseExited(evt);
            }
        });
        minimize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minimizeActionPerformed(evt);
            }
        });
        add(minimize);
        minimize.setBounds(990, 10, 40, 30);

        about_return.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/buttons/return_before.png"))); 
        about_return.setBorder(null);
        about_return.setBorderPainted(false);
        about_return.setContentAreaFilled(false);
        about_return.setFocusPainted(false);
        about_return.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                about_returnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                about_returnMouseExited(evt);
            }
        });
        about_return.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                about_returnActionPerformed(evt);
            }
        });
        add(about_return);
        about_return.setBounds(990, 630, 70, 70);

        about_bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/backgrounds/about_page.png"))); 
        about_bg.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        about_bg.setOpaque(true);
        add(about_bg);
        about_bg.setBounds(0, 0, 1080, 720);
    }

    private void exitMouseEntered(java.awt.event.MouseEvent evt) {
        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/buttons/close_after.png")));
    }

    private void exitMouseExited(java.awt.event.MouseEvent evt) {
        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/buttons/close_before.png")));
    }

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {
        Music.sfx();
        System.exit(0);
    }

    private void minimizeMouseEntered(java.awt.event.MouseEvent evt) {
        minimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/buttons/min_after.png")));
    }

    private void minimizeMouseExited(java.awt.event.MouseEvent evt) {
        minimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/buttons/min_before.png")));
    }

    private void minimizeActionPerformed(java.awt.event.ActionEvent evt) {
        Music.sfx();   
        Apportion.mainFrame.setState(java.awt.Frame.ICONIFIED);
    }

    private void about_returnMouseEntered(java.awt.event.MouseEvent evt) {
        about_return.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/buttons/return_after.png")));
    }

    private void about_returnMouseExited(java.awt.event.MouseEvent evt) {
        about_return.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/buttons/return_before.png")));
    }

    private void about_returnActionPerformed(java.awt.event.ActionEvent evt) {
        Music.sfx();   
        Apportion.card.show(Apportion.mainPanel, "2");
    }

    private javax.swing.JLabel about_bg;
    private javax.swing.JButton about_return;
    private javax.swing.JButton exit;
    private javax.swing.JButton minimize;
}
