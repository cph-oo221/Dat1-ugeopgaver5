package Task1;

public class Car
{
    // 5 private fields:

    // Jeg er ikke sikker på om make skal være int?????
    private int make;
    private String model;
    private int year;

    private String bodyStyle;

    private Driver driver;

    // Constructor for car
    public Car(int make, String model, int year, String bodyStyle)
    {
        this.make = make;
        this.model = model;
        this.year = year;
        this.bodyStyle = bodyStyle;
    }


    // TODO don't need all setters and getters for make, model and year;

  /*  // make get and set
    public int getMake()
    {
        return make;
    }

    public void setMake(int make)
    {
        this.make = make;
    }


    // model get and set
    public String getModel()
    {
        return model;
    }

    public void setModel(String model)
    {
        this.model = model;
    }

    // year get and set
    public int getYear()
    {
        return year;
    }

    public void setYear(int year)
    {
        this.year = year;
    }


    // bodyStyle get and set
    public String getBodyStyle()
    {
        return bodyStyle;
    }

    public void setBodyStyle(String bodyStyle)
    {
        this.bodyStyle = bodyStyle;
    }*/


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
