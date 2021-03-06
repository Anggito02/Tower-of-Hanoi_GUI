import javax.swing.JPanel;

/**
 * Tower of Hanoi Panel
 *
 * @author Anggito Anju
 * @version 1.1 - 07 June 21
 */

 import java.awt.*;

public class towerPanel extends JPanel
{
    /* ===== UTILITY ===== */
    private static Color c1 = new Color(193, 50, 0);
    private static Color c2 = new Color(245, 121, 0);
    private static Color c3 = new Color(42, 107, 244);

    // Stacks
    public DiskStack tower1 = new DiskStack();
    public DiskStack tower2 = new DiskStack();
    public DiskStack tower3 = new DiskStack();

    // Constructur to Tower Panel
    
    towerPanel() {
    }

    // PRIMARY VARIABLE
    static final int diskWidth = 55;
    static final int diskHeight = 15;

    // Draw shapes
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2D = (Graphics2D) g;

        // Poles
        g2D.setPaint(c2);
        g2D.fillRect(54, 52, 20, 200);
        g2D.fillRect(130, 52, 20, 200);
        g2D.fillRect(206, 52, 20, 200);

        // Tables
        g2D.setPaint(c1);
        g2D.fillRect(0, 230, 280, 50);

        Disk current = tower1.getHead();
        int i = 0;
        while(current != null) {
            g2D.setPaint(c3);
            switch (current.getLength()) {
                case 55 :
                g2D.fillRect(37+(4*0), 215-(diskHeight*i), current.getLength(), 15);
                break;
                case 47 :
                g2D.fillRect(37+(4*1), 215-(diskHeight*i), current.getLength(), 15);
                break;
                case 39 :
                g2D.fillRect(37+(4*2), 215-(diskHeight*i), current.getLength(), 15);
                break;
                case 31 :
                g2D.fillRect(37+(4*3), 215-(diskHeight*i), current.getLength(), 15);
                break;
                case 23 :
                g2D.fillRect(37+(4*4), 215-(diskHeight*i), current.getLength(), 15);
                break;
            }
            g2D.setPaint(Color.BLACK);
            switch (current.getLength()) {
                case 55 :
                g2D.drawRect(37+(4*0), 215-(diskHeight*i), current.getLength(), 15);
                break;
                case 47 :
                g2D.drawRect(37+(4*1), 215-(diskHeight*i), current.getLength(), 15);
                break;
                case 39 :
                g2D.drawRect(37+(4*2), 215-(diskHeight*i), current.getLength(), 15);
                break;
                case 31 :
                g2D.drawRect(37+(4*3), 215-(diskHeight*i), current.getLength(), 15);
                break;
                case 23 :
                g2D.drawRect(37+(4*4), 215-(diskHeight*i), current.getLength(), 15);
                break;
            }
            i++;
            current = current.getNext();
        }

        current = tower2.getHead();
        i = 0;
        while(current != null) {
            g2D.setPaint(c3);
            switch (current.getLength()) {
                case 55 :
                g2D.fillRect(113+(4*0), 215-(diskHeight*i), current.getLength(), 15);
                break;
                case 47 :
                g2D.fillRect(113+(4*1), 215-(diskHeight*i), current.getLength(), 15);
                break;
                case 39 :
                g2D.fillRect(113+(4*2), 215-(diskHeight*i), current.getLength(), 15);
                break;
                case 31 :
                g2D.fillRect(113+(4*3), 215-(diskHeight*i), current.getLength(), 15);
                break;
                case 23 :
                g2D.fillRect(113+(4*4), 215-(diskHeight*i), current.getLength(), 15);
                break;
            }
            g2D.setPaint(Color.BLACK);
            switch (current.getLength()) {
                case 55 :
                g2D.drawRect(113+(4*0), 215-(diskHeight*i), current.getLength(), 15);
                break;
                case 47 :
                g2D.drawRect(113+(4*1), 215-(diskHeight*i), current.getLength(), 15);
                break;
                case 39 :
                g2D.drawRect(113+(4*2), 215-(diskHeight*i), current.getLength(), 15);
                break;
                case 31 :
                g2D.drawRect(113+(4*3), 215-(diskHeight*i), current.getLength(), 15);
                break;
                case 23 :
                g2D.drawRect(113+(4*4), 215-(diskHeight*i), current.getLength(), 15);
                break;
            }
            i++;
            current = current.getNext();
        }

        current = tower3.getHead();
        i = 0;
        while(current != null) {
            g2D.setPaint(c3);
            switch (current.getLength()) {
                case 55 :
                g2D.fillRect(189+(4*0), 215-(diskHeight*i), current.getLength(), 15);
                break;
                case 47 :
                g2D.fillRect(189+(4*1), 215-(diskHeight*i), current.getLength(), 15);
                break;
                case 39 :
                g2D.fillRect(189+(4*2), 215-(diskHeight*i), current.getLength(), 15);
                break;
                case 31 :
                g2D.fillRect(189+(4*3), 215-(diskHeight*i), current.getLength(), 15);
                break;
                case 23 :
                g2D.fillRect(189+(4*4), 215-(diskHeight*i), current.getLength(), 15);
                break;
            }
            g2D.setPaint(Color.BLACK);
            switch (current.getLength()) {
                case 55 :
                g2D.drawRect(189+(4*0), 215-(diskHeight*i), current.getLength(), 15);
                break;
                case 47 :
                g2D.drawRect(189+(4*1), 215-(diskHeight*i), current.getLength(), 15);
                break;
                case 39 :
                g2D.drawRect(189+(4*2), 215-(diskHeight*i), current.getLength(), 15);
                break;
                case 31 :
                g2D.drawRect(189+(4*3), 215-(diskHeight*i), current.getLength(), 15);
                break;
                case 23 :
                g2D.drawRect(189+(4*4), 215-(diskHeight*i), current.getLength(), 15);
                break;
            }
            i++;
            current = current.getNext();
        }
        
    }

    public void moveDisks(int n, DiskStack start, DiskStack end, DiskStack other, int a, int c, int b) {
        if(n == 0) {
            return;
        }

        moveDisks(n-1, start, other, end, a, b, c);
        end.push(start.pop());

        PlayFrame.ansCounterField.append(a + " -> " + c + "\n");
        PlayFrame.ansCounter.setText("Moves : " + PlayFrame.movesCounter++);
        repaint();

        try {
            Thread.sleep(750);
        }
        catch(Exception e) {}

        moveDisks(n-1, other, end, start, b, c, a);
    }
}
