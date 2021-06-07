import javax.swing.JPanel;

/**
 * Play Panel object
 *
 * @author Anggito Anju
 * @version ver 1.0 - 07 June 21
 */

 import java.awt.*;
 import java.awt.event.*;
 import javax.swing.*;

public class playPanel extends JPanel implements ActionListener
{

    // Buttons 
    private JButton inputButton = new JButton("INPUT DISK");
    // Labels
    private JLabel playPanelTitle = new JLabel("Tower of Hanoi");

    /* ===== UTILITY ===== */
    private Font f1 = new Font(Font.SANS_SERIF, Font.BOLD, 18);
    private Font f2 = new Font(Font.SERIF, Font.BOLD, 16);
    private Font f3 = new Font(Font.SERIF, Font.BOLD, 14);

    private Color c1 = new Color(104, 164, 244);
    private Color c2 = new Color(5, 29, 61);
    private Color c3 = new Color(42, 107, 244);


    playPanel() {
        /* ===== PLAY PANEL ===== */
        this.setBounds(0, 120, 320, 480);
        this.setBackground(c1);
        this.setLayout(null);

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

        this.add(playPanelTitle);
        this.add(inputButton);

    /* ===== END PLAY PANEL ===== */
    }

    // SHAPES
    public void paint(Graphics g) {
        Graphics2D g2D = (Graphics2D) g;

        // BASE TABLE
        g2D.fillRect(0, 0, 50, 50);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        if(command == "INPUT") {
            PlayFrame.playFrame.dispose();
            String inputUser = JOptionPane.showInputDialog("Masukkan banyak disk (1-7)");
            HomeFrame.diskAmount = Integer.parseInt(inputUser);
            HomeFrame.diskInput(HomeFrame.diskAmount);
        }
    }
}
