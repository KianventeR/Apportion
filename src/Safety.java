import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;

public class Safety extends javax.swing.JPanel {
    public Safety() {
        initComponents();
    }
    
    public void reset(){
        defaultprocess = 3;
        appendprocess = 0;
        defaultresource= defaultprocess;
        current_resource = appendprocess;

        removeAll();
        initComponents();
    }
    
    int defaultprocess = 3;
    int appendprocess = 0;
    int defaultresource= 3;
    int current_resource = 0;
    public int[][] alloc_array;
    public int[][] max_array;
    public int[] avail_array;

    public void table_design(JTable table){
        table.setFont(new java.awt.Font("Poppins", 0, 12)); 
        table.getTableHeader().setFont(new java.awt.Font("Poppins", 1, 12));
        table.getTableHeader().setOpaque(false);
        table.getTableHeader().setBackground(Color.LIGHT_GRAY);
    }

    public void initComponents() {
        appendprocess = defaultprocess; 
        current_resource = defaultresource; 
      
        exit = new javax.swing.JButton();
        minimize = new javax.swing.JButton();
        input_availtable_scroll = new javax.swing.JScrollPane();
        input_availtable = new javax.swing.JTable();
        input_maxtable_scroll = new javax.swing.JScrollPane();
        input_maxtable = new javax.swing.JTable();
        input_processtable_scroll = new javax.swing.JScrollPane();
        input_processtable = new javax.swing.JTable();
        input_alloctable_scroll = new javax.swing.JScrollPane();
        input_alloctable = new javax.swing.JTable();
        input_minusresource = new javax.swing.JButton();
        input_addresource = new javax.swing.JButton();
        input_minusprocess = new javax.swing.JButton();
        input_addprocess = new javax.swing.JButton();
        input_safety = new javax.swing.JButton();
        input_random = new javax.swing.JButton();
        input_import = new javax.swing.JButton();
        input_return = new javax.swing.JButton();
        input_addR = new javax.swing.JTextField();
        input_addP = new javax.swing.JTextField();
        input_resourcenum = new javax.swing.JLabel();
        input_processnum = new javax.swing.JLabel();
        input_availtableLabel = new javax.swing.JLabel();
        input_maxtableLabel = new javax.swing.JLabel();
        input_alloctableLabel = new javax.swing.JLabel();
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

        input_availtable_scroll.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        input_availtable_scroll.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        input_availtable.setFont(new java.awt.Font("Poppins", 0, 11)); 
        input_availtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null}
            },
            new String [] {
                "A", "B", "C"
            }
        ) {


            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class,
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class,
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class,
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class,
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class,
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        input_availtable.setColumnSelectionAllowed(true);
        input_availtable.setRowSelectionAllowed(true);
        input_availtable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        input_availtable.setFillsViewportHeight(false);
        input_availtable.setGridColor(new java.awt.Color(0, 0, 0));
        input_availtable.setIntercellSpacing(new java.awt.Dimension(0, 0));
        input_availtable.getTableHeader().setResizingAllowed(false);
        input_availtable.getTableHeader().setReorderingAllowed(false);


        input_availtable_scroll.setViewportView(input_availtable);
        input_availtable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (input_availtable.getColumnModel().getColumnCount() > 0) {
            input_availtable.getColumnModel().getColumn(0).setResizable(false);
            input_availtable.getColumnModel().getColumn(0).setPreferredWidth(90);
            input_availtable.getColumnModel().getColumn(1).setResizable(false);
            input_availtable.getColumnModel().getColumn(1).setPreferredWidth(90);
            input_availtable.getColumnModel().getColumn(2).setResizable(false);
            input_availtable.getColumnModel().getColumn(2).setPreferredWidth(90);
        }

        add(input_availtable_scroll);
        input_availtable_scroll.setBounds(710, 140, 270, 70);

        input_maxtable.setFont(new java.awt.Font("Poppins", 0, 11)); 
        input_maxtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "A", "B", "C"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class,
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class,
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class,
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class,
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class,
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        input_maxtable.setColumnSelectionAllowed(true);
        input_maxtable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        input_maxtable.setGridColor(new java.awt.Color(0, 0, 0));
        input_maxtable.setIntercellSpacing(new java.awt.Dimension(0, 0));
        input_maxtable.getTableHeader().setResizingAllowed(false);
        input_maxtable.getTableHeader().setReorderingAllowed(false);
        input_maxtable_scroll.setViewportView(input_maxtable);
        input_maxtable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        
            input_maxtable.getColumnModel().getColumn(0).setResizable(false);
            input_maxtable.getColumnModel().getColumn(0).setPreferredWidth(90);
            input_maxtable.getColumnModel().getColumn(1).setResizable(false);
            input_maxtable.getColumnModel().getColumn(1).setPreferredWidth(90);
            input_maxtable.getColumnModel().getColumn(2).setResizable(false);
            input_maxtable.getColumnModel().getColumn(2).setPreferredWidth(90);
        

        add(input_maxtable_scroll);
        input_maxtable_scroll.setBounds(430, 140, 270, 280);
        

        input_processtable.setFont(new java.awt.Font("Poppins", 0, 11)); 
        input_processtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"P1"},
                {"P2"},
                {"P3"}

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
        input_processtable.setFillsViewportHeight(false);
        input_processtable.setGridColor(new java.awt.Color(0, 0, 0));
        input_processtable.setIntercellSpacing(new java.awt.Dimension(0, 0));
        input_processtable.getTableHeader().setResizingAllowed(false);
        input_processtable.getTableHeader().setReorderingAllowed(false);
        input_processtable_scroll.setViewportView(input_processtable);
        input_processtable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (input_processtable.getColumnModel().getColumnCount() > 0) {
            input_processtable.getColumnModel().getColumn(0).setResizable(false);
            input_processtable.getColumnModel().getColumn(0).setPreferredWidth(50);
        }

        add(input_processtable_scroll);
        input_processtable_scroll.setBounds(90, 140, 60, 280);

        

        input_alloctable.setFont(new java.awt.Font("Poppins", 0, 11)); 
        input_alloctable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "A", "B", "C"
            }
        ){
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class,
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class,
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class,
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class,
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class,
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        input_alloctable.setColumnSelectionAllowed(true);
        input_alloctable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        input_alloctable.setFillsViewportHeight(false);
        input_alloctable.setGridColor(Color.black);
        input_alloctable.setIntercellSpacing(new java.awt.Dimension(0, 0));
        input_alloctable.getTableHeader().setResizingAllowed(false);
        input_alloctable.getTableHeader().setReorderingAllowed(false);
        input_alloctable_scroll.setViewportView(input_alloctable);
        
        input_alloctable.getColumnModel().getColumn(0).setResizable(false);
        input_alloctable.getColumnModel().getColumn(0).setPreferredWidth(90);
        input_alloctable.getColumnModel().getColumn(1).setResizable(false);
        input_alloctable.getColumnModel().getColumn(1).setPreferredWidth(90);
        input_alloctable.getColumnModel().getColumn(2).setResizable(false);
        input_alloctable.getColumnModel().getColumn(2).setPreferredWidth(90);

        add(input_alloctable_scroll);
        input_alloctable_scroll.setBounds(150, 140, 270, 280);

        input_minusresource.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/input_panel/remove_before.png"))); 
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
        input_minusresource.setBounds(270, 510, 40, 40);

        input_addresource.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/input_panel/adding_before.png"))); 
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
        input_addresource.setBounds(310, 510, 40, 40);

        input_minusprocess.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/input_panel/remove_before.png"))); 
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
        input_minusprocess.setBounds(270, 450, 40, 40);
        input_minusprocess.setEnabled(false);

        input_addprocess.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/input_panel/adding_before.png"))); 
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
        input_addprocess.setBounds(310, 450, 40, 40);

        input_safety.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/input_panel/simulate.png"))); 
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
                input_simulate(evt);
            }
        });
        add(input_safety);
        input_safety.setBounds(540, 470, 200, 60);

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
        input_random.setBounds(210, 570, 120, 30);

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
        input_import.setBounds(90, 570, 112, 30);

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

        input_addR.setEditable(false);
        input_addR.setFont(new java.awt.Font("Poppins SemiBold", 0, 18)); 
        input_addR.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        input_addR.setText("0");
        input_addR.setBorder(null);
        input_addR.setOpaque(false);
        add(input_addR);
        input_addR.setBounds(210, 510, 40, 30);

        input_addP.setEditable(false);
        input_addP.setFont(new java.awt.Font("Poppins SemiBold", 0, 18)); 
        input_addP.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        input_addP.setText("0");
        input_addP.setBorder(null);
        input_addP.setOpaque(false);
        add(input_addP);
        input_addP.setBounds(210, 450, 40, 30);

        input_resourcenum.setFont(new java.awt.Font("Poppins SemiBold", 0, 18)); 
        input_resourcenum.setForeground(new java.awt.Color(255, 255, 255));
        input_resourcenum.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        input_resourcenum.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/input_panel/resource_container.png"))); 
        add(input_resourcenum);
        input_resourcenum.setBounds(90, 500, 170, 50);

        input_processnum.setFont(new java.awt.Font("Poppins SemiBold", 0, 18)); 
        input_processnum.setForeground(new java.awt.Color(255, 255, 255));
        input_processnum.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        input_processnum.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/input_panel/process_container.png"))); 
        add(input_processnum);
        input_processnum.setBounds(90, 440, 170, 50);

        input_availtableLabel.setFont(new java.awt.Font("Poppins SemiBold", 0, 18)); 
        input_availtableLabel.setForeground(new java.awt.Color(255, 255, 255));
        input_availtableLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        input_availtableLabel.setText("AVAILABLE");
        add(input_availtableLabel);
        input_availtableLabel.setBounds(710, 100, 190, 40);

        input_maxtableLabel.setFont(new java.awt.Font("Poppins SemiBold", 0, 18)); 
        input_maxtableLabel.setForeground(new java.awt.Color(255, 255, 255));
        input_maxtableLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        input_maxtableLabel.setText("MAX TABLE");
        add(input_maxtableLabel);
        input_maxtableLabel.setBounds(430, 100, 190, 40);

        input_alloctableLabel.setFont(new java.awt.Font("Poppins SemiBold", 0, 18)); 
        input_alloctableLabel.setForeground(new java.awt.Color(255, 255, 255));
        input_alloctableLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        input_alloctableLabel.setText("ALLOCATION TABLE");
        add(input_alloctableLabel);
        input_alloctableLabel.setBounds(90, 100, 260, 40);

        input_bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/input_panel/input_background.png"))); 
        input_bg.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        input_bg.setOpaque(true);
        add(input_bg);
        input_bg.setBounds(0, 0, 1080, 720);

        table_design(input_alloctable);
        table_design(input_processtable);
        table_design(input_maxtable);
        table_design(input_availtable);

        input_addP.setText(String.valueOf(appendprocess));
        input_addR.setText(String.valueOf(current_resource));
    }

    public void minimizeMouseEntered(java.awt.event.MouseEvent evt) {
        minimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/buttons/min_after.png")));
    }

    public void minimizeMouseExited(java.awt.event.MouseEvent evt) {
        minimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/buttons/min_before.png")));
    }

    public void minimizeActionPerformed(java.awt.event.ActionEvent evt) {
        Music.sfx();
        Apportion.mainFrame.setState(java.awt.Frame.ICONIFIED);
    }

    public void exitMouseEntered(java.awt.event.MouseEvent evt) {
        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/buttons/close_after.png")));
    }

    public void exitMouseExited(java.awt.event.MouseEvent evt) {
        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/buttons/close_before.png")));
    }

    public void exitActionPerformed(java.awt.event.ActionEvent evt) {
        Music.sfx();
        System.exit(0);
    }

    public void input_returnMouseEntered(java.awt.event.MouseEvent evt) {
        input_return.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/buttons/return_after.png")));
    }

    public void input_returnMouseExited(java.awt.event.MouseEvent evt) {
        input_return.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/buttons/return_before.png")));
    }

    public void input_returnActionPerformed(java.awt.event.ActionEvent evt) {
        Music.sfx();
        
        Apportion.card.show(Apportion.mainPanel, "2");
        reset();
    }

    public void input_importMouseEntered(java.awt.event.MouseEvent evt) {
        input_import.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/input_panel/import_after.png")));
    }

    public void input_importMouseExited(java.awt.event.MouseEvent evt) {
        input_import.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/input_panel/import_before.png")));
    }
   
   
    public void input_importActionPerformed(java.awt.event.ActionEvent evt) {
        Music.sfx();

        alloc = access_models(input_alloctable, "alloc");
        max = access_models(input_maxtable, "max");
        process = access_models(input_processtable, "process");
        available = access_models(input_availtable, "avail");

        final JFileChooser fc = new JFileChooser();
        fc.showOpenDialog(null);
        File file = fc.getSelectedFile();

        
        try (Scanner read = new Scanner(file)) {
            String string_process = " ";
            String string_resource = " ";
            String temp = " ";
            String int_temp = " ";
            
            for(int i = 0; i < 4; i++){
                string_process = read.next();
            }
            for(int i = 0; i < 4; i++){
                string_resource = read.next();
            }
           
            int process_no = Integer.valueOf(string_process);
            int resource_no = Integer.valueOf(string_resource);
            alloc.setRowCount(process_no);
            alloc.setColumnCount(resource_no);
            max.setRowCount(process_no);
            max.setColumnCount(resource_no);
            for(int i = 0; i < process_no; i++){
            process.setRowCount(i + 1);
            process.setValueAt("P" + (i + 1), i, 0);
            }
            available.setColumnCount(resource_no);
            temp = read.next();

            if(temp.equals("Alloc")){
                for(int row = 0; row < process_no; row++){
                    for(int col = 0; col < resource_no; col++){
                        
                        int_temp = read.next();
                        if(int_temp.equals("Max")){
                            break;
                        }
                        else{
                            int value = Integer.valueOf(int_temp);
                            alloc.setValueAt(value, row, col);
                        }
                    }
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "Follow proper format!");
                return;
            }

            temp = read.next();
            if(temp.equals("Max")){
                for(int row = 0; row < process_no; row++){
                    for(int col = 0; col < resource_no; col++){
                        
                        int_temp = read.next();
                        if(int_temp.equals("Available")){
                            break;
                        }
                        else{
                            int value = Integer.valueOf(int_temp);
                            max.setValueAt(value, row, col);
                        }
                    }
                }
            }

            temp = read.next();
            if (temp.equals("Available")) {
               
                for(int col = 0; col < resource_no; col++){
                    int_temp = read.next();
                    if (int_temp.equals("Resource-Request")) {
                        break;
                    } else {
                        int value = Integer.valueOf(int_temp);
                        available.setValueAt(value, 0, col);
                    }
                }
            }

           appendprocess = process_no;
           current_resource = resource_no;

           input_addP.setText(String.valueOf(appendprocess));
           input_addR.setText(String.valueOf(current_resource));
        } catch (Exception e) {}
    }   

    public void input_randomMouseEntered(java.awt.event.MouseEvent evt) {
        input_random.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/input_panel/random_after.png")));
    }

    public void input_randomMouseExited(java.awt.event.MouseEvent evt) {
        input_random.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/input_panel/random_before.png")));
    }

    public void input_randomActionPerformed(java.awt.event.ActionEvent evt) {                                             
        Music.sfx();

        int upperbound, lowerbound, seed;
        upperbound = 20;
        lowerbound = 0;   
        seed = (int) System.currentTimeMillis();
        Random rand = new Random(seed);
        int random_int = rand.nextInt(upperbound-lowerbound) + lowerbound;

        for(int col = 0; col < current_resource; col++){
            for(int row = 0; row < appendprocess; row++){
                max = access_models(input_maxtable, "max");
                alloc = access_models(input_alloctable, "alloc");
                available = access_models(input_availtable, "avail");


                max.setValueAt(random_int, row, col);
                random_int = rand.nextInt((int)(max.getValueAt(row, col))-lowerbound + 1) + lowerbound;
                alloc.setValueAt(random_int, row, col);
                random_int = rand.nextInt(upperbound-lowerbound) + lowerbound;
           
                
            }
        }
           for(int i = 0; i < current_resource; i++){
            available.setValueAt(random_int, 0, i);
            random_int = rand.nextInt(upperbound-lowerbound) + lowerbound;
           }

    } 

    public void input_simulate(java.awt.event.ActionEvent evt) {
        Music.sfx();
        max = access_models(input_maxtable, "max");
        alloc = access_models(input_alloctable, "alloc");
        available = access_models(input_availtable, "avail");
        SafetyAlgorithm safety_algo = new SafetyAlgorithm();
       
        
        for (int i = 0; i < appendprocess; i++){
            for(int j = 0; j < current_resource; j++){
                if(max.getValueAt(i, j) != null && alloc.getValueAt(i, j) != null){
                    continue;
                }

                else{
                    JOptionPane.showMessageDialog(null, "Fill all cells!");
                    return;
                }
            }
        }

        for(int i = 0; i < current_resource; i++){
            if(available.getValueAt(0, i) != null){
                continue;
            }
            
            else{
                JOptionPane.showMessageDialog(null, "Fill all cells!");
                return;
            }
           }

        alloc_array = createAlloc(alloc, appendprocess, current_resource);
        max_array = createMax(max, appendprocess, current_resource);
        avail_array = createAvail(available, appendprocess, current_resource);
        int[][] need_array = new int[appendprocess][current_resource];
        
        DefaultTableModel need_model = (DefaultTableModel) Apportion.output.input_needtable.getModel(); 
        need_model.setColumnCount(current_resource);
        need_model.setRowCount(appendprocess);
        
        for(int row = 0; row < appendprocess; row++){
            for(int col = 0; col < current_resource; col++){
                need_array[row][col] = max_array[row][col] - alloc_array[row][col];
                need_model.setValueAt(need_array[row][col], row, col);
            
            }
        }
        
        // safety algorithm simulation
        timer = new Timer(500, new ActionListener() {
            
            public void actionPerformed(ActionEvent evt){
                if(stopTimer){
                    timer.stop();
                }
                String display_help = "";
                if(safety_algo.getStep() < 5){
                    // show step
                    step = safety_algo.getStep();
                    // add if-else for every step
                    if(step == 1){
                         // simulate first
                        safety_algo.simulate(avail_array, alloc_array, need_array);
                        display_help += "Step 1 -> ";
                        display_help += "Work = Available\n";
                        display_help += "Work array: ";
                        int[] work = safety_algo.getWork();
                        for(int i = 0; i < safety_algo.getResources(); i++){
                            display_help += work[i] + " ";
                        }
                        display_help += "\n";
                        
                        Boolean[] finish = safety_algo.getFinish();
                        display_help += "Finish array: ";
                        for(int i = 0; i < safety_algo.getProcesses(); i++){
                            display_help += finish[i] + " ";
                        }
                    }else if(step == 2){
                        Apportion.output.input_boxcheckbg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/input_panel/boxcheck.png")));
                        int process = safety_algo.getProcess();
                        int resource = safety_algo.getResource();
                        display_help += "Step 2 ";
                        display_help += "for Process "+process+" and Resource "+resource+"\n";
                        
                        // simulate first
                        safety_algo.simulate(avail_array, alloc_array, need_array);
        
                        int [][] needCopy = safety_algo.getNeed();
                        int [] work = safety_algo.getWork();
                        display_help += "Need["+process+"]["+resource+"]: "+needCopy[process][resource]+"\n";
                        display_help += "Work"+"["+resource+"]: "+work[resource]+"\n";
                        // show result
                        Boolean hasWork = safety_algo.getHasWork();
                        display_help += "Can be executed? : "+hasWork;
                        if(hasWork){
                           Apportion.output.input_boxcheckbg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/input_panel/boxcheck_right.png"))); 
                        }
                        else{
                            Apportion.output.input_boxcheckbg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/input_panel/boxcheck_wrong.png")));
                        }
        
                    }else if(step == 3){
                        Apportion.output.input_boxcheckbg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/input_panel/boxcheck.png")));
                        Boolean[] finish = safety_algo.getFinish();
                         Boolean hasWork = safety_algo.getHasWork();
                         int process = safety_algo.getProcess();
                         display_help += "Step 3 ";
                         display_help += "for Process "+process+"\n";
                         display_help += "finish["+process+"]"+finish[process]+" and "+"hasWork: "+hasWork+"\n";
                         if(hasWork){
                            display_help += "So, Process "+process+" should be executed\n";
                         }else{
                            display_help += "So, Process "+process+" should wait\n";
                         }

                        // simulate first
                        safety_algo.simulate(avail_array, alloc_array, need_array);
        
                        int worked = safety_algo.getWorked();
                        display_help += "checked processes: "+worked+"\n";
        
                    }else if(step == 4){
                         // simulate first
                         Apportion.output.input_boxcheckbg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/input_panel/boxcheck.png")));
                         safety_algo.simulate(avail_array, alloc_array, need_array);
        
                        Boolean[] finish = safety_algo.getFinish();
                        Boolean safe = safety_algo.isSafe();
                        display_help += "Finished processes: \n";
                        for(int i = 0; i < safety_algo.getProcesses(); i++){
                            if(finish[i]){
                                display_help += (i+1) + " ";
                            }
                            
                        }
                        display_help += "\nSafe state found: "+safe;
                    }else{}
                }
                Apportion.output.help_01.setText(display_help);
                String sequence_display = "";
                int[] safeSeq = safety_algo.getSafetySequence();
                for(int i = 0; i < safeSeq.length; i++){
                    int display_num = safeSeq[i]+1;
                    
                    if(i < safeSeq.length - 1){
                        sequence_display += ("P"+display_num+ "->");
                    }else{
                        sequence_display += ("P"+display_num);
                    }
                }
                if(safety_algo.getStep() == 5 && safety_algo.isSafe()){
                    Apportion.output.input_seqText.setText(sequence_display);
                }else{
                    Apportion.output.input_seqText.setText("NO SAFETY SEQUENCE");
                }
                if(safety_algo.getStep() == 5 || stopTimer){
                    timer.stop();
                }
                int[] work = safety_algo.getWork();
                for(int i = 0; i < work.length; i++){
                    available.setValueAt(work[i], 0, i);
                }
            }
            
        });
        if(!timer.isRunning()){
            timer.start();
        }
       
        Apportion.output.initiateDisables("from_safety");
        Apportion.output.input_alloctable_scroll.setViewportView(input_alloctable);
        Apportion.output.input_processtable_scroll.setViewportView(input_processtable);
        Apportion.output.input_maxtable_scroll.setViewportView(input_maxtable);
        Apportion.output.input_availtable_scroll.setViewportView(input_availtable);
        Apportion.card.show(Apportion.mainPanel, "8");
        
    }

    

    public int[][] createAlloc(DefaultTableModel allocations, int p, int r) {
        int alloc_array[][] = new int [p][r];

        for(int row = 0; row < p; row++){
            for(int col = 0; col < r; col++){
                alloc_array[row][col] = (int) allocations.getValueAt(row, col);
            }
        }
        return alloc_array;
    }

    public int[][] createMax(DefaultTableModel max,int p, int r) {
        int max_array[][] = new int [p][r];
        for(int row = 0; row < p; row++){
            for(int col = 0; col < r; col++){
                max_array[row][col] = (int) max.getValueAt(row, col);
            }
        }
        return max_array;
    }

    public int[] createAvail(DefaultTableModel avail,int p, int r) {
        int avail_array[] = new int [r];
        for(int col = 0; col < r; col++){
                avail_array[col] = (int) avail.getValueAt(0, col);
        }
        return avail_array;
    }



    public void input_safetyMouseExited(java.awt.event.MouseEvent evt) {                                         
        input_safety.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/input_panel/simulate.png")));
    }                                        

    public void input_safetyMouseEntered(java.awt.event.MouseEvent evt) {                                          
        input_safety.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/input_panel/simulate_after.png")));
    }                                         

    public void input_addprocessMouseEntered(java.awt.event.MouseEvent evt) {                                              
        input_addprocess.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/input_panel/adding_after.png")));
    }                                             

    public void input_addprocessMouseExited(java.awt.event.MouseEvent evt) {                                             
        input_addprocess.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/input_panel/adding_before.png")));
    }                                            
    
    javax.swing.table.DefaultTableModel process, max, alloc, available;

    public void input_addprocessActionPerformed(java.awt.event.ActionEvent evt) {    
        Music.sfx();
        input_minusprocess.setEnabled(true);

        process = access_models(input_processtable, "process");
        max = access_models(input_maxtable, "max");
        alloc = access_models(input_alloctable, "alloc");
         
        process.setRowCount(process.getRowCount() + 1);
        
        max.setRowCount(max.getRowCount() + 1);
        alloc.setRowCount(alloc.getRowCount() + 1);

        process.setValueAt("P"+ process.getRowCount(), process.getRowCount()-1, 0);
        appendprocess++;
        input_addP.setText(String.valueOf(appendprocess));
    }                                                

    public javax.swing.table.DefaultTableModel access_models(JTable table, String name) {
        
        javax.swing.table.DefaultTableModel process_model = (javax.swing.table.DefaultTableModel)input_processtable.getModel();
        javax.swing.table.DefaultTableModel alloc_model = (javax.swing.table.DefaultTableModel)input_alloctable.getModel();
        javax.swing.table.DefaultTableModel max_model = (javax.swing.table.DefaultTableModel)input_maxtable.getModel();
        javax.swing.table.DefaultTableModel avail_model = (javax.swing.table.DefaultTableModel)input_availtable.getModel();
        
        if(name == "process"){return process_model;}
        if(name == "alloc"){return alloc_model;}
        if(name == "max"){return max_model;}
        if(name == "avail"){return avail_model;}
        return null;
    }

    public void input_minusprocessMouseEntered(java.awt.event.MouseEvent evt) {                                                
        input_minusprocess.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/input_panel/remove_after.png")));
    }                                               

    public void input_minusprocessMouseExited(java.awt.event.MouseEvent evt) {                                               
        input_minusprocess.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/input_panel/remove_before.png")));
    }                                              

    public void input_minusprocessActionPerformed(java.awt.event.ActionEvent evt) {
        Music.sfx();
        int getRowCount = process.getRowCount();
        if(getRowCount > 3){
        
        process = access_models(input_alloctable, "process");
        max = access_models(input_maxtable, "max");
        alloc = access_models(input_alloctable, "alloc");
        
            process.setRowCount(process.getRowCount() - 1);
            max.setRowCount(max.getRowCount() - 1);
            alloc.setRowCount(alloc.getRowCount() - 1);
            appendprocess--;
            input_addP.setText(String.valueOf(appendprocess));
        }
    }                                                  

    public void input_minusresourceMouseEntered(java.awt.event.MouseEvent evt) {                                                 
        input_minusresource.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/input_panel/remove_after.png")));
    }                                                

    public void input_minusresourceMouseExited(java.awt.event.MouseEvent evt) {                                                
        input_minusresource.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/input_panel/remove_before.png")));
    }                                               

    public void input_minusresourceActionPerformed(java.awt.event.ActionEvent evt) {        
        Music.sfx();                
        javax.swing.table.DefaultTableModel alloc_model = (javax.swing.table.DefaultTableModel)input_alloctable.getModel();
        javax.swing.table.DefaultTableModel max_model = (javax.swing.table.DefaultTableModel)input_maxtable.getModel();
        javax.swing.table.DefaultTableModel avail_model = (javax.swing.table.DefaultTableModel)input_availtable.getModel();
       ;
        if( current_resource > 3){     
          alloc_model.setColumnCount(alloc_model.getColumnCount()-1);
          max_model.setColumnCount(max_model.getColumnCount()-1);
          avail_model.setColumnCount(avail_model.getColumnCount()-1);
          current_resource--;
          input_addR.setText(String.valueOf(current_resource));
        }
    }

    public void input_addresourceMouseEntered(java.awt.event.MouseEvent evt) {                                               
       input_addresource.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/input_panel/adding_after.png")));
    }                                              

    public void input_addresourceMouseExited(java.awt.event.MouseEvent evt) {                                              
        input_addresource.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/input_panel/adding_before.png")));
    }                                             

    public void input_addresourceActionPerformed(java.awt.event.ActionEvent evt) {         
        Music.sfx();

        javax.swing.table.DefaultTableModel alloc_model = (javax.swing.table.DefaultTableModel)input_alloctable.getModel();
        javax.swing.table.DefaultTableModel max_model = (javax.swing.table.DefaultTableModel)input_maxtable.getModel();
        javax.swing.table.DefaultTableModel avail_model = (javax.swing.table.DefaultTableModel)input_availtable.getModel();
          
       try {
            alloc_model.setColumnCount(alloc_model.getColumnCount()+1);
            max_model.setColumnCount(max_model.getColumnCount()+1);
            avail_model.setColumnCount(avail_model.getColumnCount()+1);

            current_resource++;
            input_addR.setText(String.valueOf(current_resource));

       } catch (Exception e) {}
        
    }     

    public javax.swing.JButton exit;
    public javax.swing.JTextField input_addP;
    public javax.swing.JTextField input_addR;
    public javax.swing.JButton input_addprocess;
    public javax.swing.JButton input_addresource;
    javax.swing.JTable input_alloctable;
    public javax.swing.JLabel input_alloctableLabel;
    public javax.swing.JScrollPane input_alloctable_scroll;
    javax.swing.JTable input_availtable;
    public javax.swing.JLabel input_availtableLabel;
    public javax.swing.JScrollPane input_availtable_scroll;
    public javax.swing.JLabel input_bg;
    public javax.swing.JButton input_import;
    public javax.swing.JTable input_maxtable;
    public javax.swing.JLabel input_maxtableLabel;
    public javax.swing.JScrollPane input_maxtable_scroll;
    public javax.swing.JButton input_minusprocess;
    public javax.swing.JButton input_minusresource;
    public javax.swing.JLabel input_processnum;
    public javax.swing.JTable input_processtable;
    public javax.swing.JScrollPane input_processtable_scroll;
    public javax.swing.JButton input_random;
    public javax.swing.JLabel input_resourcenum;
    public javax.swing.JButton input_return;
    public javax.swing.JButton input_safety;
    public javax.swing.JButton minimize;
    public Timer timer;
    public int step;
    public Boolean stopTimer = false;
}
