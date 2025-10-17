package org.lwx.design.structual;

public class Composite {
    interface Component{
        void execute();
    }
    static class Leaf1 implements Component{
        @Override
        public void execute() {
            System.out.println("Leaf1 execute");
        }
    }
    static class Leaf2 implements Component{
        @Override
        public void execute() {
            System.out.println("Leaf2 execute");
        }
    }
    static class Composite1 implements Component{
        private final Component[] components;
        public Composite1(Component... components){
            this.components = components;
        }
        @Override
        public void execute() {
            System.out.println("Composite1 execute");
            for(Component component : components){
                component.execute();
            }
            System.out.println("Composite1 end");
        }
    }
    public static void main(String[] args){
        Component root = new Composite1(new Leaf1(), new Composite1(new Leaf1(), new Leaf2()), new Leaf2());
        root.execute();
    }
}
