package command;

import receiver.Device;

public class OffCommand implements Command{
    private final Device device;

    public OffCommand(final Device device) {
        this.device = device;
    }

    @Override
    public void execute() {
        this.device.off();
    }

    @Override
    public void undo() {
        this.device.on();
    }
}
