/*
Name: Yixing Xu
Date: January 31, 2020
Student ID: 950706619
Course: CS211 Online
Objective of assignment: 
Testing the runtime of fibonacci() and bigFastFib()
*/
import java.util.*;
public class Main{
  public static void main(String[] args){
    //Array for fibonacci()
    for (int x = 1; x <= 10; x++){
      long startTime = System.currentTimeMillis();
      int N = 25;
      for (int i = 0; i <= 10; i++){
        Fibonacci test = new Fibonacci(N);
        test.fibonacci();
        N+=2;
      }
      long endTime = System.currentTimeMillis();
      System.out.println((endTime - startTime));
    }
    System.out.println("");
    //Array for bigFastFib()
    for (int x = 1; x <= 10; x++){
      long startTime = System.currentTimeMillis();
      int N = 2000;
      for (int i = 0; i <= 10; i++){
        Fibonacci test = new Fibonacci(N);
        test.bigFastFib();
        N+=100;
      }
      long endTime = System.currentTimeMillis();
      System.out.println((endTime - startTime));
    }
    System.out.println("");
  }
}