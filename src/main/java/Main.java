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

    }
}
