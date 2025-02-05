
/*
 Write a Java program that demonstrates the use of lambda expressions 
 to sort a list of strings in reverse alphabetical order. Then, implement 
 a functional interface StringProcessor with a method process(String str) 
 that takes a string and returns its uppercase version. Use this functional 
 interface in conjunction with a lambda expression to process a list of 
 strings and print their uppercase forms.
 Hint: Use List.sort(), lambda expressions, and String::toUpperCase
 */
import java.util.List;
import java.util.Arrays;

interface StringProcessor {
    String process(String s);
}
public class LambdaDemo {
    public static void main(String[] args) {
        List<String> l=Arrays.asList("dog","apple","cat","ball","eagle");
        System.out.println("Initial list: "+l);
        l.sort((s1, s2) -> s2.compareTo(s1));
        System.out.println("Sorting in reverse alphabetical order: "+l);
        StringProcessor stp=String::toUpperCase;
        System.out.println("Uppercase list:");
        l.forEach(s -> System.out.println(stp.process(s)));
    }
}
