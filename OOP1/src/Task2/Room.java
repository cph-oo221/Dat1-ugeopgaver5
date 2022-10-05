package Task2;

public class Room
{
    // 3 fields:
   private int numberOfDoors;
   private int numberOfLamps;
   private int numberOfWindows;

   // constructor for room
    public Room(int numberOfDoors, int numberOfLamps, int numberOfWindows)
    {
        this.numberOfDoors = numberOfDoors;
        this.numberOfLamps = numberOfLamps;
        this.numberOfWindows = numberOfWindows;
    }


    // getter for the 3 fields:
    public int getNumberOfDoors()
    {
        return numberOfDoors;
    }

    public int getNumberOfLamps()
    {
        return numberOfLamps;
    }

    public int getNumberOfWindows()
    {
        return numberOfWindows;
    }


}
