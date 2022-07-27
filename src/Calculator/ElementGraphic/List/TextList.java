package Calculator.ElementGraphic.List;

import Calculator.ElementGraphic.Text;
import Calculator.Manager.GraphicManager;
import Calculator.Math.Coord;

import java.util.List;

public class TextList extends Calculator.ElementGraphic.List.List {
    private static List<Text> texts = GraphicManager.getTexts();

    public TextList() {
        super();
        createTexts();
    }
    private void createTexts(){
        Text t1 = createText("0", new Coord(80 * 4 + 20, 50), new Coord(15, 15));
        texts.add(t1);
        window.add(t1.getJLabel());
    }
    public static List<Text> getTexts(){
        return texts;
    }
}
