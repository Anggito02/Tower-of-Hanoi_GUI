
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
    public static int movesCounter = 1;

    /* ===== PRIVATE VARIABLE FOR PLAY FRAME ===== */
    // Creating frame
    public static JFrame playFrame = new JFrame("Tower of Hanoi");

    // Upper Panel
    private JPanel upperPanel = new JPanel();
    // Buttons
    private JButton animateButton = new JButton("Animate");
    private JButton resetButton = new JButton("Reset");

    // Play Panel
    private JPanel playPanel = new JPanel();
    // Inside Panel
    static towerPanel towerPane = new towerPanel();
    // Buttons 
    private JButton inputButton = new JButton("INPUT DISK");
    // Labels
    private JLabel playPanelTitle = new JLabel("Tower of Hanoi");
    // Graphics
    Graphics g;

    // Answer Panel
    private JPanel ansPanel = new JPanel();
    // Labels
    public static JLabel ansCounter = new JLabel("Moves : 0");
    // Text Fields
    public static JTextArea ansCounterField = new JTextArea();
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
        playFrame.add(playPanel);
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
        // Button Event
        animateButton.addActionListener(this);
        animateButton.setActionCommand("ANIMATE");

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

        playPanel.setBounds(0, 120, 320, 480);
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

        towerPane.setBounds(20, 100, 280, 280);
        towerPane.setBackground(c1);

        playPanel.add(playPanelTitle);
        playPanel.add(inputButton);
        playPanel.add(towerPane);

        /* ===== END PLAY PANEL ===== */

        /* ===== ANS PANEL ===== */
        ansPanel.setBounds(320, 120, 160, 480);
        ansPanel.setBackground(c3);
        ansPanel.setLayout(null);

        ansCounter.setBounds(40, 20, 80, 30);
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

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        if(command == "Home") {
            playFrame.dispose();
            new HomeFrame();
        }
        else if(command == "RESET") {
            playFrame.dispose();

            while(towerPane.tower1.count() > 0) {
                towerPane.tower1.pop();
                //System.out.println(towerPanel.tower1.count());
            }

            while(towerPane.tower2.count() > 0) {
                towerPane.tower2.pop();
                //System.out.println(towerPanel.tower2.count());
            }

            while(towerPane.tower3.count() > 0) {
                towerPane.tower3.pop();
                //System.out.println(towerPanel.tower3.count());
            }

            ansCounterField.setText("");
            movesCounter = 1;

            new PlayFrame();
        }
        else if(command == "INPUT") {
            playFrame.dispose();

            while(towerPane.tower1.count() > 0) {
                towerPane.tower1.pop();
                //System.out.println(towerPanel.tower1.count());
            }

            while(towerPane.tower2.count() > 0) {
                towerPane.tower2.pop();
                //System.out.println(towerPanel.tower2.count());
            }

            while(towerPane.tower3.count() > 0) {
                towerPane.tower3.pop();
                //System.out.println(towerPanel.tower3.count());
            }

            ansCounterField.setText("");
            movesCounter = 1;

            String inputUser = JOptionPane.showInputDialog("Masukkan banyak disk (1-5)");
            HomeFrame.diskAmount = Integer.parseInt(inputUser);
            HomeFrame.diskInput(HomeFrame.diskAmount);
        }
        else if(command == "ANIMATE") {
            towerPane.moveDisks(HomeFrame.diskAmount, towerPane.tower1, towerPane.tower3, towerPane.tower2, 1, 3, 2);
        }
    }
}
