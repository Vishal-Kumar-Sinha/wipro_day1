import java.util.*;

public class AL {
    static void queueDemo() {
        Queue<String> q=new PriorityQueue<>();
        q.add("apple");
        q.add("ball");
        q.add("cat");
        q.add("doll");
        q.offer("vishal");
        System.out.println("\nQUEUE DEMO");
        System.out.println("Size = "+q.size());
        System.out.println(q);
        System.out.println("useing element(), head = "+q.element());
        System.out.println(q);
        System.out.println("Using peek(), head = "+q.peek());
        System.out.println(q);
        System.out.println("Using poll(), head = "+q.poll());
        System.out.println(q);
    }
    static void alDemo() {
        List<String> al=new ArrayList<>();
        al.add("Apple");
        al.add("Grapes");
        al.add("Pinapple");
        al.add(1,"potato");
        System.out.println("\nLIST DEMO");
        System.out.println("For each loop ::");
        for(String a:al) {
            System.out.println(a);
        }
        System.out.println("---------\nIterator ::");
        Iterator itr=al.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
        System.out.println("Size = "+al.size());
    }
    static void setDemo() {
        Set<String> hs=new HashSet<>();
        hs.add("App1");
        hs.add("App2");
        hs.add("App1");
        System.out.println("\nSET DEMO");
        Iterator it=hs.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("Size = "+hs.size());
    }
    static void mapDemo() {
        Map<String, Integer> mp=new HashMap<>();
        mp.put("abb",9);
        mp.put("bbc", 12);
        mp.put("ccd", 42);
        mp.put("abb", 25);
        System.out.println("\nMAP DEMO");
        for(Map.Entry<String, Integer> e:mp.entrySet()) {
            System.out.println(e.getKey()+" : "+e.getValue());
        }
        System.out.println("Size = "+mp.size());
        System.out.println(mp);
    }
    public static void main(String[] args) {
        alDemo();
        setDemo();
        mapDemo();
        queueDemo();
    }
}
