package Invoker;

import command.Command;
import command.NoCommand;
import command.OnCommand;

public class Invoker {
    private final Command onCommand;
    private final Command offCommand;
    private final Command upCommand;
    private final Command downCommand;

    private Command prevCommand;

    public Invoker(final Command onCommand,
                   final Command offCommand,
                   final Command upCommand,
                   final Command downCommand) {
        this.onCommand = onCommand;
        this.offCommand = offCommand;
        this.upCommand = upCommand;
        this.downCommand = downCommand;
        this.prevCommand = new NoCommand();
    }

    public void clickOn() {
        this.onCommand.execute();
        this.prevCommand = onCommand;
    }

    public void clickOff() {
        this.offCommand.execute();
        this.prevCommand = offCommand;
    }

    public void clickUp() {
        this.upCommand.execute();
        this.prevCommand = upCommand;
    }

    public void clickDown() {
        this.downCommand.execute();
        this.prevCommand = downCommand;
    }

    public void undo() {
        this.prevCommand.undo();
    }
}
