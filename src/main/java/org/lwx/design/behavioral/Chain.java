package org.lwx.design.behavioral;

public class Chain {
    interface Handler{
        void setNext(Handler handler);
        void handle();
    }
    static class BaseHandler implements Handler{
        private Handler next;
        @Override
        public void setNext(Handler handler) {
            this.next = handler;
        }
        @Override
        public void handle() {
            if(next != null){
                next.handle();
            }
        }
    }
    static class ParameterCheckHandler extends BaseHandler{
        @Override
        public void handle() {
            System.out.println("ParameterCheckHandler handle");
            super.handle();
        }
    }
    static class AuthCheckHandler extends BaseHandler{
        @Override
        public void handle() {
            System.out.println("AuthCheckHandler handle");
            super.handle();
        }
    }
    static class BusinessHandler extends BaseHandler{
        @Override
        public void handle() {
            System.out.println("BusinessHandler handle");
            super.handle();
        }
    }
    public static void main(String[] args) {
        Handler businessHandler = new BusinessHandler();
        Handler authCheckHandler = new AuthCheckHandler();
        Handler parameterCheckHandler = new ParameterCheckHandler();
        authCheckHandler.setNext(businessHandler);
        parameterCheckHandler.setNext(authCheckHandler);

        parameterCheckHandler.handle();
    }
}
