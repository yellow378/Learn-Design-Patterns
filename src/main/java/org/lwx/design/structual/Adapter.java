package org.lwx.design.structual;

import java.util.Arrays;

public class Adapter {

    static interface ClientInterface{
        void request();
    }
    static class ClientAdapter implements ClientInterface{
        private final Service service;
        public ClientAdapter(Service service){
            this.service = service;
        }
        @Override
        public void request() {
            System.out.println("process by ClientAdapter");
            service.request("specific type");
        }
    }
    static class Service{
        void request(String type){
            System.out.println("Service request: " + type);
        }
    }

    public static void main(String[] args){
        ClientAdapter clientAdapter = new ClientAdapter(new Service());
        clientAdapter.request();
        Arrays.asList("String","Buffer");
    }
}
