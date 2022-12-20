public class Circle {
    protected static   double radius   ;
    protected static String color   ;

    public Circle()
    {

    }
    public Circle(double r){
        this.radius = r;

    }
    public Circle(double r,String c){
        this.radius = r;
        this.color = c;

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double getArea(){
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", area=" + getArea() +
                '}';
    }
}
