package com.sultana.assignment1;

public class DemoSingleton {
    /*private static DemoSingleton instance;
    public static synchronized DemoSingleton getInstance() {
        if (instance == null) {
            instance = new DemoSingleton();
        }
        return instance;
    }*/

    private static class InstanceHolder {
        private static final DemoSingleton INSTANCE = new DemoSingleton();
    }
    public static DemoSingleton getInstance() {
        return InstanceHolder.INSTANCE;
    }


}
