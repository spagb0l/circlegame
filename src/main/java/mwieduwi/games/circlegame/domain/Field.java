package mwieduwi.games.circlegame.domain;

public class Field {

    private int x, y;

    public Field(int x, int y) {
        setX(x);
        setY(y);
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
