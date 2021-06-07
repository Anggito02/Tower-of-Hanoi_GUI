
/**
 * Play Frame for Tower of Hanoi Application
 *
 * @author Anggito Anju
 * @version 1.0 - 05 June 2021
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PlayFrame implements ActionListener
{
    /* ===== PRIMARY USER VARIABLE ===== */
    public int movesCounter = 0;

    /* ===== PRIVATE VARIABLE FOR PLAY FRAME ===== */
    // Creating frame
    public static JFrame playFrame = new JFrame("Tower of Hanoi");

    // Upper Panel
    private JPanel upperPanel = new JPanel();
    // Buttons
    private JButton animateButton = new JButton("Animate");
    private JButton resetButton = new JButton("Reset");

    playPanel towerPanel = new playPanel();
    /*// Play Panel
    private JPanel playPanel = new JPanel();
    // Buttons 
    private JButton inputButton = new JButton("INPUT DISK");
    // Labels
    private JLabel playPanelTitle = new JLabel("Tower of Hanoi");
    */

    // Answer Panel
    private JPanel ansPanel = new JPanel();
    // Labels
    private JLabel ansCounter = new JLabel("Moves : " + movesCounter);
    // Text Fields
    private JTextArea ansCounterField = new JTextArea();
    // Buttons
    private JButton backToHomeButton = new JButton("Home");

    /* ===== END PRIVATE VARIABLE FOR PLAY FRAME ===== */

    /* ===== UTILITY ===== */
    private Font f1 = new Font(Font.SANS_SERIF, Font.BOLD, 18);
    private Font f2 = new Font(Font.SERIF, Font.BOLD, 16);
    private Font f3 = new Font(Font.SERIF, Font.BOLD, 14);

    private Color c1 = new Color(104, 164, 244);
    private Color c2 = new Color(5, 29, 61);
    private Color c3 = new Color(42, 107, 244);

    // Constructur for Play Frame
    public PlayFrame() {
        initComponents();
    }

    private void initComponents() {
        /* ========== CONTAINER SETTINGS ========== */
        playFrame.setSize(480, 600);
        playFrame.setLocationRelativeTo(null);
        playFrame.setLayout(null);
        playFrame.setResizable(false);
        playFrame.setVisible(true);
        playFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        /* ===== ADD PANELS ===== */
        playFrame.add(upperPanel);
        playFrame.add(towerPanel);
        //playFrame.add(playPanel);
        playFrame.add(ansPanel);

        /* ========== END CONTAINER SETTINGS ========== */

        /* ========== COMPONENTS SETTINGS ========== */

        /* ===== UPPER PANEL ===== */
        upperPanel.setBounds(0, 0, 480, 120);
        upperPanel.setBackground(c2);
        upperPanel.setLayout(null);

        animateButton.setBounds(100, 50, 100, 30);
        animateButton.setFont(f2);
        animateButton.setForeground(c2);
        animateButton.setBackground(c1);

        resetButton.setBounds(280, 50, 100, 30);
        resetButton.setFont(f2);
        resetButton.setForeground(c2);
        resetButton.setBackground(c1);
        // Button Event
        resetButton.addActionListener(this);
        resetButton.setActionCommand("RESET");

        upperPanel.add(animateButton);
        upperPanel.add(resetButton);

        /* ===== END UPPER PANEL ===== */

        /* ===== PLAY PANEL ===== */
        /*playPanel.setBounds(0, 120, 320, 480);
        playPanel.setBackground(c1);
        playPanel.setLayout(null);

        inputButton.setBounds(90, 20, 140, 30);
        inputButton.setFont(f2);
        inputButton.setForeground(c2);
        inputButton.setBackground(c3);
        // Button Event
        inputButton.addActionListener(this);
        inputButton.setActionCommand("INPUT");

        playPanelTitle.setBounds(90, 60, 140, 30);
        playPanelTitle.setFont(f1);
        playPanelTitle.setForeground(Color.WHITE);

        playPanel.add(playPanelTitle);
        playPanel.add(inputButton);*/

        /* ===== END PLAY PANEL ===== */

        /* ===== ANS PANEL ===== */
        ansPanel.setBounds(320, 120, 160, 480);
        ansPanel.setBackground(c3);
        ansPanel.setLayout(null);

        ansCounter.setBounds(40, 20, 60, 30);
        ansCounter.setFont(f3);
        ansCounter.setForeground(c2);

        ansCounterField.setBounds(10, 60, 125, 320);

        backToHomeButton.setBounds(10, 400, 125, 30);
        // Button Event
        backToHomeButton.addActionListener(this);
        backToHomeButton.setActionCommand("Home");

        ansPanel.add(ansCounter);
        ansPanel.add(ansCounterField);
        ansPanel.add(backToHomeButton);
        /* ===== END ANS PANEL ===== */

    }

    /* ===== DRAW SHAPES ===== */
    /*public void paint(Graphics g) {
        Graphics2D g2D = (Graphics2D) g;

        g2D.drawRect(320, 320, 50, 50);
    }*/

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        if(command == "Home") {
            playFrame.dispose();
            new HomeFrame();
        }
        else if(command == "RESET") {
            playFrame.dispose();
            new PlayFrame();
        }
        /*else if(command == "INPUT") {
            playFrame.dispose();
            String inputUser = JOptionPane.showInputDialog("Masukkan banyak disk (1-7)");
            HomeFrame.diskAmount = Integer.parseInt(inputUser);
            HomeFrame.diskInput(HomeFrame.diskAmount);
        }*/
    }
}
