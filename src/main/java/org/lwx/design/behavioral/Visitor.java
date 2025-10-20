package org.lwx.design.behavioral;

public interface Visitor{
    public void visit(ElementA elementA);
    public void visit(ElementB elementB);

    public class VisitorImpl implements Visitor{
        @Override
        public void visit(ElementA elementA) {
            System.out.println("visit ElementA");
        }

        @Override
        public void visit(ElementB elementB) {
            System.out.println("visit ElementB");
        }
    }


    public interface Element{
        void accept(Visitor visitor);
    }
    static class ElementA implements Element{
        public void accept(Visitor visitor) {
            visitor.visit(this);
        }
    }
    static class ElementB implements Element{
        public void accept(Visitor visitor) {
            visitor.visit(this);
        }
    }
    public static void main(String[] args) {
        Visitor visitor = new VisitorImpl();
        ElementA elementA = new ElementA();
        ElementB elementB = new ElementB();
        elementA.accept(visitor);
        elementB.accept(visitor);
    }
}
