package Task1;

public class Car
{
    // 5 private fields:
    private String make;
    private String model;
    private int year;

    private String bodyStyle;

    private Driver driver;

    // Constructor for car
    public Car(String make, String model, int year, String bodyStyle)
    {
        this.make = make;
        this.model = model;
        this.year = year;
        this.bodyStyle = bodyStyle;
    }


    // Driver get and set
    public Driver getDriver()
    {
        return driver;
    }

    public void setDriver(Driver driver)
    {
        this.driver = driver;
    }

    // toString method for car
    @Override
    public String toString()
    {
        return "Make: "+make+". Model: "+model+ " ("+ year + "), BodyStyle: " + bodyStyle;
    }
}
