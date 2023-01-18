import Room;

public class Hotel
{
    private String hotelName;
    private Room[] rooms;
    private int totalRooms;

    public Hotel (String hotelName, int totalRooms, int floors)
    {
        this.rooms = new Room[totalRooms];
        for (int i = 0; i < floors; i++)
        {
            for (int p = 0; p < totalRooms / floors; p++)
            {
                String tempRoomType;
                if (p == (totalRooms / floors)-1)
                {
                    tempRoomType = "suite";
                }
                else if (p >= (totalRooms / floors) - 5)
                {
                    tempRoomType = "single king";
                }
                else
                {
                    tempRoomType = "double qeen";
                }
                this.rooms[i*(totalRooms / floors)+p] = new Room(i*100 + p, tempRoomType);
            }
        }
    }

    public int getTotalRooms()
    {
        return totalRooms;
    }
    public int getNumberOccupied()
    {
        int occupiedNumber = 0;
        for (int i = 0; i < totalRooms; i++)
        {
            if (this.rooms[i].getOccupantName == null)
            {
                occupiedNumber++;
            }
        }
        return occupiedNumber;
    }
    public double getOccupantRate()
    {
        return ((double)this.getNumberOccupied() / (double)this.totalRooms);
    }
    public boolean rentRoom(String roomType, String renterName, int daysStay)
    {
        for (int i = 0; i < this.totalRooms; i++)
        {
            if (this.rooms[i].getOccupantName() == null && this.rooms[i].getRoomType == roomType)
            {
                this.rooms[i].setOccupant(renterName, daysStay);
            }
        }
    }
}