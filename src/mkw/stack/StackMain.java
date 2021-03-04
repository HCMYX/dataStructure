package mkw.stack;

import org.apache.tools.ant.util.StringUtils;

public class StackMain {

    public static void main(String[] args) {
        String test = "{[()]}]";
        if (StackMain.checkKUOHAO(test)){
            System.out.println("括号匹配");
        }else {
            System.out.println("括号不匹配");
        }

    }

    public static boolean checkKUOHAO(String str){
        //使用栈验证括号是否匹配 {([])}
        ArrayStack<Character> stack = new ArrayStack<Character>();
        for (Character i : str.toCharArray()){

            if ( '{' == i || '['==i || '(' == i){
                stack.push(i);
            }else {
                Character lastChar = stack.pop();
                if ("{".equals(i) && !"}".equals(lastChar)){
                    return false;
                }
                if ("[".equals(i) && !"]".equals(lastChar)){
                    return false;
                }
                if ("(".equals(i) && !")".equals(lastChar)){
                    return false;
                }
                if (!stack.isEmpty()){
                    return false;
                }
            }
        }
        return true;
    }
}
