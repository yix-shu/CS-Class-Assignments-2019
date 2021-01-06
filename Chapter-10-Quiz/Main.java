import java.util.ArrayList;
//starter code:
class Main{

  public static void main(String[] args){
    ArrayList<CalendarDate> dates = new ArrayList<CalendarDate>();
    dates.add(new CalendarDate(5, 5, 2018));
    //dates.add(new CalendarDate(10, 2, 2018));
    //dates.add(new CalendarDate(10, 7, 2017));
    //dates.add(new CalendarDate(10, 7, 2020));
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