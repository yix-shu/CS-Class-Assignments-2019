/*
Full name: Yixing Xu
Student ID: 950706619
Date: November 20, 2019
Description of program:
  This program finds the minimum and maximum values of an array
*/
import java.util.Arrays;
public class ex5MinMax {
  static int max;
  static int min; 
  public static void max_min(int my_array[]) {
}
  public static void main(String[] args) {
    int[] my_array = {25, 10, 55, 65, 36, 92, 77, 8, 13, 79};
    max_min(my_array);
    System.out.println(" Original Array: "+Arrays.toString(my_array));
    int max = my_array[0];
    for (int i = 0; i < my_array.length; i ++){
      if(my_array[i] >= max){ //iterates through the elements in an array and replaces the value in the variable "max" when a new element of larger value than the current max is found
        max = my_array[i];
      }
    }
    System.out.println(" Maximum value for the above array = " + max);
    int min = my_array[0];
    for (int i = 0; i < my_array.length; i ++){ //iterates through the elements in an array and replaces the value in the variable "min" when a new element of smaller value than the current max is found
      if(my_array[i] <= min){
        min = my_array[i];
      }
    }
    System.out.println(" Minimum value for the above array = " + min);
  }
}
//Original Array: [25, 10, 55, 65, 36, 92, 77, 8, 13, 79]
//Maximum value for the above array = 92
//Minimum value for the above array = 8 