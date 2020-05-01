// package testlight;
public class TestLight {
    public static void main(String[] args) {
        // Object of Light is created 
        Light objectOne = new Light();
        // brightness,color and switch methods are called to give them values             
        objectOne.setLight_brightness(Light.HIGH);
        objectOne.setLight_color("orange");
        objectOne.setLight_switch(true);
        // calls toString method to get the result string and it is displayed
        System.out.println(objectOne.toString());
        
        // creating second object of Light class and same as above
        Light objectTwo = new Light();
        objectTwo.setLight_brightness(Light.MEDIUM);
        objectTwo.setLight_color("green");
        objectTwo.setLight_switch(false);             
        System.out.println(objectTwo.toString());
    }
    
}


