package datastructure.LinkedList;

import java.util.Stack;

public class CharPairIsLegal {
    public static void main(String[] args) {
        String str="{[(([)()][";
        System.out.println(isLegal(str));
    }
    public static boolean isLegal(String str){
        Stack stack=new Stack();
        for (int i = 0; i <str.length() ; i++) {
            char c=str.charAt(i);
            if(isLeft(c)){
                stack.push(c);
            }else {
                if (!isPair(stack,c)){
                    return false;
                }
            }
        }
        return stack.empty();

    }
    public static boolean isLeft( char c){
        if(c=='{'||c=='['||c=='('){
            return true;
        }
        else return false;
    }
    public static boolean isPair(Stack stack, char c){
        if(stack.empty()){
            return false;
        }else {
            char c1=(char)stack.pop();
            if ((c1=='['&&c==']')||(c1=='{'&&c=='}')||(c1=='('&&c==')')){
                return true;
            }else return false;
        }
    }

}
