
public class Amenity {
	
	private String amenitycode;
	private String amenitycategory;
	private String amenitydescription;
	private double amenitycost;
	
	Amenity (String amenitycode, String amenitycategory, String amenitydescription, double amenitycost) {
		
		this.setAmenityCode(amenitycode);
		this.setAmenityCategory(amenitycategory);
		this.setAmenityDescription(amenitydescription);
		this.setAmenityCost(amenitycost);
		
	}
	
	Amenity () {
		
	}

	// (set & get) AmenityCode
	public  void setAmenityCode(String amenitycode) {
		this.amenitycode = amenitycode;
	}
	
	public String getAmenityCode() {
		return this.amenitycode;
	}
	
	// (set & get) AmenityCategory
	public void setAmenityCategory(String amenitycategory) {
		this.amenitycategory = amenitycategory;
	}
	
	public String getAmenityCategory() {
		return this.amenitycategory;
	}
	
	// (set & get) AmenityDescription
	public void setAmenityDescription(String amenitydescription) {
		this.amenitydescription = amenitydescription;
	}
	
	public String getAmenityDescription() {
		return this.amenitydescription;
	}
	
	// (set & get) AmenityCost
	public void setAmenityCost(double amenitycost) {
		this.amenitycost = amenitycost;
	}
	
	public double getAmenityCost() {
		return this.amenitycost;
	}

}
