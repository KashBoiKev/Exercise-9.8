package com.mycompany.excercise_9_8;

public class Excercise_9_8 {
    
    public static void main(String[] args) {
        
    // two fans objects are created with the following values 
    
    //Assign maximum speed, radius 10, color yellow, and turn it on to the first object.
        Fan fan1 = new Fan();
        fan1.setSpeed(3);
        fan1.setOn(true);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        System.out.println(fan1.toString());
        
        
    //Assign medium speed, radius 5, color blue, and turn it off to the second object.
        Fan fan2 = new Fan();
        fan2.setSpeed(2);
        fan2.setOn(false);
        fan2.setRadius(5);
        fan2.setColor("blue");
        System.out.println(fan2.toString());     

        
    }
}
