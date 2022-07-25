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

    private String Calc(String expression){
        if (expression.contains("+")) {
            return Float.toString(Sum(expression));
        } else if (expression.contains("-")) {
            return Float.toString(Subtraction(expression));
        } else if (expression.contains("x")) {
            return Float.toString(Multiplication(expression));
        } else if (expression.contains("/")) {
            float aux = Division(expression);
            if (aux == 0) {
                return "";
            } else {
                return Float.toString(aux);
            }
        } else {
            return Float.toString(Percentage(expression));
        }
    }
    private String removePoint(String expression){
        int pos = expression.length();
        if (expression.charAt(pos - 2) == '.' && expression.charAt(pos - 1) == '0') {
            return expression.substring(0, pos - 2);
        }
        return expression;
    }
    public String result(String expression){
        if(!expression.contains("(")){
            return removePoint(Calc(expression));
        }
        return removePoint(Calc(returnNumber(expression, expression.indexOf("("))));
    }

    private String calcPar(String expression){
        return expression;
    }

    private String returnNumber(String expression, int pos_ini){
        int pos_end = expression.lastIndexOf("(");
        if(pos_ini == pos_end){
            if(pos_ini < expression.indexOf(")")) {
                String aux = removePoint(Calc(expression.substring(pos_ini + 1, expression.indexOf(")"))));
                expression = expression.substring(0, pos_ini) + aux + expression.substring(expression.indexOf(")") + 1);
                return expression;
            } else {
                int aux2 = expression.indexOf(")", pos_ini + 1);
                String aux = removePoint(Calc(expression.substring(pos_ini + 1, aux2)));
                expression = expression.substring(0, pos_ini) + aux + expression.substring(aux2 + 1);
                return expression;
            }
        } else {
            if(expression.charAt(pos_ini + 1) == '('){
                expression = returnNumber(expression, pos_ini + 1);
            } else {
                expression = returnNumber(expression, expression.indexOf("(", pos_ini + 1));
            }
        }
        if(expression.contains("(")){
            return returnNumber(expression, 0);
        }
        return expression;
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
        return Float.parseFloat(expression.substring(ini, end));
    }
    private float Sum(String expression){
        int pos1 = expression.indexOf('+');
        return returnNumber(expression, 0, pos1) + returnNumber(expression, pos1 + 1, expression.length());
    }
    private float Subtraction(String expression){
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
