package Task1;

public class Driver
{

    // 2 private fields:
    private String name;
    private int age;

    // Constructor for driver
    public Driver(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    // getter & setter

    // get and set name
    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    // get and set age
    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    @Override
    public String toString()
    {
        return "is driven by: " + name; //+ ", which is " + age + " years old" ;
    }
}
