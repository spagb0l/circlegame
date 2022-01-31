package mwieduwi.games.circlegame.controller;

import mwieduwi.games.circlegame.backend.Game;

public class GameController {

    private Game game;
    
    public GameController(Game game) {
        setGame(game);
    }

    public Game getGame() {
        return game;
    }

    private void setGame(Game game) {
        this.game = game;
    }
}
