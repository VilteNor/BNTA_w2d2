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
        return this.radius; // specifically this radius
//        return radius // can also use this but that is going to look for general variable radius
    }
    public double getCircumference(){
        return this.radius * Math.PI*2;
    }

    @Override
    public String toString() {
        return "Circle{" + "radius='" + radius+'}';
    }


}
