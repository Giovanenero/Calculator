package Calculator.Manager;

import Calculator.ElementGraphic.Button;
import Calculator.Math.Math;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

//Singleton
public class EventManager implements ActionListener {

    private static EventManager eventManager;
    private static List<Button> buttons;
    private static JFrame window = GraphicManager.getWindow();
    private String expression = "";
    private Math math = new Math();
    private int quantity_par = 0;

    private EventManager(){
        buttons = GraphicManager.getButtons();
    }

    public static EventManager getEventManager() {
        return (eventManager == null) ? new EventManager() : eventManager;
    }

    @Override
    public void actionPerformed(ActionEvent event){
        // "C"
        if(event.getActionCommand().equals(buttons.get(0).getContent())){
            expression = "";
        }
        // 7
        else if(event.getActionCommand().equals(buttons.get(1).getContent())){
            expression = expression + "7";
        }
        // 4
        else if(event.getActionCommand().equals(buttons.get(2).getContent())){
            expression = expression + "4";
        }
        // 1
        else if(event.getActionCommand().equals(buttons.get(3).getContent())){
            expression = expression + "1";
        }
        // +/-
        else if(event.getActionCommand().equals(buttons.get(4).getContent())){
            if(!expression.contains("-")) {
                expression = "-" + expression;
            } else  {
                expression = expression.substring(1, expression.length());
            }
        }
        // ()
        else if(event.getActionCommand().equals(buttons.get(5).getContent())){
            if (quantity_par == 0) {
                if (!expression.isEmpty()) {
                    expression = expression + "x";
                }
                expression = expression + "(";
                quantity_par++;
            } else if (expression.charAt(expression.length() - 1) == '(') {
                expression = expression + "(";
                quantity_par++;
            } else {
                expression = expression + ")";
                quantity_par--;
            }
        }
        //8
        else if(event.getActionCommand().equals(buttons.get(6).getContent())){
            expression = expression + "8";
        }
        // 5
        else if(event.getActionCommand().equals(buttons.get(7).getContent())){
            expression = expression + "5";
        }
        // 2
        else if(event.getActionCommand().equals(buttons.get(8).getContent())){
            expression = expression + "2";
        }
        // 0
        else if(event.getActionCommand().equals(buttons.get(9).getContent())){
            expression = expression + "0";
        }
        // %
        else if(event.getActionCommand().equals(buttons.get(10).getContent())){
            if (math.canAdd(expression)){
                expression = expression + "%";
            }
        }
        // 9
        else if(event.getActionCommand().equals(buttons.get(11).getContent())){
            expression = expression + "9";
        }
        // 6
        else if(event.getActionCommand().equals(buttons.get(12).getContent())){
            expression = expression + "6";
        }
        // 3
        else if(event.getActionCommand().equals(buttons.get(13).getContent())){
            expression = expression + "3";
        }
        // ,
        else if(event.getActionCommand().equals(buttons.get(14).getContent())){
            if(math.canAdd(expression)){
                expression = expression + ".";
            }
        }
        // /
        else if(event.getActionCommand().equals(buttons.get(15).getContent())){
            if(math.canAdd(expression)){
                expression = expression + "/";
            }
        }
        // x
        else if(event.getActionCommand().equals(buttons.get(16).getContent())){
            if(math.canAdd(expression)){
                expression = expression + "x";
            }
        }
        // -
        else if(event.getActionCommand().equals(buttons.get(17).getContent())){
            if(math.canAdd(expression)){
                expression = expression + "-";
            }
        }
        // +
        else if(event.getActionCommand().equals(buttons.get(18).getContent())){
            if(math.canAdd(expression)) {
                expression = expression + "+";
            }
        }
        // =
        else if(event.getActionCommand().equals(buttons.get(19).getContent())){
            expression = math.result(expression);
        }
        System.out.println(expression);
    }
}