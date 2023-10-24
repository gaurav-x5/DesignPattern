package Observer;

public class ObserverB implements Observer{

    @Override
    public void update(Message m){
        System.out.println("observerB: " + m.getMessage());
    }
}