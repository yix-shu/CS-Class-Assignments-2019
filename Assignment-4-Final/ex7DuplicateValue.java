/*
Full name: Yixing Xu
Student ID: 950706619
Date: November 20, 2019
Description of program:
  This program finds duplicate values within an array
*/
import java.util.Arrays;
public class ex7DuplicateValue {
  static int indexes = 2;
  static int[] duplicates = new int[indexes];
  public static void main(String[] args){
    int[] my_array = {1, 2, 3, 3, 4, 5, 6, 2}; 
    int index = 0;
    for(int i = 0; i<(my_array.length); i++){ //iterates through the elements in an array and compares to the other elements using another for loop to iterate through the array. 
      for (int x = (i+1); x<(my_array.length); x++){
        if (my_array[i] == my_array[x]){
          duplicates[index] = my_array[i]; //stores the duplicates in an array called "duplicates"
          indexes += 1;
          index += 1;
        }
      }
    }
    System.out.println(Arrays.toString(duplicates));
  }
}
//Duplicate Element : 2
//Duplicate Element : 3
