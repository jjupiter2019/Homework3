import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

class Employee {
    private String address;
    private double payrate;
    private String name;
    private int id;
    private static int nextID = 1;


    Employee(String address, double payrate, String name) {
        this.address = address;
        this.payrate = payrate;
        this.name = name;

        id = nextID++;
    }

    public String getAddress() {
        return address;
    }

    public double getPayRate() {
        return payrate;
    }

    public int getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public static int getNextID() {
        return nextID;
    }
}