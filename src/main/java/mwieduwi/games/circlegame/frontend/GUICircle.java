package mwieduwi.games.circlegame.frontend;

import javax.swing.JPanel;
import java.awt.Graphics;

public class GUICircle extends JPanel {
    
    private int circleX, circleY, circleDiameter;


    public GUICircle(int circleX, int circleY, int circleDiameter) {
        setCircleX(circleX);
        setCircleY(circleY);
        setCircleDiameter(circleDiameter);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawOval(circleX, circleY, circleDiameter, circleDiameter);
    }


    public int getCircleDiameter() {
        return circleDiameter;
    }


    private void setCircleDiameter(int circleDiameter) {
        this.circleDiameter = circleDiameter;
    }


    public int getCircleY() {
        return circleY;
    }


    private void setCircleY(int circleY) {
        this.circleY = circleY;
    }


    public int getCircleX() {
        return circleX;
    }


    private void setCircleX(int circleX) {
        this.circleX = circleX;
    }

    

}
