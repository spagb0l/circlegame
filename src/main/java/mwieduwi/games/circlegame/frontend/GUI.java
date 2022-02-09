package mwieduwi.games.circlegame.frontend;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GUI extends JFrame {

    private GUIField field;
    private JPanel background = new JPanel();

    private int sizeX = 800; //Size of Window
    private int sizeY = 800;
    
    public GUI() { 
        this.add(background);
        
        
        field = new GUIField();
        
        background.add(field);
        background.setVisible(true);

        this.setSize(sizeX, sizeY);
        this.setTitle("Circle Game");
        // this.add(field);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    public GUIField getField() {
        return field;
    }
}
