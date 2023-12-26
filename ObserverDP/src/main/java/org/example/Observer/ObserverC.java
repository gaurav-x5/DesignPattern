package org.example.Observer;

public class ObserverC implements Observer {

    @Override
    public void update(Message m){
        System.out.println("observerC: " + m.getMessage());
    }
}
