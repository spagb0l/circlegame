package mwieduwi.games.circlegame.controller;

import javax.swing.SwingUtilities;
import java.awt.Color;

import mwieduwi.games.circlegame.domain.Circle;
import mwieduwi.games.circlegame.domain.Game;
import mwieduwi.games.circlegame.frontend.GUI;

public class GUIController {

    private Game game;
    private GUI gui;
    

    public GUIController(Game game, GUI gui) {
        setGame(game);
        setGui(gui);
        
        setFieldSize();
        
        setColor(Color.CYAN);

        drawAllCircles();

        refreshUI();
    }

    private void refreshUI() {
        SwingUtilities.updateComponentTreeUI(getGui());
    }

    private void drawAllCircles() {
        for(Circle circle : getGame().getCircleList()) {
            drawCircle(circle.getX(), circle.getY(), circle.getDiameter());
        }
    }

    private void drawCircle(int x, int y, int diameter) {
        getGui().getField().setCircleX(x);
        getGui().getField().setCircleY(y);
        getGui().getField().setCircleDiameter(diameter);
    }

    private void setColor(Color color) {
        getGui().getField().setColor(color);
    }

    private void setFieldSize() {
        getGui().getField().setSize(getGame().getField().getX(), getGame().getField().getY());
    }

    public Game getGame() {
        return game;
    }

    private void setGame(Game game) {
        this.game = game;
    }

    public GUI getGui() {
        return gui;
    }

    private void setGui(GUI gui) {
        this.gui = gui;
    }
    
}
