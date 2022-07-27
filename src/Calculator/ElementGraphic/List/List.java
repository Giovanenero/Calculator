package Calculator.ElementGraphic.List;

import Calculator.ElementGraphic.Button;
import Calculator.ElementGraphic.Text;
import Calculator.Manager.EventManager;
import Calculator.Manager.GraphicManager;
import Calculator.Math.Coord;

import javax.swing.*;

public class List {
    protected static JFrame window = GraphicManager.getWindow();
    protected static EventManager eventManager = EventManager.getEventManager();
    public List(){

    }
    public Button createButton(String typo, Coord position, boolean isNumber, boolean isSpecial){
        return new Button(typo, position, isNumber, isSpecial);
    }
    public Text createText(String typo, Coord position, Coord size){
        return new Text(typo, position, size);
    }
}
