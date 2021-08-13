package test;

public class SubStrCompare{
    public static void main(String[] args) {
        String str1="goodgooxgle";
        String substr="google";
        boolean flag=false;
        for (int i = 0; i <str1.length(); i++) {
            if (str1.charAt(i)==substr.charAt(0)){
                flag=compare(str1,i,substr);
                if (flag){
                    break;
                }
            }
        }
        if (flag){
            System.out.println("substr是str1的子串");
        }else {
            System.out.println("substr不是str1的子串");
        }

    }
    public static  boolean compare(String str1,int inx,String substr){
        boolean flag=true;
        for (int i = 0; i <substr.length(); i++) {
            if((inx>=str1.length())||(str1.charAt(inx)!=substr.charAt(i))){
                flag=false;
                return flag;
            }else{
                inx++;
            }
        }
        return flag;
    }
}
