package Calculator.Manager;

import Calculator.ElementGraphic.Button;
import Calculator.Math.Math;

import java.util.List;
import java.util.ArrayList;

import javax.swing.*;

public class GraphicManager {
    private static JFrame window;
    private Math display;
    private static List<Button> buttons;

    public GraphicManager(){
        window = new JFrame();
        if(window == null){
            System.out.println("ERROR: window is null");
            System.exit(0);
        }
        buttons = new ArrayList<>();
        if(buttons == null){
            System.out.println("ERROR: buttons is null");
            System.exit(0);
        }
        display = new Math(235, 450);
        newWindow();
        newButtons();
    }
    public void newWindow(){
        window.setTitle("Calculator");
        window.setSize(display.x, display.y);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);
        window.setVisible(true);
    }

    public void newButtons(){

        short space = 0;

        Button b1 = new Button("/", new Math(160 + space * 4, 150 + space), false, false);
        buttons.add(b1);

        Button b2 = new Button("x", new Math(160 + space * 4, 150 + b1.getSize().y * 1 + space), false, false);
        buttons.add(b2);

        Button b3 = new Button("-", new Math(160 + space * 4, 150 + b1.getSize().y * 2 + space), false, false);
        buttons.add(b3);

        Button b4 = new Button("+", new Math(160 + space * 4, 150 + b1.getSize().y * 3 + space), false, false);
        buttons.add(b4);

        Button b5 = new Button("=", new Math(160 + space * 4, 150 + b1.getSize().y * 4 + space), false, true);
        buttons.add(b5);


        Button b6 = new Button("%", new Math(160 - b1.getSize().x * 1 + space * 3, 150 + b1.getSize().y * 0 + space), false, false);
        buttons.add(b6);

        Button b7 = new Button("()", new Math(160 - b1.getSize().x * 2 + space * 2, 150 + b1.getSize().y * 0 + space), false, false);
        buttons.add(b7);

        Button b8 = new Button("C", new Math(160 - b1.getSize().x * 3 + space * 1, 150 + b1.getSize().y * 0 + space), false, true);
        buttons.add(b8);

        Button b9 = new Button("7", new Math(160 - b1.getSize().x * 3 + space * 1, 150 + b1.getSize().y * 1 + space), true, false);
        buttons.add(b9);

        Button b10 = new Button("8", new Math(160 - b1.getSize().x * 2 + space * 2, 150 + b1.getSize().y * 1 + space), true, false);
        buttons.add(b10);

        Button b11 = new Button("9", new Math(160 - b1.getSize().x * 1 + space * 3, 150 + b1.getSize().y * 1 + space), true, false);
        buttons.add(b11);

        Button b12 = new Button("4", new Math(160 - b1.getSize().x * 3 + space * 1, 150 + b1.getSize().y * 2 + space), true, false);
        buttons.add(b12);

        Button b13 = new Button("5", new Math(160 - b1.getSize().x * 2 + space * 2, 150 + b1.getSize().y * 2 + space), true, false);
        buttons.add(b13);

        Button b14 = new Button("6", new Math(160 - b1.getSize().x * 1 + space * 3, 150 + b1.getSize().y * 2 + space), true, false);
        buttons.add(b14);

        Button b15 = new Button("1", new Math(160 - b1.getSize().x * 3 + space * 1, 150 + b1.getSize().y * 3 + space), true, false);
        buttons.add(b15);

        Button b16 = new Button("2", new Math(160 - b1.getSize().x * 2 + space * 2, 150 + b1.getSize().y * 3 + space), true, false);
        buttons.add(b16);

        Button b17 = new Button("3", new Math(160 - b1.getSize().x * 1 + space * 3, 150 + b1.getSize().y * 3 + space), true, false);
        buttons.add(b17);

        Button b18 = new Button("+/-", new Math(160 - b1.getSize().x * 3 + space * 1, 150 + b1.getSize().y * 4 + space), false, false);
        buttons.add(b18);

        Button b19 = new Button("0", new Math(160 - b1.getSize().x * 2 + space * 2, 150 + b1.getSize().y * 4 + space), true, false);
        buttons.add(b19);

        Button b20 = new Button(",", new Math(160 - b1.getSize().x * 1 + space * 3, 150 + b1.getSize().y * 4 + space), false, false);
        buttons.add(b20);
    }

    public static JFrame getWindow(){
        return window;
    }
}
