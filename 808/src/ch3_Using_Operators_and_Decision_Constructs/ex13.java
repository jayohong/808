package ch3_Using_Operators_and_Decision_Constructs;

public class ex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
/*
Given the following two classes:

Customer.java
public class Customer {
 
    ElectricAccount acct = new ElectricAccount();
 
    public void useElectricity(double kWh) {
        acct.addKWh(kWh);
    }
}
ElectricAccount.java
public class ElectricAccount {
 
    private double kWh;
    private double rate = 0.07;
    private double bill;
 
    // line n1
}
How should you write methods in the ElectricAccount class at line n1 so that the 
member variable bill is always equal to the value of the member 
variable kwh multiplied by the member variable rate?

Any amount of electricity used by a customer (represented by an instance of the customer class)
 must contribute to the customer's bill (represented by the member variable bill) 
 through the method useElectricity method. 
 
An instance of the customer class should never be able to tamper with or
decrease the value of the member variable bill.

A.

ElectricAccount.java
public void addKWh(double kWh){
    this.kWh += kWh;
    this.bill = this.kWh * this.rate;
}
B.

ElectricAccount.java
public void addKWh(double kWh){
    if(kWh > 0){
        this.kWh += kWh;
        this.bill = this.kWh * this.rate;
    }
}
C.

ElectricAccount.java
private void addKWh(double kWh){
    if(kWh > 0){
        this.kWh += kWh;
        this.bill = this.kWh * this.rate;
    }
}
D.

ElectricAccount.java
public void addKWh(double kWh){
    if(kWh > 0){
        this.kWh += kWh;
        setBill(this.kWh);
    }
}
 
public void setBill(double kWh){
    bill = kWh * rate;
}



ans is B
A錯在可能有負數
C錯在方法權限
D錯在setBill方法沒保護可以被隨意修改bill的內容

*/