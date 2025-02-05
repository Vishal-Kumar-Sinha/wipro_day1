
interface intr{
    
    default void getit() {
        System.out.println("gotit");
    }
    default void getit(int n) {
        System.out.println("got it "+n);
    }
}
class B implements intr {
    public void getit() {
        System.out.println("B got it");
    }
}
public class Ltest {
    public static void main(String[] args) {
        B b=new B();
        b.getit();
        b.getit(9);
    }
}
