package empSalary;

import java.util.Scanner;
public class DemoProject {
	public static void main(String[] args){
		int id,salary, sales;
		String name;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter data Employee : ");
		id = input.nextInt();
		name = input.next();
		salary = input.nextInt();
		sales = input.nextInt();
		inputProject in = new inputProject(id,name,salary,sales);
		processProject cess = new processProject(in);
		outputProject out = new outputProject(in,cess);
	}
}
