package ch1_javaBasic;
/*
 Ans: DGH
 */

public class ex2 {

	public static void main(String[] args) {
		  
		CheckingAccount acct = new CheckingAccount((int)(Math.random() * 1000));
	    //line n1
		//acct.amount=0;
		//acct.changeAmount(0);
		//acct.changeAmount(-acct.amount);
		//acct.changeAmount(-acct.getAmount());
	    System.out.println(acct.getAmount());

	}

}
class CheckingAccount {
	 
    public int amount;
 
    public CheckingAccount(int amount) {
        this.amount = amount;
    }
 
    public int getAmount() {
        return amount;
    }
 
    public void changeAmount(int x) {
        amount += x;//amount=amunt+x;
    }
}

/*


Given the following class:

public class CheckingAccount {
 
    public int amount;
 
    public CheckingAccount(int amount) {
        this.amount = amount;
    }
 
    public int getAmount() {
        return amount;
    }
 
    public void changeAmount(int x) {
        amount += x;
    }
}
And given the following main method, located in another class:

public static void main(String[] args){
    CheckingAccount acct = new CheckingAccount((int)(Math.random() * 1000));
    //line n1
    System.out.println(acct.getAmount());
}
Which three lines, when inserted independently at line n1, cause the program to print a 0 balance?

A.
this.amount = 0; 語法錯誤

B.
amount = 0;  語法錯誤

C.
acct(0);     語法錯誤

D.
acct.amount = 0;

E.
acct.getAmount() = 0;   語法錯誤

F.
acct.changeAmount(0);   值不變

G.
acct.changeAmount(-acct.amount);

H.
acct.changeAmount(-acct.getAmount());
*/