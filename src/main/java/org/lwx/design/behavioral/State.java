package org.lwx.design.behavioral;

public interface State {
    void doAction1();
    void doAction2();

    static class StateA implements State {
        private Context context;
        public StateA(Context context) {
            this.context = context;
        }
        @Override
        public void doAction1() {
            System.out.println("StateA doAction1");
        }
        @Override
        public void doAction2() {
            System.out.println("StateA doAction2");
            context.setState(new StateB(context));
        }
    }
    static class StateB implements State {
        private Context context;
        public StateB(Context context) {
            this.context = context;
        }
        @Override
        public void doAction1() {
            System.out.println("StateB doAction1");
        }
        @Override
        public void doAction2() {
            System.out.println("StateB doAction2");
        }
    }
    static class Context {
        private State state;
        public Context(State state) {
            this.state = state;
        }
        public Context(){
            this.state = new StateA(this);
        }
        public void setState(State state) {
            this.state = state;
        }
        public void doAction1() {
            state.doAction1();
        }
        public void doAction2() {
            state.doAction2();
        }
    }
    public static void main(String[] args) {
        Context context = new Context();
        context.doAction1();
        context.doAction2();
        context.doAction1();
        context.doAction2();
    }
}
