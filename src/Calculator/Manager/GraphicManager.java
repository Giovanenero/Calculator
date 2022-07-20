package Calculator.Manager;

import Calculator.Math.Math;

import javax.swing.*;

public class GraphicManager {
    JFrame window = new JFrame();
    Math math = new Math(250, 400);
    public GraphicManager(){
        newWindow();
    }
    public void newWindow(){
        window.setTitle("Calculator");
        window.setSize(math.x, math.y);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }
}
