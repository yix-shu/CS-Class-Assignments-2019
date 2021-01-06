/*
Full name: Yixing Xu
Student ID: 950706619
Date: November 20, 2019
Description of program:
  This program copies the original array into another array
*/
import java.util.Arrays;
public class ex3CopyArray {
  public static void main(String[] args) {
    int[] my_array = new int[]{25, 10, 55, 65, 36, 92, 77, 8, 13, 79};
    int[] new_array = new int[10];
    for (int i = 0; i < my_array.length; i++){ //iterates through all of the elements of the original array and then saves each individual element into the new one with the same index
      new_array[i] = my_array[i];
    }
    System.out.println("Source Array : "+Arrays.toString(my_array));
    System.out.println("New Array: "+Arrays.toString(new_array));
  }
}
//Source Array : [25, 10, 55, 65, 36, 92, 77, 8, 13, 79]
//New Array: [25, 10, 55, 65, 36, 92, 77, 8, 13, 79]
