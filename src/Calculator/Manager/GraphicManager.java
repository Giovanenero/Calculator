package Calculator.Manager;

import Calculator.ElementGraphic.Button;
import Calculator.Math.Math;

import javax.swing.*;

public class GraphicManager {
    private static JFrame window = new JFrame();
    private Math math = new Math(235, 450);
    public GraphicManager(){
        newWindow();
        new Button();
    }
    public void newWindow(){
        window.setTitle("Calculator");
        window.setSize(math.x, math.y);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);
        window.setVisible(true);
    }

    public static JFrame getWindow(){
        return window;
    }
}
