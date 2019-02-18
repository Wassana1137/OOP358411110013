package CaseStudy;

public class bankAccount {
    private String id;
    private double balance;
    private  Customer mane;

    public bankAccount(String id, double balance, Customer mane) {
        this.id = id;
        this.balance = balance;
        this.mane = mane;
    }
    public String checkBalance (){
        return  this.balance;
    }
    private void  doposit (double amount){
        this.balance += amount;//this.balance= this.balance+amount;

    }

}//class
