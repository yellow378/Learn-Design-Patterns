package org.lwx.design.behavioral;

public abstract class TemplateMethod {
    public void do1(){
        System.out.println("do1");
    }
    public int do2(){
        System.out.println("do2");
        return 0;
    }
    public abstract int do3(int n);
    public void method(){
        do1();
        int ret = do2();
        ret = do3(ret);
        System.out.println(ret);
    }

    static class TemplateClass1 extends TemplateMethod{
        public int do3(int n){
            if(n == 0){
                System.out.println("do nothing because n == "+n);
                return 0;
            }
            System.out.println("do3");
            return 4;
        }
    }
    public static void main(String[] args){
        TemplateClass1 class1 = new TemplateClass1();
        class1.method();
    }

}
