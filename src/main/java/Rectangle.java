public class Rectangle {
    double length;
    double width;

    // constructor:
    public Rectangle(double newLength, double newWidth){
        this.width = newWidth;
        this.length= newLength;
    }

    // methods: setters
    public void setLength(double length){  // use void for setting
        this.length=length;
    }
    public void setWidth(double width){  // use void for setting
        this.width=width;
    }

    // getters:

    public double getLength(){
        return this.length;
    }
    public double getWidth(){
        return this.width;
    }
    public double getPerimeter(){
        return this.width*2 + this.length*2;
    }
    public double getArea(){
        return this.width*this.length;
    }
    public double getDiagonal(){ // sqrt returns a double
        return Math.sqrt(Math.pow(this.width,2)+Math.pow(this.length,2));
    }






    @Override
    public String toString() {
        return "Rectangle{" + "length = '" + length+ " width = "+width+'}';
    }




}
