import java.awt.Color;

public class Triangle {
    private double xPosition;
    private double yPosition;
    private double width;
    private double height;
    private Color color;
//  Constructor Method
public Triangle(double xPosition, double yPosition, double width, double height) {
    this.xPosition = xPosition;
    this.yPosition = yPosition;
    this.width = width;
    this.height = height;
}
// two methods used to calculate perimeter and area which are is used in fractalDrawing class.
public double calculatePerimeter() {
    return width + 2 * (Math.sqrt(Math.pow(width / 2, 2) +  Math.pow(height, 2))); 
}
public double calculateArea() {
    return 0.5 * width * height;
}
// Setter and Getter Methods 
public void setColor(Color newColor) {
    this.color = newColor;
}
public void setPos(double newXPosition, double newYPosition) {
    xPosition = newXPosition; yPosition = newYPosition;
}
public void setHeight(double newHeight) {
    height = newHeight;
}
public void setWidth(double newWidth) {
    width = newWidth;
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
public double getHeight() {
    return height;
}
public double getWidth() {
    return width;
}
}