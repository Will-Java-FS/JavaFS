package com.revature.models;

public class Command {

    private String command;

    public Command(String command) {
        this.command = command;
    }

    public Command() {
    }

    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }

    @Override
    public String toString() {
        return "Command{" +
                "command='" + command + '\'' +
                '}';
    }
}