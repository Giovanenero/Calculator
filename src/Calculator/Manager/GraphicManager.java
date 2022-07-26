package Calculator.Manager;

import Calculator.ElementGraphic.Button;
import Calculator.ElementGraphic.Text;
import Calculator.Math.Math;

import java.util.List;
import java.util.ArrayList;

import javax.swing.*;

public class GraphicManager {
    private static JFrame window;
    private Math display;
    private static List<Button> buttons;
    private static List<Text> texts;

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
        display = new Math(25 + 80 * 4 + 25 + 15, 25 + 150 + 80 * 6 + 25);
        newWindow();
        newButtons();
        newJLabels();
    }

    public static JFrame getWindow(){
        return window;
    }

    public static List<Button> getButtons() {
        return buttons;
    }
    //public static List<Text> getTexts(){return texts;}

    public void newWindow(){
        window.setTitle("Calculator");
        window.setSize(display.x, display.y);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null); //iniciar a janela no centro
        window.setResizable(false); //não pode redimensionar a tela
        window.setVisible(true);
    }
    private void newButtons(){
        short ini_x = 25, ini_y = 200;

        Button b1 = new Button("C", new Math(ini_x, ini_y), false, true);
        buttons.add(b1);

        Button b2 = new Button("7", new Math(ini_x, ini_y + b1.getSize().y * 1), true, false);
        buttons.add(b2);

        Button b3 = new Button("4", new Math(ini_x, ini_y + b1.getSize().y * 2), true, false);
        buttons.add(b3);

        Button b4 = new Button("1", new Math(ini_x, ini_y + b1.getSize().y * 3), true, false);
        buttons.add(b4);

        Button b5 = new Button("+/-", new Math(ini_x, ini_y + b1.getSize().y * 4), false, false);
        buttons.add(b5);

        Button b6 = new Button("()", new Math(ini_x + b1.getSize().x * 1, ini_y), false, false);
        buttons.add(b6);

        Button b7 = new Button("8", new Math(ini_x + b1.getSize().x * 1, ini_y + b1.getSize().y * 1), true, false);
        buttons.add(b7);

        Button b8 = new Button("5", new Math(ini_x + b1.getSize().x * 1, ini_y + b1.getSize().y * 2), true, false);
        buttons.add(b8);

        Button b9 = new Button("2", new Math(ini_x + b1.getSize().x * 1, ini_y + b1.getSize().y * 3), true, false);
        buttons.add(b9);

        Button b10 = new Button("0", new Math(ini_x + b1.getSize().x * 1, ini_y + b1.getSize().y * 4), true, false);
        buttons.add(b10);

        Button b11 = new Button("%", new Math(ini_x + b1.getSize().x * 2, ini_y + b1.getSize().y * 0), false, false);
        buttons.add(b11);

        Button b12 = new Button("9", new Math(ini_x + b1.getSize().x * 2, ini_y + b1.getSize().y * 1), true, false);
        buttons.add(b12);

        Button b13 = new Button("6", new Math(ini_x + b1.getSize().x * 2, ini_y + b1.getSize().y * 2), true, false);
        buttons.add(b13);

        Button b14 = new Button("3", new Math(ini_x + b1.getSize().x * 2, ini_y + b1.getSize().y * 3), true, false);
        buttons.add(b14);

        Button b15 = new Button(",", new Math(ini_x + b1.getSize().x * 2, ini_y + b1.getSize().y * 4), false, false);
        buttons.add(b15);

        Button b16 = new Button("/", new Math(ini_x + b1.getSize().x * 3, ini_y + b1.getSize().y * 0), false, false);
        buttons.add(b16);

        Button b17 = new Button("x", new Math(ini_x + b1.getSize().x * 3, ini_y + b1.getSize().y * 1), false, false);
        buttons.add(b17);

        Button b18 = new Button("-", new Math(ini_x + b1.getSize().x * 3, ini_y + b1.getSize().y * 2), false, false);
        buttons.add(b18);

        Button b19 = new Button("+", new Math(ini_x + b1.getSize().x * 3, ini_y + b1.getSize().y * 3), false, false);
        buttons.add(b19);

        Button b20 = new Button("=", new Math(ini_x + b1.getSize().x * 3, ini_y + b1.getSize().y * 4), false, true);
        buttons.add(b20);

        Button b21 = new Button("A", new Math(ini_x + b1.getSize().x * 3, ini_y - b1.getSize().y * 1), false, true);
        buttons.add(b21);
    }
    private void newJLabels(){

    }
}
