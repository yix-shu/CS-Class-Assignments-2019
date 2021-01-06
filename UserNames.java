/*
Full name: Yixing Xu
Student ID: 950706619
Date: November 7, 2019
Description of program:
  This program allows the user to create a username, which will be saved/written into an output file. However, the username must have a special character, start with an uppercase letter, contain numbers, contain uppercase and lowercase letters, and be betwwen 4-7 characters/letters in length
*/
import java.util.*;
import java.io.*;

public class UserNames {
  public static int index = 1;
  public static int i = 0;
  public static String[] userNames = new String[index];
  public static boolean[] pass = new boolean[7];
  public static boolean loop = true;
  public static String[] state = new String[]{"Your username must begin with a letter", "Your username must contain at least one lowercase letter", "Your username must contain at least one uppercase letter", "Your username must contain at least one special character", "Your username must contain at least one number", "Your username must be between 4-7 characters long", "That username is already taken. Please choose a new username."};
  public static Scanner scannie = new Scanner(System.in); //creates scanner to get user's input
  public static String user = ""; //stores variable "user" to store user's input
  public static void main(String[] args) throws FileNotFoundException {

    Scanner scanny = new Scanner(new File("users.txt")); //creates scanner to scan file
    //PrintStream out = new PrintStream("users.txt");
    System.out.println("List of pre-existing usernames: ");
    System.out.println("-------------------------------");

    /*
    Scans the file and stores the pre-existing usernames into the array "userNames" and then prints out the usernames:
    */
    while (scanny.hasNext()){
      userNames[i] = scanny.next();
      System.out.println(userNames[i]);
      index += 1;
      i += 1;
      userNames = new String[index];
    }

    System.out.println("-------------------------------");
    while(loop == true){ //initiates loop to get user's username until the username fits all the criteria
      for (int x = 0; x <= 5; ++x){
        pass[x] = false;
      }
      System.out.println("Enter a new username: ");
      user = scannie.next();
      char[] characters = user.toCharArray(); //splits the username string into characters so that the program can check each character to see if they fit the criteria

      pass[6] = true;
      /*
      for (int y = 0; y <= i; y ++){
        if (userNames[y].equals(user)){
          System.out.println("That username has already been taken. Please choose a new one. ");
          pass[6] = false;
        }
      }
      */
      for (int x = 0; x <= (characters.length -1); x++){ //iterates through and checks each character of the username
        if (((user.charAt(0) >= 65) && (user.charAt(0) <= 90))||((user.charAt(x) >= 97) && (user.charAt(x) <= 122))){ //checks if the first character of the username is a letter
          pass[0] = true;
        } 
        if ((user.charAt(x) >= 97) || (user.charAt(x) <= 122)){ //checks if the username contains a lowercase letter through checking the ASCII value of the char
          pass[1] = true;
        } 
        if ((user.charAt(0) >= 65) || (user.charAt(0) <= 90)){ //checks if the username contains an uppercase letter through checking the ASCII value of the char
          pass[2] = true;
        }
        
        if (((user.charAt(x) >= 32) && (user.charAt(x) <= 47)) || ((user.charAt(x) >= 58) && (user.charAt(x) <= 64)) || ((user.charAt(x) >= 91) && (user.charAt(x) <= 96)) ||((user.charAt(x) >= 123) &&(user.charAt(x) <= 126))){ //checks if the username contains special characters by checking the ASCII value of the char
          pass[3] = true;
        }
        if ((user.charAt(x) >= 48) && (user.charAt(x) <= 57)){ // checks if the username contains a number
          pass[4] = true;
        }
        if ((characters.length>=4)&&(characters.length<=7)){
          //checks if the username is between 4 and 7 characters long
          pass[5] = true;
        }
        for (int y = 0; y <= i; y ++){ //iterates through the array of usernames to see if there is already a pre-existing username of the same characters
          String use = userNames[y];
          if (use.equals(user)){
            System.out.println("That username has already   been taken. Please choose a new one. ");
            pass[6] = false;
          }
        }
      }

      int yes = 0;
      for (int x = 6; x >= 0; --x){ //prints appropriate statements/diagnoses for the criteria that is not met
        if (pass[6] == false){
          System.out.println(state[6]);
          x = 0; //if there is a duplicate username, the program will only print that there is already a duplicate username
        }else if (pass[x] == false){
          System.out.println(state[x]);
        }
        else{
          yes += 1;
        }
      }
      if (yes == 5){
        loop = false;
      }else{
        System.out.println("**Please try again**");
      }
    }
    index += 1;
    i+=1;
    userNames[i] = user;
    System.out.println("Congratulations. Your new username is " + user);
    /*
    Prints all of the usernames in the array to the "users.txt" file
    */
    PrintStream out = new PrintStream("users.txt");
    for (int y = 0; y < index; y++){
      out.println(userNames[y]);
    }
  }
}