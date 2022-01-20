
public class SuperiorRoom extends Room{
	
	private String roomamenities;
	
	SuperiorRoom (int roomcode, int roomfloor, String roomcapacity, double roomprice, String roomamenities) {
		
		super (roomcode, roomfloor, roomcapacity, roomprice);
		this.setRoomAmenities(roomamenities);
		
	}
	
	SuperiorRoom () {
		
	}

	// (set & get) RoomAmenities
	public void setRoomAmenities(String roomamenities) {
			this.roomamenities = roomamenities;
	}
			
	public String getRoomAmenities() {
			return this.roomamenities;
	}
	
	

}
