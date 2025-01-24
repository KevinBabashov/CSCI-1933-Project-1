// FractalDrawer class draws a fractal of a shape indicated by user input
import java.awt.Color;
import java.util.Scanner;

public class FractalDrawer {
    private double totalArea=0;  // member variable for tracking the total area
    private Color[] myArray = {Color.green, Color.black, Color.yellow, Color.pink, Color.orange, Color.blue};
    public FractalDrawer() {}  // contructor

       public double drawFractal(String type) { // The drawFractal class is where the user input is taken and then evaluated for what type of shape it is.
        Canvas drawing  = new Canvas(2000, 2000);
        if (type.equals("Triangle") || type.equals("triangle")) { // Checks if type is equal to triangle and then sets all parameters of first triangle.
            drawTriangleFractal(300, 300, 700, 700, Color.RED, drawing, 7); {}
        }
        else if (type.equals("Circle") || type.equals("circle")) { // Checks if type is equal to Circle
            drawCircleFractal(150,850, 450, Color.RED, drawing, 7); {}
        }
        else if (type.equals("Rectangle") || type.equals("rectangle")) { // Checks if type is equal to Rectangle
            drawRectangleFractal(300, 300, 750, 350, Color.RED, drawing, 7); {}
        }
        return totalArea; // Once recursive call from one of the 3 methods is called and returned it gives us our total area by keeping track of the total area as a method variable.
    }
    public void drawTriangleFractal(double width, double height, double x, double y, Color c, Canvas can, int level){
        Triangle myTriangle = new Triangle(x, y, width, height);
        can.drawShape(myTriangle); // This line draws the shape from each level which are then called again from our recursive call. 
        myTriangle.setColor(c); // sets the color to one of 6 choices based on the modulos division of the level by the 6 choice. 
        totalArea += myTriangle.calculateArea(); // Keeps track each triangle recursive call's area and adds that area to the total area method variable
        if (level != 0) {
            drawTriangleFractal(width / 2, height / 2, x + width, y, myArray[level % 6], can, level - 1); // These last three calls are all recursive calls that represent each corner of the Triangle meaning that the 3 corners of the triangle will have another triangle drawn there. 
            drawTriangleFractal(width / 2, height / 2, x - (width / 2), y, myArray[level % 6], can, level - 1);
            drawTriangleFractal(width / 2, height / 2, x + (width / 4), y - height, myArray[level % 6], can, level - 1);
            
        }  
    }
    public void drawCircleFractal(double radius, double x, double y, Color c, Canvas can, int level) { // drawcirclefractal method uses recursive calls to fractal the circle 7 times.
        Circle myCircle = new Circle(x, y, radius); // Creates circle object that is then given a x, y and radius which can be used to draw the circles in the recursive calls.
        can.drawShape(myCircle); // Draws circle for each recursive call
        myCircle.setColor(c); // sets colors for each recursively called circle dependeing on the level or depth of the circle.
        totalArea += myCircle.calculateArea();
        if (level >= 1) { // checks the level until it reaches the 7 recursion in which case the if block returns false and returns to the drawFractal method.
            drawCircleFractal(radius / 2, x - (33.0 / 32.0) * radius, y + (33.0 / 32.0) * radius, myArray[level % 6], can, level -1);
            drawCircleFractal(radius / 2, x + (33.0 / 32.0) * radius, y + (33.0 / 32.0) * radius, myArray[level % 6], can, level -1);
            drawCircleFractal(radius / 2, x - (33.0 / 32.0) * radius, y - (33.0 / 32.0) * radius, myArray[level % 6], can, level -1);
            drawCircleFractal(radius / 2, x + (33.0 / 32.0) * radius, y - (33.0 / 32.0) * radius, myArray[level % 6], can, level -1);
        }
    }
    public void drawRectangleFractal(double width, double height, double x, double y, Color c, Canvas can, int level) { // method uses recursive calls to fractal rectangle 7 times.
        Rectangle myRectangle = new Rectangle(x, y, width, height); // creates new Rectangle object that can then be used to draw shapes.
        can.drawShape(myRectangle); // method draws shape on canvas page.
        myRectangle.setColor(c); // sets color of drawn shape.
        totalArea += myRectangle.calculateArea(); // includes track of totalArea by calculating area of each rectangle thats recursively called.
        if (level >= 1) {
            drawRectangleFractal(width / 2, height / 2, x - width / 2, y + height, myArray[level % 6], can, level - 1);
            drawRectangleFractal(width / 2, height / 2, x + width, y + height, myArray[level % 6], can, level - 1);
            drawRectangleFractal(width / 2, height / 2, x + width, y - height / 2, myArray[level % 6], can, level - 1);
            drawRectangleFractal(width / 2, height / 2, x - width / 2, y - height / 2, myArray[level % 6], can, level - 1);
        }
    }
    public static void main(String[] args){
        FractalDrawer myFractalDrawer = new FractalDrawer(); // calls fractal drawer constructor to initialize myFractalDrawer for the given shape.
        Scanner input = new Scanner(System.in); // Scanner used to take in users input 
        System.out.print("Should the fractal be a Rectangle, Circle or Triangle? "); // output of system to user.
        String shape = input.next(); // lines that accounts for what the user types next.
        while (!(shape.equals("Triangle")|| shape.equals("Circle") || shape.equals("Rectangle") || shape.equals("rectangle") || shape.equals("circle") || shape.equals("triangle")))  { //checks to see if input is one of the shapes given or just garbage and tells you to try again if your input is incorrect.
            System.out.println("Input " + shape + " is invalid. Please try again.");
            System.out.print("Should the fractal be a Rectangle, Circle or Triangle? ");
            shape = input.next();
            }
            System.out.println("Area of fractal is " + myFractalDrawer.drawFractal(shape) + " pixels."); // calls drawfractal method on the shape that the user gives.
            input.close(); // closes input of scanner class
        }
    }
