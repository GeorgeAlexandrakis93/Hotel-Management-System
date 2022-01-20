import java.time.LocalDate;
import java.util.ArrayList;

public class Reservation {
	
	private int resroomnumber;
	private String resclient;
	private int resgroup;
	private LocalDate rescheckin;
	private LocalDate rescheckout;
	private double resdiscount;
	private String resamenities;
	private double restotalcost;
	
	Reservation(int resroomnumber, String resclient, int resgroup, LocalDate rescheckin, LocalDate rescheckout, double resdiscount, double restotalcost) {
		
		this.setResRoomNumber(resroomnumber);
		this.setResClient(resclient);
		this.setResGroup(resgroup);
		this.setResCheckIn(rescheckin);
		this.setResCheckOut(rescheckout);
		this.setResDiscount(resdiscount);
		this.setResTotalCost(restotalcost);
	}
	
	Reservation () {
		
	}

	// (set & get) ResRoomNumber
	public void setResRoomNumber(int resroomnumber) {
		this.resroomnumber = resroomnumber;
	}
	
	public int getResRoomNumber() {
		return this.resroomnumber;
	}
	
	// (set & get) ResClient
	public void setResClient(String resclient) {
		this.resclient = resclient;
	}
	
	public String getResClient() {
		return this.resclient;
	}
	
	// (set & get) ResNumber
	public void setResGroup(int resgroup) {
		this.resgroup = resgroup;
	}
	
	public int getResGroup() {
		return this.resgroup;
	}
	
	// (set & get) ResCheckIn
	public void setResCheckIn(LocalDate rescheckin) {
		this.rescheckin = rescheckin;
	}
	
	public LocalDate getResCheckIn() {
		return this.rescheckin;
	}
	
	// (set & get) ResCheckOut
	public void setResCheckOut(LocalDate rescheckout) {
		this.rescheckout = rescheckout;
	}
	
	public LocalDate getResCheckOut() {
		return this.rescheckout;
	}
	
	// (set & get) ResDiscount
	public void setResDiscount(double resdiscount) {
		this.resdiscount = resdiscount;
	}
	
	public double getResDiscount() {
		return this.resdiscount;
	}
	
	// (set & get) ResAmenities
	public void setResAmenities(String resamenities) {
		this.resamenities = resamenities;
	}
	
	public String getResAmenities() {
		return this.resamenities;
	}
	
	// (set & get) ResTotalCost
	public void setResTotalCost(double restotalcost) {
		this.restotalcost = restotalcost;
	}
	
	public double getResTotalCost() {
		return this.restotalcost;
	}


}
