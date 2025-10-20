package org.lwx.design.behavioral;

import lombok.Data;

import java.util.ArrayList;

public class Memento {
    private String state;
    public Memento(String state) {
        this.state = state;
    }
    public String getState() {
        return state;
    }

    static class Originator {
        private String state;
        public void setState(String state) {
            this.state = state;
        }
        public Memento createMemento() {
            return new Memento(state);
        }
        public void restoreMemento(Memento memento) {
            state = memento.getState();
        }
        public String getState() {
            return state;
        }
    }
    static class Caretaker {
        private ArrayList<Memento> mementoList = new ArrayList<>();
        public void setMemento(Memento memento) {
            this.mementoList.add(memento);
        }
        public Memento getMemento() {
            Memento ret =  mementoList.get(mementoList.size() - 1);
            mementoList.remove(mementoList.size() - 1);
            return ret;
        }
    }
    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();
        originator.setState("state1");
        caretaker.setMemento(originator.createMemento());
        originator.setState("state2");
        caretaker.setMemento(originator.createMemento());
        originator.setState("state3");
        System.out.println(originator.getState());
        originator.restoreMemento(caretaker.getMemento());
        System.out.println(originator.getState());
    }

}
