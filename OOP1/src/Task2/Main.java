package Task2;

import java.util.ArrayList;

public class Main
{


    public static void main(String[] args)
    {
        // 2.g instantiate at least three different rooms
        Room room1 = new Room(1,2,3);
        Room room2 = new Room(2,4,2);
        Room room3 = new Room(1,3,1);

        // 2.h Add the three rooms to the "Rooms"
        ArrayList<Room> rooms = new ArrayList<>();
        rooms.add(room1);
        rooms.add(room2);
        rooms.add(room3);



        // 2.I Instantiate a new building.

        Building building = new Building(rooms,5,4,false);

        //System.out.println(building1.toString());


        int countOfLambs = countLampsInBuilding(building);
        System.out.println("The numbers of lambs: " + countOfLambs);

        System.out.println("isNormal: " + isNormal(building));

    }


    // 2.j  create a static method in Main, countLampsInBuilding
    public static int countLampsInBuilding(Building building)
    {
        int countOfLamps = 0;

        for (int i = 0; i<building.getRooms().size(); i++)
        {
           countOfLamps =  building.getRooms().get(i).getNumberOfLamps();

        }
        return countOfLamps;


    }

    // 2.k
    public static boolean isNormal(Building building)
    {
        if(building.getNumberOfFloors()>building.getRooms().size())
        {
            return true;
        }
        else
        {
            System.out.println("This is an odd building");
        }
        return false;

    }


}
