public class Customer {
    int id;
    String firstName;
    String lastName;
    double heldMoney;

    // constructor:
    public Customer(int newId, String newFirstName, String newLastName, double newHeldMoney){
        this.id = (int) (Math.random()*1000+1);  // but doesn't ensure that others won't have the same ID
        this.firstName= newFirstName;
        this.lastName=newLastName;
        this.heldMoney=newHeldMoney;
    }

    // methods: setters
    public void setId(int id){  // use void for setting
        this.id=id;
    }
    public void setFirstName(String firstName){  // use void for setting
        this.firstName=firstName;
    }
    public void setLastName(String lastName){  // use void for setting
        this.lastName=lastName;
    }
    public void setHeldMoney(double heldMoney){  // use void for setting
        this.heldMoney=heldMoney;
    }

    // getters:

    public String getFullName(){
        return "Customer's name is "+ firstName +" "+ lastName;
    }
    public double getHeldMoney(){
        return heldMoney;
    }
    public void subtractHeldMoney(double moneyOut){
        this.heldMoney=heldMoney-moneyOut;
        System.out.println("you have cashed out "+moneyOut+" and your updated balance is: "+heldMoney);
        setHeldMoney(heldMoney);
    }






    @Override
    public String toString() {
        return "Customer{ "+ "ID = '" + id + " first name = "+firstName+ " last name = "+lastName+ " money held = "+heldMoney+'}';
        }


        }
