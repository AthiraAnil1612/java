package graphics;

public class triangle {
    double base, height;
    public triangle(double base, double height) {
        this.base= base;
        this.height= height;
    }
    public double calculateArea(){
        return 0.5*base*height;
    }
    
}
