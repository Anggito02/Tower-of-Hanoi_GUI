
/**
 * Home Frame for Tower of Hanoi Application
 *
 * @author Anggito Anju
 * @version 1.0 - 05 June 2021
 */

 import java.awt.*;
 import java.awt.event.*;
 import javax.swing.*;

public class HomeFrame implements ActionListener
{
    /* ===== PRIVATE VARIABLE FOR HOME FRAME ===== */
    // Frame
    public JFrame homeFrame = new JFrame("Tower of Hanoi");

    // Home Panel
    private JPanel homePanel = new JPanel();
    // Labels
    private JLabel versionHomePanel = new JLabel("VER 1.0");
    private JLabel titleHomePanel = new JLabel("Tower of Hanoi");
    private JLabel smallTitleHomePanel = new JLabel("Art of Recursion");
    // Buttons
    private JButton playButton = new JButton("PLAY");

    // Author Panel
    private JPanel authorPanel = new JPanel();
    // Labels
    private JLabel authorCredit = new JLabel("Designed and Coded by Anggito Anju");

    /* ===== PRIMARY VARIABLE ===== */
    public static int diskAmount;

    /* ===== UTILITY ===== */
    private Font f1 = new Font(Font.SANS_SERIF, Font.BOLD, 30);
    private Font f2 = new Font(Font.SERIF, Font.BOLD, 16);
    private Font f3 = new Font(Font.SERIF, Font.BOLD, 18);
    private Font f4 = new Font(Font.SERIF, Font.BOLD, 14);
    private Font f5 = new Font(Font.SERIF, Font.PLAIN, 13);

    private Color c1 = new Color(42, 107, 244);
    private Color c2 = new Color(104, 164, 244);
    private Color c3 = new Color(5, 29, 61);

    // Constructur for Home Frame
    public HomeFrame() {
        initComponents();
    }

    // Components Method
    private void initComponents() {
        /* ========== CONTAINER SETTINGS ========== */
        homeFrame.setSize(480, 600);
        homeFrame.setLocationRelativeTo(null);
        homeFrame.setLayout(new BorderLayout());
        homeFrame.setResizable(false);
        homeFrame.setVisible(true);
        homeFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        /* ===== ADD PANELS ===== */
        homeFrame.add(homePanel, BorderLayout.PAGE_START);
        homeFrame.add(authorPanel, BorderLayout.PAGE_END);

        /* ========== END CONTAINER SETTINGS ========== */
        
        /* ========== COMPONENTS SETTINGS ========== */
        /* ===== HOME PANEL ===== */
        homePanel.setBackground(c1);
        homePanel.setPreferredSize(new Dimension(480, 520));
        homePanel.setLayout(null);

        versionHomePanel.setBounds(398, 10, 68, 22);
        versionHomePanel.setFont(f4);
        versionHomePanel.setForeground(Color.BLACK);

        titleHomePanel.setBounds(125, 200, 225, 30);
        titleHomePanel.setFont(f1);
        titleHomePanel.setForeground(Color.WHITE);
        
        smallTitleHomePanel.setBounds(168, 240, 140, 24);
        smallTitleHomePanel.setFont(f3);
        smallTitleHomePanel.setForeground(Color.BLACK);

        playButton.setBounds(185, 300, 100, 30);
        playButton.setBackground(c2);
        playButton.setFont(f2);
        playButton.setForeground(c3);

        // PLAY BUTTON EVENT
        playButton.addActionListener(this);

        homePanel.add(versionHomePanel);
        homePanel.add(titleHomePanel);
        homePanel.add(smallTitleHomePanel);
        homePanel.add(playButton);
        /* ===== END HOME PANEL ===== */

        /* ===== AUTHOR PANEL ===== */
        authorPanel.setBackground(c2);
        authorPanel.setPreferredSize(new Dimension(480, 45));
        authorPanel.setLayout(null);

        authorCredit.setBounds(250, 12, 200, 20);
        authorCredit.setFont(f5);
        authorCredit.setForeground(Color.BLACK);

        authorPanel.add(authorCredit);

        /* ===== END AUTHOR PANEL ===== */
    }

    public static void diskInput(int num) {
        if(num <= 7 && diskAmount > 0) {
            new PlayFrame();
        }
        else {
            JOptionPane.showMessageDialog(null, "Must be integer 1-7", "Wrong Input", JOptionPane.ERROR_MESSAGE);
            new HomeFrame();
        }   
    }

    public static void main(String[] args) {
        new HomeFrame();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        homeFrame.dispose();
        String inputUser = JOptionPane.showInputDialog("Masukkan banyak disk (1-7)");
        diskAmount = Integer.parseInt(inputUser);
        diskInput(diskAmount);
    }
}
