package controller;

public class Remote {
    private int colour;
    private double width,height,depth;
    public Remote(){
        colour=10;
        width=15;
        height=20;
        depth=25;
    }

    public Remote(int colour, double width, double height, double depth) {
        this.colour = colour;
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public int getColour() {
        return colour;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getDepth() {
        return depth;
    }

    public void setColour(int colour) {
        this.colour = colour;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }
    public boolean turnOff(){
        return false;
    }
    public boolean turnOn(){
        return true;
    }
}