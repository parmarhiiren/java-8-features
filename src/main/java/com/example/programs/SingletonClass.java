package com.example.programs;

import java.io.Serializable;

public class SingletonClass implements Serializable {

    //Without volatile modifier,
    // it’s possible for another thread in Java to see half initialized state of sSoleInstance variable,
    // but with volatile variable guaranteeing happens-before relationship,
    // all the writes will happen on volatile instance before any read of sSoleInstance variable.

    private static volatile SingletonClass instance;

    //private constructor.
    private SingletonClass(){

        //Prevent form the reflection api.
        if (instance != null){
            throw new RuntimeException("Use getInstance() method to get the single instance of this class.");
        }
    }

    public static SingletonClass getInstance() {
        if (instance == null) { //if there is no instance available... create new one
            synchronized (SingletonClass.class) {
                if (instance == null) instance = new SingletonClass();
            }
        }

        return instance;
    }



    //Make singleton from serialize and deserialize operation.
    protected SingletonClass readResolve() {
        return getInstance();
    }
}