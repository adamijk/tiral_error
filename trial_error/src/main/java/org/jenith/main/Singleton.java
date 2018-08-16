package org.jenith.main;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Singleton {
    
    private static final Singleton instance = new Singleton();
    
    //private constructor to avoid client applications to use constructor
    private Singleton(){}

    public static Singleton getInstance(){
        return instance;
    }
    
    public void print(){
    	log.info("Singleton Design pattern Executed");
    }
}