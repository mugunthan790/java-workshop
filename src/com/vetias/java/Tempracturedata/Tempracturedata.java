package com.vetias.java.Tempracturedata;

public class TempractureData {
    public static void main(string[]args){
        Tempracturesensor sensor = new Tempracturesensor(aTempracture:19.5f);
        float reading = sensor.getReading();
        System.out.println(reading);
    }

}
