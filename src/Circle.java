public class Circle {
   private double radius;
   public String color;

    public Circle()
    {}
    public Circle(double r)
    {this.radius=r;}
    public double GetRadius()
    {return radius;}
    public double GetArea()
    {return (3.14*radius*radius);}
}

