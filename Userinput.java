import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

Creating input for the user

class Userinput {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 5;
        String address, name;
		String lawType;
		String jobLocation;
		String emp;
		String task;
		double billHours;
		int userType;
        double rate;
        ArrayList<Employee> employees = new ArrayList<Employee>();
        for (int i = 0; i < n; i++) {
			System.out.print("Enter name of employee: ");
            name = in.nextLine();
            System.out.print("Enter address of employee: ");
            address = in.nextLine();
            System.out.print("Enter pay rate: ");
            rate = in.nextDouble();
			System.out.println("What type of employee is " + name + "? 1 - Lawyer or 2 - Secretary:"); 
			userType = in.nextInt();
			in.nextLine();
            if(userType == 1){     **//  It is showing it it is 1 it is a lawyer and 2 its a sec
				System.out.println("What type of law does " + name + " practice?"); 
				lawType = in.nextLine();
				
				System.out.println("How many hours did " + name + " bill?"); 
				billHours = in.nextDouble();
				in.nextLine();
				employees.add(new Lawyer(address, rate, name, billHours, lawType, userType));
			}else if(userType == 2){
				System.out.println("What is " + name + "'s office number?"); 
				jobLocation = in.nextLine();
				task = "Filing a brief";
				employees.add(new Secretary(address, rate, name, jobLocation, task, userType));
			}
			
            //employees.add(new Lawyer(address, rate, name));
        }

        System.out.println("Here are all the employees");
        for (int i = 0; i < n; i++) {
            System.out.println("ID: " + employees.get(i).getID() + ", Name: " + employees.get(i).getName() + ", Address: " + employees.get(i).getAddress() + ", Pay rate: " + employees.get(i).getPayRate());
        }
		System.out.println("Enter the name of an employee to search for"); 
		emp = in.nextLine();
		//this is where we can search for the list of employees
		for (int i = 0; i < n; i++) {
			System.out.println(employees.get(i).getName());
            if( employees.get(i).getName().toLowerCase().equals( emp.toLowerCase())){
                
				System.out.println("We found "+emp);
				return; 
            }
        }
		System.out.println("There is no record of an employee named " + emp);
		return;
    }
	
}
