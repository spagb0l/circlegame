package mwieduwi.games.circlegame.frontend;

import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;

public class GUIField extends JPanel {

    public GUIField() {
        this.setVisible(true);
        
    }

    public void setColor(Color color) {
        this.setBackground(color);
        this.setOpaque(true);
        

        System.out.println("Color is: " + this.getBackground().toString());
    }

    @Override
    public void paint(Graphics g) {
        g.drawOval(100, 100, 80, 80);
    }

}
