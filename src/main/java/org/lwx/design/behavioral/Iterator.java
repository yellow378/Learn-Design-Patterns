package org.lwx.design.behavioral;

import java.util.ArrayList;

public interface Iterator<T> {
    T getNext();
    boolean hasNext();


    static class ArrayListIterator<T> implements Iterator<T>{
        IterableArrayList<T> collection;
        private int index;
        ArrayListIterator(IterableArrayList<T> collection){
            this.collection = collection;
            index = collection.size();
        }


        @Override
        public T getNext() {
            return collection.get(--index);
        }

        @Override
        public boolean hasNext() {
            return index > 0;
        }
    }

    interface IterableCollection<T>{
        Iterator<T> getIterator();
    }
    static class IterableArrayList<T> implements IterableCollection<T>{
        ArrayList<T> list = new ArrayList<>();
        @Override
        public Iterator getIterator() {
            return new ArrayListIterator<T>(this);
        }
        public int size(){
            return list.size();
        }
        public void add(T t){
            list.add(t);
        }
        public T get(int index){
            return list.get(index);
        }
    }
    public static void main(String[] args) {
        IterableArrayList<Integer> list = new IterableArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        Iterator<Integer> iterator = list.getIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.getNext());
        }
    }
}
