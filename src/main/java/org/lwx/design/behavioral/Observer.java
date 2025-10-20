package org.lwx.design.behavioral;

import java.util.ArrayList;

public class Observer {
    static class Publisher{
        private ArrayList<Subscriber> subscriberList = new ArrayList<>();
        public void addSubscriber(Subscriber subscriber) {
            this.subscriberList.add(subscriber);
        }
        public void removeSubscriber(Subscriber subscriber) {
            this.subscriberList.remove(subscriber);
        }
        public void notifySubscribers() {
            for (Subscriber subscriber : subscriberList) {
                subscriber.update();
            }
        }
    }
    static class Subscriber{
        private String name;
        public Subscriber(String name) {
            this.name = name;
        }
        public void update() {
            System.out.println(name + " is updated");
        }
    }
    public static void main(String[] args) {
        Publisher publisher = new Publisher();
        Subscriber subscriber1 = new Subscriber("subscriber1");
        Subscriber subscriber2 = new Subscriber("subscriber2");
        publisher.addSubscriber(subscriber1);
        publisher.addSubscriber(subscriber2);
        publisher.notifySubscribers();
    }
}
