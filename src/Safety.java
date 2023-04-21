public class Safety extends javax.swing.JPanel {
    public Safety() {
        initComponents();
    }

    private void initComponents() {
        exit = new javax.swing.JButton();
        minimize = new javax.swing.JButton();
        input_availtable_scroll = new javax.swing.JScrollPane();
        input_availtable = new javax.swing.JTable();
        input_maxtable_scroll = new javax.swing.JScrollPane();
        input_maxtable = new javax.swing.JTable();
        input_alloctable_scroll = new javax.swing.JScrollPane();
        input_alloctable = new javax.swing.JTable();
        input_inAllocMax = new javax.swing.JButton();
        input_inAvail = new javax.swing.JButton();
        input_safety = new javax.swing.JButton();
        input_random = new javax.swing.JButton();
        input_import = new javax.swing.JButton();
        input_return = new javax.swing.JButton();
        input_a2_resource3 = new javax.swing.JTextField();
        input_a2_resource2 = new javax.swing.JTextField();
        input_a2_resource1 = new javax.swing.JTextField();
        input_m1_resource3 = new javax.swing.JTextField();
        input_m1_resource2 = new javax.swing.JTextField();
        input_m1_resource1 = new javax.swing.JTextField();
        input_a1_resource3 = new javax.swing.JTextField();
        input_a1_resource2 = new javax.swing.JTextField();
        input_a1_resource1 = new javax.swing.JTextField();
        input_a1_process = new javax.swing.JTextField();
        input_availtableLabel = new javax.swing.JLabel();
        input_maxtableLabel = new javax.swing.JLabel();
        input_alloctableLabel = new javax.swing.JLabel();
        input_alloc = new javax.swing.JLabel();
        input_avail = new javax.swing.JLabel();
        input_bg = new javax.swing.JLabel();

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

        input_availtable.setFont(new java.awt.Font("Poppins", 0, 11)); 
        input_availtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "A", "B", "C"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        input_availtable.setColumnSelectionAllowed(true);
        input_availtable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        input_availtable.setFillsViewportHeight(true);
        input_availtable.setGridColor(new java.awt.Color(0, 0, 0));
        input_availtable.setIntercellSpacing(new java.awt.Dimension(0, 0));
        input_availtable.getTableHeader().setResizingAllowed(false);
        input_availtable.getTableHeader().setReorderingAllowed(false);
        input_availtable_scroll.setViewportView(input_availtable);
        input_availtable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (input_availtable.getColumnModel().getColumnCount() > 0) {
            input_availtable.getColumnModel().getColumn(0).setResizable(false);
            input_availtable.getColumnModel().getColumn(1).setResizable(false);
            input_availtable.getColumnModel().getColumn(2).setResizable(false);
        }

        add(input_availtable_scroll);
        input_availtable_scroll.setBounds(660, 110, 210, 40);

        input_maxtable.setFont(new java.awt.Font("Poppins", 0, 11)); 
        input_maxtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "A", "B", "C"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        input_maxtable.setColumnSelectionAllowed(true);
        input_maxtable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        input_maxtable.setFillsViewportHeight(true);
        input_maxtable.setGridColor(new java.awt.Color(0, 0, 0));
        input_maxtable.setIntercellSpacing(new java.awt.Dimension(0, 0));
        input_maxtable.getTableHeader().setResizingAllowed(false);
        input_maxtable.getTableHeader().setReorderingAllowed(false);
        input_maxtable_scroll.setViewportView(input_maxtable);
        input_maxtable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (input_maxtable.getColumnModel().getColumnCount() > 0) {
            input_maxtable.getColumnModel().getColumn(0).setResizable(false);
            input_maxtable.getColumnModel().getColumn(1).setResizable(false);
            input_maxtable.getColumnModel().getColumn(2).setResizable(false);
        }

        add(input_maxtable_scroll);
        input_maxtable_scroll.setBounds(460, 110, 190, 280);

        input_alloctable.setFont(new java.awt.Font("Poppins", 0, 11)); 
        input_alloctable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Process", "A", "B", "C"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        input_alloctable.setColumnSelectionAllowed(true);
        input_alloctable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        input_alloctable.setFillsViewportHeight(true);
        input_alloctable.setGridColor(new java.awt.Color(0, 0, 0));
        input_alloctable.setIntercellSpacing(new java.awt.Dimension(0, 0));
        input_alloctable.getTableHeader().setResizingAllowed(false);
        input_alloctable.getTableHeader().setReorderingAllowed(false);
        input_alloctable_scroll.setViewportView(input_alloctable);
        input_alloctable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (input_alloctable.getColumnModel().getColumnCount() > 0) {
            input_alloctable.getColumnModel().getColumn(0).setResizable(false);
            input_alloctable.getColumnModel().getColumn(1).setResizable(false);
            input_alloctable.getColumnModel().getColumn(2).setResizable(false);
            input_alloctable.getColumnModel().getColumn(3).setResizable(false);
        }

        add(input_alloctable_scroll);
        input_alloctable_scroll.setBounds(190, 110, 260, 280);

        input_inAllocMax.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/input_panel/add_before.png"))); 
        input_inAllocMax.setBorder(null);
        input_inAllocMax.setBorderPainted(false);
        input_inAllocMax.setContentAreaFilled(false);
        input_inAllocMax.setFocusPainted(false);
        input_inAllocMax.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                input_inAllocMaxMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                input_inAllocMaxMouseExited(evt);
            }
        });
        input_inAllocMax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_inAllocMaxActionPerformed(evt);
            }
        });
        add(input_inAllocMax);
        input_inAllocMax.setBounds(320, 490, 130, 20);

        input_inAvail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/input_panel/input_before.png"))); 
        input_inAvail.setBorder(null);
        input_inAvail.setBorderPainted(false);
        input_inAvail.setContentAreaFilled(false);
        input_inAvail.setFocusPainted(false);
        input_inAvail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                input_inAvailMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                input_inAvailMouseExited(evt);
            }
        });
        input_inAvail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_inAvailActionPerformed(evt);
            }
        });
        add(input_inAvail);
        input_inAvail.setBounds(730, 490, 130, 20);

        input_safety.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/input_panel/safety_before.png"))); 
        input_safety.setBorder(null);
        input_safety.setBorderPainted(false);
        input_safety.setContentAreaFilled(false);
        input_safety.setFocusPainted(false);
        input_safety.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                input_safetyMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                input_safetyMouseExited(evt);
            }
        });
        input_safety.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_safetyActionPerformed(evt);
            }
        });
        add(input_safety);
        input_safety.setBounds(410, 580, 280, 60);

        input_random.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/input_panel/random_before.png"))); 
        input_random.setBorder(null);
        input_random.setBorderPainted(false);
        input_random.setContentAreaFilled(false);
        input_random.setFocusPainted(false);
        input_random.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                input_randomMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                input_randomMouseExited(evt);
            }
        });
        input_random.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_randomActionPerformed(evt);
            }
        });
        add(input_random);
        input_random.setBounds(550, 540, 120, 30);

        input_import.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/input_panel/import_before.png"))); 
        input_import.setBorder(null);
        input_import.setBorderPainted(false);
        input_import.setContentAreaFilled(false);
        input_import.setFocusPainted(false);
        input_import.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                input_importMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                input_importMouseExited(evt);
            }
        });
        input_import.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_importActionPerformed(evt);
            }
        });
        add(input_import);
        input_import.setBounds(430, 540, 112, 30);

        input_return.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/buttons/return_before.png"))); 
        input_return.setBorder(null);
        input_return.setBorderPainted(false);
        input_return.setContentAreaFilled(false);
        input_return.setFocusPainted(false);
        input_return.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                input_returnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                input_returnMouseExited(evt);
            }
        });
        input_return.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_returnActionPerformed(evt);
            }
        });
        add(input_return);
        input_return.setBounds(990, 630, 70, 70);

        input_a2_resource3.setFont(new java.awt.Font("Poppins SemiBold", 0, 12)); 
        input_a2_resource3.setForeground(new java.awt.Color(153, 153, 153));
        input_a2_resource3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        input_a2_resource3.setToolTipText("");
        input_a2_resource3.setBorder(null);
        input_a2_resource3.setOpaque(false);
        add(input_a2_resource3);
        input_a2_resource3.setBounds(830, 460, 50, 20);

        input_a2_resource2.setFont(new java.awt.Font("Poppins SemiBold", 0, 12)); 
        input_a2_resource2.setForeground(new java.awt.Color(153, 153, 153));
        input_a2_resource2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        input_a2_resource2.setToolTipText("");
        input_a2_resource2.setBorder(null);
        input_a2_resource2.setOpaque(false);
        add(input_a2_resource2);
        input_a2_resource2.setBounds(770, 460, 50, 20);

        input_a2_resource1.setFont(new java.awt.Font("Poppins SemiBold", 0, 12)); 
        input_a2_resource1.setForeground(new java.awt.Color(153, 153, 153));
        input_a2_resource1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        input_a2_resource1.setToolTipText("");
        input_a2_resource1.setBorder(null);
        input_a2_resource1.setOpaque(false);
        add(input_a2_resource1);
        input_a2_resource1.setBounds(710, 460, 50, 20);

        input_m1_resource3.setFont(new java.awt.Font("Poppins SemiBold", 0, 12)); 
        input_m1_resource3.setForeground(new java.awt.Color(153, 153, 153));
        input_m1_resource3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        input_m1_resource3.setToolTipText("");
        input_m1_resource3.setBorder(null);
        input_m1_resource3.setOpaque(false);
        add(input_m1_resource3);
        input_m1_resource3.setBounds(560, 460, 50, 20);

        input_m1_resource2.setFont(new java.awt.Font("Poppins SemiBold", 0, 12)); 
        input_m1_resource2.setForeground(new java.awt.Color(153, 153, 153));
        input_m1_resource2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        input_m1_resource2.setToolTipText("");
        input_m1_resource2.setBorder(null);
        input_m1_resource2.setOpaque(false);
        add(input_m1_resource2);
        input_m1_resource2.setBounds(490, 460, 50, 20);

        input_m1_resource1.setFont(new java.awt.Font("Poppins SemiBold", 0, 12)); 
        input_m1_resource1.setForeground(new java.awt.Color(153, 153, 153));
        input_m1_resource1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        input_m1_resource1.setToolTipText("");
        input_m1_resource1.setBorder(null);
        input_m1_resource1.setOpaque(false);
        add(input_m1_resource1);
        input_m1_resource1.setBounds(430, 460, 50, 20);

        input_a1_resource3.setFont(new java.awt.Font("Poppins SemiBold", 0, 12)); 
        input_a1_resource3.setForeground(new java.awt.Color(153, 153, 153));
        input_a1_resource3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        input_a1_resource3.setToolTipText("");
        input_a1_resource3.setBorder(null);
        input_a1_resource3.setOpaque(false);
        add(input_a1_resource3);
        input_a1_resource3.setBounds(340, 460, 50, 20);

        input_a1_resource2.setFont(new java.awt.Font("Poppins SemiBold", 0, 12)); 
        input_a1_resource2.setForeground(new java.awt.Color(153, 153, 153));
        input_a1_resource2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        input_a1_resource2.setToolTipText("");
        input_a1_resource2.setBorder(null);
        input_a1_resource2.setOpaque(false);
        add(input_a1_resource2);
        input_a1_resource2.setBounds(280, 460, 50, 20);

        input_a1_resource1.setFont(new java.awt.Font("Poppins SemiBold", 0, 12)); 
        input_a1_resource1.setForeground(new java.awt.Color(153, 153, 153));
        input_a1_resource1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        input_a1_resource1.setToolTipText("");
        input_a1_resource1.setBorder(null);
        input_a1_resource1.setOpaque(false);
        add(input_a1_resource1);
        input_a1_resource1.setBounds(220, 460, 50, 20);

        input_a1_process.setFont(new java.awt.Font("Poppins SemiBold", 0, 12)); 
        input_a1_process.setForeground(new java.awt.Color(153, 153, 153));
        input_a1_process.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        input_a1_process.setToolTipText("");
        input_a1_process.setBorder(null);
        input_a1_process.setOpaque(false);
        add(input_a1_process);
        input_a1_process.setBounds(150, 460, 50, 20);

        input_availtableLabel.setFont(new java.awt.Font("Poppins SemiBold", 0, 18)); 
        input_availtableLabel.setForeground(new java.awt.Color(255, 255, 255));
        input_availtableLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        input_availtableLabel.setText("AVAILABLE");
        add(input_availtableLabel);
        input_availtableLabel.setBounds(660, 70, 190, 40);

        input_maxtableLabel.setFont(new java.awt.Font("Poppins SemiBold", 0, 18)); 
        input_maxtableLabel.setForeground(new java.awt.Color(255, 255, 255));
        input_maxtableLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        input_maxtableLabel.setText("MAX TABLE");
        add(input_maxtableLabel);
        input_maxtableLabel.setBounds(460, 70, 190, 40);

        input_alloctableLabel.setFont(new java.awt.Font("Poppins SemiBold", 0, 18)); 
        input_alloctableLabel.setForeground(new java.awt.Color(255, 255, 255));
        input_alloctableLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        input_alloctableLabel.setText("ALLOCATION TABLE");
        add(input_alloctableLabel);
        input_alloctableLabel.setBounds(190, 70, 260, 40);

        input_alloc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/input_panel/alloc_max.png"))); 
        add(input_alloc);
        input_alloc.setBounds(130, 410, 502, 120);

        input_avail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/input_panel/available_module.png"))); 
        add(input_avail);
        input_avail.setBounds(650, 410, 290, 120);

        input_bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/input_panel/input_background.png"))); 
        input_bg.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        input_bg.setOpaque(true);
        add(input_bg);
        input_bg.setBounds(0, 0, 1080, 720);
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

    private void input_returnMouseEntered(java.awt.event.MouseEvent evt) {
        input_return.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/buttons/return_after.png")));
    }

    private void input_returnMouseExited(java.awt.event.MouseEvent evt) {
        input_return.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/buttons/return_before.png")));
    }

    private void input_returnActionPerformed(java.awt.event.ActionEvent evt) {
        Apportion.card.show(Apportion.mainPanel, "2");
    }

    private void input_importMouseEntered(java.awt.event.MouseEvent evt) {
        input_import.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/input_panel/import_after.png")));
    }

    private void input_importMouseExited(java.awt.event.MouseEvent evt) {
        input_import.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/input_panel/import_before.png")));
    }

    private void input_importActionPerformed(java.awt.event.ActionEvent evt) {
        
    }

    private void input_randomMouseEntered(java.awt.event.MouseEvent evt) {
        input_random.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/input_panel/random_after.png")));
    }

    private void input_randomMouseExited(java.awt.event.MouseEvent evt) {
        input_random.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/input_panel/random_before.png")));
    }

    private void input_randomActionPerformed(java.awt.event.ActionEvent evt) {
        
    }

    private void input_safetyActionPerformed(java.awt.event.ActionEvent evt) {
        
    }

    private void input_safetyMouseExited(java.awt.event.MouseEvent evt) {
        input_safety.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/input_panel/safety_before.png")));
    }

    private void input_safetyMouseEntered(java.awt.event.MouseEvent evt) {
        input_safety.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/input_panel/safety_after.png")));
    }

    private void input_inAllocMaxMouseEntered(java.awt.event.MouseEvent evt) {
        input_inAllocMax.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/input_panel/add_after.png")));
    }

    private void input_inAllocMaxMouseExited(java.awt.event.MouseEvent evt) {
        input_inAllocMax.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/input_panel/add_before.png")));
    }

    private void input_inAllocMaxActionPerformed(java.awt.event.ActionEvent evt) {
        
    }

    private void input_inAvailMouseEntered(java.awt.event.MouseEvent evt) {
        input_inAvail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/input_panel/input_after.png")));
    }

    private void input_inAvailMouseExited(java.awt.event.MouseEvent evt) {
        input_inAvail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/input_panel/input_before.png")));
    }

    private void input_inAvailActionPerformed(java.awt.event.ActionEvent evt) {
        
    }

    private javax.swing.JButton exit;
    private javax.swing.JTextField input_a1_process;
    private javax.swing.JTextField input_a1_resource1;
    private javax.swing.JTextField input_a1_resource2;
    private javax.swing.JTextField input_a1_resource3;
    private javax.swing.JTextField input_a2_resource1;
    private javax.swing.JTextField input_a2_resource2;
    private javax.swing.JTextField input_a2_resource3;
    private javax.swing.JLabel input_alloc;
    private javax.swing.JTable input_alloctable;
    private javax.swing.JLabel input_alloctableLabel;
    private javax.swing.JScrollPane input_alloctable_scroll;
    private javax.swing.JLabel input_avail;
    private javax.swing.JTable input_availtable;
    private javax.swing.JLabel input_availtableLabel;
    private javax.swing.JScrollPane input_availtable_scroll;
    private javax.swing.JLabel input_bg;
    private javax.swing.JButton input_import;
    private javax.swing.JButton input_inAllocMax;
    private javax.swing.JButton input_inAvail;
    private javax.swing.JTextField input_m1_resource1;
    private javax.swing.JTextField input_m1_resource2;
    private javax.swing.JTextField input_m1_resource3;
    private javax.swing.JTable input_maxtable;
    private javax.swing.JLabel input_maxtableLabel;
    private javax.swing.JScrollPane input_maxtable_scroll;
    private javax.swing.JButton input_random;
    private javax.swing.JButton input_return;
    private javax.swing.JButton input_safety;
    private javax.swing.JButton minimize;
}
