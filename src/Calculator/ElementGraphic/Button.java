package Calculator.ElementGraphic;

import Calculator.Manager.EventManager;
import Calculator.Manager.GraphicManager;
import Calculator.Math.Coord;
import Calculator.Math.Math;

import javax.swing.*;
import java.awt.*;

public class Button extends ElementGraphic{
    private Coord size = new Coord(80, 80);
    private JButton jButton;
    private boolean isNumber;
    private boolean isSpecial;

    public Button(String content, Coord position, boolean isNumber, boolean isSpecial){
        super(content, position);
        this.isNumber = isNumber;
        this.isSpecial = isSpecial;
        jButton = new JButton(content);
        if(jButton == null){
            System.out.println("ERROR: jButton is null");
            System.exit(0);
        }
        startup();
    }

    private void startup(){
        //window.setLayout(null);
        jButton.setBackground(Color.BLACK);
        if(isNumber){
            jButton.setForeground(Color.WHITE);
        } else if(!isSpecial) {
            jButton.setForeground(Color.GREEN);
        } else {
            jButton.setForeground(Color.ORANGE);
        }
        jButton.setBounds(position.x, position.y, size.x, size.y);
        jButton.setFont(font);
    }

    public JButton getButton(){
        return jButton;
    }
}
