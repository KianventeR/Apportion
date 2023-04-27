import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Output extends javax.swing.JPanel {
    public Output() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException
                | UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }
        initComponents();
    }

    private void initComponents() {
        exit = new javax.swing.JButton();
        minimize = new javax.swing.JButton();
        input_return = new javax.swing.JButton();
        input_safety = new javax.swing.JButton();
        input_processtable_scroll = new javax.swing.JScrollPane();
        input_processtable = new javax.swing.JTable();
        input_alloctable_scroll = new javax.swing.JScrollPane();
        input_alloctable = new javax.swing.JTable();
        input_maxtable_scroll = new javax.swing.JScrollPane();
        input_maxtable = new javax.swing.JTable();
        input_needtable_scroll = new javax.swing.JScrollPane();
        input_needtable = new javax.swing.JTable();
        input_availtable_scroll = new javax.swing.JScrollPane();
        input_availtable = new javax.swing.JTable();
        input_requesttable_scroll = new javax.swing.JScrollPane();
        input_requesttable = new javax.swing.JTable();
        input_seqText = new javax.swing.JLabel();
        help_01 = new javax.swing.JTextPane();
        input_boxcheckbg = new javax.swing.JLabel();
        input_seq = new javax.swing.JLabel();
        input_seqLabel = new javax.swing.JLabel();
        input_availtableLabel = new javax.swing.JLabel();
        input_needtableLabel = new javax.swing.JLabel();
        input_maxtableLabel = new javax.swing.JLabel();
        input_alloctableLabel = new javax.swing.JLabel();
        input_requesttableLabel = new javax.swing.JLabel();
        input_bg = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(1080, 720));
        setMinimumSize(new java.awt.Dimension(1080, 720));
        setPreferredSize(new java.awt.Dimension(1080, 720));
        setLayout(null);

        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/buttons/close_before.png"))); // NOI18N
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

        minimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/buttons/min_before.png"))); // NOI18N
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

        input_return.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/buttons/return_before.png"))); // NOI18N
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

        input_safety.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/input_panel/request_before.png"))); // NOI18N
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
        input_safety.setBounds(620, 470, 280, 60);

        input_processtable.setFont(new java.awt.Font("Poppins", 0, 11)); // NOI18N
        input_processtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Process"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        input_processtable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        input_processtable.setFillsViewportHeight(true);
        input_processtable.setGridColor(new java.awt.Color(0, 0, 0));
        input_processtable.setIntercellSpacing(new java.awt.Dimension(0, 0));
        input_processtable.getTableHeader().setResizingAllowed(false);
        input_processtable.getTableHeader().setReorderingAllowed(false);
        input_processtable_scroll.setViewportView(input_processtable);
        input_processtable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        if (input_processtable.getColumnModel().getColumnCount() > 0) {
            input_processtable.getColumnModel().getColumn(0).setResizable(false);
            input_processtable.getColumnModel().getColumn(0).setHeaderValue("Process");
        }

        add(input_processtable_scroll);
        input_processtable_scroll.setBounds(50, 140, 60, 280);

        input_alloctable.setFont(new java.awt.Font("Poppins", 0, 11)); // NOI18N
        input_alloctable.setModel(new javax.swing.table.DefaultTableModel(
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
        input_alloctable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        input_alloctable.setColumnSelectionAllowed(true);
        input_alloctable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        input_alloctable.setFillsViewportHeight(true);
        input_alloctable.setGridColor(new java.awt.Color(0, 0, 0));
        input_alloctable.setIntercellSpacing(new java.awt.Dimension(0, 0));
        input_alloctable.getTableHeader().setResizingAllowed(false);
        input_alloctable.getTableHeader().setReorderingAllowed(false);
        input_alloctable_scroll.setViewportView(input_alloctable);
        input_alloctable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        add(input_alloctable_scroll);
        input_alloctable_scroll.setBounds(110, 140, 220, 280);

        input_maxtable.setFont(new java.awt.Font("Poppins", 0, 11)); // NOI18N
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
        input_maxtable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        input_maxtable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        input_maxtable.setFillsViewportHeight(true);
        input_maxtable.setGridColor(new java.awt.Color(0, 0, 0));
        input_maxtable.setIntercellSpacing(new java.awt.Dimension(0, 0));
        input_maxtable.getTableHeader().setResizingAllowed(false);
        input_maxtable.getTableHeader().setReorderingAllowed(false);
        input_maxtable_scroll.setViewportView(input_maxtable);

        add(input_maxtable_scroll);
        input_maxtable_scroll.setBounds(340, 140, 220, 280);

        input_needtable.setFont(new java.awt.Font("Poppins", 0, 11)); // NOI18N
        input_needtable.setModel(new javax.swing.table.DefaultTableModel(
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
        input_needtable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        input_needtable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        input_needtable.setFillsViewportHeight(true);
        input_needtable.setGridColor(new java.awt.Color(0, 0, 0));
        input_needtable.setIntercellSpacing(new java.awt.Dimension(0, 0));
        input_needtable.getTableHeader().setResizingAllowed(false);
        input_needtable.getTableHeader().setReorderingAllowed(false);
        input_needtable_scroll.setViewportView(input_needtable);

        add(input_needtable_scroll);
        input_needtable_scroll.setBounds(570, 140, 220, 280);

        input_availtable_scroll.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        input_availtable_scroll.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        input_availtable.setFont(new java.awt.Font("Poppins", 0, 11)); // NOI18N
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
        input_availtable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        input_availtable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        input_availtable.setFillsViewportHeight(true);
        input_availtable.setGridColor(new java.awt.Color(0, 0, 0));
        input_availtable.setIntercellSpacing(new java.awt.Dimension(0, 0));
        input_availtable.getTableHeader().setResizingAllowed(false);
        input_availtable.getTableHeader().setReorderingAllowed(false);
        input_availtable_scroll.setViewportView(input_availtable);

        add(input_availtable_scroll);
        input_availtable_scroll.setBounds(800, 140, 220, 60);

        input_requesttable_scroll.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        input_requesttable_scroll.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        input_requesttable.setFont(new java.awt.Font("Poppins", 0, 11)); // NOI18N
        input_requesttable.setModel(new javax.swing.table.DefaultTableModel(
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
        input_requesttable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        input_requesttable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        input_requesttable.setFillsViewportHeight(true);
        input_requesttable.setGridColor(new java.awt.Color(0, 0, 0));
        input_requesttable.setIntercellSpacing(new java.awt.Dimension(0, 0));
        input_requesttable.getTableHeader().setResizingAllowed(false);
        input_requesttable.getTableHeader().setReorderingAllowed(false);
        input_requesttable_scroll.setViewportView(input_requesttable);

        add(input_requesttable_scroll);
        input_requesttable_scroll.setBounds(800, 250, 220, 70);

        input_seqText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(input_seqText);
        input_seqText.setBounds(160, 600, 290, 60);

        help_01.setEditable(false);
        help_01.setBorder(null);
        help_01.setFont(new java.awt.Font("Poppins SemiBold", 0, 16)); // NOI18N
        help_01.setText("LINE 1\nLINE 2\nLINE 3\nLINE 4");
        help_01.setToolTipText("");
        help_01.setOpaque(false);
        add(help_01);
        help_01.setBounds(170, 450, 370, 100);

        input_boxcheckbg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        input_boxcheckbg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/input_panel/boxcheck.png"))); // NOI18N
        add(input_boxcheckbg);
        input_boxcheckbg.setBounds(150, 440, 410, 120);

        input_seq.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        input_seq.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/input_panel/sequence_placeholder.png"))); // NOI18N
        add(input_seq);
        input_seq.setBounds(150, 600, 310, 40);

        input_seqLabel.setFont(new java.awt.Font("Poppins SemiBold", 0, 18)); // NOI18N
        input_seqLabel.setForeground(new java.awt.Color(255, 255, 255));
        input_seqLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        input_seqLabel.setText("THE SAFETY SEQUENCE IS");
        add(input_seqLabel);
        input_seqLabel.setBounds(160, 570, 300, 30);

        input_availtableLabel.setFont(new java.awt.Font("Poppins SemiBold", 0, 18)); // NOI18N
        input_availtableLabel.setForeground(new java.awt.Color(255, 255, 255));
        input_availtableLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        input_availtableLabel.setText("AVAILABLE");
        add(input_availtableLabel);
        input_availtableLabel.setBounds(800, 100, 190, 40);

        input_needtableLabel.setFont(new java.awt.Font("Poppins SemiBold", 0, 18)); // NOI18N
        input_needtableLabel.setForeground(new java.awt.Color(255, 255, 255));
        input_needtableLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        input_needtableLabel.setText("NEED TABLE");
        add(input_needtableLabel);
        input_needtableLabel.setBounds(570, 100, 190, 40);

        input_maxtableLabel.setFont(new java.awt.Font("Poppins SemiBold", 0, 18)); // NOI18N
        input_maxtableLabel.setForeground(new java.awt.Color(255, 255, 255));
        input_maxtableLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        input_maxtableLabel.setText("MAX TABLE");
        add(input_maxtableLabel);
        input_maxtableLabel.setBounds(360, 100, 190, 40);

        input_alloctableLabel.setFont(new java.awt.Font("Poppins SemiBold", 0, 18)); // NOI18N
        input_alloctableLabel.setForeground(new java.awt.Color(255, 255, 255));
        input_alloctableLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        input_alloctableLabel.setText("ALLOCATION TABLE");
        add(input_alloctableLabel);
        input_alloctableLabel.setBounds(50, 100, 260, 40);

        input_requesttableLabel.setFont(new java.awt.Font("Poppins SemiBold", 0, 18)); // NOI18N
        input_requesttableLabel.setForeground(new java.awt.Color(255, 255, 255));
        input_requesttableLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        input_requesttableLabel.setText("REQUEST-RESOURCE");
        add(input_requesttableLabel);
        input_requesttableLabel.setBounds(800, 210, 190, 40);

        input_bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/input_panel/input_background.png"))); // NOI18N
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
        Music.sfx();
        Apportion.mainFrame.setState(java.awt.Frame.ICONIFIED);
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

    private void input_returnMouseEntered(java.awt.event.MouseEvent evt) {
        input_return.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/buttons/return_after.png")));
    }

    private void input_returnMouseExited(java.awt.event.MouseEvent evt) {
        input_return.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/buttons/return_before.png")));
    }

    private void input_returnActionPerformed(java.awt.event.ActionEvent evt) {
        Music.sfx();
        Apportion.card.show(Apportion.mainPanel, "2");
    }

    private void input_safetyMouseEntered(java.awt.event.MouseEvent evt) {
        input_safety.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/input_panel/request_after.png"))); 
    }

    private void input_safetyMouseExited(java.awt.event.MouseEvent evt) {
        input_safety.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/input_panel/request_before.png"))); 
    }

    private void input_safetyActionPerformed(java.awt.event.ActionEvent evt) {
        Music.sfx();

        
    }

    private javax.swing.JButton exit;
    private javax.swing.JTextPane help_01;
    private javax.swing.JTable input_alloctable;
    private javax.swing.JLabel input_alloctableLabel;
    private javax.swing.JScrollPane input_alloctable_scroll;
    private javax.swing.JTable input_availtable;
    private javax.swing.JLabel input_availtableLabel;
    private javax.swing.JScrollPane input_availtable_scroll;
    private javax.swing.JLabel input_bg;
    private javax.swing.JLabel input_boxcheckbg;
    private javax.swing.JTable input_maxtable;
    private javax.swing.JLabel input_maxtableLabel;
    private javax.swing.JScrollPane input_maxtable_scroll;
    private javax.swing.JTable input_needtable;
    private javax.swing.JLabel input_needtableLabel;
    private javax.swing.JScrollPane input_needtable_scroll;
    private javax.swing.JTable input_processtable;
    private javax.swing.JScrollPane input_processtable_scroll;
    private javax.swing.JTable input_requesttable;
    private javax.swing.JLabel input_requesttableLabel;
    private javax.swing.JScrollPane input_requesttable_scroll;
    private javax.swing.JButton input_return;
    private javax.swing.JButton input_safety;
    private javax.swing.JLabel input_seq;
    private javax.swing.JLabel input_seqLabel;
    private javax.swing.JLabel input_seqText;
    private javax.swing.JButton minimize;
}
