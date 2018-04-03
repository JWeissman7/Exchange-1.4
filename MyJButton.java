import java.util.Arrays;
import java.util.ArrayList;
import javax.swing.JButton;

public class MyJButton extends JButton{
 int coordinateX;
 int coordinateY;
 int[] cellID; 
 int distanceCustomer;
 int numExchanges;
 ArrayList<String> exchangeIDs = new ArrayList<String>();;
 ArrayList<Integer> exchangeCapacities = new ArrayList<Integer>();
 
 public ArrayList<Integer> getexchangeCapacities() {
	return exchangeCapacities;
 }

 public void setexchangeCapacities(ArrayList<Integer> exchangeCapacities) {
	this.exchangeCapacities = exchangeCapacities;
 }

public int getcoordinateX() {
 	return coordinateX;
 }
 
 
 public void setcoordinateX(int coordinateX) { 
	this.coordinateX = coordinateX;
 }
 
 public int getcoordinateY() {
	return coordinateY;
 }
 
 public void setcoordinateY(int coordinateY) {
	this.coordinateY = coordinateY;
 }
 
 public int[] getCellID() {
	return cellID;
 }

 public void setCellID(int[] cellID) {
	this.cellID = cellID;
 }

 public int getDistanceCustomer() {
	return distanceCustomer;
 }
 
 public void setDistanceCustomer(int distanceCustomer) {
 	this.distanceCustomer = distanceCustomer;
 }
 
 public int getNumExchanges() {
	return numExchanges;
 }
 
 public void setNumExchanges(int numExchanges) {
	this.numExchanges = numExchanges;
 }
 
 public ArrayList<String> getExchangeIDs() {
	return exchangeIDs;
 }
 
 public String getExchangeID(int k) {
		return exchangeIDs.get(k);
	 }
 
 public void setExchangeID(String exchangeIDElement) {
	exchangeIDs.add(exchangeIDElement);
 }
 
 public int getExchangeCapacity(int k) {
		return exchangeCapacities.get(k);
	 }

 public void setExchangeCapacity(int exchangeCapacityElement) { 
	exchangeCapacities.add(exchangeCapacityElement);
 }
 
}
