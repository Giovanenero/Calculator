package Calculator.ElementGraphic;

import Calculator.Math.Math;
import javax.swing.*;
import java.awt.*;

public class Text {
    private JLabel jLabel;
    private Font font = new Font("Courier New", Font.BOLD, 20);

    public Text(String text, Math size, Math position){
        jLabel = new JLabel(text);
        if(jLabel == null){
            System.out.println("ERROR: jLabel is null");
            System.exit(0);
        }
        jLabel.setBounds(position.x, position.y, size.x, size.y);
    }
    public JLabel getjLabel(){
        return jLabel;
    }
}
