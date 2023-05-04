public class Select extends javax.swing.JPanel {
    public Select() {
        initComponents();
    }

    public boolean safety_selected(){
        return true;
        
    }

    private void initComponents() {
        exit = new javax.swing.JButton();
        minimize = new javax.swing.JButton();
        select_safety = new javax.swing.JButton();
        select_resource = new javax.swing.JButton();
        select_return = new javax.swing.JButton();
        select_bg = new javax.swing.JLabel();

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

        select_safety.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/input_panel/safety_before.png"))); 
        select_safety.setBorder(null);
        select_safety.setBorderPainted(false);
        select_safety.setContentAreaFilled(false);
        select_safety.setFocusPainted(false);
        select_safety.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                select_safetyMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                select_safetyMouseExited(evt);
            }
        });
        select_safety.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                select_safetyActionPerformed(evt);
            }
        });
        add(select_safety);
        select_safety.setBounds(250, 320, 280, 60);

        select_resource.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/input_panel/request_before.png"))); 
        select_resource.setBorder(null);
        select_resource.setBorderPainted(false);
        select_resource.setContentAreaFilled(false);
        select_resource.setFocusPainted(false);
        select_resource.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                select_resourceMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                select_resourceMouseExited(evt);
            }
        });
        select_resource.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                select_resourceActionPerformed(evt);
            }
        });
        add(select_resource);
        select_resource.setBounds(560, 320, 280, 60);

        select_return.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/buttons/return_before.png"))); 
        select_return.setBorder(null);
        select_return.setBorderPainted(false);
        select_return.setContentAreaFilled(false);
        select_return.setFocusPainted(false);
        select_return.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                select_returnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                select_returnMouseExited(evt);
            }
        });
        select_return.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                select_returnActionPerformed(evt);
            }
        });
        add(select_return);
        select_return.setBounds(990, 630, 70, 70);

        select_bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/input_panel/input_background.png"))); 
        select_bg.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        select_bg.setOpaque(true);
        add(select_bg);
        select_bg.setBounds(0, 0, 1080, 720);
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

    private void exitMouseEntered(java.awt.event.MouseEvent evt) {
        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/buttons/close_after.png")));
    }

    private void exitMouseExited(java.awt.event.MouseEvent evt) {
        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/buttons/close_before.png")));
    }

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {
        System.exit(0);
    }

    private void select_returnMouseEntered(java.awt.event.MouseEvent evt) {
        select_return.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/buttons/return_after.png")));
    }

    private void select_returnMouseExited(java.awt.event.MouseEvent evt) {
        select_return.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/buttons/return_before.png")));
    }

    private void select_returnActionPerformed(java.awt.event.ActionEvent evt) {
        Music.sfx();
        Apportion.card.show(Apportion.mainPanel, "2");
    }

    private void select_safetyMouseEntered(java.awt.event.MouseEvent evt) {
        select_safety.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/input_panel/safety_after.png")));
    }

    private void select_safetyMouseExited(java.awt.event.MouseEvent evt) {
        select_safety.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/input_panel/safety_before.png")));
    }

    private void select_safetyActionPerformed(java.awt.event.ActionEvent evt) {
        Music.sfx();
        Apportion.safe.reset();
        Apportion.card.show(Apportion.mainPanel, "7");
    }

    private void select_resourceMouseEntered(java.awt.event.MouseEvent evt) {
        select_resource.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/input_panel/request_after.png")));
    }

    private void select_resourceMouseExited(java.awt.event.MouseEvent evt) {
        select_resource.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/input_panel/request_before.png")));
    }

    private void select_resourceActionPerformed(java.awt.event.ActionEvent evt) {
        Music.sfx();
        Apportion.rreq.reset();
        Apportion.rreq.initiateDisables("from_menu");
        Apportion.card.show(Apportion.mainPanel, "6");
    }

    private javax.swing.JButton exit;
    private javax.swing.JButton minimize;
    private javax.swing.JLabel select_bg;
    private javax.swing.JButton select_resource;
    private javax.swing.JButton select_return;
    private javax.swing.JButton select_safety;
}
