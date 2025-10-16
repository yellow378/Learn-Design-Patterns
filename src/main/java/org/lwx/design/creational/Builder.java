package org.lwx.design.creational;
import org.lwx.design.creational.product.Car;

public interface Builder {
    void setColor(String color);
    void setEngine(String engine);
    void setWheel(String wheel);
    Car build();

    static class CarBuilder implements Builder {
        private String color;
        private String engine;
        private String wheel;

        @Override
        public void setColor(String color) {
            this.color = color;
        }

        @Override
        public void setEngine(String engine) {
            this.engine = engine;
        }

        @Override
        public void setWheel(String wheel) {
            this.wheel = wheel;
        }

        @Override
        public Car build() {
            Car car = new Car();
            car.setColor(color);
            car.setEngine(engine);
            car.setWheel(wheel);
            return car;
        }
    }
    class Director {
        private final Builder builder;
        public Director(Builder builder){
            this.builder = builder;
        }
        public Car constructACar(){
            builder.setColor("red");
            builder.setEngine("v8");
            builder.setWheel("18");
            return builder.build();
        }
        public Car constructBCar(){
            builder.setColor("blue");
            builder.setEngine("v6");
            builder.setWheel("16");
            return builder.build();
        }
    }
    static void main(String[] args) {
        Director d1 = new Director(new CarBuilder());
        Car c1 = d1.constructACar();
        System.out.println(c1);
        Car c2 = d1.constructBCar();
        System.out.println(c2);
    }
}
