package com.vetias.java;
public class Employees {
    public static void main(String[] args) {
        String[][] employee = new String [10][2];
        employee [0][0]="raj";
        employee [0][1]="50,000";
        employee [1][0]="ravi";
        employee [1][1]="24,000";
        employee [2][0]="viky";
        employee [2][1]="30,000";
        employee [3][0]="Arun";
        employee [3][1]="46,000";
        for(String []employee:employee){
        System.out.println(Array.toString (employee));
        }
    }

}

