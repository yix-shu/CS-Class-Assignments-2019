/*
Name: Yixing Xu
Date: February 24, 2020
Student ID: 950706619
Course: CS211 Online

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class Main implements Iterable<E> {  
  public static void main(String[] args) {
    ArrayList<Integer> quiz15 = new ArrayList<Integer>();
    quiz15.mirror();
    System.out.println(quiz15); // []
    quiz15.add(1); quiz15.add(2); quiz15.add(3);
    quiz15.mirror();
    System.out.println(quiz15); // [1, 2, 3, 3, 2, 1]
    quiz15.mirror();
    System.out.println(quiz15); // [1, 2, 3, 3, 2, 1, 1, 2, 3, 3, 2, 1]
  }
}
*/
  