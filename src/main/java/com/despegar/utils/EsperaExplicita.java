package com.despegar.utils;

public class EsperaExplicita {

    public void esperaExplicita ( int segundos){
        try {
            Thread.sleep(segundos*1000);
        } catch (InterruptedException e) {
            e.printStackTrace(System.out);
        }
    }

}