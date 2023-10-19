package command;

import receiver.Device;

public class OnCommand implements Command{
    private final Device device;

    public OnCommand(final Device device) {
        this.device = device;
    }

    @Override
    public void execute() {
        this.device.on();
    }

    @Override
    public void undo() {
        this.device.off();
    }
}
