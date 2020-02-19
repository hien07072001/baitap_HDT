public class Circle {
    public static final double PI=3.14;
    private double radius=1;
    private String color="red";

    public Circle(){

    }
    public Circle( double radius){
        this.radius=radius;
        this.color=color;
    }
    public double getRadius(){
        return  radius;

    }
    double Area=radius*radius*PI;
    public double getArea()
    {
        return Area;
    }
    void display(){
        System.out.println(radius+" "+Area+" ");
    }

}
