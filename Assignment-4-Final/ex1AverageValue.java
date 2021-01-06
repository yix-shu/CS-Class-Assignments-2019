/*
Full name: Yixing Xu
Student ID: 950706619
Date: November 20, 2019
Description of program:
  This program finds the average value of all the elements in the array.
*/
public class ex1AverageValue {
  public static int sum = 0;
  public static void main(String[] args) {
    int[] numbers = new int[]{10, 20, 30, 40, -50, 60, -70};
    for (int x = 0; x < (numbers.length); x ++){
      sum += numbers[x];//iterates through all the elements in the array and adds them all up and saves it to a variable called "sum"
    }
    double average = (double)sum/numbers.length; //takes the sum and divdes it by the number of elements in the array to find the average which is a double
    System.out.println("Average value of the array elements is : " + average); 
  }
}