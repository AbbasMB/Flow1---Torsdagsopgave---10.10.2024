package Task1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(new Customer("Abbas", "Badreddine", "AbbasB"));
        customers.add(new Customer("Imad", "Badreddine", "ImadB"));
        customers.add(new Customer("Medina", "Badreddine", "Medinos"));
        printCustomers(customers);
    }

    static void printCustomers(ArrayList<Customer> customers){
        for(Customer c : customers){
            System.out.println(c.toString());
        }
    }
}
