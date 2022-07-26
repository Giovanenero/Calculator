package Calculator;

import Calculator.ElementGraphic.Text;
import Calculator.Manager.EventManager;
import Calculator.Manager.GraphicManager;

import java.util.List;

public class Principal {
    public Principal(){
        new GraphicManager();
        List<Text> texts = GraphicManager.getTexts();
        while(true){
            texts.get(0).print();
        }
    }
}
