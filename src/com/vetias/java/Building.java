package com.vetias.java;

import java.time.LocalDateTime;

  public class Building {
    private String name;
    private double area;
    private int floors;
    private LocalDateTime openingDateTime;
    private LocalDateTime cLocalDateTime;

    public void setName(String name) {
      this.name = name;
    }

    public String getName() {
      return name;
    }

    public void setArea(double area) {
      this.area = area;
    }

    public double getArea() {
      return area;
    }

    public void setFloors(int floors) {
      this.floors = floors;
    }

    public int getFloors() {
      return floors;
    }

    public void setOpeningDateTime(LocalDateTime openingDateTime) {
      this.openingDateTime = openingDateTime;
    }

    public LocalDateTime getOpeningDateTime() {
      return openingDateTime;
    }
  }
  
}
