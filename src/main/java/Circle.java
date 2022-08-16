public class Circle {
    // Class properties:
    double radius;

    // constructor:
    public Circle(double newRadius){
        this.radius = newRadius;
    }


    // methods:
    public void setRadius(double radius){  // use void for setting
        this.radius=radius;
    }
    public double getRadius(){
        return this.radius;
    }
    public double getCircumference(){
        return this.radius * Math.PI*2;
    }

    @Override
    public String toString() {
        return "Circle{" + "radius='" + radius+'}';
    }


}
