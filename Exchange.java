public class Exchange {
	int numID = 0;
	String exchangeID = "blank";
	int xLoc = 0;
	int yLoc = 0;
	boolean locationSet = false;
	int customerDistance = 0;
	int capacity = 0;
	
	public int getCapacity() {
		return capacity;
	}
	
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	public int getNumID() {
		return numID;
	}
	public void setNumID(int numID) {
		this.numID = numID;
	}
	public String getExchangeID() {
		return exchangeID;
	}
	public void setExchangeID(String exchangeID) {
		this.exchangeID = exchangeID;
	}
	public int getxLoc() {
		return xLoc;
	}
	public void setxLoc(int xLoc) {
		this.xLoc = xLoc;
	}
	public int getyLoc() {
		return yLoc;
	}
	public void setyLoc(int yLoc) {
		this.yLoc = yLoc;
	}
	public boolean isLocationSet() {
		return locationSet;
	}
	public void setLocationSet(boolean locationSet) {
		this.locationSet = locationSet;
	}
	public int getCustomerDistance() {
		return customerDistance;
	}
	public void setCustomerDistance(int customerDistance) {
		this.customerDistance = customerDistance;
	}
	
}
