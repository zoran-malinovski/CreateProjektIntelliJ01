package com.company;

public class Main {

    public static void main(String[] args) {
        //added first lines of code
        String model;
        String color;
        boolean engineState = false;

        void startEngine () {

            if (engineState == true)
                System.out.println("Engine is already ON");
            else {
                engineState = true;
                System.out.println("Engine is OFF");
            }
        }

        void showAtribute(){
            System.out.println("This motorcycle is a " + color + " " + model);
            if(engineState == true)
                System.out.println("The engine is on");
            else
                System.out.println("The Engine is off");

        }

    }

}
