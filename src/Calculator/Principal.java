package Calculator;

import Calculator.ElementGraphic.Text;
import Calculator.Manager.GraphicManager;

import java.util.List;

public class Principal {
    private static List<Text> texts = GraphicManager.getTexts();
    public Principal(){
        new GraphicManager();
        while(true){
            texts.get(0).print();
        }
    }
}
