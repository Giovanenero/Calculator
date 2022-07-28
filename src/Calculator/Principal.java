package Calculator;

import Calculator.ElementGraphic.Text;
import Calculator.Manager.GraphicManager;

import java.util.List;

public class Principal {
    private static List<Text> texts = GraphicManager.getTexts();
    private static GraphicManager graphicManager = new GraphicManager();
    public Principal(){
        while(true){
            texts.get(0).print();
        }
    }
}
