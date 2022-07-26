package Calculator.ElementGraphic;

import Calculator.Manager.EventManager;
import Calculator.Manager.GraphicManager;
import Calculator.Math.Math;

import javax.swing.*;
import java.awt.*;

public class Button {
    private Math size;
    private Math position;
    private String content;
    private JButton jButton;
    private Font font = new Font("Courier New", Font.BOLD, 20);
    private boolean isNumber;
    private boolean isSpecial;
    private static JFrame window  = GraphicManager.getWindow();
    private static EventManager eventManager = EventManager.getEventManager();

    public Button(String content, Math position, boolean isNumber, boolean isSpecial){
        if(window == null){
            System.out.println("ERROR: window is null");
            System.exit(0);
        }
        if(eventManager == null){
            System.out.println("ERROR: eventManager is null");
            System.exit(0);
        }
        if(font == null){
            System.out.println("ERROR: font is null");
            System.exit(0);
        }
        this.content = content;
        this.isNumber = isNumber;
        this.isSpecial = isSpecial;
        size = new Math(80, 80);
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
        jButton.addActionListener(eventManager); //eventManager vai tratar dos eventos
        jButton.setFont(font);
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

    public String getContent(){
        return content;
    }
}
