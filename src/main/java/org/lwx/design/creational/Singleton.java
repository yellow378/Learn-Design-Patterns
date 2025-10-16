package org.lwx.design.creational;

public final class Singleton {
    private String value;
    private Singleton(String value) {
        this.value = value;

    }

    private static volatile Singleton instance;
    public static Singleton getInstance() {
        if(instance == null) {
            synchronized (Singleton.class) {
                if(instance == null) {
                    instance = new Singleton("default");
                }
            }
        }
        return instance;
    }
    public static void main(String[] args){
        Singleton s1 = Singleton.getInstance();
        System.out.println(s1.value);
        Singleton s2 = Singleton.getInstance();
        System.out.println(s2.value);
        System.out.println(s1 == s2);
    }
}
