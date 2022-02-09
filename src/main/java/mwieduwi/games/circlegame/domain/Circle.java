package mwieduwi.games.circlegame.domain;

public class Circle {

    private int diameter;
    private int x, y; //position

    public Circle(int x, int y, int diameter) {
        setX(x);
        setY(y);
        setDiameter(diameter);
    }

    public int getDiameter() {
        return diameter;
    }

    private void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public int getY() {
        return y;
    }

    private void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    private void setX(int x) {
        this.x = x;
    }
    
}
