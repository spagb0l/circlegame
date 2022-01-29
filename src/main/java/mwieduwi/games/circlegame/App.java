package mwieduwi.games.circlegame;

import mwieduwi.games.circlegame.backend.Game;
import mwieduwi.games.circlegame.controller.GUIController;
import mwieduwi.games.circlegame.controller.GameController;
import mwieduwi.games.circlegame.frontend.GUI;

public class App 
{
    public static void main(String[] args)
    {
        Game game = new Game();
        GameController gc = new GameController(game);

        GUI gui = new GUI();
        GUIController guic = new GUIController(game, gui);
    }
}
