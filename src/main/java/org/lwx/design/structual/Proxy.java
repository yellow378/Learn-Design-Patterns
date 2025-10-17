package org.lwx.design.structual;

public class Proxy {
    interface ServiceInterface {
        void request();
    }
    static class Service implements ServiceInterface{
        @Override
        public void request() {
            System.out.println("Service request");
        }
    }
    static class ServiceProxy implements ServiceInterface{
        private final ServiceInterface service;
        public ServiceProxy(Service service){
            this.service = service;
        }
        @Override
        public void request() {
            System.out.println("process by ServiceProxy");
            service.request();
        }
    }
    public static void main(String[] args) {
        ServiceProxy serviceProxy = new ServiceProxy(new Service());
        serviceProxy.request();
    }
}
