import javax.swing.*;
import java.awt.*;

public class Apportion extends javax.swing.JFrame {
    public static JFrame mainFrame = new JFrame();
    public static JPanel mainPanel = new JPanel();
    public static CardLayout card = new CardLayout();
    
    public static SplashScreen splashScreen = new SplashScreen();
    public static MainMenu mainMenu = new MainMenu();
    public static Help help = new Help();
    public static About about = new About();
    public static Select select = new Select();
    public static ResourceReqPanel rreq = new ResourceReqPanel();
    public static Safety safe = new Safety();
    public static Output output = new Output();
    
    public static boolean sound = true;
    
    public Apportion() {
        
        mainFrame.setSize(1080, 720);
        mainFrame.setTitle("Apportion");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setUndecorated(true);
        
        mainPanel.setLayout(card);
        mainPanel.add(splashScreen, "1");
        mainPanel.add(mainMenu, "2");
        mainPanel.add(help, "3");
        mainPanel.add(about, "4");
        mainPanel.add(select, "5");
        mainPanel.add(rreq, "6");
        mainPanel.add(safe, "7");
        mainPanel.add(output, "8");
        
        mainFrame.add(mainPanel);
        mainFrame.pack();
        
        mainFrame.setVisible(true);
        mainFrame.setLocationRelativeTo(null);
        
        card.show(mainPanel, "1");
//        Music.bgMusic();
            
        new java.util.Timer().schedule(new java.util.TimerTask() {
            @Override
            public void run() {
                card.show(mainPanel, "2");
            }
        }, 2 * 1000); // Miliseconds
    }

    public static void main(String[] args) {
    
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Apportion();
            }
        });

       
    }
}