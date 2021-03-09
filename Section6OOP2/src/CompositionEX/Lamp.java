package CompositionEX;

public class Lamp {
    private String style;
    private boolean battery;
    private int globRating;

//    Cons:
    public Lamp(String style, boolean battery, int globRating) {
        this.style = style;
        this.battery = battery;
        this.globRating = globRating;
    }
//    Getters:
    public String getStyle() {
        return style;
    }
    public boolean isBattery() {
        return battery;
    }
    public int getGlobRating() {
        return globRating;
    }
//    Methods:
    public void turnOn(){
        System.out.println("Lamp --> Turning ON.");
    }
}

