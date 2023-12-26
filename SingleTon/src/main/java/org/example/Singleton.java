package org.example;

public class Singleton {
    private static volatile Singleton instance;
    private String data;

    private Singleton(String data) {
        this.data = data;
    }

    public static Singleton getInstance(String data) {
        Singleton result = instance; // creating this such that main memory should be accessed only once
        // usage of local variable can improve the method overall performance by as much as 40%.
        if(result == null) {
            synchronized (Singleton.class) {
                result = instance;
                if(result == null) {
                    instance = result = new Singleton(data);
                }
            }
        }

        return result;
    }
}