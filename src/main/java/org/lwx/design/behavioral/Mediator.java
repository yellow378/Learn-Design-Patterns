package org.lwx.design.behavioral;

public interface Mediator {
    static class ComponentA{
        Mediator mediator;
        public void operation(){
            System.out.println("ComponentA operation");
        }
    }
    static class ComponentB{
        Mediator mediator;
        public void operation(){
            System.out.println("ComponentB operation");
        }
    }
    static class ComponentC{
        Mediator mediator;
        public void operation(){
            System.out.println("ComponentC operation");
        }
    }
    void notify(Object sender);

    class ConcreteMediator implements Mediator{
        ComponentA componentA;
        ComponentB componentB;
        ComponentC componentC;
        public ConcreteMediator(ComponentA componentA, ComponentB componentB, ComponentC componentC){
            this.componentA = componentA;
            this.componentB = componentB;
            this.componentC = componentC;
            componentA.mediator = this;
            componentB.mediator = this;
            componentC.mediator = this;
        }
        @Override
        public void notify(Object sender) {
            if (sender == componentA){
                componentB.operation();
                componentC.operation();
            }else if (sender == componentB){
                componentA.operation();
                componentC.operation();
            }else if (sender == componentC){
                componentA.operation();
                componentB.operation();
            }
        }
    }
    public static void main(String[] args) {
        ComponentA componentA = new ComponentA();
        ComponentB componentB = new ComponentB();
        ComponentC componentC = new ComponentC();
        ConcreteMediator mediator = new ConcreteMediator(componentA, componentB, componentC);
        componentA.operation();
        mediator.notify(componentA);
    }


}
