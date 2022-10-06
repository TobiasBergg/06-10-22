package Task1;

public class Main {

    public static void main(String[] args) {

        Driver driver1 = new Driver("Tobias", 21);
        Car car1 = new Car("Toyota", "Aygo", 2012,"Convertible");
        Car car2 = new Car("Volkswagen","Passat",2021,"Coupe");

        car1.setDriver("Tobias");
        car2.getDriver();

        System.out.println(car1);
        System.out.println(driver1);

        System.out.println(car2);
        System.out.println(driver1);


    }
}
