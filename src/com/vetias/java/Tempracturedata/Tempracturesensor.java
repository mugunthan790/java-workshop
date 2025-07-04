package com.vetias.java.Tempracturedata;

public class Tempracturesensor {

  public class Tempracturedata implements sensors { 
    public float tempracture;
    public Tempracturesensor (float aTempracture){
       thistempracture = aTempracture;
    }

    @Override
    public float getReading() {
        return tempracture;
    }




  }
    

}
