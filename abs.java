abstract class Ball {
    int a=9;
    abstract void getBAll();
}
class Ball2 extends Ball{
    void getBAll() {
        System.out.println("I got the ball\na="+a);
    }
}
public class abs {
    public static void main(String[] args) {
        Ball2 b=new Ball2();
        b.getBAll();
    }
}
