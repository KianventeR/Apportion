import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class ResourceReqPanel extends javax.swing.JPanel {
    public ResourceReqPanel() {
        initComponents();
    }
                   
    private void initComponents() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException
                | UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }

        exit = new javax.swing.JButton();
        minimize = new javax.swing.JButton();
        input_requesttable_scroll = new javax.swing.JScrollPane();
        input_requesttable = new javax.swing.JTable();
        input_processtable_scroll = new javax.swing.JScrollPane();
        input_processtable = new javax.swing.JTable();
        input_availtable_scroll = new javax.swing.JScrollPane();
        input_availtable = new javax.swing.JTable();
        input_needtable_scroll = new javax.swing.JScrollPane();
        input_needtable = new javax.swing.JTable();
        input_maxtable_scroll = new javax.swing.JScrollPane();
        input_maxtable = new javax.swing.JTable();
        input_alloctable_scroll = new javax.swing.JScrollPane();
        input_alloctable = new javax.swing.JTable();
        input_resourcereq = new javax.swing.JButton();
        input_random = new javax.swing.JButton();
        input_import = new javax.swing.JButton();
        input_return = new javax.swing.JButton();
        input_minusresource = new javax.swing.JButton();
        input_addresource = new javax.swing.JButton();
        input_minusprocess = new javax.swing.JButton();
        input_addprocess = new javax.swing.JButton();
        input_addR = new javax.swing.JTextField();
        input_addP = new javax.swing.JTextField();
        input_resourcenum = new javax.swing.JLabel();
        input_processnum = new javax.swing.JLabel();
        input_requesttableLabel = new javax.swing.JLabel();
        input_availtableLabel = new javax.swing.JLabel();
        input_needtableLabel = new javax.swing.JLabel();
        input_maxtableLabel = new javax.swing.JLabel();
        input_alloctableLabel = new javax.swing.JLabel();
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

        input_requesttable_scroll.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        input_requesttable_scroll.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        input_requesttable.setFont(new java.awt.Font("Poppins", 0, 11)); // NOI18N
        input_requesttable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null}
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
        input_requesttable.setColumnSelectionAllowed(true);
        input_requesttable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        input_requesttable.setFillsViewportHeight(true);
        input_requesttable.setGridColor(new java.awt.Color(0, 0, 0));
        input_requesttable.setIntercellSpacing(new java.awt.Dimension(0, 0));
        input_requesttable.getTableHeader().setResizingAllowed(false);
        input_requesttable.getTableHeader().setReorderingAllowed(false);
        input_requesttable_scroll.setViewportView(input_requesttable);
        input_requesttable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (input_requesttable.getColumnModel().getColumnCount() > 0) {
            input_requesttable.getColumnModel().getColumn(0).setResizable(false);
            input_requesttable.getColumnModel().getColumn(1).setResizable(false);
            input_requesttable.getColumnModel().getColumn(2).setResizable(false);
        }

        add(input_requesttable_scroll);
        input_requesttable_scroll.setBounds(800, 230, 210, 40);

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
        if (input_processtable.getColumnModel().getColumnCount() > 0) {
            input_processtable.getColumnModel().getColumn(0).setResizable(false);
        }

        add(input_processtable_scroll);
        input_processtable_scroll.setBounds(50, 140, 60, 280);

        input_availtable_scroll.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        input_availtable_scroll.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        input_availtable.setFont(new java.awt.Font("Poppins", 0, 11)); // NOI18N
        input_availtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null}
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
        input_availtable_scroll.setBounds(800, 140, 210, 40);

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
        input_needtable.setColumnSelectionAllowed(true);
        input_needtable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        input_needtable.setFillsViewportHeight(true);
        input_needtable.setGridColor(new java.awt.Color(0, 0, 0));
        input_needtable.setIntercellSpacing(new java.awt.Dimension(0, 0));
        input_needtable.getTableHeader().setResizingAllowed(false);
        input_needtable.getTableHeader().setReorderingAllowed(false);
        input_needtable_scroll.setViewportView(input_needtable);
        input_needtable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (input_needtable.getColumnModel().getColumnCount() > 0) {
            input_needtable.getColumnModel().getColumn(0).setResizable(false);
            input_needtable.getColumnModel().getColumn(1).setResizable(false);
            input_needtable.getColumnModel().getColumn(2).setResizable(false);
        }

        add(input_needtable_scroll);
        input_needtable_scroll.setBounds(570, 140, 220, 280);

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
        input_maxtable_scroll.setBounds(340, 140, 220, 280);

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
        }

        add(input_alloctable_scroll);
        input_alloctable_scroll.setBounds(110, 140, 220, 280);

        input_resourcereq.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/input_panel/simulate.png"))); // NOI18N
        input_resourcereq.setBorder(null);
        input_resourcereq.setBorderPainted(false);
        input_resourcereq.setContentAreaFilled(false);
        input_resourcereq.setFocusPainted(false);
        input_resourcereq.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                input_resourcereqMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                input_resourcereqMouseExited(evt);
            }
        });
        input_resourcereq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_resourcereqActionPerformed(evt);
            }
        });
        add(input_resourcereq);
        input_resourcereq.setBounds(540, 470, 200, 60);

        input_random.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/input_panel/random_before.png"))); // NOI18N
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
        input_random.setBounds(170, 570, 120, 30);

        input_import.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/input_panel/import_before.png"))); // NOI18N
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
        input_import.setBounds(50, 570, 112, 30);

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

        input_minusresource.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/input_panel/remove_before.png"))); // NOI18N
        input_minusresource.setBorder(null);
        input_minusresource.setBorderPainted(false);
        input_minusresource.setContentAreaFilled(false);
        input_minusresource.setFocusPainted(false);
        input_minusresource.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                input_minusresourceMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                input_minusresourceMouseExited(evt);
            }
        });
        input_minusresource.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_minusresourceActionPerformed(evt);
            }
        });
        add(input_minusresource);
        input_minusresource.setBounds(230, 510, 40, 40);

        input_addresource.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/input_panel/adding_before.png"))); // NOI18N
        input_addresource.setBorder(null);
        input_addresource.setBorderPainted(false);
        input_addresource.setContentAreaFilled(false);
        input_addresource.setFocusPainted(false);
        input_addresource.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                input_addresourceMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                input_addresourceMouseExited(evt);
            }
        });
        input_addresource.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_addresourceActionPerformed(evt);
            }
        });
        add(input_addresource);
        input_addresource.setBounds(270, 510, 40, 40);

        input_minusprocess.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/input_panel/remove_before.png"))); // NOI18N
        input_minusprocess.setBorder(null);
        input_minusprocess.setBorderPainted(false);
        input_minusprocess.setContentAreaFilled(false);
        input_minusprocess.setFocusPainted(false);
        input_minusprocess.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                input_minusprocessMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                input_minusprocessMouseExited(evt);
            }
        });
        input_minusprocess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_minusprocessActionPerformed(evt);
            }
        });
        add(input_minusprocess);
        input_minusprocess.setBounds(230, 450, 40, 40);

        input_addprocess.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/input_panel/adding_before.png"))); // NOI18N
        input_addprocess.setBorder(null);
        input_addprocess.setBorderPainted(false);
        input_addprocess.setContentAreaFilled(false);
        input_addprocess.setFocusPainted(false);
        input_addprocess.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                input_addprocessMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                input_addprocessMouseExited(evt);
            }
        });
        input_addprocess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_addprocessActionPerformed(evt);
            }
        });
        add(input_addprocess);
        input_addprocess.setBounds(270, 450, 40, 40);

        input_addR.setEditable(false);
        input_addR.setFont(new java.awt.Font("Poppins SemiBold", 0, 18)); // NOI18N
        input_addR.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        input_addR.setText("0");
        input_addR.setBorder(null);
        input_addR.setOpaque(false);
        add(input_addR);
        input_addR.setBounds(170, 510, 40, 30);

        input_addP.setEditable(false);
        input_addP.setFont(new java.awt.Font("Poppins SemiBold", 0, 18)); // NOI18N
        input_addP.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        input_addP.setText("0");
        input_addP.setBorder(null);
        input_addP.setOpaque(false);
        add(input_addP);
        input_addP.setBounds(170, 450, 40, 30);

        input_resourcenum.setFont(new java.awt.Font("Poppins SemiBold", 0, 18)); // NOI18N
        input_resourcenum.setForeground(new java.awt.Color(255, 255, 255));
        input_resourcenum.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        input_resourcenum.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/input_panel/resource_container.png"))); // NOI18N
        add(input_resourcenum);
        input_resourcenum.setBounds(50, 500, 170, 50);

        input_processnum.setFont(new java.awt.Font("Poppins SemiBold", 0, 18)); // NOI18N
        input_processnum.setForeground(new java.awt.Color(255, 255, 255));
        input_processnum.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        input_processnum.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/input_panel/process_container.png"))); // NOI18N
        add(input_processnum);
        input_processnum.setBounds(50, 440, 170, 50);

        input_requesttableLabel.setFont(new java.awt.Font("Poppins SemiBold", 0, 18)); // NOI18N
        input_requesttableLabel.setForeground(new java.awt.Color(255, 255, 255));
        input_requesttableLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        input_requesttableLabel.setText("RESOURCE-REQUEST");
        add(input_requesttableLabel);
        input_requesttableLabel.setBounds(800, 190, 190, 40);

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
        input_maxtableLabel.setBounds(340, 100, 190, 40);

        input_alloctableLabel.setFont(new java.awt.Font("Poppins SemiBold", 0, 18)); // NOI18N
        input_alloctableLabel.setForeground(new java.awt.Color(255, 255, 255));
        input_alloctableLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        input_alloctableLabel.setText("ALLOCATION TABLE");
        add(input_alloctableLabel);
        input_alloctableLabel.setBounds(50, 100, 260, 40);

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

    private void input_resourcereqActionPerformed(java.awt.event.ActionEvent evt) {                                             
        Apportion.card.show(Apportion.mainPanel, "8");
    }                                            

    private void input_resourcereqMouseExited(java.awt.event.MouseEvent evt) {                                              
        input_resourcereq.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/input_panel/simulate.png")));
    }                                             

    private void input_resourcereqMouseEntered(java.awt.event.MouseEvent evt) {                                               
        input_resourcereq.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/input_panel/simulate_after.png")));
    }                                              

    private void input_minusresourceMouseEntered(java.awt.event.MouseEvent evt) {                                                 
        input_minusresource.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/input_panel/remove_after.png")));
    }                                                

    private void input_minusresourceMouseExited(java.awt.event.MouseEvent evt) {                                                
        input_minusresource.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/input_panel/remove_before.png")));
    }                                               

    private void input_minusresourceActionPerformed(java.awt.event.ActionEvent evt) {                                                    
        // TODO add your handling code here:
    }                                                   

    private void input_addresourceMouseEntered(java.awt.event.MouseEvent evt) {                                               
        input_addresource.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/input_panel/adding_after.png")));

          
    }                                              

    private void input_addresourceMouseExited(java.awt.event.MouseEvent evt) {                                              
        input_addresource.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/input_panel/adding_before.png")));
    }                                             

    private void input_addresourceActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        // TODO add your handling code here:

        javax.swing.table.DefaultTableModel alloc_model = (javax.swing.table.DefaultTableModel)input_alloctable.getModel();
          javax.swing.table.DefaultTableModel max_model = (javax.swing.table.DefaultTableModel)input_maxtable.getModel();
            alloc_model.setColumnCount(alloc_model.getColumnCount()+1);
            max_model.setColumnCount(max_model.getColumnCount()+1);
    }                                                 

    private void input_minusprocessMouseEntered(java.awt.event.MouseEvent evt) {                                                
        input_minusprocess.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/input_panel/remove_after.png")));
    }                                               

    private void input_minusprocessMouseExited(java.awt.event.MouseEvent evt) {                                               
        input_minusprocess.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/input_panel/remove_before.png")));
    }                                              

    private void input_minusprocessActionPerformed(java.awt.event.ActionEvent evt) {                                                   
        // TODO add your handling code here:
    }                                                  

    private void input_addprocessMouseEntered(java.awt.event.MouseEvent evt) {                                              
        input_addprocess.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/input_panel/adding_after.png")));
    }                                             

    private void input_addprocessMouseExited(java.awt.event.MouseEvent evt) {                                             
        input_addprocess.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/input_panel/adding_before.png")));
    }                                            

    private void input_addprocessActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        // TODO add your handling code here:
    }                          
             
    private javax.swing.JButton exit;
    private javax.swing.JTextField input_addP;
    private javax.swing.JTextField input_addR;
    private javax.swing.JButton input_addprocess;
    private javax.swing.JButton input_addresource;
    private javax.swing.JTable input_alloctable;
    private javax.swing.JLabel input_alloctableLabel;
    private javax.swing.JScrollPane input_alloctable_scroll;
    private javax.swing.JTable input_availtable;
    private javax.swing.JLabel input_availtableLabel;
    private javax.swing.JScrollPane input_availtable_scroll;
    private javax.swing.JLabel input_bg;
    private javax.swing.JButton input_import;
    private javax.swing.JTable input_maxtable;
    private javax.swing.JLabel input_maxtableLabel;
    private javax.swing.JScrollPane input_maxtable_scroll;
    private javax.swing.JButton input_minusprocess;
    private javax.swing.JButton input_minusresource;
    private javax.swing.JTable input_needtable;
    private javax.swing.JLabel input_needtableLabel;
    private javax.swing.JScrollPane input_needtable_scroll;
    private javax.swing.JLabel input_processnum;
    private javax.swing.JTable input_processtable;
    private javax.swing.JScrollPane input_processtable_scroll;
    private javax.swing.JButton input_random;
    private javax.swing.JTable input_requesttable;
    private javax.swing.JLabel input_requesttableLabel;
    private javax.swing.JScrollPane input_requesttable_scroll;
    private javax.swing.JLabel input_resourcenum;
    private javax.swing.JButton input_resourcereq;
    private javax.swing.JButton input_return;
    private javax.swing.JButton minimize;      
}
