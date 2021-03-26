package chapter1.part3;

import edu.princeton.cs.algs4.StdIn;

import java.util.Stack;

public class Evaluate {

    public static void main(String[] args) {



        while (!StdIn.isEmpty()){

            Stack<String> ops = new Stack<>();
            Stack<Double> vals = new Stack<>();
            //读取字符，如果是运算符则压入栈
            String expressionStr = StdIn.readString();

            System.out.println(expressionStr);

            for(int i=0;i<expressionStr.length();i++){
                String s = expressionStr.charAt(i) + "";
                switch (s){
                    case "(": break;
                    case "+":
                    case "-":
                    case "*":
                    case "/":
                    case "sqrt": ops.push(s); break;
                    case ")": //如果字符为")",弹出运算符和操作数，计算结果并压入栈
                        String op = ops.pop();
                        Double v = vals.pop();
                        switch (op){
                            case "+": v=vals.pop()+v; break;
                            case "-": v=vals.pop()-v; break;
                            case "*": v=vals.pop()*v; break;
                            case "/": v=vals.pop()/v; break;
                            case "sqrt": v=Math.sqrt(v); break;
                        }
                        vals.push(v);
                        break;
                    default:
                        vals.push(Double.parseDouble(s));
                }
            }
            System.out.println(vals.pop());

        }




    }
}
