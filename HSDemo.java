/*
Write a Java program to create a HashSet of strings. Perform the following operations:
Add five city names to the set, ensuring at least one duplicate entry.
Display the elements to show that duplicates are not allowed.
Check if a particular city exists in the set.
Remove a city and display the updated set.
*/
import java.util.*;
public class HSDemo {
    public static void main(String[] args) {
        Set<String> st=new HashSet<>();
        st.add("Pune");
        st.add("Hyderabad");
        st.add("Chennai");
        st.add("Kolkata");
        st.add("Hyderabad");
        System.out.println("HashSet : "+st);
        System.out.println("Checking if Pune exists : "+st.contains("Pune"));
        System.out.println("Checking if Bengalore exists : "+st.contains("Bengalore"));
        st.remove("Chennai");
        System.out.println("Updated HashSet after removing Chennai : "+st);
    }
}
