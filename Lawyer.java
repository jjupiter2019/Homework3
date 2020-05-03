import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
import java.util.List;
 
/** Here the employee is the super class and in the following code it assigns the lawtype the billable hours and employees*/

public class Lawyer extends Employee {
    private String lawtype;
    private double hours;
	private int userType = 1;
	
	public Lawyer (String address, double payrate, String name, double hours, String lawtype, int userType ){
		super(address, payrate, name); 
		this.hours=hours;
		this.lawtype=lawtype;
		this.userType=userType;
    }
	
	public double getBillableHours() {
		return hours;
	}
	
	public void setBillableHours(double hours) {
        this.hours = hours;
    }
	
	public int getUserType() {
		return userType;
	}
	
	public void setUserType(int userType) {
        this.userType = userType;
    }

	public String getLawType() {
		 return lawtype;
	}
	
	public void setLawType(String lawtype) {
        this.lawtype = lawtype;
    }

	/*public void sue() {
		System.out.println("I'll see you in court!");
	}*/

}

