package org.lwx.design.structual;

public class Decorator {
    interface Component{
        void execute();
    }
    static class ConcreteComponent1 implements Component{
        @Override
        public void execute() {
            System.out.println("ConcreteComponent1 execute");
        }
    }
    static class ConcreteComponent2 implements Component{
        @Override
        public void execute() {
            System.out.println("ConcreteComponent2 execute");
        }
    }
    static class BasicDecorator implements Component{
        Component component;
        public BasicDecorator(Component component){
            this.component = component;
        }
        @Override
        public void execute() {
            component.execute();
        }
    }
    static class AdvancedDecorator extends BasicDecorator {
        public AdvancedDecorator(Component component){
            super(component);
        }
        @Override
        public void execute() {
            super.execute();
            System.out.println("AdvancedDecorator execute");
        }
    }
    static class AdvancedDecorator2 extends BasicDecorator {
        public AdvancedDecorator2(Component component){
            super(component);
        }
        @Override
        public void execute() {
            super.execute();
            System.out.println("AdvancedDecorator2 execute");
        }
    }
    public static void main(String[] args){
        Component component1 = new ConcreteComponent1();
        BasicDecorator basicDecorator = new AdvancedDecorator(component1);
        BasicDecorator basicDecorator2 = new AdvancedDecorator2(basicDecorator);
        basicDecorator2.execute();
    }
}
