package CompositionEX;

public class Ceiling {
    private int height;
    private int paintedColor;

//    Cons:
    public Ceiling(int height, int paintedColor) {
        this.height = height;
        this.paintedColor = paintedColor;
    }
//    Getters:
    public int getHeight() {
        return height;
    }
    public int getPaintedColor() {
        return paintedColor;
    }
}
