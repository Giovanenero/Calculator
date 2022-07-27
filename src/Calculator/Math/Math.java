package Calculator.Math;

import com.sun.tools.javac.Main;

public class Math {

    private boolean verification(String expression, int i){
        if(expression.charAt(i) == '+' || expression.charAt(i) == '-' || expression.charAt(i) == 'x' || expression.charAt(i) == '/' || expression.charAt(i) == '%'){
            if(expression.charAt(i - 1) != 'x' && expression.charAt(i - 1) != '/' && expression.charAt(i - 1) != '%'){
                return true;
            }
            return false;
        }
        return false;
    }
    private boolean verification(String expression){
        if(expression.contains("+") || expression.contains("-") || expression.contains("x") || expression.contains("/") || expression.contains("%")){
            return true;
        }
        return false;
    }
    private String CalcDiv(String expression){
        int j = 0;
        int i;
        for(i = 1; i < expression.length() && j < 2; i++){
            if(verification(expression, i)){
                j++;
            }
        }
        String aux;
        if(j == 2){
            aux = expression.substring(0, i - 1);
            aux = Calc(aux);
            expression = aux + expression.substring(i - 1);
            if(verification(expression)){
                return CalcDiv(expression);
            }
        } else if(j == 1){
            return Calc(expression);
        }
        return expression;
    }

    private String Calc(String expression){
        if (expression.contains("+")) {
            return removePoint(Float.toString(Sum(expression)));
        } else if (expression.contains("x")) {
            return removePoint(Float.toString(Multiplication(expression)));
        } else if (expression.contains("/")) {
            float aux = Division(expression);
            if (aux == 0) {
                return "";
            } else {
                return removePoint(Float.toString(aux));
            }
        } else if(expression.contains("%")) {
            return removePoint(Float.toString(Percentage(expression)));
        } else {
            return removePoint(Float.toString(Subtraction(expression)));
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
            return CalcDiv(expression);
        } else {
            String aux = returnNumber(expression, expression.indexOf("("));
            if(aux.contains("+") || aux.contains("-") || aux.contains("x") || aux.contains("/") || aux.contains("%")){
                return CalcDiv(aux);
            }
            return aux;
        }
    }

    private String returnNumber(String expression, int pos_ini){
        int pos_end = expression.lastIndexOf("(");
        if(pos_ini == pos_end){
            String aux;
            if(pos_ini < expression.indexOf(")")) {
                aux = CalcDiv(expression.substring(pos_ini + 1, expression.indexOf(")")));
                return expression.substring(0, pos_ini) + aux + expression.substring(expression.indexOf(")") + 1);
            }
            //int aux2 = expression.indexOf(")", pos_ini + 1);
            aux = CalcDiv(expression.substring(pos_ini + 1, expression.indexOf(")", pos_ini + 1)));
            return expression.substring(0, pos_ini) + aux + expression.substring(expression.indexOf(")", pos_ini + 1) + 1);
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
        return returnNumber(expression,0, pos1) + returnNumber(expression, pos1 + 1, expression.length());
    }
    private float Subtraction(String expression){
        int pos1 = expression.indexOf("-");
        int pos2 = expression.indexOf("-", pos1 + 1);
        float num1, num2;
        if(pos2 != -1){
            num1 = returnNumber(expression, 0, pos2);
            num2 = returnNumber(expression, pos2 + 1, expression.length());
        } else {
            num1 = returnNumber(expression, 0, pos1);
            num2 = returnNumber(expression, pos1 + 1, expression.length());
        }
        return num1 - num2;
    }
    private float Multiplication(String expression){
        int pos1 = expression.indexOf("x");
        return returnNumber(expression, 0, pos1) * returnNumber(expression, pos1 + 1, expression.length());
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
        return returnNumber(expression, 0, pos1) * (returnNumber(expression, pos1 + 1, expression.length())/100);
    }
}