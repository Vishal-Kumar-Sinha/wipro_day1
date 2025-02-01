/* 
Write a java program by creating a custom exception of your own 
*/
class MyCustomException extends Exception {
    public MyCustomException(String s) {
        super(s);
    }
}
public class CE {
    static void f1() throws MyCustomException {
        throw new MyCustomException("Thrown my custom exception");
    }
    public static void main(String[] args) {
        try {
            f1();
        } catch(MyCustomException e) {
            System.out.println("My custom exception is caught :"+e.getMessage());
        }
    }
}