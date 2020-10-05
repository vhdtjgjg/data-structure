/**
 * 表达式检测
 */
public class CheckExpression {

    public static String isValid(String expStr){

        //创建栈
        LinkedStack<String> stringLinkedStack = new LinkedStack<>();

        int i=0;

        while (i<expStr.length()){
            String expChar=expStr.charAt(i)+"";
            i++;
            switch (expChar){
                case "(": stringLinkedStack.push(expChar);//左括号直接入栈
                    break;
                case ")":
                    if(stringLinkedStack.isEmpty()||!stringLinkedStack.pop().equals("(")){
                        return "no...";
                    }
            }

        }

        //最后检测是否为空，为空则检测通过
        if(stringLinkedStack.isEmpty()){
            return "ok";
        }
        return "no";

    }

    public static void main(String[] args) {
        String expStr="((xxxx)dkjfk)";
        System.out.println(isValid(expStr));
    }
}
