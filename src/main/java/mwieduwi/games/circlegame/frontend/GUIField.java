package mwieduwi.games.circlegame.frontend;

import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;

public class GUIField extends JPanel {

    private int circleX, circleY, circleDiameter;

    public GUIField() {
        this.setOpaque(true);
        this.setVisible(true);     
    }

    public int getCircleDiameter() {
        return circleDiameter;
    }

    public void setCircleDiameter(int circleDiameter) {
        this.circleDiameter = circleDiameter;
    }

    public int getCircleY() {
        return circleY;
    }

    public void setCircleY(int circleY) {
        this.circleY = circleY;
    }

    public int getCircleX() {
        return circleX;
    }

    public void setCircleX(int circleX) {
        this.circleX = circleX;
    }

    public void setColor(Color color) {
        this.setBackground(color);  
    }

    // @Override
    // public void paintComponent(Graphics g) {
    //     super.paintComponent(g);
    //     g.drawOval(100, 100, 80, 80);
    // }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawOval(circleX, circleY, circleDiameter, circleDiameter);
    }

    // public void drawCircle(int x, int y, int diameter) {
    //     int realX, realY;
    //     realX = x - (diameter / 2);
    //     realY = y - (diameter / 2);
    //     paintComponent(g);
    //     g.drawOval(realX, realY, diameter, diameter);
    // }

}
