class Shape {
    void getName() {
        System.out.println("Shape");
    }
}
class Rectangle extends Shape{
    void getName() {
        System.out.println("Rectangle");
    }
}
public class rnpoly {
    public static void main(String[] args) {
        Shape s1=new Shape();
        s1.getName();
        Shape s2=new Rectangle();
        s2.getName();
        Rectangle s3=new Rectangle();
        s3.getName();
    }
}
