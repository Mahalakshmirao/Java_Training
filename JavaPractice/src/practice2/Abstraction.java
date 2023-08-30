package practice2;
abstract class Shape{
    abstract void draw();

        }
        class Rectangle extends Shape{
    void draw(){
        System.out.println("drawing a rectangle");

    }
}
        class Circle extends Shape{
    void draw(){
        System.out.println("circle is drawing");

    }
        }
public class Abstraction {
    public static void main(String[] args){
        Shape c=new Circle();
        c.draw();
    }

}
