import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Arrays;


interface Greet {
    void getMsg(String msg);    
}
interface Msg {
    void say();
}
interface Vcle {
    default void start() {
        System.out.println("Vehicle is starting......");
    }
}
class Carrr implements Vcle {

}
class Mreg {
    static void printMsg(String m) {
        System.out.println(m);
    }
    static void getMssg() {
        System.out.println("Static method in method reference class");
    }
    void getImsg() {
        System.out.println("Instance method in method reference class");
    }
}
class Test {
    void getTest() {
        System.out.println("Hi, this is test");
    }
}
public class lmddemo {
    static void streamEg() {
        List<String> al=Arrays.asList("Apple","Ball","Cat","Array");
        List<String> stlist=al.stream().filter(element -> element.startsWith("A")).collect(Collectors.toList());
        System.out.println(stlist);
        stlist.forEach(System.out::println);
    }
    static void functionalinterfacedemo() {
        Predicate<Integer> isOdd=n->n%2!=0;
        System.out.println(isOdd.test(2));
        System.out.println(isOdd.test(3));
    }
    static void optionalclassdemo() {
        String[] str=new String[5];
        str[1]="Vishal Kumar Sinha";
        Optional<String> op;
        //ofNullable and isPresent
        op = Optional.ofNullable(str[1]);
        if(op.isPresent()) {
            String temp=str[1].toUpperCase();
            System.out.println(temp);
        } else {
            System.out.println("default");
        }
        op = Optional.ofNullable(str[2]);
        if(op.isPresent()) {
            String temp=str[1].toUpperCase();
            System.out.println(temp);
        } else {
            System.out.println("default value");
        }
        //ifPresent and get
        str[3]="I am str[3]";
        op=Optional.ofNullable(str[3]);
        op.ifPresent(System.out::println);//why only reference variable is working?-----doubt?
        System.out.println("Using get() : "+op.get());
        //of, empty and orElse
        op=Optional.of(str[3]);
        System.out.println(op.orElse("str[0] is empty"));
        op=Optional.empty();
        System.out.println(op.orElse("str[0] is empty"));
    }
    static void datetimeDemo() {
        System.out.println("Loacal date: "+LocalDate.now());
        System.out.println("Local time: "+LocalTime.now());
        System.out.println("Local datetime: "+LocalDateTime.now());
        System.out.println("Formatted date");
        System.out.println(LocalDate.now().format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));
        System.out.println(LocalDate.now().format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)));
        System.out.println(LocalDate.now().format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));
        System.out.println(LocalDate.now().format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)));
        System.out.println("Formatted time");
        System.out.println(LocalTime.now().format(DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM)));
        System.out.println(LocalTime.now().format(DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT)));
    }
    public static void main(String[] args) {
        System.out.println("Lambda expressiion:");
        Greet g=(msg) -> System.out.println("Hello, "+msg);
        g.getMsg("Vishal");
        System.out.println("\nStream APT example:");
        streamEg();
        System.out.println("\nFunctional interface example:");
        functionalinterfacedemo();
        //how to create custom functional interface-------------doubt?
        System.out.println("\nDefault method in interface:");
        Carrr c=new Carrr();
        c.start();
        //can we overload or override default method------------doubt?
        System.out.println("\nMethod reference example:");
        Consumer<String> r=Mreg::printMsg;
        r.accept("Accepting msg from consumer");
        Mreg.getMssg();
        Mreg mg=new Mreg();
        Msg msg=mg::getImsg;
        msg.say();
        //how to know which java.util.functions are used when?---doubt?
        System.out.println("\nOptional class example:");
        optionalclassdemo();
        System.out.println("\nDate and time package example:");
        datetimeDemo();
        //couldnot understand executor services, explanationa required----doubt?
    }
}
