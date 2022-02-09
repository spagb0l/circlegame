package mwieduwi.games.circlegame;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import mwieduwi.games.circlegame.controller.GUIController;
import mwieduwi.games.circlegame.controller.GameController;
import mwieduwi.games.circlegame.domain.Game;
import mwieduwi.games.circlegame.frontend.GUI;

public class App 
{
    public static void main(String[] args)
    {
        try {
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (InstantiationException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (UnsupportedLookAndFeelException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        Game game = new Game();
        GameController gc = new GameController(game);

        GUI gui = new GUI();
        GUIController guic = new GUIController(game, gui);
    }
}
