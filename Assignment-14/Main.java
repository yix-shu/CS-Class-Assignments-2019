/*
Name: Yixing Xu
Date: February 10, 2020
Student ID: 950706619
Course: CS211 Online
Objective of assignment: 
Write a mirror(x) and a mirror(y) method that returns the Stack of integers + backgrounds and the Queue of integers + backwards, respectively.
*/
import java.util.*;
import java.io.*;
public class Main{
  public static void main(String[] args){

  }
  public static Stack<Integer> mirror(Stack<Integer> x){
    Stack<Integer> top = new Stack<Integer>();
    Stack<Integer> bottom = new Stack<Integer>();
    Stack<Integer> og = new Stack<Integer>();
    while (!x.empty()){
      int value = x.pop();
      bottom.push(value);
    }
    while(!bottom.empty()){
      int valueBottom = bottom.pop();
      og.push(valueBottom);
      top.push(valueBottom);
      x.push(valueBottom);
    }
    while (!top.empty()){
      int valueTop = top.pop();
      og.push(valueTop);
    }
    return og;
  }
  public static Queue<Integer> mirror(Queue<Integer> y){
    Queue<Integer> ordered = new Queue<Integer>();
    Stack<Integer> mirrored = new Stack<Integer>();
    while (!y.empty()){
      int bottomValue = y.remove();
      og.push(bottomValue);
      ordered.add(bottomValue);
    }
    while(!og.empty()){
      int mirroredValue = og.pop();
      ordered.add(mirroredValue);
    }
    return ordered;
  }
}