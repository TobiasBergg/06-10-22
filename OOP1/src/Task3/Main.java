package Task3;

import java.util.ArrayList;

public class Main {

    public static ArrayList<Customer> costumers = new ArrayList<>();

    public static void main(String[] args) {


        Customer customer1 = new Customer("Tobias","Berg","TobiasBerg");
        Customer customer2 = new Customer("Oliver","Carlsen","OliverC");
        Customer customer3 = new Customer("Søren","Sørensen","SøSø");
        Customer customer4 = new Customer("Martin","Rothe","MarRot");
        Customer customer5 = new Customer("Mathias","Holst","MathiasH");
        Customer customer6 = new Customer("Sander","Lindgren","SanderLanggren");
        costumers.add(customer1);
        costumers.add(customer2);
        costumers.add(customer3);
        costumers.add(customer4);
        costumers.add(customer5);
        costumers.add(customer6);

        printCustomers();
    }
    public static void printCustomers(){
        for (Customer c: costumers) {
            System.out.println(c.toString());
        }
    }

}
