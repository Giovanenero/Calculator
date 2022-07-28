package Calculator.ElementGraphic.List;

import Calculator.ElementGraphic.Button;
import Calculator.Manager.GraphicManager;
import Calculator.Math.Coord;

import java.util.List;

public class ButtonList extends Calculator.ElementGraphic.List.List {
    private static List<Button> buttons = GraphicManager.getButtons();

    public ButtonList(){
        super();
        createButtons();
    }

    private void createButtons(){
        short ini_x = 2, ini_y = 200;
        int sizeX = 80;
        int sizeY = 80;

        Button b1 = createButton("C", new Coord (ini_x, ini_y), false, true);
        buttons.add(b1);

        Button b2 = createButton("7", new Coord(ini_x, ini_y + sizeY * 1), true, false);
        buttons.add(b2);

        Button b3 = createButton("4", new Coord(ini_x, ini_y + sizeY * 2), true, false);
        buttons.add(b3);

        Button b4 = createButton("1", new Coord(ini_x, ini_y + sizeY * 3), true, false);
        buttons.add(b4);

        Button b5 = createButton("+/-", new Coord(ini_x, ini_y + sizeY * 4), false, false);
        buttons.add(b5);

        Button b6 = createButton("()", new Coord(ini_x + sizeX * 1, ini_y), false, false);
        buttons.add(b6);

        Button b7 = createButton("8", new Coord(ini_x + sizeX * 1, ini_y + sizeY * 1), true, false);
        buttons.add(b7);

        Button b8 = createButton("5", new Coord(ini_x + sizeX * 1, ini_y + sizeY * 2), true, false);
        buttons.add(b8);

        Button b9 = createButton("2", new Coord(ini_x + sizeX * 1, ini_y + sizeY * 3), true, false);
        buttons.add(b9);

        Button b10 = createButton("0", new Coord(ini_x + sizeX * 1, ini_y + sizeY * 4), true, false);
        buttons.add(b10);

        Button b11 = createButton("%", new Coord(ini_x + sizeX * 2, ini_y + sizeY * 0), false, false);
        buttons.add(b11);

        Button b12 = createButton("9", new Coord(ini_x + sizeX * 2, ini_y + sizeY * 1), true, false);
        buttons.add(b12);

        Button b13 = createButton("6", new Coord(ini_x + sizeX * 2, ini_y + sizeY * 2), true, false);
        buttons.add(b13);

        Button b14 = createButton("3", new Coord(ini_x + sizeX * 2, ini_y + sizeY * 3), true, false);
        buttons.add(b14);

        Button b15 = createButton(",", new Coord(ini_x + sizeX * 2, ini_y + sizeY * 4), false, false);
        buttons.add(b15);

        Button b16 = createButton("/", new Coord(ini_x + sizeX * 3, ini_y + sizeY * 0), false, false);
        buttons.add(b16);

        Button b17 = createButton("x", new Coord(ini_x + sizeX * 3, ini_y + sizeY * 1), false, false);
        buttons.add(b17);

        Button b18 = createButton("-", new Coord(ini_x + sizeX * 3, ini_y + sizeY * 2), false, false);
        buttons.add(b18);

        Button b19 = createButton("+", new Coord(ini_x + sizeX * 3, ini_y + sizeY * 3), false, false);
        buttons.add(b19);

        Button b20 = createButton("=", new Coord(ini_x + sizeX * 3, ini_y + sizeY * 4), false, true);
        buttons.add(b20);

        Button b21 = createButton("A", new Coord(ini_x + sizeX * 3, ini_y - sizeY * 1), false, true);
        buttons.add(b21);

        for(int i = 0; i < buttons.size(); i++){
            window.add(buttons.get(i).getButton());
            buttons.get(i).getButton().addActionListener(eventManager);
        }
    }
}
