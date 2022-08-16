public class Account {
    // Class Properties:
    String id;
    String name;
    int balance;

    // Constructor:
    public Account(String newAccountId, String newAccountName, int newAccountBalance){
        this.id = newAccountId;
        this.name = newAccountName;
        this.balance = newAccountBalance;
    }

    @Override
    public String toString() {
        return "Account{" + "id='" + id + ", name='" + name + ", balance=" + balance + '}';
    }




    // methods:  getters/setters

    public String getID(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public int getBalance(){
        return this.balance;
    }
    public void setId(String id){
        this.id=id;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setBalance(int balance){
        this.balance=balance;
    }


}
