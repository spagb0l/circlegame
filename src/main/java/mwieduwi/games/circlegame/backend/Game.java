package mwieduwi.games.circlegame.backend;

public class Game {

    private Field field;
    private Color colorNow;   

    public Game() {
        setField(new Field(720, 720));
    }

    public Field getField() {
        return field;
    }

    private void setField(Field field) {
        this.field = field;
    }

    public Color getColorNow() {
        return colorNow;
    }

    public void setColorNow(Color colorNow) {
        this.colorNow = colorNow;
    }
    
}
