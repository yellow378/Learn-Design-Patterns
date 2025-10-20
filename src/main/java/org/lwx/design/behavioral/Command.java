package org.lwx.design.behavioral;

public class Command {
    interface CommandInterface {
        void execute(String parameters);
    }
    static class NotifyCommand implements CommandInterface {
        private final Receiver receiver;
        public NotifyCommand(Receiver receiver) {
            this.receiver = receiver;
        }
        @Override
        public void execute(String parameters) {
            receiver.action(parameters);

        }
    }
    static class Button{
        private CommandInterface command;
        public void setCommand(CommandInterface command){
            this.command = command;
        }
        public void executeCommand(String parameters){
            command.execute(parameters);
        }
    }
    static class Receiver{
        public void action(String parameters){
            System.out.println("Receiver action: " + parameters);
        }
    }
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        CommandInterface notifyCommand = new NotifyCommand(receiver);
        Button button = new Button();
        button.setCommand(notifyCommand);
        button.executeCommand("command");
    }
}
