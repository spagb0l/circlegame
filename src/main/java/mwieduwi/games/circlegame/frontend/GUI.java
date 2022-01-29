package mwieduwi.games.circlegame.frontend;

import javax.swing.JFrame;

public class GUI extends JFrame {

    private GUIField field;

    private int sizeX = 800; //Size of Window
    private int sizeY = 800;
    
    public GUI() {     
        field = new GUIField();
        
        this.setSize(sizeX, sizeY);
        this.setTitle("Circle Game");
        this.add(field);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);

        openField();
    }

    public GUIField getField() {
        return field;
    }

    private void openField() {
 

        field.setVisible(true);
    }
}
