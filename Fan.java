package com.mycompany.excercise_9_8;

public class Fan {
    // Three constants named SLOW, MEDIUM, and FAST with the values 1, 2, and 3 to denote the fan speed.
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    
    // Private int, boolean, double, and String data fields
    private int speed;
    private boolean on;
    private double radius;
    String color;

    //Constructor with default fan values
    public Fan() {
        speed = SLOW;
        on = false;
        radius = 5;
        color = "blue";
    }
    
// Accessors and mutators 
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

   // Method named toString(); that returns a string description of the fan 
    public String toString() {
         // When fan is on it display the speed , color, and radius
        if (on == true){
            return "Fan : " + "Speed: " + (speed == 1 ? "SLOW" : speed == 2 ? "MEDIUM" : "FAST") +
                    ", Color: " + color + ", Radius: " + radius;
        }
        // when fan is off it displays the color, radius, and lets the user know the fan is off
        else{
             return "Fan : " + "Color: " + color + ", Radius: " + radius + ", fan is off";   
        }   
    }    
}
