package mwieduwi.games.circlegame.frontend;

import javax.swing.JPanel;
import java.awt.Graphics;

public class GUIField extends JPanel {

    private int x, y;

    public GUIField() {
        this.setVisible(true);
    }

    // public int getY() {
    //     return y;
    // }

    // public void setY(int y) {
    //     this.y = y;
    // }

    // public int getX() {
    //     return x;
    // }

    // public void setX(int x) {
    //     this.x = x;
    // }

    @Override
    public void paint(Graphics g) {
        g.drawOval(100, 100, 80, 80);
    }

}
