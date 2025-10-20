package org.lwx.design.behavioral;

public interface Strategy {
    int calculatePrice(int price);
    static class StrategyA implements Strategy {
        @Override
        public int calculatePrice(int price) {
            if(price > 100) {
                return price - 10;
            }
            return price;
        }
    }
    static class StrategyB implements Strategy {
        @Override
        public int calculatePrice(int price) {
            return (int)(price * 0.9);
        }
    }

    static class Context{
        private Strategy strategy;
        public Context(Strategy strategy) {
            this.strategy = strategy;
        }
        public int calculatePrice(int price) {
            return strategy.calculatePrice(price);
        }
    }
    public static void main(String[] args) {
        Context context = new Context(new StrategyA());
        System.out.println(context.calculatePrice(100));
        System.out.println(context.calculatePrice(200));
        context = new Context(new StrategyB());
        System.out.println(context.calculatePrice(100));
        System.out.println(context.calculatePrice(200));
    }

}
