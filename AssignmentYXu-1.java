/*
Full name: Yixing Xu
Student ID: 950706619
Date: October 3, 2019
Description of program:
  This program retrieves the user's input and uses it to calculate the areas of the shapes dictated by the user using the dimensions they provide. This is done through the combination of if statements, Scanners, creating methods, return values, and paramter passing.
*/

import java.util.*;
public class AssignmentYXu {
  //Creates new scanner to use to get user input
  static Scanner scanie = new Scanner(System.in);
  static double height, width, radius, shape1area, shape2area;
  static String shape1, shape2;

    public static void main(String[] args) {
    //Asks user for first shape and assigns the string to a variable called "shape1"
    shape1 = ask();
    shape1area = check(shape1);
    System.out.println();

    //Asks user for second shape and assigns the string to a variable called "shape2"
    shape2 = askSecond();
    shape2area = check(shape2);
    System.out.println();
    //calls the Compare() method:
    compare(shape1, shape2, shape1area, shape2area);
    System.out.println();
  }

  public static String ask(){
    System.out.println("Choose a shape (Rectangle, Triangle, Circle) :");
    String shape1 = scanie.nextLine(); //Gets the user's input on the shape and stores it as a string int he variable "shape1"
    return shape1;
  }

  public static String askSecond(){
    System.out.println("Choose a different shape now (Rectangle, Triangle, Circle): "); //Gets the user's input on the shape and stores it as a string int he variable "shape2"
    String shape2 = scanie.next();
    return shape2;
  }

  public static double check(String shape){
    if (shape.equalsIgnoreCase("Circle")){ //Checks if the user chose "circle" to execute appropriate code and methods for calculating the area. Bypasses the uppercase or lowercase lettering of the user's input by using the ".equalsIgnoreCase()" function
      double shape1area = get_CircArea();
      return shape1area;
    }
    if (shape.equalsIgnoreCase("Rectangle")){
      double shape1area = get_RectArea(); //Checks if the user chose "rectangle" to execute appropriate code and methods for calculating the area. Bypasses the uppercase or lowercase lettering of the user's input by using the ".equalsIgnoreCase()" function
      return shape1area;
    }
    if (shape.equalsIgnoreCase("Triangle")){
      double shape1area = get_TriArea(); //Checks if the user chose "triangle" to execute appropriate code and methods for calculating the area. Bypasses the uppercase or lowercase lettering of the user's input by using the ".equalsIgnoreCase()" function
      return shape1area;
    }
    return shape1area; //returns the area of the first shape and stores in the variable "shape1area" when called
  }
  //calculates the area of the rectangle using the dimensions provided by the user
  public static double rectArea(double width, double height){
    double area = width*height;
    return area;
  }
  //calculates the area of the circle using the dimensions provided by the user:
  public static double circArea(double radius){
    double area = radius*radius*3.1415926535897932384626433832795028841971693993;
    return area;
  }
  //calculates the area of the triangle using the dimensions provided by the user:
  public static double triArea(double width, double height){
    double area = width*height*0.5;
    return area;
  }

  public static double get_RectArea(){
    System.out.println("Width of the rectangle: ");
    double width = scanie.nextDouble();//gets user's input for width of rectangle in the double data type and assigns it to a variable called "width"
    System.out.println("Height of the rectangle: ");
    double height = scanie.nextDouble(); //gets user's input for height of rectangle in the double data type and saves it to a variable called "height"
    double shapearea = rectArea(width, height);
    System.out.println("The rectangle's area is " + shapearea);//prints out calculated area of the rectangle
    return shapearea;
  }

  public static double get_CircArea(){
    //Area of circle
    System.out.println("Radius of the circle: ");
    double radius = scanie.nextDouble(); //gets user's input for radius of circle in the double data type and assigns it to variable called "Radius"       
    double shapearea = circArea(radius);
    System.out.println("The circle's area is " + shapearea);
    //prints out calculated area of the circle
    return shapearea;
  }

  public static double get_TriArea(){
    //Area of Triangle
    System.out.println("Width of the triangle: "); 
    double width = scanie.nextDouble(); //gets user's input for width of triangle in the double data type and assigns to variable called "width" 
    System.out.println("Height of the triangle: "); 
    double height = scanie.nextDouble(); //gets user's input for height of triangle in the double data type and assigns to variable called "height" 

    double shapearea = triArea(width, height);      
    System.out.println("The triangle's area is " + shapearea); //prints out calculated area of the triangle
    return shapearea;
  }

  public static void compare(String shape1, String shape2, double shapearea1, double shapearea2){
    //compares the two shapes to see which one is larger or if they are equal 
      double factor = (shapearea1) / (shapearea2);
      if (factor > 1){
        System.out.println("The " + shape1 + " is larger than " + shape2 + " by a factor of " + factor); //prints out which shape is larger and by how much
      } 
      if (factor < 1){
        System.out.println("The " +shape1 + " is smaller than " + shape2 + " by a factor of " + factor); //prints out which shape is larger and by how much
      } 
      if (factor == 1){
        System.out.println("The " +shape1 + " is the same size as " + shape2 + ". They are both " + shapearea1); //prints out that the shapes are the same size and their sizes.
    } 
    System.out.println();
  }
}