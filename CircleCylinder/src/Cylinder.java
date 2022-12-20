public class Cylinder extends Circle{

    private static double height ;

   public Cylinder(){

   }
   public Cylinder(double h)
   {
       this.height =h ;

   }
   public Cylinder(double h,double r){
this.height = h;
this.radius = r;
   }
   public Cylinder(double h,double r,String c){
       this.height = h;
       this.radius = r;
       this.color = c;
   }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume(){
       return Math.PI * radius * radius * height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                ", volume=" + getVolume() +
                ", radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }

}

