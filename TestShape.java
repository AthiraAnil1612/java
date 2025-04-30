import graphics.rectangle;
import graphics.triangle;
import graphics.square;
import graphics.circle;
public class TestShape{
    public static void main(String[] args){
        rectangle Rectangle= new rectangle(5,3);
        triangle Triangle = new triangle(4,6);
        square Square=new square(4);
        circle Circle=new circle(3);
        System.out.println("Area of Rectangle"+Rectangle.calculateArea());
        System.out.println("Area of Triangle"+Triangle.calculateArea());
        System.out.println("Area of Square"+Square.calculateArea());
        System.out.println("Area of Circle"+Circle.calculateArea());


    }
}