package graphics;

public class circle {
    double radius;
    public circle(double radius){
        this.radius=radius;
    }
    public double calculateArea(){
        return Math.PI*radius*radius;
        
    }
}
