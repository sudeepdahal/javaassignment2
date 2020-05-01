// package testlight;
public class Light {
    // values are set accordingly
    public static final int LOW = 1;
    public static final int MEDIUM = 2;
    public static final int HIGH = 3;
    
    // Initial values are set accordingly
    private int light_brightness = LOW;
    private boolean light_switch = false;
    String light_color = "red";

    // constructor of class
    public Light() {        
        System.out.println("\nConstructor invoked. Default Light created with default color: "+light_color +", default switch: "+light_switch+", default Light Brightness: "+ light_brightness);
    }       

    // accessor and mutator methods for all 3 data set.
    // get light brightness value
    public int getLight_brightness() {
        return light_brightness;
    }

    // set light brightness value
    public void setLight_brightness(int light_brightness) {
        this.light_brightness = light_brightness;
    }

    // get light switch value
    public boolean isLight_switch() {
        return light_switch;
    }

    // set light switch value
    public void setLight_switch(boolean light_switch) {
        this.light_switch = light_switch;
    }

    // get light color value
    public String getLight_color() {
        return light_color;
    }

    // set light color value
    public void setLight_color(String light_color) {
        this.light_color = light_color;
    }    
    // Overridding toString default Function to our desiged string returning Function
    @Override
    public String toString() {
        // when light switch is on
        if(light_switch == true)return "Light color is: "+light_color+" and its brightness level is at "+light_brightness; 
        // when light switch is off
        return "Light color is: "+light_color+". Light is off";        
    }       
    
}
