/*
Full name: Yixing Xu
Student ID: 950706619
Date: November 20, 2019
Description of program:
  This program fnds the triplets in an array
*/
public class ex9TripleDuplicateString {
  static int indexes = 4;
  static String[] duplicates = new String[indexes];
  static String[] triplets = new String[indexes];
  public static void main(String[] args){
 String[] my_array = {"apple", "orange", "banana", "apple", "orange",
"apple", "grape"};
  int index = 0;
    for(int i = 0; i<(my_array.length); i++){ //iterates through the elements in an array and compares to the other elements using another for loop to iterate through the array to find the duplicate values
      for (int x = (i+1); x<(my_array.length); x++){
        if (my_array[i] == my_array[x]){
          duplicates[index] = my_array[i]; //stores the duplicates in an array called "duplicates"
          indexes += 1;
          index += 1;
        }
      }
    }
    for(int i = 0; i<(duplicates.length); i++){ //iterates through the duplicates array to find whether there were 2 repeats found. 2 repeats would mean that there was a triple duplicate
      for (int x = (i+1); x<(duplicates.length); x++){
        if (duplicates[i] == duplicates[x]){
          triplets[0] = duplicates[i]; //stores triple duplicates in an array called "triplets"
        }
      }
    }
    System.out.println(triplets[0]);
  }
}
//Triple Duplicate Element is : apple