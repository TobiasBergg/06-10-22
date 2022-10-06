package Task1;

public class Car {

    private String driver;
    private String make;
    private String model;
    private int year;
    private String bodyStyle;

    public Car(String make, String model, int year, String bodyStyle) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.bodyStyle = bodyStyle;
    }

    public String getDriver(){
    return driver;
    }

    public void setDriver(String driver){
        this.driver = driver;
    }

    @Override
    public String toString() {
        return "Car \n" +
                "Make: " + make + "\n" +
                "Model: " + model + "\n" +
                "Year: " + year + "\n" +
                "BodyStyle: " + bodyStyle;
    }
}
