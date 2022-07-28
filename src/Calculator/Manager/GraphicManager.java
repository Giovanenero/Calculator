package Calculator.Manager;

import Calculator.ElementGraphic.Button;
import Calculator.ElementGraphic.List.ButtonList;
import Calculator.ElementGraphic.List.TextList;
import Calculator.ElementGraphic.Text;
import Calculator.Math.Coord;

import java.util.List;
import java.util.ArrayList;

import javax.swing.*;

public class GraphicManager {
    private static JFrame window = null;
    private Coord display = new Coord(80 * 4 + 20, 10 + 150 + 80 * 6);
    private static List<Button> buttons = new ArrayList<>();
    private static  List<Text> texts = new ArrayList<>();

    public GraphicManager(){
        newWindow();
        createButtons();
        createText();
        window.update(window.getGraphics());
    }
    private void createButtons(){
        new ButtonList();
    }
    private void createText(){
        new TextList();
    }

    public static JFrame getWindow(){
        return window;
    }

    private void newWindow(){
        window = new JFrame();
        if(window == null){
            System.out.println("ERROR: window is null");
            System.exit(0);
        }
        window.setTitle("Calculator");
        window.setSize(display.x, display.y);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null); //iniciar a janela no centro
        window.setResizable(false); //não pode redimensionar a tela
        window.setVisible(true);
    }
    static public List<Button> getButtons(){
        return buttons;
    }
    static public List<Text> getTexts(){
        return texts;
    }
}