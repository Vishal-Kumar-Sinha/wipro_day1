/*
Write a Java program to implement a HashMap that stores student roll numbers (Integer) 
as keys and their names (String) as values. Perform the following operations:
Insert five student records.
Retrieve and display the name of a student using a specific roll number.
Remove a student entry using a roll number.
Display all student records.
 */
import java.util.*;
public class HMDemo {
    public static void main(String[] args) {
        Map<Integer,String> hm=new HashMap<>();
        hm.put(1, "Vishal K S");
        hm.put(2, "John Doe");
        hm.put(3, "Jason Smith");
        hm.put(4, "Jin Gu");
        hm.put(5, "Crissy Kent");
        System.out.println("All student details : "+hm);
        System.out.println("Name of roll number 3 student : "+hm.get(3));
        hm.remove(3);
        System.out.println("After removing roll number 3 student...: "+hm);
        System.out.println("All Student Records :\nRoll   :  Name");
        for(Map.Entry<Integer, String> e:hm.entrySet()) {
            System.out.println(e.getKey()+"      :  "+e.getValue());
        }
    }
}
