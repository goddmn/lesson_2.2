package com.company;

public class Main {

    public static void main(String[] args) {
       int age = 16;
       int temperature = 20;
       boolean isRainy = false;

        System.out.println("1");
        System.out.println("2");
       if ((isRainy || temperature < 10) && (age < 180)){
           System.out.println("Не выходите на улицу!");
           System.out.println("3");
       }

    }
}
