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
        /*
        expression = removePoint(Calc(expression));
        */
        if(!expression.contains("(")){
            //terminar...
        } else {
            return returnNumber(expression, expression.indexOf("("));
        }
        return expression;
    }

    private String returnNumber(String expression, int pos_ini){
        String aux;
        if(expression.charAt(pos_ini + 1) == '('){
            aux = returnNumber(expression, pos_ini + 1);
        } else {
            String aux2 = "";
            if(expression.indexOf("(", pos_ini + 1) == -1){
                if(pos_ini == 0){
                    return removePoint(Calc(expression.substring(pos_ini + 1, expression.lastIndexOf(")"))));
                } else {
                    aux = expression.substring(expression.indexOf(")") + 1);
                    for(int i = 0; i < pos_ini; i++){
                        aux2 += "(";
                    }
                    return aux2 + removePoint(Calc(expression.substring(pos_ini + 1, expression.indexOf(")")))) + aux;
                }
            } else {
                int pos = expression.indexOf("(", pos_ini + 1);
                int cont1 = pos_ini;
                int cont2 = pos_ini;
                if(pos_ini != )
                for(int i = 0; i <= cont1; i++){
                    aux2 += "(";
                }
                String aux3 = "";
                for(int i = 0; i <= cont2; i++){
                    aux3 += ")";
                }
                aux = aux2 + expression.substring(pos_ini, pos) + returnNumber(expression.substring(pos), 0) + aux3;
                System.out.println(aux);
            }
        }
        //System.out.println(aux);
        if(aux.contains("(")){
            return returnNumber(aux, 0);
        }
        return aux;
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
