package Observer;

public class ObserverA implements Observer{

    @Override
    public void update(Message m){
        System.out.println("observerA: " + m.getMessage());
    }
}