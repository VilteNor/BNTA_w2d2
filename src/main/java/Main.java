public class Main {
    public static void main(String[] args) {
// creating an object myAccount:
Account myAccount = new Account("1","Mary",200);

// getter:
int myBalance = myAccount.getBalance();
System.out.println(myBalance);

// Override in Class file first, then can print object's properties
System.out.println(myAccount);

// setter:
myAccount.setBalance(100);
System.out.println("new balance: "+myAccount.getBalance());



        // **** CIRCLE **** //

Circle circle1 = new Circle(2);
System.out.println(circle1);

// getting the circumference:
double circumference1= circle1.getCircumference();
        System.out.println("circumference = "+Math.round(circumference1*100)/100D);
// setting new radius:
        circle1.setRadius(100);
        // getting new circumference
        double circumference2= circle1.getCircumference();
        System.out.println("new circumference = " + Math.round(circumference2*100)/100D);



        // **** RECTANGLE **** //
        Rectangle myRectangle = new Rectangle(10,5);
        System.out.println(myRectangle);
// getting the Perimeter:
        double perimeter1= myRectangle.getPerimeter();
        System.out.println("perimeter1 = "+Math.round(perimeter1*100)/100D);
// getting the Area:
        double area1= myRectangle.getArea();
        System.out.println("area1 = "+Math.round(area1*100)/100D);
// getting the Diagonal:
        double diagonal1= myRectangle.getDiagonal();
        System.out.println("diagonal1 = "+Math.round(diagonal1*100)/100D);
//

// setting new values:
            myRectangle.setWidth(50);
            myRectangle.setLength(200);

// getting new Perimeter:
            double perimeter2= myRectangle.getPerimeter();
            System.out.println("new perimeter of this rectangle = "+Math.round(perimeter2*100)/100D);

// getting new Area
            double area2= myRectangle.getArea();
            System.out.println("new area of this rectangle = " + Math.round(area2*100)/100D);
// getting new Diagonal:
            double diagonal2= myRectangle.getDiagonal();
            System.out.println("new diagonal = "+Math.round(diagonal2*100)/100D);
//

// end of code
    }
}
