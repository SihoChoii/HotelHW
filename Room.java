public class Room
{
    private int roomNumber = 0;
    private int daysRented = 0;
    private String roomType;
    private String occupantName;

    public Room (int roomNumber, String roomType)
    {
        this.roomNumber = roomNumber;
        this.occupantName = null;
        this.daysRented = 0;

        if (roomType != "double qeen" && roomType != "single king" && roomType != "suite") this.roomType = "double qeen";
        else this.roomType = roomType;
    }


    public boolean setOccupant(String name, int days)
    {   
        if (this.occupantName == null)
        {
            this.daysRented = days;
            this.occupantName = name;
            return true;
        }
        return false;
    }
    public void advanceDay()
    {
        if (daysRented <= 0)
        {
            this.occupantName = null;
            this.daysRented = 0;
        }
        else
        {
            this.daysRented--;
        }
    }
    public String toString()
    {
        String occupantTempName = this.occupantName;
        if (occupantTempName == null)
        {
            occupantTempName = "free";
        }
        return  "Room " + this.roomNumber + ": " + this.roomType + " - rented to " + this.occupantTempName;
    }
    public int getRoomNumber()
    {
        return roomNumber;
    }
    public int getDaysRented()
    {
        return daysRented;
    }
    public String getRoomType()
    {
        return roomType;
    }
    public String getOccupantName()
    {
        return occupantName;
    }
}
