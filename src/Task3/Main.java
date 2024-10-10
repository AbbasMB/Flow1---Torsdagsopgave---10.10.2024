package Task3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Room> rooms = new ArrayList<Room>();
        rooms.add(new Room(2, 2));
        rooms.add(new Room(3, 3));
        rooms.add(new Room(4, 4));

        Building buliding = new Building(rooms, 40);

        System.out.println(countLampsInBuilding(buliding));
        System.out.println(countWindowsInBuilding(buliding));
        System.out.println(isNormal(buliding));
        }
private static int countLampsInBuilding(Building building) {
        int count = 0;
        for (Room room : building.getRooms()) {
            count += room.getNumberOfLamps();
        }
        return count;

    }
    private static int countWindowsInBuilding(Building building) {
        int count = 0;
        for (Room room : building.getRooms()) {
            count += room.getNumberOfWindows();
        }
        return count;
    }

    private static boolean isNormal(Building building){
        return building.getNumberOfFloors() >= (building.getRooms()).size();
    }
}
