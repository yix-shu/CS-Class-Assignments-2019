/*
Full name: Yixing Xu
Student ID: 950706619
Date: October 27, 2019
Description of program:
  This program will try to guess the user's number through trial and error and learning from the error. When the user answers that a guess is too high, that is stored as the new upper bound. When the user answers that a guess is too low, that is stored as the new lower bound.

  I answered the bonus question on line 34.
*/
import java.util.*; //import java.util.* to access Scanner
public class GuessingGame{
  static Scanner scannie = new Scanner(System.in); //create a new Scanner
  static Random rand = new Random(); //create random function
  static int lb = 0, ub = 0;
  static boolean input = true, goodInput = false, correct = false;
  public static void main(String[] args) {
    System.out.println("**Please think of a number for me (the computer) to guess.**\n");
    
    lb = lowerBounds(); //calls lowerBounds() method to get user's lowerbound

    ub = upperBounds(); //calls upperBounds() method to get user's upperbound

    while (correct == false){
      int upper = (ub + 1); //creates the upper bound for the range for the random number generator

      int randomNum = rand.nextInt(upper - lb) + lb; //creates the entire range for the random number generator


      input = true;//boolean to initiate the 2nd while loop
      while (input == true){
        System.out.println("Is it " + randomNum + "? (Enter a 'h' for too high, 'l' for too low, or 'c' for correct) "); 
        String userInput = scannie.next();

        //BONUS:
        if ((!userInput.equalsIgnoreCase("C")) && (ub == lb) ){ //checks for whether the user is cheating or not, based on whether the user continues to say that the guessed number is too high or too low and if the lower bound is equal to the upper bound, because this would mean that all of the possible numbers have been guessed.

          System.out.println("**That's not possible! You're cheating!\nLet's restart.**");

          System.out.println("\n~~NEW GAME~~\n");
          
          restart(); //calls restart function
        }
        if (userInput.contains("h") || userInput.contains("H")){ //checks for different user inputs so that both "h" and "H" are accepted by the program
          ub = randomNum; //stores the user's input as the new upper bound so that the computer is able to narrow down the range of the random number generator

          input = false; //breaks the 2nd while loop by making the 2nd while loop's boolean false
        } else if (userInput.contains("l") || userInput.contains("L")){ 

          lb = randomNum;//stores the user's input as the new lower bound so that the computer is able to narrow down the range of the random number generator
          input = false;//breaks the 2nd while loop by making the 2nd while loop's boolean false
        } else if (userInput.contains("C")|| userInput.contains("c")){
            System.out.println("\n**Aha, so I am a genius!**");

            goodInput = false; 
            while (goodInput == false){
              System.out.println("Play again? (Y or N) ");
              String answer = scannie.next();
              if (answer.equalsIgnoreCase("y")){
                System.out.println("\n~~NEW GAME~~\n");
                restart(); //calls restart function
              }
              if (answer.equalsIgnoreCase("n")){
                goodInput = true; //breaks third while loop
                correct = true; //breaks first while loop
                input = false; //breaks second while loop
              }
            }
        } else{
          System.out.println("Input not recognized. Try again."); //reinitiates while loop is input is unrecognized.
        }
      }
    }
  }
  public static int upperBounds(){ //asks for user's upper bound

    System.out.println("Put in a upper bound number: "); //stores the user's input for upper bound so that it can be used for the random number generator into variable called "ub"

    int ub =scannie.nextInt();
    return ub;
  }
  public static int lowerBounds(){ //asks for user's lower bound
    System.out.println("Put in a lower bound number: "); //stores the user's input for lower bound so that it can be used for the random number generator into variable called "lb"

    int lb = scannie.nextInt();
    return lb;
  }
  public static void restart(){
    goodInput = true; //breaks third while loop
    input = false;//breaks second while loop      
    lb = lowerBounds(); //continues playing by asking for new lower bound            
    ub = upperBounds(); //contines playing by asking for new upper bound
  }
}