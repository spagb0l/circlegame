package mwieduwi.games.circlegame.backend;

public class Player {

    private String name;
    private int lastHighscore;

    public Player(String name) {
        setName(name);
    }

    public int getLastHighscore() {
        return lastHighscore;
    }

    public void setLastHighscore(int lastHighscore) {
        this.lastHighscore = lastHighscore;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
    
}
