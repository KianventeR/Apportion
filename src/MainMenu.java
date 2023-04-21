public class MainMenu extends javax.swing.JPanel {
    public MainMenu() {
        initComponents();
    }

    private void initComponents() {
        menu_exit = new javax.swing.JButton();
        menu_about = new javax.swing.JButton();
        menu_help = new javax.swing.JButton();
        menu_start = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        minimize = new javax.swing.JButton();
        menu_bg = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(1080, 720));
        setMinimumSize(new java.awt.Dimension(1080, 720));
        setPreferredSize(new java.awt.Dimension(1080, 720));
        setLayout(null);

        menu_exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/buttons/exit_before.png"))); 
        menu_exit.setBorder(null);
        menu_exit.setBorderPainted(false);
        menu_exit.setContentAreaFilled(false);
        menu_exit.setFocusPainted(false);
        menu_exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menu_exitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menu_exitMouseExited(evt);
            }
        });
        menu_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_exitActionPerformed(evt);
            }
        });
        add(menu_exit);
        menu_exit.setBounds(790, 300, 200, 164);

        menu_about.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/buttons/about_before.png"))); 
        menu_about.setBorder(null);
        menu_about.setBorderPainted(false);
        menu_about.setContentAreaFilled(false);
        menu_about.setFocusPainted(false);
        menu_about.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menu_aboutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menu_aboutMouseExited(evt);
            }
        });
        menu_about.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_aboutActionPerformed(evt);
            }
        });
        add(menu_about);
        menu_about.setBounds(530, 300, 240, 164);

        menu_help.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/buttons/help_before.png"))); 
        menu_help.setBorder(null);
        menu_help.setBorderPainted(false);
        menu_help.setContentAreaFilled(false);
        menu_help.setFocusPainted(false);
        menu_help.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menu_helpMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menu_helpMouseExited(evt);
            }
        });
        menu_help.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_helpActionPerformed(evt);
            }
        });
        add(menu_help);
        menu_help.setBounds(310, 300, 200, 164);

        menu_start.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/buttons/start_before.png"))); 
        menu_start.setBorder(null);
        menu_start.setBorderPainted(false);
        menu_start.setContentAreaFilled(false);
        menu_start.setFocusPainted(false);
        menu_start.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menu_startMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menu_startMouseExited(evt);
            }
        });
        menu_start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_startActionPerformed(evt);
            }
        });
        add(menu_start);
        menu_start.setBounds(90, 300, 200, 164);

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

        menu_bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/backgrounds/bg_menu.png"))); 
        menu_bg.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        menu_bg.setOpaque(true);
        add(menu_bg);
        menu_bg.setBounds(0, 0, 1080, 720);
    }

    private void exitMouseEntered(java.awt.event.MouseEvent evt) {
        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/buttons/close_after.png")));
    }

    private void exitMouseExited(java.awt.event.MouseEvent evt) {
        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/buttons/close_before.png")));
    }

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {
        System.exit(0);
    }

    private void minimizeMouseEntered(java.awt.event.MouseEvent evt) {
        minimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/buttons/min_after.png")));
    }

    private void minimizeMouseExited(java.awt.event.MouseEvent evt) {
        minimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/buttons/min_before.png")));
    }

    private void minimizeActionPerformed(java.awt.event.ActionEvent evt) {
        Apportion.mainFrame.setState(java.awt.Frame.ICONIFIED);
    }

    private void menu_startMouseEntered(java.awt.event.MouseEvent evt) {
        menu_start.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/buttons/start_after.png")));
    }

    private void menu_startMouseExited(java.awt.event.MouseEvent evt) {
        menu_start.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/buttons/start_before.png")));
    }

    private void menu_startActionPerformed(java.awt.event.ActionEvent evt) {
        Apportion.card.show(Apportion.mainPanel, "5");
    }

    private void menu_aboutMouseEntered(java.awt.event.MouseEvent evt) {
        menu_about.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/buttons/about_after.png"))); 
    }

    private void menu_aboutMouseExited(java.awt.event.MouseEvent evt) {
        menu_about.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/buttons/about_before.png"))); 
    }

    private void menu_aboutActionPerformed(java.awt.event.ActionEvent evt) {
        Apportion.card.show(Apportion.mainPanel, "4");
    }

    private void menu_helpMouseEntered(java.awt.event.MouseEvent evt) {
        menu_help.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/buttons/help_after.png")));
    }

    private void menu_helpMouseExited(java.awt.event.MouseEvent evt) {
        menu_help.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/buttons/help_before.png")));
    }

    private void menu_helpActionPerformed(java.awt.event.ActionEvent evt) {
        Apportion.card.show(Apportion.mainPanel, "3");
    }

    private void menu_exitMouseEntered(java.awt.event.MouseEvent evt) {
        menu_exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/buttons/exit_after.png")));
    }

    private void menu_exitMouseExited(java.awt.event.MouseEvent evt) {
        menu_exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/buttons/exit_before.png")));
    }

    private void menu_exitActionPerformed(java.awt.event.ActionEvent evt) {
        System.exit(0);
    }

    private javax.swing.JButton exit;
    private javax.swing.JButton menu_about;
    private javax.swing.JLabel menu_bg;
    private javax.swing.JButton menu_exit;
    private javax.swing.JButton menu_help;
    private javax.swing.JButton menu_start;
    private javax.swing.JButton minimize;
}
