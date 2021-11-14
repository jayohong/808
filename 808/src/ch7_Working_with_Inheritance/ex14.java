package ch7_Working_with_Inheritance;

public class ex14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee = new Employee();
		Manager manager = new Manager();
		Director director = new Director();
		 //A.
		 employee.salary = 50_000; 
		 
		 //B.
		 director.salary = 80_000; 
		 
		 //C.
		 //employee.budget = 200_000; 
		 
		 //D.
		 manager.budget = 1_000_000; 
		 
		 //E.
		 //manager.stockOption = 500; 
		 //F.
		 director.stockOptions = 1_000;
		

	}

}

class Employee {

	public int salary;
}

class Manager extends Employee {

	public int budget;
}

class Director extends Manager {

	public int stockOptions;
}
/*
 * 
 * Given the following classes:
 * 
 * Employee.java public class Employee {
 * 
 * public int salary; } Manager.java public class Manager extends Employee {
 * 
 * public int budget; } Director.java public class Director extends Manager {
 * 
 * public int stockOptions; } And given the follow main method:
 * 
 * public static void main(String[] args){ Employee employee = new Employee();
 * Manager manager = new Manager(); Director director = new Director(); // line
 * n1 } Which two options fail to compile when placed at line n1 of the main
 * method?
 * 
 * A.
 * 
 * employee.salary = 50_000; 
 * B.
 * 
 * director.salary = 80_000; 
 * C.
 * 
 * employee.budget = 200_000; 
 * D.
 * 
 * manager.budget = 1_000_000; 
 * E.
 * 
 * manager.stockOption = 500; 
 * F.
 * 
 * director.stockOptions = 1_000;
 * 
 * my ans is CE
 */