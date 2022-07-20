package Calculator.ElementGraphic;

import Calculator.Manager.GraphicManager;
import Calculator.Math.Math;
import javax.swing.JFrame;
import javax.swing.JButton;

public class Button {
    Math size = new Math(50,50);
    public Button(){
        newButton();
    }
    private void newButton(){
        JFrame window = GraphicManager.getWindow();

        JButton b1 = new JButton("/");
        b1.setBounds( 160, 150 + size.y * 0, size.x, size.y);
        window.add(b1);

        JButton b2 = new JButton("x");
        b2.setBounds( 160, 150 + size.y * 1, size.x, size.y);
        window.add(b2);

        JButton b3 = new JButton("-");
        b3.setBounds(160, 150 + size.y * 2, size.x, size.y);
        window.add(b3);

        JButton b4 = new JButton("+");
        b4.setBounds(160, 150 + size.y * 3, size.x, size.y);
        window.add(b4);

        JButton b5 = new JButton("=");
        b5.setBounds(160, 150 + size.y * 4, size.x, size.y);
        window.add(b5);

        JButton b6 = new JButton("%");
        b6.setBounds(160 - size.x * 1, 150 + size.y * 0, size.x, size.y);
        window.add(b6);

        JButton b7 = new JButton("()");
        b7.setBounds(160 - size.x * 2, 150 + size.y * 0, size.x, size.y);
        window.add(b7);

        JButton b8 = new JButton("C");
        b8.setBounds(160 - size.x * 3, 150 + size.y * 0, size.x, size.y);
        window.add(b8);

        JButton b9 = new JButton("7");
        b9.setBounds(160 - size.x * 3, 150 + size.y * 1, size.x, size.y);
        window.add(b9);

        JButton b10 = new JButton("8");
        b10.setBounds(160 - size.x * 2, 150 + size.y * 1, size.x, size.y);
        window.add(b10);

        JButton b11 = new JButton("9");
        b11.setBounds(160 - size.x * 1, 150 + size.y * 1, size.x, size.y);
        window.add(b11);

        JButton b12 = new JButton("4");
        b12.setBounds(160 - size.x * 3, 150 + size.y * 2, size.x, size.y);
        window.add(b12);

        JButton b13 = new JButton("5");
        b13.setBounds(160 - size.x * 2, 150 + size.y * 2, size.x, size.y);
        window.add(b13);

        JButton b14 = new JButton("6");
        b14.setBounds(160 - size.x * 1, 150 + size.y * 2, size.x, size.y);
        window.add(b14);

        JButton b15 = new JButton("1");
        b15.setBounds(160 - size.x * 3, 150 + size.y * 3, size.x, size.y);
        window.add(b15);

        JButton b16 = new JButton("2");
        b16.setBounds(160 - size.x * 2, 150 + size.y * 3, size.x, size.y);
        window.add(b16);

        JButton b17 = new JButton("3");
        b17.setBounds(160 - size.x * 1, 150 + size.y * 3, size.x, size.y);
        window.add(b17);

        JButton b18 = new JButton("+/-");
        b18.setBounds(160 - size.x * 3, 150 + size.y * 4, size.x, size.y);
        window.add(b18);

        JButton b19 = new JButton("0");
        b19.setBounds(160 - size.x * 2, 150 + size.y * 4, size.x, size.y);
        window.add(b19);

        JButton b20 = new JButton(",");
        b20.setBounds(160 - size.x * 1, 150 + size.y * 4, size.x, size.y);
        window.add(b20);
    }
}
