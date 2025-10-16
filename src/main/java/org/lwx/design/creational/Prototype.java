package org.lwx.design.creational;

public interface Prototype {
    public Prototype clone();

    class Car implements Prototype{
        private String color;
        private String engine;
        private String wheel;

        public Car(String color, String engine, String wheel) {
            this.color = color;
            this.engine = engine;
            this.wheel = wheel;
        }
        @Override
        public Prototype clone() {
            return new Car(this.color, this.engine, this.wheel);
        }
    }
    public static void main(String[] args){
        Car car = new Car("red", "V8", "4");
        Car car2 = (Car) car.clone();
        System.out.println(car2.color);
        System.out.println(car2.engine);
        System.out.println(car2.wheel);
    }
}
