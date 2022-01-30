package mwieduwi.games.circlegame.backend;

import java.util.ArrayList;

public class Game {

    private Field field;
    private Color colorNow;
    private ArrayList<Circle> circleList;

    public Game() {
        setField(new Field(720, 720));
        setCircleList(new ArrayList<>());

        drawFirstCircle();
    }

    private void drawFirstCircle() {
        circleList.add(new Circle(100, 100, 80));
    }

    public ArrayList<Circle> getCircleList() {
        return circleList;
    }

    private void setCircleList(ArrayList<Circle> circleList) {
        this.circleList = circleList;
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
