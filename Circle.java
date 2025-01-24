import java.awt.Color;

public class Circle { // method variables 
    private double xPosition;
    private double yPosition;
    private double radius;
    private Color color; 
    // Constructor Methods 
public Circle(double xPosition, double yPosition, double radius) {
    this.xPosition = xPosition; // substantiates method variables to variables that can be used within the methods and set to a value given in parameter.
    this.yPosition = yPosition;
    this.radius = radius;
}
public double calculatePerimeter() { // next two methods are calculations done that one are needed later in program. 
    return radius * 2.0 * Math.PI;
}
public double calculateArea() {
    return Math.pow(radius, 2.0) * Math.PI;
}
// Setter and Getter methods in Java
public void setColor(Color newColor )  {
    this.color = newColor;
}
public void setPos(double newXPosition,double newYPosition) {
    xPosition = newXPosition; yPosition = newYPosition;
}
public void setRadius(double newRadius) {
    radius = newRadius;
}
public Color getColor() {
    return color;
}
public double getXPos() {
    return xPosition;
}
public double getYPos() {
    return yPosition;
}
public double getRadius() {
    return radius;
}
}