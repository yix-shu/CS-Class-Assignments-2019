/*
Full name: Yixing Xu
Student ID: 950706619
Date: November 20, 2019
Description of program:
  This program finds the index of any value/element in the array
*/
import java.util.*;
public class ex2FindIndex {
  public static int findIndex(int[] array, int element){
    int index = 0;
    for (int i = 0; i < array.length; i ++){
      if (array[i] == element){ //iterates through the array to find the element that is the same as the value given in the argument for findIndex(), and saves the index
        index = i;
      }
    }
    return index; //returns index to the called function
  }
  public static void main(String[] args) {
    int[] my_array = new int[] {25, 10, 55, 65, 36, 92, 77, 8, 13, 79};
    System.out.println("Index position of 55 is: " + findIndex(my_array, 55));
    System.out.println("Index position of 13 is: " + findIndex(my_array, 13));
  }
}
//Index position of 55 is: 2
//Index position of 13 is: 8