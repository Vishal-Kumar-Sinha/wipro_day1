/*
Write a Java program to create an ArrayList of integers. Perform the following operations:
Add five integer elements to the list.
Remove the third element.
Update the second element with a new value.
Display all the elements using a loop.
 */
import java.util.*;
public class ALDemo {
 public static void main(String[] args) {
    List<Integer> al=new ArrayList<>();
    al.add(3);
    al.add(78);
    al.add(9);
    al.add(26);
    al.add(7);
    System.out.println("ArrayList : "+al);
    al.remove(2);
    System.out.println("After removing 3rd element, ArrayList : "+al);
    al.set(1, 102);
    System.out.println("After updating 2nd element, ArrayList : "+al);
    System.out.println("ArrayList traversal using a loop :");
    for(Integer i:al) {
        System.out.println(i);
    }
 }
}