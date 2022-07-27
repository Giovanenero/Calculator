package Calculator.ElementGraphic;

import Calculator.Manager.GraphicManager;
import Calculator.Math.Coord;
import Calculator.Math.Math;
import javax.swing.*;
import java.awt.*;

public class Text extends ElementGraphic{
    private JLabel jLabel;
    private Coord size;

    public Text(String content, Coord size, Coord position){
        super(content, position);
        this.size = size;
        startup();
    }
    private void startup(){
        jLabel = new JLabel(content);
        if(jLabel == null){
            System.out.println("ERROR: jLabel is null");
            System.exit(0);
        }
        jLabel.setFont(font);
        jLabel.setBounds(position.x, position.y, size.x, size.y);
    }

    public void setText(String content){
        this.content = content;
        jLabel.setText(content);
    }
    public String getText(){
        return content;
    }

    public JLabel getJLabel(){
        return jLabel;
    }
    public void print(){
        jLabel.setBounds(position.x, position.y, size.x, size.y);
    }
}
