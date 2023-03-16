package Task02.BankAccount;

public class Account {
    public Account(String id, String name){
        this.id=id;
        this.name=name;
    }
    public Account(String id, String name,int balance){
        this.id=id;
        this.name=name;
        this.balance=balance;
    }
    private  String id;
    private  String name;
    private int balance=0;

    public String getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }

    public int getBalance() {
        return this.balance;
    }
    public int credit(int amount){
        this.balance+=amount;
        return this.balance;
    }
    public int debit(int amount){
        if(amount<=this.balance)
            this.balance-=amount;
        else
            System.out.println("Amount exceeded balance.");
        return this.balance;
    }
    public int transferTo(Account another,int amount){
        if(amount<=this.balance){
            this.balance-=amount;
            another.balance+=amount;
            System.out.println("Your balance: "+this.balance);
            System.out.println("Another's balance: "+another.balance);
        }
        else
            System.out.println("Amount exceeded balance.");
        return this.balance;
    }
public String ToString(){
        return "Account: [ id= "+this.id+", name= "+this.name+", balance= "+this.balance+" ]";
    }
}
