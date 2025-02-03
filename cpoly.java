class Num {
    Num() {
        System.out.println("Default constructor");
    }
    Num(int n) {
        System.out.println("Parameterized constructor, n="+n);
    }
}
public class cpoly {
    public static void main(String[] args) {
        Num n1=new Num();
        Num n2=new Num(7);
    }
}
