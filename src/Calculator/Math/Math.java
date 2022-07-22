package Calculator.Math;

import com.sun.tools.javac.Main;

public class Math {
    public int x;
    public int y;

    public Math(int x, int y){
        this.x = x;
        this.y = y;
    }
    public Math(){

    }

    public String result(String expression){
        /*
        if (expression.contains("+")) {
            expression = Float.toString(Sum(expression));
        } else if (expression.contains("-")) {
            expression = Float.toString(Subtraction(expression));
        } else if (expression.contains("x")) {
            expression = Float.toString(Multiplication(expression));
        } else if (expression.contains("/")) {
            float aux = Division(expression);
            if (aux == 0) {
                return "";
            } else {
                expression = Float.toString(aux);
            }
        } else if (expression.contains("%")) {
            expression = Float.toString(Percentage(expression));
        }
        int pos = expression.length();
        if (expression.charAt(pos - 2) == '.' && expression.charAt(pos - 1) == '0') {
            return expression.substring(0, pos - 2);
        }
        return expression;
        */
        if(!expression.contains("(")){
            //terminar...
        } else {
            int pos_par = expression.indexOf("(");
            //terminar...
        }



    }

    public boolean canAdd(String expression){
        int pos = expression.length() - 1;
        if(expression.charAt(pos) == '+' || expression.charAt(pos) == '-' ||
                expression.charAt(pos) == 'x' || expression.charAt(pos) == '/' ||
                expression.charAt(pos) == '%' || expression.charAt(pos) == '.'){
            return false;
        }
        return true;
    }
    private float returnNumber(String expression, int ini, int end){
        String aux = expression.substring(ini, end);
        return Float.parseFloat(aux);
    }
    private float Sum(String expression){
        int pos1 = expression.indexOf('+');
        float num1 = returnNumber(expression, 0, pos1);
        float num2 = returnNumber(expression, pos1 + 1, expression.length());
        return num1 + num2;
    }
    private  float Subtraction(String expression){
        int pos1 = expression.indexOf('-');
        float num1 = returnNumber(expression, 0, pos1);
        float num2 = returnNumber(expression, pos1 + 1, expression.length());
        return num1 - num2;
    }
    private float Multiplication(String expression){
        int pos1 = expression.indexOf('x');
        float num1 = returnNumber(expression, 0, pos1);
        float num2 = returnNumber(expression, pos1 + 1, expression.length());
        return num1 * num2;
    }

    private float Division(String expression){
        int pos1 = expression.indexOf('/');
        float num1 = returnNumber(expression, 0, pos1);
        float num2 = returnNumber(expression, pos1 + 1, expression.length());
        if(num2 == 0.0){
            System.out.println("ERROR: division for 0");
            return 0;
        }
        return num1 / num2;
    }
    private float Percentage(String expression){
        int pos1 = expression.indexOf("%");
        float num1 = returnNumber(expression, 0, pos1);
        float num2 = returnNumber(expression, pos1 + 1, expression.length());
        return num1 * (num2/100);
    }
}
