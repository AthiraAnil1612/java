package graphics;

public class rectangle {
    double length, breadth;
    public rectangle(double len,double wid){
        length=len;
        breadth =wid;
    }
    public double calculateArea(){
        return length*breadth;
    }
    
}
