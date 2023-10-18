package receiver;

public class Speaker implements Device{
    @Override
    public void on() {
        System.out.println("Turn on speaker");
    }

    @Override
    public void off() {
        System.out.println("Turn off speaker");
    }

    @Override
    public void up() {
        System.out.println("Increase volume");
    }

    @Override
    public void down() {
        System.out.println("Decrease volume");
    }
}
