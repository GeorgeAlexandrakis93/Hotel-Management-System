
public class Room {
	
	private int roomcode;
	private int roomfloor;
	private String roomcapacity;
	private double roomprice;
	
	Room (int roomcode, int roomfloor, String roomcapacity, double roomprice) {
		
		this.setRoomCode(roomcode);
		this.setRoomFloor(roomfloor);
		this.setRoomCapacity(roomcapacity);
		this.setRoomPrice(roomprice);
		
	}
	
	Room () {
		
	}
	
	    //(set & get) RoomCode
		public void setRoomCode(int roomcode) {
			this.roomcode = roomcode;
		}
		
		public int getRoomCode() {
			return this.roomcode;
		}
		
		// (set & get) RoomFloor
		public void setRoomFloor(int roomfloor) {
			this.roomfloor = roomfloor;
		}
		
		public int getRoomFloor() {
			return this.roomfloor;
		}
		
		// (set & get) RoomCapacity
		public void setRoomCapacity(String roomcapacity) {
			this.roomcapacity = roomcapacity;
		}
		
		public String getRoomCapacity() {
			return this.roomcapacity;
		}
		
		// (set & get) RoomPrice
		public void setRoomPrice(double roomprice) {
			this.roomprice = roomprice;
		}
		
		public double getRoomPrice() {
			return this.roomprice;
		}

}
