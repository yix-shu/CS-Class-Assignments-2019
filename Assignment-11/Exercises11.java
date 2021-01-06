import java.util.*;
/*
Name: Yixing Xu
Date: January 17, 2020
Student ID: 950706619
Course: CS211 Online
Objective of assignment: 
BJP4 Exercise 11.11: symmetricSetDifference
BJP4 Exercise 11.12: contains3
BJP4 Exercise 11.13: isUnique
BJP4 Exercise 11.14: intersect
BJP4 Exercise 11.15: maxOccurrences

Did not complete
*/
public class Exercises11
{
    public static void main(String[] a) {
        // Build Integer array
        Integer[] arrayI = {7,4,-9,4,15,8,27,7,11,-5,32,-9,-9};
        ArrayList<Integer> testListI = new ArrayList<Integer>();
        
        // Build an array of Strings
        String[] arrayS = {"Jane","Logan","Whitaker","Alyssa","Stefanie","Jeff","Kim","Sylvia"};
        ArrayList<String> testListS = new ArrayList<String>();
        
        // Build the Set of Strings:
        for (String s: arrayS) testListS.add(s);
        Set<String> testSetS = new TreeSet<String>(testListS);
        
        // Build the Set of Integers:
         Set<Integer> testSetI = new TreeSet<Integer>();       
        for (int i: arrayI) testSetI.add(i);
        
        // Build a Map of Strings:
        Map<String, String> testMapSS = new HashMap<String, String>();
        Map<String, Integer> testMapSI = new HashMap<String, Integer>();
        String[] array2 = {"Jane2","Logan2","Whitaker2","Alyssa2","Stefanie2","Jeff2","Kim2","Sylvia2"};
        for (int i=0; i<arrayS.length; i++) testMapSS.put(arrayS[i], array2[i]);
        for (int i=0; i<arrayS.length; i++) testMapSI.put(arrayS[i], i);
         
        // Exercise 11.8
        System.out.println(testSetS);
        //System.out.println("maxLength="+maxLength(testSetS));       
        
        // Exercise 11.11
        System.out.println(testSetI);
        //System.out.println("symmetricSetDifference="+symmetricSetDifference(testSetI,testSetI));
        
        // Exercise 11.12
        System.out.println(testListS);
        //System.out.println("contains3="+contains3(testListS));
        
        // Exercise 11.13
        System.out.println(testMapSS);
        //System.out.println("isUnique="+isUnique(testMapSS));
        
        // Exercise 11.14
        System.out.println(testMapSI);
        //System.out.println("intersect="+intersect(testMapSI,testMapSI));
        
        // Exercise 11.15
        System.out.println(testListI);
        //System.out.println("maxOccurrences="+maxOccurrences(testListI));
    }
    public symmetricSetDifference{

    }
    
public static boolean contains3(List<String> list){
    int times = 1;
    Map<String, Integer> map = new HashMap<>();
    for (int i = 1; i < list.size(); i++)
    {
        times = 1;
        if(map.containsKey(list.get(i))){
            times = (map.get(list.get(i)))+1;
            map.put(list.get(i), times);
        }
        else{
            map.put(list.get(i), times);
        }
    }
    return map.containsValue(3);
}
    public static boolean isUnique(Map<String, String> map){
    Collection<String> mapValues = map.values();
    Map<Integer, String> map2 = new HashMap<>();
    boolean bool = true;
    int i = 0;
    for (String value : mapValues){
        i+=1;
        if(map.containsValue(value)){
            bool = false;
        }
        else{
            map.put(i, value);
        }
    }
    return bool;
}
    public maxOccurrences{

    }
}