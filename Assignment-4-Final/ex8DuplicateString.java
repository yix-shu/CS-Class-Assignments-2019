/*
Full name: Yixing Xu
Student ID: 950706619
Date: November 20, 2019
Description of program:
  This program finds the duplicate strings in an array.
*/
public class ex8DuplicateString {
  static int indexes = 2;
  static String[] duplicates = new String[indexes];
  public static void main(String[] args){
    String[] my_array = {"apple", "orange", "kiwi", "mango", "banana", "apple","kiwi"};
    int index = 0;
    for(int i = 0; i<(my_array.length); i++){ //iterates through the elements in an array and compares to the other elements using another for loop to iterate through the array to find the duplicate strings
      for (int x = (i+1); x<(my_array.length); x++){
        if (my_array[i].equals(my_array[x])){
          duplicates[index] = my_array[i]; //stores the duplicates in an array called "duplicates"
          indexes += 1;
          index += 1;
        }
      }
    }
    System.out.println(duplicates[0] + duplicates[1]);
  }
}
//Duplicate Element is : apple
//Duplicate Element is : kiwi