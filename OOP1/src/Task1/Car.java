package Task1;

public class Car
{
    // 5 private fields:

    // Jeg er ikke sikker på om make skal være int?????
    // ^ samt bodystyle 
    private int make;
    private String model;
    private int year;
    private String bodyStyle;
    private String Driver;

    // Constructor for car
    public Car(int make, String model, int year, String bodyStyle, String driver)
    {
        this.make = make;
        this.model = model;
        this.year = year;
        this.bodyStyle = bodyStyle;
        Driver = driver;
    }


    // make get and set
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
    }


    // Driver get and set
    public String getDriver()
    {
        return Driver;
    }

    public void setDriver(String driver)
    {
        Driver = driver;
    }


    @Override
    public String toString()
    {
        return "Make: "+make+". Model: "+model+ " ("+ year + "), BodyStyle: " + bodyStyle;
    }
}
