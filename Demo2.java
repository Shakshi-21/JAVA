class Room
{
	int length, breadth, height;
	Double FloorArea, WallArea;
	int NoRooms, NoWindows, NoDoors;
	Room(int length, int breadth, int height, int NoRooms, int NoWindows, int NoDoors)
	{
		this.length=length;
		this.breadth=breadth;
		this.height=height;
		this.FloorArea=AreaFloor();
		this.WallArea=AreaWall();
		this.NoRooms=NoRooms;
		this.NoWindows=NoWindows;
		this.NoDoors=NoDoors;
	}
	double AreaFloor()
	{
		return length*breadth;
	}
	double AreaWall()
	{
		double totalWallArea=2*height*(length + breadth); // Total wall area of the room
        	double occupiedArea=totalWallArea*0.20; // 20% of the wall area
        	return totalWallArea - occupiedArea;// Effective wall area after subtracting the occupied area
    }
	void display()
	{
		System.out.println("Length: "+length+"m"+"\nBreadth: "+breadth+"m"+"\nHeight: "+height+"m"+"\nFloor Area: "+FloorArea+"\nWall Area: "+WallArea+"\nNo of Rooms: "+NoRooms+"\nNo of Windows: "+NoWindows+"\nNo of Doors: "+NoDoors);
	}
}
class Demo2
{
	public static void main(String args[])
	{
		Room room=new Room(20, 40, 50, 4, 6, 5);
		room.display();
	}
}