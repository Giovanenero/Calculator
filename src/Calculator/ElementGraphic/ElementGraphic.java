package Calculator.ElementGraphic;

import Calculator.Math.Coord;

import java.awt.*;

public class ElementGraphic {
    protected String content;
    protected Coord position;
    protected Font font = new Font("Courier New", Font.BOLD, 20);
    public ElementGraphic(String content, Coord position){
        if(font == null){
            System.out.println("ERROR: font is null");
            System.exit(0);
        }
        this.content = content;
        this.position = position;
    }
}
