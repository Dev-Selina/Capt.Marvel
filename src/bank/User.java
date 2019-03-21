package bank;

public class User {
    //I want to declare the access-data type-var name
    //Listing below attributes of my object User
    protected String userID;
    protected String password;
    protected double currentAccount;
    protected double jointAccount;
    protected double savingsAccount;

    //Here is my user and the attributes I want to assign to them
    //Object description below
    public User(String userID, String password, double currentAccount, double jointAccount, double savingsAccount) {
        this.userID = userID;
        this.password = password;
        //Do I need to get the data below from somewhere?
        this.currentAccount = currentAccount;
        this.jointAccount = jointAccount;
        this.savingsAccount = savingsAccount;
    }

}
