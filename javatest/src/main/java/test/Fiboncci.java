package test;

public class Fiboncci {
    public static void main(String[] args) {
        int a=fiboncci(8);
        System.out.println(a);
    }
    public static int fiboncci(int x){
        if (x==1){
            return 0;
        }
        if (x==2){
            return 1;
        }

        return fiboncci(x-1)+fiboncci(x-2);

    }
}
