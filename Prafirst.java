// public package pra;
import java.util.*;
class TravelAgencies {
	private int regNo;
	private String agencyName;
	private String pakageType;
	private int price;
	private boolean flightFacilty;
	
	

	public TravelAgencies(int regNo, String agencyName, String pakageType, int price, boolean flightFacilty) {
//		super();
		this.regNo = regNo;
		this.agencyName = agencyName;
		this.pakageType = pakageType;
		this.price = price;
		this.flightFacilty = flightFacilty;
	}
	
	public int getRegNo() {
		return regNo;
	}

	public void setRegNo(int regNo) {
		this.regNo = regNo;
	}

	public String getAgencyName() {
		return agencyName;
	}

	public void setAgencyName(String agencyName) {
		this.agencyName = agencyName;
	}

	public String getPakageType() {
		return pakageType;
	}

	public void setPakageType(String pakageType) {
		this.pakageType = pakageType;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public boolean isFlightFacilty() {
		return flightFacilty;
	}

	public void setFlightFacilty(boolean flightFacilty) {
		this.flightFacilty = flightFacilty;
	}

   
	
}
public class Prafirst {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	TravelAgencies [] arr = new TravelAgencies[4];
    	for(int i =0;i<4;i++) {
    		int regNo = sc.nextInt();
    		sc.nextLine();
    		String agencyName  = sc.nextLine();
    		String pakageType = sc.nextLine();
    		int price = sc.nextInt();
    		boolean flightFacility = sc.nextBoolean();
    		arr[i] = new TravelAgencies(regNo,agencyName,pakageType,price,flightFacility);
    	}
    	int regNoid = sc.nextInt();
    	sc.nextLine();
    	String packageTypeSearch = sc.nextLine();
		sc.close();
    	int ans1 =findAgencyWithHighestPackagePrice(arr);
    	if(ans1!=0) {
    		System.out.println(ans1);
    	}
    	else {
    		System.out.println("No value");
    	}
    	
    	TravelAgencies ans = agencyDetailsforGivenIdAndType(arr ,regNoid,packageTypeSearch); 
    	if(ans!=null) {
    	System.out.println(ans.getAgencyName()+":"+ans.getPrice());
    		
    	}
    	else {
    		System.out.println("not found ");
    	}
    	
    }
    public static int findAgencyWithHighestPackagePrice(TravelAgencies[] arr) {
    	int ans = Integer.MIN_VALUE;
    	for(int i =0;i<arr.length;i++) {
    		if(arr[i].getPrice()>ans) {
    			ans = arr[i].getPrice();
    		}
    	}
    	// if(ans>0) return ans;
    	// else {
    	// 	return 0;
    	// }
		return ans>0 ? ans : 0;
    }
//    return object
    public static TravelAgencies agencyDetailsforGivenIdAndType(TravelAgencies[] arr, int regNo,String packgtypeSearch) {
//    	boolean found = false;
    	
    	for(int i =0;i<4;i++) {
    		if(arr[i].getRegNo()==regNo && arr[i].getPakageType().equalsIgnoreCase(packgtypeSearch)) 
    			return arr[i];
    		}
    	
    	return null;
    	
    }
}
// Question: 1
// Create a class TravelAgencies with below attributes:

// regNo – int
// agencyName – String
// pakageType – String
// price – int
// flightFacility – boolean

// Write getters, setters for the above attributes . Create constructor which takes parameter in the above sequence.

// Create class Solution with main method. Implement two static methods – findAgencyWithHighestPackagePrice and 
// agencyDetailsforGivenIdAndType in Solution class.

// findAgencyWithHighestPackagePrice method:

// This method will take array of TravelAgencies objects as an input parameter and return the highest package 
// price from the given array of objects.

// agencyDetailsForGivenldAndType method:

// This method will take three input parameters -array of TravelAgencies objects, int parameter regNo and String
// parameter packageType. The method will return the TravelAgencies object based on below conditions.

// FlightFacility should be available.
// The input parameters(regNo and packageType) should matched with the regNo and packageType of TravelAgencies object.
// If any of the above conditions are not met, then the method should return null. Note : Same Travel agency can 
// have more than one package type. Travel agency and package type combination is unique. All the searches should 
// be case insensitive.

// The above mentioned static methods should be called from the main method.


// For findAgencyWithHighestPackagePrice method – The main method should print the highestPackagePrice as it is. 
// For agencyDetailsForGivenldAndType method -The main method should print the AgencyName and price of the returned 
// object.The AgencyName and price should be concatinated with : while printing.
// ---------
// Input
// ---------
// 123
// A2Z Agency
// Platinum
// 50000
// true
// 345
// SSS Agency
// Gold
// 30000
// false
// 987
// Cox and Kings
// Diamond
// 40000
// true
// 888
// Global Tours
// Silver
// 20000
// false
// 987
// Diamond
// -------------------------------
// Output
// -------------------------------
// 50000
// Cox and Kings:40000