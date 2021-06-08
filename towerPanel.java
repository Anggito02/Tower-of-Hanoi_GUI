import javax.swing.JPanel;

/**
 * Tower of Hanoi Panel
 *
 * @author Anggito Anju
 * @version 1.1 - 07 June 21
 */

 import java.awt.*;
 import java.awt.event.*;
 import javax.swing.*;

public class towerPanel extends JPanel
{
    /* ===== UTILITY ===== */
    private Color c1 = new Color(193, 50, 0);
    private Color c2 = new Color(245, 121, 0);
    private Color c3 = new Color(42, 107, 244);

    // Graphics
    Graphics g;

    // Stacks
    public static DiskStack tower1 = new DiskStack();
    public static DiskStack tower2 = new DiskStack();
    public static DiskStack tower3 = new DiskStack();

    // Constructur to Tower Panel
    
    towerPanel() {
    }

    // PRIMARY VARIABLE
    final int diskWidth = 55;
    final int diskHeight = 15;

    // Draw shapes
    public void paint(Graphics g) {
        Graphics2D g2D = (Graphics2D) g;

        // Poles
        g2D.setPaint(c2);
        g2D.fillRect(54, 52, 20, 200);
        g2D.fillRect(130, 52, 20, 200);
        g2D.fillRect(206, 52, 20, 200);

        // Tables
        g2D.setPaint(c1);
        g2D.fillRect(0, 230, 280, 50);

        /*// Disks
        g2D.setPaint(c3);
        for(int i = HomeFrame.diskAmount; i > 0; i--) {
            g2D.fillRect(30-5*i+(HomeFrame.diskAmount-i+1), 230-(diskHeight*(HomeFrame.diskAmount-i+1)) , diskWidth+(10*i), diskHeight);
        }

        // Disks Border
        g2D.setPaint(Color.BLACK);
        for(int i = HomeFrame.diskAmount; i > 0; i--) {
            g2D.drawRect(30-5*i+(HomeFrame.diskAmount-i+1), 230-(diskHeight*(HomeFrame.diskAmount-i+1)) , diskWidth+(10*i), diskHeight);
        }*/
        for(int i = 0; i < HomeFrame.diskAmount; i++) {
            tower1.push(new Disk(55-(8*i)));
        }

        Disk current = tower1.getHead();

        for(int i = 0; i<tower1.count(); i ++) {
            g2D.setPaint(c3);
            g2D.fillRect(37+(4*i), 215-(diskHeight*i), current.getLength(), 15);
            g2D.setPaint(Color.BLACK);
            g2D.drawRect(37+(4*i), 215-(diskHeight*i), current.getLength(), 15);
            current = current.getNext();
        }
    }

    /*public void drawAll(Graphics g) {
        Graphics2D g2D = (Graphics2D) g;

        // Poles
        g2D.setPaint(c2);
        g2D.fillRect(54, 52, 20, 200);
        g2D.fillRect(130, 52, 20, 200);
        g2D.fillRect(206, 52, 20, 200);

        Disk current = tower1.getHead();
        int i = 0;
        while(current != null) {
            g2D.setPaint(c3);
            g2D.fillRect(37+(4*i), 215-(diskHeight*i), current.getLength(), 15);
            g2D.setPaint(Color.BLACK);
            g2D.drawRect(37+(4*i), 215-(diskHeight*i), current.getLength(), 15);
        }

        current = tower2.getHead();
        i = 0;
        while(current != null) {
            g2D.setPaint(c3);
            g2D.fillRect(113+(4*i), 215-(diskHeight*i), current.getLength(), 15);
            g2D.setPaint(Color.BLACK);
            g2D.drawRect(113+(4*i), 215-(diskHeight*i), current.getLength(), 15);
        }

        current = tower3.getHead();
        i = 0;
        while(current != null) {
            g2D.setPaint(c3);
            g2D.fillRect(189+(4*i), 215-(diskHeight*i), current.getLength(), 15);
            g2D.setPaint(Color.BLACK);
            g2D.drawRect(189+(4*i), 215-(diskHeight*i), current.getLength(), 15);
        }
    }

    public void moveDisks(int n, DiskStack start, DiskStack end, DiskStack other) {
        if(n == 0) {
            return;
        }

        moveDisks(n-1, start, other, end);
        end.push(start.pop());
        PlayFrame.movesCounter++;
        drawAll(g);
        try {
            Thread.sleep(750);
        }
        catch(Exception e) {}
    }*/
}
