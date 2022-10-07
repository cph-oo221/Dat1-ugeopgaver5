package Task1;

public class Main
{
    public static void main(String[] args)
    {
        //instantiate a new Driver and car
        Driver driver = new Driver("Oskar", 21);
        Car car = new Car("Nissan", "GT-R",2021,"Sports Car");


        // 1.j: assign the driver to the car created
        car.setDriver(driver);


        // 1.k print the toString method of car and the toString method of driver
        System.out.println(car + ", " + driver);


        // 1.l create another car and assign same driver to the car
        Car car2 = new Car("Nissan", "NV200",2019,"Van");
        car2.setDriver(driver);


        // 1.m repeat step 1k for the new car
        System.out.println(car2 + ", " + driver);

    }
}
