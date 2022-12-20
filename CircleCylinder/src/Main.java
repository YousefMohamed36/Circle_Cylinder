public class Main {
    public static void main(String[] args) {
        Circle ci1 = new Circle(4,"blue");
        System.out.println(ci1.toString());
        Cylinder cy1 = new Cylinder(4,3,"Black");
        System.out.println(cy1.toString());
        Circle c2 = new Circle();
        c2.setRadius(3);
        c2.setColor("green");
        System.out.println(c2.toString());
    }
}



