package Calculator.ElementGraphic;

import Calculator.Manager.GraphicManager;
import Calculator.Math.Math;
import javax.swing.*;
import java.awt.*;

public class Text {
    private JLabel jLabel;
    private Font font = new Font("Courier New", Font.BOLD, 20);
    private JFrame window = GraphicManager.getWindow();
    private Math size;
    private Math position;
    private String text;

    public Text(String text, Math size, Math position){
        if(window == null){
            System.out.println("ERROR: window is null");
            System.exit(0);
        }
        this.size = size;
        this.position = position;
        this.text = text;
        startup();
    }
    private void startup(){
        jLabel = new JLabel(text);
        if(jLabel == null){
            System.out.println("ERROR: jLabel is null");
            System.exit(0);
        }
        jLabel.setFont(font);
        jLabel.setBounds(position.x, position.y, size.x, size.y);
        window.add(jLabel);
    }

    public void setText(String text){
        this.text = text;
        jLabel.setText(text);
    }
    public String getText(){
        return text;
    }
    public void print(){
        jLabel.setBounds(position.x, position.y, size.x, size.y);
    }
}
