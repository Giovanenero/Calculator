package Calculator.ElementGraphic;

import Calculator.Manager.GraphicManager;
import Calculator.Math.Math;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Button {
    private Math size;
    private Math position;
    private String content;
    private JButton jButton;
    private boolean isNumber;
    private boolean isSpecial;
    private static JFrame window = GraphicManager.getWindow();

    public Button(String content, Math position, boolean isNumber, boolean isSpecial){
        this.content = content;
        this.isNumber = isNumber;
        this.isSpecial = isSpecial;
        size = new Math(50, 50);
        this.position = position;
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
        window.add(jButton);
    }

    public Math getSize(){
        return size;
    }

    public void setSize(Math size){
        this.size = size;
    }

    public JButton getButton(){
        return jButton;
    }
}
