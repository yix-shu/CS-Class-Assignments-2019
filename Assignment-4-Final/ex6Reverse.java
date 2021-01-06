/*
Full name: Yixing Xu
Student ID: 950706619
Date: November 20, 2019
Description of program:
  This program reverses the placement of the elements in an array
*/
import java.util.Arrays;
public class ex6Reverse {
  public static void main(String[] args){
    int[] my_array1 = {2010, 2011, 2012, 2013, 2014, 2015, 2016, 2017, 2018, 2019};
    System.out.println("Original array : "+Arrays.toString(my_array1));
    for (int i = 0; i <(my_array1.length)/2; i++){ //iterates through the first half of the elements in the array 
      int temp = my_array1[my_array1.length-i-1]; //saves the value in a temporary variable to replace later
      my_array1[my_array1.length-i-1] = my_array1[i]; //replaces element with the value on the other side of the array
      my_array1[i] = temp; //replaces the element with the value of the temporary variable
    }
    System.out.println("Reverse array : "+Arrays.toString(my_array1));
  }
}
//Original array : [2010, 2011, 2012, 2013, 2014, 2015, 2016, 2017, 2018, 2019]
//Reverse array : [2019, 2018, 2017, 2016, 2015, 2014, 2013, 2012, 2011, 2010]
