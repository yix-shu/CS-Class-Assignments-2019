/*
Full name: Yixing Xu
Student ID: 950706619
Date: November 20, 2019
Description of program:
  This program inserts a new value into a pre-existing array
*/
import java.util.Arrays;
public class ex4Insert {
  public static void main(String[] args) {
    int[] my_array =new int[] {25, 10, 55, 65, 36, 92, 77, 8, 13, 79};
    // Insert an element in 3rd position of the array (index->3, value->12)
    int Index_position = 3;
    int newValue = 12;
    System.out.println("Original Array : "+Arrays.toString(my_array));
    for (int i = (my_array.length-1); i > (Index_position); i--){//shifts all of the elements to the right within the array
      my_array[i]=my_array[i-1];
    }
    my_array[Index_position] = newValue;//replaces the element that is in the index "3" with the new value "12" after shifting the array
    System.out.println("New Array: "+Arrays.toString(my_array));
  }
}
//Original Array : [25, 10, 55, 65, 36, 92, 77, 8, 13, 79]
//New Array: [25, 10, 55, 12, 65, 36, 92, 77, 8, 13]
