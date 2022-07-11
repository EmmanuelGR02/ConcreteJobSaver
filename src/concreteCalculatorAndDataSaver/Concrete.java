package concreteCalculatorAndDataSaver;
import java.util.Scanner;

public class Concrete {
	// set scanner
	Scanner in = new Scanner(System.in);
	
	// Initializers
	private String date;
	private String customerName;
	private String address;
	private String jobDescription;
	
	// measurements
	private double length;
	private double width;
	private double depth;
	private double yards;
	
	// prices 
	private double concretePrice;
	private double utilitiesPrice;
	private double otherUtilities;
	private double gravelPrice;
	private double machinesPrice;
	private int workers;
	private double workersPrice;
	private double personalProfit;
	private double total;

	
	// Getters 
	public String getDate() { return date; }
	public String getCustomerName() { return customerName; }
	public String getAddress() { return address; }
	public String getJobDescription() { return jobDescription; }
	
	// measurements
	public double getYards() { return yards; }
	public double getLength() { return length; }
	public double getWidth() { return width; }
	public double getDepth() { return depth; }
	
	// prices
	public double getConcretePrice() { return concretePrice; }
	public double getUtilitiesPrice() { return utilitiesPrice; }
	public double getGravelPrice() { return gravelPrice; }
	public double getMachinesPrice() { return machinesPrice; }
	public double getWorkers() { return workers; }
	public double getWorkersPrice() { return workersPrice; }
	public double getPersonalProfit() { return personalProfit; }
	public double getTotal() { return total; }


		
	// Setters
	public void setDate(String date) { this.date = date; }
	public void setCustomerName(String customerName) { this.customerName = customerName; }
	public void setAddress(String address) { this.address = address; }
	public void setJobDescription(String jobDescription) { this.jobDescription = jobDescription; }
	
	// measurements
	public void setYards(double yards) { this.yards = yards; }

	// prices
	public void setConcretePrice(double concretePrice) { this.concretePrice = concretePrice; }
	
	// reads date entered
	public void jobDate(String prompt) {
		System.out.print(prompt);
		date = in.nextLine();
	}
	
	// reads customer name
	public void  jobCustomerName(String prompt) {
		System.out.print(prompt);
		customerName = in.nextLine();
	}
	
	// reads customer address
	public void jobAddress(String prompt) {
		System.out.print(prompt);
		address = in.nextLine();
	}
	
	// reads job description
	public void jobDescription(String prompt) {
		System.out.print(prompt);
		jobDescription = in.nextLine();
	}
	
	// reads the length
	public void jobLength(String prompt) {
		System.out.print(prompt);
		length = in.nextDouble();
	}
	
	// reads the width
	public void jobWidth(String prompt) {
		System.out.print(prompt);
		width = in.nextDouble();
	}
	
	// reads the depth
	public void jobDepth(String prompt) {
		System.out.print(prompt);
		depth = in.nextDouble();
	}
	
	// calculate the yards
	public void calculateYards() {
		double inchesToFeet = depth/12;
		double squaredFeet = length * width * inchesToFeet;
		double tempYards = squaredFeet/27; 
		yards = Math.round(tempYards * 100.0) / 100.0; 
	}
	
	//calculate concrete price
	public void calculateConcretePrice() {
		double price = yards * 170;
		concretePrice = Math.round(price * 100.0) / 100.0; 
	}
	
	// reads the price for the gravel
	public void jobGravel(String prompt) {
		System.out.print(prompt);
		gravelPrice = in.nextDouble();
	}
	
	// reads the price for machines needed
	public void jobMachines(String prompt) {
		System.out.print(prompt);
		machinesPrice = in.nextDouble();
	}
	
	// reads the price for the other utilities
	public void jobOtherUtilities(String prompt) {
		System.out.print(prompt);
		otherUtilities = in.nextDouble();
	}
	
	// reads the amount of workers
	public void jobWorkers(String prompt) {
		System.out.print(prompt);
		workers = in.nextInt();
	}
	
	// calculate the cost for the workers
	public void jobWorkersPrice() {
		workersPrice = workers * 200;
	}
	
	// reads the personal profit
	public void jobPersonalProfit(String prompt) {
		System.out.print(prompt);
		personalProfit = in.nextDouble();
	}
	
	// calculates the total for utilities
	public void jobTotalUtilities() {
		double price = otherUtilities + gravelPrice + machinesPrice;
		utilitiesPrice = Math.round(price * 100.0) / 100.0;
	}
	
	// calculates the total for the job
	public void jobTotal() {
		double price = concretePrice + utilitiesPrice + personalProfit + workersPrice;
		total = Math.round(price * 100.0) / 100.0;
	}
	
	
		
}
