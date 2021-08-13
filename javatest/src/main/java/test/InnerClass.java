package test;

import javax.crypto.spec.PSource;

public class InnerClass {
    public static void main(String[] args) {
        InnerClass inner = new InnerClass();
        Per per = inner.new Per(14,"hello");
        per.printstr();
    }
    class  Per{
        int age;
        String name;
        Per(int age,String name){
            this.age=age;
            this.name=name;
        }
        public void printstr(){
            System.out.println("sssss");
        }

    }
}
