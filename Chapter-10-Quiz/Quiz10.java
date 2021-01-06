/*
Name: Yixing Xu
Date: January 13, 2020
Student ID: 950706619
Course: CS211 Online
Objective of assignment: 
To swap pairs within an ArrayList, and to not do anything with the last element in the ArrayList if there are an odd number of elements in it. Also, the program must still run even if there is an empty ArrayList.

All of the conditions were tested and fulfilled.
*/
import java.util.ArrayList;
//starter code:
public class Quiz10{

  public static void main(String[] args){
    ArrayList<CalendarDate> dates = new ArrayList<CalendarDate>();
    dates.add(new CalendarDate(5, 5, 2018));
    dates.add(new CalendarDate(10, 2, 2018));
    dates.add(new CalendarDate(10, 7, 2017));
    dates.add(new CalendarDate(10, 7, 2020));
    System.out.println("         Before: " + dates);
    swapPairs(dates);
    System.out.println("After swapPairs: " + dates);
  }
  public static void swapPairs(ArrayList<CalendarDate> dates){
    for (int i = 0; i< dates.size(); i+=2){
      if(dates.size()%2==1 && i==(dates.size()-1)){
    
      }
      else{
        CalendarDate temp = dates.get(i);
        dates.set(i, dates.get(i+1));
        dates.set(i+1, temp);
      }
    }
  }
}