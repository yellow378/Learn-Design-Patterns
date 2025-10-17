package org.lwx.design.structual;

public class Bridge {
    interface Implementor{
        void do1();
        void do2();
        void do3();
    }
    static class ConcreteImplementor implements Implementor{
        @Override
        public void do1() {
            System.out.println("ConcreteImplementor do1");
        }
        @Override
        public void do2() {
            System.out.println("ConcreteImplementor do2");
        }
        @Override
        public void do3() {
            System.out.println("ConcreteImplementor do3");
        }
    }
    abstract static class AbstractClass{
        protected Implementor implementor;
        public AbstractClass(Implementor implementor){
            this.implementor = implementor;
        }
        public abstract void doSomething();
    }
    static class ConcreteClass extends AbstractClass{
        ConcreteClass(){
            super(new ConcreteImplementor());
        }

        @Override
        public void doSomething() {
            System.out.println("ConcreteClass doSomething");
            implementor.do1();
            implementor.do2();
            implementor.do3();

        }
    }
    public static void main(String[] args){
        ConcreteClass concreteClass = new ConcreteClass();
        concreteClass.doSomething();
    }


}
