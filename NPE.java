/*
write a program that shows the implementation of null pointer exception &array 
index out of bound exception using try catch finally blocks
*/
public class NPE {
    static void f1() {
        int[]arr=new int[4];
        arr[4]=2;
    }
    @SuppressWarnings("null")
    static void f2() {
        String str=null;
        System.out.println(str.length());
    }
    public static void main(String[] args) {
        try {
            f2();
        } catch(NullPointerException npe) {
            System.out.println("Null pointer exception handled: "+npe.getMessage());
        }
        try {
            f1();
        } catch(ArrayIndexOutOfBoundsException abe) {
            System.out.println("Array index out of bounds exception handled: "+abe.getMessage());
        } finally {
            System.out.println("Finally block executed");
        }
    }
}