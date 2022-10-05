package Task2;

import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        // TODO in class building, check/make 2.d

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

        Building building1 = new Building(rooms,5,2,false);

        System.out.println(building1.toString());




    }


    // 2.j  create a static method in Main, countLampsInBuilding
    public static void countLampsInBuilding(Building building)
    {

        System.out.println(building.getRooms().get(1).getNumberOfLamps());



    }

}
