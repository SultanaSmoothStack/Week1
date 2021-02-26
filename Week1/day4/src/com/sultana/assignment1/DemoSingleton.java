package com.sultana.assignment1;

public class DemoSingleton {

    private static volatile DemoSingleton instance;
    int value;
    private DemoSingleton(){

    }

    public static DemoSingleton getInstance(){
        if(instance == null){
            synchronized (DemoSingleton.class){
                if(instance == null){
                    instance = new DemoSingleton();
                }
            }

        }
        return instance;
    }

}
