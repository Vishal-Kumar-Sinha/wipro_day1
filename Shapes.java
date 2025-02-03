/*
Create a class structure for a Shape Drawing Application. Start 
with an abstract class Shape with a method draw(). Derive two 
classes: Circle and Rectangle. Implement the draw() method in both 
derived classes to display specific messages such as “Drawing a 
Circle” and “Drawing a Rectangle”. In the main program, create an 
array of Shape objects (including both circles and rectangles) and 
call the draw() method on each. Demonstrate polymorphism through this 
array.
  */
abstract class Shape {
    abstract void draw();
}
class Rectangle extends Shape{
    void draw() {
        System.out.println("Drawing a Rectangle");
    }
}
class Circle extends Shape{
    void draw() {
        System.out.println("Drawing a Circle");
    }
}
public class Shapes {
    public static void main(String[] args) {
        Shape[] s=new Shape[5];
        for(int i=0;i<s.length;i++) {
            if(i%2==0) {
                s[i]=new Rectangle();
            } else {
                s[i]=new Circle();
            }
            s[i].draw();
        }
    }
}
