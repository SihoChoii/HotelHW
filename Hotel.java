import Room;

public class Hotel
{
    private String hotelName;
    private Room[] rooms;
    private int totalRooms;

    public Hotel (String hotelName, int totalRooms, int floors)
    {
        this.rooms = new Room[totalRooms];
        for (int i = 0; i < totalRooms; i++)
        {
            if (i = totalRooms/floors)
            (
                 
            )
            this.rooms[i] = new Room(totalRooms, null);
        }
    }
}