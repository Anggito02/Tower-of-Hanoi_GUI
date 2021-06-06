
/**
 * Play Frame for Tower of Hanoi Application
 *
 * @author Anggito Anju
 * @version 1.0 - 05 June 2021
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PlayFrame
{
    /* ===== PRIVATE VARIABLE FOR PLAY FRAME ===== */
    // Creating frame
    public JFrame playFrame = new JFrame("Tower of Hanoi");

    // Upper Panel
    private JPanel upperPanel = new JPanel();
    // Buttons
    private JButton animateButton = new JButton("Animate");
    private JButton resetButton = new JButton("Reset");

    // Play Panel
    private JPanel playPanel = new JPanel();
    // Shapes
    private Graphics graphics;
    // Labels
    private JLabel playPanelTitle = new JLabel("Tower of Hanoi Implementation");

    // Answer Panel
    private JPanel ansPanel = new JPanel();
    // Labels
    private JLabel ansCounter = new JLabel("Moves :");
    private JTextField ansCounterField = new JTextField();
    private JLabel ansUser = new JLabel();
    // Text Field
    private JTextField ansField = new JTextField();
    /* ===== END PRIVATE VARIABLE FOR PLAY FRAME ===== */

    /* ===== UTILITY ===== */
    private Font f1 = new Font(Font.SANS_SERIF, Font.BOLD, 24);
    private Font f2 = new Font(Font.SERIF, Font.BOLD, 16);
    private Font f3 = new Font(Font.SERIF, Font.PLAIN, 14);

    private Color c1 = new Color(104, 164, 244);
    private Color c2 = new Color(5, 29, 61);

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

        resetButton.setBounds(280, 50, 100, 30);
        resetButton.setFont(f2);
        resetButton.setForeground(c2);
        resetButton.setBackground(c1);

        upperPanel.add(animateButton);
        upperPanel.add(resetButton);

        /* ===== END UPPER PANEL ===== */

        /* ===== PLAY PANEL ===== */
        playPanel.setBounds(0, 120, 320, 480);
        playPanel.setBackground(c1);
        playPanel.setLayout(null);
        playPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        playPanelTitle.setBounds(80, 60, 255, 30);
        playPanelTitle.setFont(f1);
        playPanelTitle.setForeground(c2);
        playPanelTitle.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        playPanel.add(playPanelTitle);

        /* ===== END PLAY PANEL ===== */

        /* ===== ANS PANEL ===== */
        ansPanel.setBounds(320, 120, 160, 480);
        ansPanel.setBackground(c1);
        ansPanel.setLayout(null);
        /* ===== END ANS PANEL ===== */

    }
}
