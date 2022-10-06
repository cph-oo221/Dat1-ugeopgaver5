package Task3;

import java.util.ArrayList;

public class Main
{
    public static ArrayList<Customer> customers =new ArrayList<>();
    public static void main(String[] args)
    {



        // test  toString
        /* Customer customer = new Customer("Oskar","Olsen","OskarOlsen",123);
        System.out.println(customer.toString());*/
        Customer customer1 = new Customer("Oskar","Olsen","OskarOlsen");
        Customer customer2 = new Customer("Peter", "Hansen", "PeterHansen");
        Customer customer3 = new Customer("Fie", "Larsen", "FieLarsen");
        Customer customer4 = new Customer("Lars", "Olsen", "LarsOlsen");
        Customer customer5 = new Customer("Maja", "Linegord", "MajaLinegord");
        Customer customer6 = new Customer("Nunu", "el nene", "Nunuere");

        // add customers to the Arralist:
        customers.add(customer1);
        customers.add(customer2);
        customers.add(customer3);
        customers.add(customer4);
        customers.add(customer5);
        customers.add(customer6);

        // print  out customers
        printCustomers();
    }

    public static void printCustomers()
    {
        for(Customer c: customers)
        {
            System.out.println(c);
        }
    }


}
