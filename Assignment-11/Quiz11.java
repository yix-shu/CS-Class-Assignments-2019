/*
Name: Yixing Xu
Date: January 20, 2020
Student ID: 950706619
Course: CS211 Online
Objective of assignment: 

Create a method "maxOccurrences(List<CalendarDate> quiz)" that iterates through a list of dates to return the greatest number of occurrences of the same date.

Create a method "maxUsingIterator(List<CalendarDate> quiz)" that iterates through a list of dates to return the most recent date. Must use an iterator.
*/
import java.util.*;
// starter code:
public class Quiz11 {
  public static void main(String[] args) {
    ArrayList<CalendarDate> list1 = new ArrayList<CalendarDate>();
    list1.add(new CalendarDate(5, 5, 2018));
    list1.add(new CalendarDate(1, 2, 2018));
    list1.add(new CalendarDate(5, 5, 2018));
    list1.add(new CalendarDate(10, 7, 2011));
    list1.add(new CalendarDate(5, 5, 2018));
    System.out.println(maxOccurrences(list1)); //   3
    System.out.println(maxUsingIterator(list1)); //   5/5/2018
  }

    // solutions go below here:
  public static int maxOccurrences(List<CalendarDate> quiz) { 
    int num = 0;
    Map<CalendarDate, Integer> map = new HashMap<CalendarDate, Integer>();
    for(int i = 0; i < quiz.size(); i++){
      CalendarDate date = quiz.get(i);
      if (map.containsKey(date)){
        map.put(date, map.get(date) + 1);
        if(num <(map.get(date))){
          num = map.get(date);
        }
      }
      else{
        map.put(date, 1);
      }
    }
    return num;
  }
  public static CalendarDate maxUsingIterator(List<CalendarDate> quiz){
    Iterator<CalendarDate> i = quiz.iterator();
    CalendarDate date = quiz.get(0);
    while(i.hasNext()){
      CalendarDate date2 = i.next();
      if (date.compareTo(date2)<0){
        date = date2;
      }
    }
    return date;
  }
}