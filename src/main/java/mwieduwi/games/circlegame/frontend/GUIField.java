package mwieduwi.games.circlegame.frontend;

import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;

public class GUIField extends JPanel {

    public GUIField() {
        this.setOpaque(true);
        this.setVisible(true);     
    }

    public void setColor(Color color) {
        this.setBackground(color);  
    }

    // @Override
    // public void paintComponent(Graphics g) {
    //     super.paintComponent(g);
    //     g.drawOval(100, 100, 80, 80);
    // }

    // public void drawCircle(int x, int y, int diameter) {
    //     int realX, realY;
    //     realX = x - (diameter / 2);
    //     realY = y - (diameter / 2);
    //     paintComponent(g);
    //     g.drawOval(realX, realY, diameter, diameter);
    // }

}
