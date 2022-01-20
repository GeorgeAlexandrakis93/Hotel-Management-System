import java.util.Scanner;
import java.time.LocalDate;
import java.util.ArrayList;

public class HotelReservationSystem {
	
	public static void main(String[] args) {
		
		// Variable declaration
		String menu = new String ("[1] Insert Amenity\n" + "[2] Insert Room (Standard or Superrior)\n" + "[3] Insert Client\n" + "[4] Book Room\n" + "[5] Cancel Room Reservation\n" + "[6] Order Amenity (Available only in Superior Rooms)\n" + "[7] Hotel Capacity\n" + "[8] Room Availability\n" + "[0] Exit\n");
		int [][] rooms = { {1, 2, 3, 4, 5, 6}, {101, 102, 103, 104, 105, 106}, {201, 202, 203, 204, 205, 206}, {301, 302, 303, 304, 305, 306} };
		int i, j, k, option, option3, option4, y, m, d;
		String option2;
		boolean flag, flag2, flag3;
		
		// ArrayList declaration
		ArrayList<Amenity> AmenityList = new ArrayList<Amenity>();
		ArrayList<Room> RoomList = new ArrayList<Room>();
		ArrayList<Client> ClientList = new ArrayList<Client>();
		ArrayList<Reservation> ReservationList = new ArrayList<Reservation>();
		ArrayList<Integer> DateList = new ArrayList<Integer>();
		
		Scanner sc = new Scanner (System.in);
	
		// Menu Selection
		System.out.println(menu);
		option = sc.nextInt();
		while ((option != 1) && (option != 2) && (option != 3) && (option != 4) && (option != 5) && (option != 6) && (option != 7) && (option!= 8) && (option != 0)) {
			System.out.println("No such option, enter again:");
			option = sc.nextInt();
		}
		while (option != 0) {
			
			// 7a --> Create new Amenity Object
			if (option == 1) {
				Amenity AmenityObject = new Amenity ();
				System.out.println("Enter the Amenity's code:");
				AmenityObject.setAmenityCode(sc.next());
				flag = false;
				while (!flag) {
					for (i = 0; i < AmenityList.size(); i++) {
						if (AmenityObject.getAmenityCode().equals(AmenityList.get(i).getAmenityCode())) {
							flag = true;
							break;
						}
					}
					if (flag) {
						System.out.println("The Amenity's code already exists, enter again:");	
						AmenityObject.setAmenityCode(sc.next());
						flag = false;
					}
					else {
						flag = true;
					}
				}
				System.out.println("Enter the Amenity's category:");	
				AmenityObject.setAmenityCategory(sc.next());
				System.out.println("Enter the Amenity's description:");	
				AmenityObject.setAmenityDescription(sc.next());
				System.out.println("Enter the Amenity's cost:");	
				AmenityObject.setAmenityCost(sc.nextDouble());
				AmenityList.add(AmenityObject);
				System.out.println(menu);
				option = sc.nextInt();
				while ((option != 1) && (option != 2) && (option != 3) && (option != 4) && (option != 5) && (option != 6) && (option != 7) && (option != 8) && (option != 0)) {
					System.out.println("No such option, enter again:");
					option = sc.nextInt();
				} 
			}
			
			// Room Menu
			else if (option == 2) {
				System.out.println("[a] Insert a standard room\n" + "[b] Insert a superior room\n");
				option2 = sc.next();
				while ((!option2.equals("a")) && (!option2.equals("b"))) {
					System.out.println("No such option, enter again:");
					option2 = sc.next();
				}

				// 7b --> Create new StandardRoom Object
				if (option2.equals("a")) {
					StandardRoom StandardRoomObject = new StandardRoom ();
					System.out.println("Enter the Room's code:");
					StandardRoomObject.setRoomCode(sc.nextInt());
					flag = false;
					while (!flag) {
						for (i = 0; i < RoomList.size(); i++) {
							if (StandardRoomObject.getRoomCode() == (RoomList.get(i).getRoomCode())) {
								flag = true;
								break;
							}
						}
						if (flag) {
							System.out.println("The Room's code already exists, enter again:");	
							StandardRoomObject.setRoomCode(sc.nextInt());
							flag = false;
						}
						else {
							flag = true;
						}
					}
					System.out.println("Enter the Room's floor:");	
					StandardRoomObject.setRoomFloor(sc.nextInt());
					while ((StandardRoomObject.getRoomFloor() < 0) || (StandardRoomObject.getRoomFloor() > 3)) {
						System.out.println("There is no such Room floor, enter again:");
						StandardRoomObject.setRoomFloor(sc.nextInt());
					}
					System.out.println("Enter the Room's capacity:");
					StandardRoomObject.setRoomCapacity(sc.next());
					System.out.println("Enter the Room's price:");	
					StandardRoomObject.setRoomPrice(sc.nextDouble());
					RoomList.add(StandardRoomObject);
					System.out.println(menu);
					option = sc.nextInt();
					while ((option != 1) && (option != 2) && (option != 3) && (option != 4) && (option != 5) && (option != 6) && (option != 7) && (option != 8) && (option != 0)) {
						System.out.println("No such option, enter again:");
						option = sc.nextInt();
					} 
				}
				
				// 7c --> Create new SuperiorRoom Object
				else {
					SuperiorRoom SuperiorRoomObject = new SuperiorRoom ();
					System.out.println("Enter the Room's code:");
					SuperiorRoomObject.setRoomCode(sc.nextInt());
					flag = false;
					while (!flag) {
						for (i = 0; i < RoomList.size(); i++) {
							if (SuperiorRoomObject.getRoomCode() == (RoomList.get(i).getRoomCode())) {
								flag = true;
								break;
							}
						}
						if (flag) {
							System.out.println("The Room's code already exists, enter again:");	
							SuperiorRoomObject.setRoomCode(sc.nextInt());
							flag = false;
						}
						else {
							flag = true;
						}
					}
					System.out.println("Enter the Room's floor:");	
					SuperiorRoomObject.setRoomFloor(sc.nextInt());
					while ((SuperiorRoomObject.getRoomFloor() < 0) || (SuperiorRoomObject.getRoomFloor() > 3)) {
						System.out.println("There is no such Room floor, enter again:");
						SuperiorRoomObject.setRoomFloor(sc.nextInt());
					}
					System.out.println("Enter the Room's capacity:");
					SuperiorRoomObject.setRoomCapacity(sc.next());
					System.out.println("Enter the Room's price:");	
					SuperiorRoomObject.setRoomPrice(sc.nextDouble());
					System.out.println("Enter any Amenity from the list or enter exit:\n");
					for (i = 0; i < AmenityList.size(); i++) {
						System.out.println(AmenityList.get(i).getAmenityCode());
					}
					SuperiorRoomObject.setRoomAmenities(sc.next());
					flag = false;
					while (!flag) {
						for (i = 0; i < AmenityList.size(); i++) {
							if (SuperiorRoomObject.getRoomAmenities().equals(AmenityList.get(i).getAmenityCode())) {
								flag = true;
							}
						}
						if (!flag) {
							System.out.print("No such Amenity in the List, enter again:\n");
							SuperiorRoomObject.setRoomAmenities(sc.next());
						}
					}
					RoomList.add(SuperiorRoomObject);
					System.out.println(menu);
					option = sc.nextInt();
					while ((option != 1) && (option != 2) && (option != 3) && (option != 4) && (option != 5) && (option != 6) && (option != 7) && (option != 8) && (option != 0)) {
						System.out.println("No such option, enter again:");
						option = sc.nextInt();
					} 
				}
			}
			
			// 7d --> Create new Client Object
			else if (option == 3) {
				Client ClientObject = new Client ();
				System.out.println("Enter the Client's id:");
				ClientObject.setClientID(sc.next());
				flag = false;
				while (!flag) {
					for (i = 0; i < ClientList.size(); i++) {
						if (ClientObject.getClientID().equals(ClientList.get(i).getClientID())) {
							flag = true;
							break;
						}
					}
					if (flag) {
						System.out.println("The Client's id already exists, enter again:");	
						ClientObject.setClientID(sc.next());
						flag = false;
					}
					else {
						flag = true;
					}
				}
				System.out.println("Enter the Client's name:");
				ClientObject.setClientName(sc.next());
				System.out.println("Enter the Client's lastname:");
				ClientObject.setClientLastName(sc.next());
				System.out.println("Enter the Client's address:");
				ClientObject.setClientAddress(sc.next());
				System.out.println("Enter the Client's phone number:");
				ClientObject.setClientPhoneNumber(sc.nextInt());
				ClientList.add(ClientObject);
				System.out.println(menu);
				option = sc.nextInt();
				while ((option != 1) && (option != 2) && (option != 3) && (option != 4) && (option != 5) && (option != 6) && (option != 7) && (option != 8) && (option != 0)) {
					System.out.println("No such option, enter again:");
					option = sc.nextInt();
				} 
			}
			
			// 7e --> Create new Reservation Object
			else if (option == 4) {
				Reservation ReservationObject = new Reservation();
				System.out.println("Enter the Check-In's year:");
				y = sc.nextInt();
				System.out.println("Enter the Check-In's month:");
				m = sc.nextInt();
				while ((m < 1) || (m > 12)) {
					System.out.println("This month is not valid, enter again:");
					m = sc.nextInt();
				}
				System.out.println("Enter the Check-In's day:");
				d = sc.nextInt();
				LocalDate checkin = LocalDate.of(y ,m , d);
				ReservationObject.setResCheckIn(checkin);
				System.out.println("Enter the Check-Out's year:");
				y = sc.nextInt();
				System.out.println("Enter the Check-Out's month:");
				m = sc.nextInt();
				while ((m < 1) || (m > 12)) {
					System.out.println("There is no such month, enter again:");
					m = sc.nextInt();
				}
				System.out.println("Enter the Check-Out's day:");
				d = sc.nextInt();
				LocalDate checkout = LocalDate.of(y ,m , d);
				ReservationObject.setResCheckOut(checkout);
				System.out.println("These are the available Rooms:\n");		
				for (k = 0; k < ReservationList.size(); k++) {
					if (((ReservationObject.getResCheckIn().isAfter(ReservationList.get(k).getResCheckIn())) && (ReservationObject.getResCheckIn().isBefore(ReservationList.get(k).getResCheckOut()))) || ((ReservationObject.getResCheckOut().isAfter(ReservationList.get(k).getResCheckIn())) && (ReservationObject.getResCheckOut().isBefore(ReservationList.get(k).getResCheckOut()))) || ((ReservationObject.getResCheckIn().isBefore(ReservationList.get(k).getResCheckIn())) && (ReservationObject.getResCheckOut().isAfter(ReservationList.get(k).getResCheckIn()))) || ((ReservationObject.getResCheckIn().isBefore(ReservationList.get(k).getResCheckOut())) && (ReservationObject.getResCheckOut().isAfter(ReservationList.get(k).getResCheckOut()))) || ((ReservationObject.getResCheckIn().isEqual(ReservationList.get(k).getResCheckIn()))) && (ReservationObject.getResCheckOut().isEqual(ReservationList.get(k).getResCheckOut()))) {
						DateList.add(ReservationList.get(k).getResRoomNumber());
					}
				}
				for (i = 0; i < 4; i++) {
					for (j = 0; j < 6; j++) {
						flag = false;
						for (k = 0; k < DateList.size(); k++) {
							if (DateList.get(k) == rooms[i][j]) {
								flag = true;
							}
						}
						if (!flag) {
							if (i == 0) {
								System.out.println("00"+rooms[i][j]);
							}
							else {
								System.out.println(rooms[i][j]);
							}
						}
					}
				}				
				System.out.println("Enter the Room's code you would like to register:");
				ReservationObject.setResRoomNumber(sc.nextInt());
				flag = false;
				flag2 = false;
				flag3 = false;
				while ((!flag3) && (!flag)) {
					for (k = 0; k < DateList.size(); k++) {
						if (DateList.get(k) == ReservationObject.getResRoomNumber()) {
							flag2 = true;
						}
					}
					for (i = 0; i < 4; i++) {
						for (j = 0; j < 6; j++) {
							if (ReservationObject.getResRoomNumber() == rooms[i][j]) {
								flag = true;
							}
						}
					}
					if ((flag2) || (!flag)) {
						System.out.println("This Room is unavailable, enter again:");
						ReservationObject.setResRoomNumber(sc.nextInt());
						i = j = k = 0;
						flag2 = false;
						flag = false;
					}
					else {
						flag3 = true;
					}
				}		
				System.out.println("Enter the Reservation's number of people:");
				ReservationObject.setResGroup(sc.nextInt());
				System.out.println("Enter the Reservation's discount:");
				ReservationObject.setResDiscount(sc.nextDouble());
				System.out.println("Enter the Client's id:");
				ReservationObject.setResClient(sc.next());
				flag = false;
				for (i = 0; i < ClientList.size(); i++) {
					if (ClientList.get(i).getClientID().equals(ReservationObject.getResClient())) {
						System.out.println("This Client already exists.\n");
						flag = true;
					}
				}
				if (!flag) {
					Client ClientObject = new Client ();
					ClientObject.setClientID(ReservationObject.getResClient());
					System.out.println("Enter the Client's name:");
					ClientObject.setClientName(sc.next());
					System.out.println("Enter the Client's lastname:");
					ClientObject.setClientLastName(sc.next());
					System.out.println("Enter the Client's address:");
					ClientObject.setClientAddress(sc.next());
					System.out.println("Enter the Client's phone number:");
					ClientObject.setClientPhoneNumber(sc.nextInt());
					ClientList.add(ClientObject);
				}
				ReservationList.add(ReservationObject);
				DateList.clear();
				System.out.println(menu);
				option = sc.nextInt();
				while ((option != 1) && (option != 2) && (option != 3) && (option != 4) && (option != 5) && (option != 6) && (option != 7) && (option != 8) && (option != 0)) {
					System.out.println("No such option, enter again:");
					option = sc.nextInt();
				} 
			}
			
			// 7f --> Delete a Reservation Object
			else if (option == 5) {
				System.out.println("To delete a Reservation, enter its code:");
				option3 = sc.nextInt();
				flag = false;
				for (i = 0; i < ReservationList.size(); i++) {
					if (ReservationList.get(i).getResRoomNumber() == option3) {
						flag = true;
						System.out.println("Successful deletion.\n");
						ReservationList.remove(i);
						break;
					}
				}
				if (!flag) {
					System.out.println("No such Reservation exists in the list.\n");
				}
				System.out.println(menu);
				option = sc.nextInt();
				while ((option != 1) && (option != 2) && (option != 3) && (option != 4) && (option != 5) && (option != 6) && (option != 7) && (option != 8) && (option != 0)) {
					System.out.println("No such option, enter again:");
					option = sc.nextInt();
				} 
			}
			
			// 7g -- > Update Reservation Class for Client's Amenities
			else if (option == 6) {
				System.out.println("Enter the Reservation's code:");
				option4 = sc.nextInt();
				flag = false;
				flag2 = false;
				for (i = 0; i < ReservationList.size(); i++) {
					if ((ReservationList.get(i).getResRoomNumber() == option4)) {
						flag = true;
						break;
					}
				}
				for (j = 0; j < RoomList.size(); j ++) {
					if ((RoomList.get(j).getRoomCode() == option4) && (RoomList.get(j) instanceof SuperiorRoom)) {
						flag2 = true;
						break;
					}
				}
				if ((flag) && (flag2)) {
					System.out.println("Let's update amenities");
				}
				else {
					System.out.println("No such Reservation exists in the list.\n");
				}
				System.out.println(menu);
				option = sc.nextInt();
				while ((option != 1) && (option != 2) && (option != 3) && (option != 4) && (option != 5) && (option != 6) && (option != 7) && (option != 8) && (option != 0)) {
					System.out.println("No such option, enter again:");
					option = sc.nextInt();
				} 
			}
			
			// 7h -- > Present Hotel's availability for a specific time period
			if (option == 7) {
				System.out.println("Enter the Check-In's year:");
				y = sc.nextInt();
				System.out.println("Enter the Check-In's month:");
				m = sc.nextInt();
				while ((m < 1) || (m > 12)) {
					System.out.println("This month is not valid, enter again:");
					m = sc.nextInt();
				}
				System.out.println("Enter the Check-In's day:");
				d = sc.nextInt();
				LocalDate checkin = LocalDate.of(y ,m , d);
				System.out.println("Enter the Check-Out's year:");
				y = sc.nextInt();
				System.out.println("Enter the Check-Out's month:");
				m = sc.nextInt();
				while ((m < 1) || (m > 12)) {
					System.out.println("There is no such month, enter again:");
					m = sc.nextInt();
				}
				System.out.println("Enter the Check-Out's day:");
				d = sc.nextInt();
				LocalDate checkout = LocalDate.of(y ,m , d);
				System.out.println("These are the available Rooms:\n");
				for (i = 0; i < ReservationList.size(); i++) {
					if (((checkin.isAfter(ReservationList.get(i).getResCheckIn())) && (checkin.isBefore(ReservationList.get(i).getResCheckOut()))) || ((checkout.isAfter(ReservationList.get(i).getResCheckIn())) && (checkout.isBefore(ReservationList.get(i).getResCheckOut()))) || ((checkin.isBefore(ReservationList.get(i).getResCheckIn())) && (checkout.isAfter(ReservationList.get(i).getResCheckIn()))) || ((checkin.isBefore(ReservationList.get(i).getResCheckOut())) && (checkout.isAfter(ReservationList.get(i).getResCheckOut()))) || ((checkin.isEqual(ReservationList.get(i).getResCheckIn()))) && (checkout.isEqual(ReservationList.get(i).getResCheckOut()))) {
						DateList.add(ReservationList.get(i).getResRoomNumber());
					}
				}
				for (i = 0; i < 4; i++) {
					for (j = 0; j < 6; j++) {
						flag = false;
						for (k = 0; k < DateList.size(); k++) {
							if (DateList.get(k) == rooms[i][j]) {
								flag = true;
							}
						}
						if (!flag) {
							if (i == 0) {
								System.out.println("00"+rooms[i][j]);
							}
							else {
								System.out.println(rooms[i][j]);
							}
						}
					}
				}
				DateList.clear();
				System.out.println(menu);
				option = sc.nextInt();
				while ((option != 1) && (option != 2) && (option != 3) && (option != 4) && (option != 5) && (option != 6) && (option != 7) && (option != 8) && (option != 0)) {
					System.out.println("No such option, enter again:");
					option = sc.nextInt();
				}
			}
			
			// 7i -- > Present Hotel's completeness for a specific day
			else if (option == 8) {
				System.out.println("Enter the Date's year:");
				y = sc.nextInt();
				System.out.println("Enter the Date's month:");
				m = sc.nextInt();
				while ((m < 1) || (m > 12)) {
					System.out.println("This month is not valid, enter again:");
					m = sc.nextInt();
				}
				System.out.println("Enter the Date's day:");
				d = sc.nextInt();
				LocalDate date = LocalDate.of(y ,m , d);
				System.out.println("This is the Hotel's completeness:\n");
				for (i = 0; i < ReservationList.size(); i++) {
					if ((date.isAfter(ReservationList.get(i).getResCheckIn())) && (date.isBefore(ReservationList.get(i).getResCheckOut())) || (date.isEqual(ReservationList.get(i).getResCheckIn()))) {
						DateList.add(ReservationList.get(i).getResRoomNumber());
					}
				}
				for (i = 0; i < 4; i++) {
					for (j = 0; j < 6; j++) {
						flag = false;
						for (k = 0; k < DateList.size(); k++) {
							if (rooms[i][j] == DateList.get(k)) {
								flag = true;
							}
						}
						if (flag) {
							if (i == 0) {
								System.out.print("[00" + rooms[i][j] + "]\t");
								if (j == 5) {
									System.out.println("\n");
								}
							}
							else {
								System.out.print("[" + rooms[i][j] + "]\t");
									if (j == 5) {
									System.out.println("\n");
								}
							}
						}
						else {
							if (i == 0) {
								System.out.print("00" + rooms[i][j] + "\t");
								if (j == 5) {
									System.out.println("\n");
								}
							}
							else {
								System.out.print(rooms[i][j] + "\t");
								if (j == 5) {
									System.out.println("\n");
								}
							}
						}
					}					
				}
				DateList.clear();
				System.out.println(menu);
				option = sc.nextInt();
				while ((option != 1) && (option != 2) && (option != 3) && (option != 4) && (option != 5) && (option != 6) && (option != 7) && (option != 8) && (option != 0)) {
					System.out.println("No such option, enter again:");
					option = sc.nextInt();
				} 
			}
							
			// 7j -- > Termination
			else if (option == 0){
				System.exit(0);
			}
		}
	}
}