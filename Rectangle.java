import java.awt.Color;

public class Rectangle { // method variables for Rectangle class
    private double xPosition;
    private double yPosition;
    private double width;
    private double height;
    private Color color;
    //  Constructor Method
public Rectangle(double xPosition, double yPosition, double width, double height) {
    this.xPosition = xPosition;
    this.yPosition = yPosition;
    this.width = width;
    this.height = height;
}
// Next two methods are used to  calculate area and perimeter of shape class. 
public double calculatePerimeter() {
    return 2.0 * width + 2.0 * height;
} public double calculateArea() {
    return width * height;
    // Setter and Getter Methods 
} public void setColor(Color newColor) {
    this.color = newColor;
} public void setPos(double newXPosition, double newYPoisiton) {
    xPosition = newXPosition; yPosition = newYPoisiton;
} public void setHeight(double newHeight) {
    height = newHeight;
} public void setWidth(double newWidth) {
    width = newWidth;
} public Color getColor() {
    return color;
} public double getXPos() {
    return xPosition;
} public double getYPos() {
    return yPosition;
} public double getHeight() {
    return height;
} public double getWidth() {
    return width;
}
}