public class Customer {
    int id;
    String firstName;
    String lastName;
    double heldMoney;

    // constructor:
    public Customer(int newId, String newFirstName, String newLastName, double newHeldMoney){
        this.id = newId;
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
    public void subtractHeldMoney(double moneyOut){
        System.out.println("you have cashed out "+moneyOut);

    }








}
