import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
import java.util.List;

**/ Here the employee is the super class and in the following code it assigns the lawtype the billable hours and employees*/

public class Secretary extends Employee {
    private String location;
    private String task;
	private int userType = 2;
	Secretary (String address, double payrate, String name, String location, String task, int userType ){
		super(address, payrate, name); 
		this.location=location;
		this.task=task;
		this.userType=userType;
    }
	
	public String getLocation() {
		return location;
	}
	
	public double getUserType() {
		return userType;
	}
	
	public void setUserType(int userType) {
        this.userType = userType;
    }
	
	public void setLocation(String location) {
        this.location = location;
    }

}

