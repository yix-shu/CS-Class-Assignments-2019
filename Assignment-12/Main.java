/*
Name: Yixing Xu
Date: January 27, 2020
Student ID: 950706619
Course: CS211 Online
Objective of assignment: 
Quiz12
*/
public class Main {
  public static void main(String[] args) {
    Quiz12 test = new Quiz12("D:\\");
    System.out.println(test.fileCount()); // 99652, and took a few seconds to run
  }
  // one field as the root to search from
  private File root;

  // constructor must have root parameter
  public Main(String path) {
    root = new File(path);
  }

  // public method
  public int fileCount() {
    return fileCount(root);
  }
      
  private static int fileCount(File next) { 
    int fileCount = 0; 
    File[] files = files.listFiles();
    if (next.listFiles() == null) { //checks if there are files in the folder
      return 0;
    }
    else{
      if (next.isFile()){ //checks if it is a file
        for(int i = 0; i<files.length; i++){ //iterates through the array of files
        fileCount +=1;
        }
      }
      return fileCount;
    }
  }
}