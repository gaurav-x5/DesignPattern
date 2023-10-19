import Invoker.Invoker;
import command.DownCommand;
import command.OffCommand;
import command.OnCommand;
import command.UpCommand;
import receiver.Light;
import receiver.Speaker;

public class Main {
    public static void main(String[] args) {
        System.out.println("++++++++++++++LIGHT+++++++++++++++++");
        Light light = new Light();

         Invoker invoker = new Invoker(
                        new OnCommand(light),
                        new OffCommand(light),
                        new UpCommand(light),
                        new DownCommand(light)
                );

                invoker.clickOn();
                invoker.undo();
                invoker.clickOff();
                invoker.clickUp();
                invoker.clickDown();
                invoker.undo();

        System.out.println("++++++++++++++SPEAKER+++++++++++++++++");
        Speaker speaker = new Speaker();

        Invoker spInvoker = new Invoker(
                new OnCommand(speaker),
                new OffCommand(speaker),
                new UpCommand(speaker),
                new DownCommand(speaker)
        );

        spInvoker.clickDown();
        spInvoker.undo();
        spInvoker.clickOn();
        spInvoker.undo();
        spInvoker.clickUp();
        spInvoker.clickOff();

    }
}