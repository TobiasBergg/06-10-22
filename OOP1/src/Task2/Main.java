package Task2;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Room room1 = new Room(2,3,1);
        Room room2 = new Room(1,2,2);
        Room room3 = new Room(5,10,8);

        ArrayList<Room> rooms = new ArrayList<Room>();
        rooms.add(room1);
        rooms.add(room2);
        rooms.add(room3);

        Building building1 = new Building(rooms,10,3,true);

        System.out.println(countLampsInBuilding(building1));
        System.out.println(isNormal(building1));


    }

    public static int countLampsInBuilding(Building building){

    ArrayList<Room> rooms = building.getRooms();
    int result = 0;

    for (int i = 0; i < rooms.size(); i++){
        result += rooms.get(i).getNumberOfLamps();
    }
        return result;
    }

    public static boolean isNormal(Building building){
        int numsofFloors = building.getNumberOfFloors();
        ArrayList<Room> rooms = building.getRooms();
        if(numsofFloors > rooms.size()){
            return true;
        }
        System.out.println("This is an odd building");
        return false;
    }

}
