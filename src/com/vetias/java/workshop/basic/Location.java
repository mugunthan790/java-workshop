package com.vetias.java.workshop.basic;

public class Location {
    private String name;
    private double latitude;
    private double longitude;
    private String country;
    private String city;
    private String address;
    private String postercode;

    public location {
        private String postercode;

        public void setname(String name) {
            this.name = name;
        }
        public String getname() {
            return name;
        }
        @Override 
        public String toString(){
            return"Location { name:" + name +
            ", latitude:"+ latitude +
            ", longitude:"+ longitude +
            ", country:"+ country +
            ", city:"+ city +
            ", address:"+ address +
            ", postercode:"+ postercode

            "}";
        
        }
    }
    
}
