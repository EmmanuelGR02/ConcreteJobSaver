package concreteCalculatorAndDataSaver;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		File dataFile = new File("ConcreteJobs.txt");
		Scanner in = new Scanner(System.in);
		Concrete data = new Concrete();
		
		// keeps asking for info until user chooses to quit
		while (true) {
			// menu
			int choice = menu();
			
			// option one only calculate the yards and the concrete price
			if (choice == 1) {
				data.jobLength("\nLength: ");
				data.jobWidth("Width: ");
				data.jobDepth("Depth: ");
				
				System.out.println("\nLength: " + data.getLength());
				System.out.println("Width: " + data.getWidth());
				System.out.println("Depth: " + data.getDepth());
				data.calculateYards();
				System.out.println("Total Yards: " + data.getYards());
				data.calculateConcretePrice();
				System.out.println("Concrete Price: $" + data.getConcretePrice() + "\n");
				
			// option 2 asks for more information and stores it in a text file
			} else if (choice == 2) {
				// asks for info then it displays it
				data.jobDate("\nDate: ");
				data.jobCustomerName("Customer name: ");
				data.jobAddress("Address: ");
				data.jobDescription("Job Description: ");
				
				data.jobLength("\nLength: ");
				data.jobWidth("Width: ");
				data.jobDepth("Depth: ");
				
				data.jobGravel("Gravel Price: ");
				data.jobMachines("Machines price: ");
				data.jobOtherUtilities("Other Utilities Price: ");
				data.jobWorkers("How many Workers? ");
				data.jobPersonalProfit("Personal Profit: ");
				
			
				System.out.println("\n*****Customer Info*****\nDate: " + data.getDate());
				System.out.println("Customer Name: " + data.getCustomerName());
				System.out.println("Address: " + data.getAddress());
				System.out.println("Job Description: " + data.getJobDescription());
				
				data.calculateYards();
				System.out.println("\n*****Job Info*****\nTotal Yards: " + data.getYards());
				data.jobTotalUtilities();
				System.out.println("Utilities: $" + data.getUtilitiesPrice());
				System.out.println("Personal Profit: $" + data.getPersonalProfit());
				data.jobWorkersPrice();
				System.out.println("Workers Price: $" + data.getWorkersPrice());
				data.calculateConcretePrice();
				System.out.println("Concrete Price: $" + data.getConcretePrice());
				data.jobTotal();
				System.out.println("Total: $" + data.getTotal() + "\n");
				
				
				// save info in a text file
				try {
					FileWriter infoWriter = new FileWriter(dataFile.getName(),true);
					BufferedWriter bw = new BufferedWriter(infoWriter);
					
					bw.write("\n*****Customer Info*****\nDate: " + data.getDate() + "\n");
					bw.write("Customer Name: " + data.getCustomerName() + "\n");
					bw.write("Address: " + data.getAddress() + "\n");
					bw.write("Job Description: " + data.getJobDescription() + "\n");
					bw.write("\n*****Job Info and Prices*****\nJob Measurements: " + data.getLength() + "ft x " + data.getWidth() + "ft x " + data.getDepth() + "in\n");
					bw.write("Total Yards: " + data.getYards() + "\n");
					bw.write("Utilities: $" + data.getUtilitiesPrice() + "\n");
					bw.write("Workers Price: $" + data.getWorkersPrice() + "\n");
					bw.write("Personal Profit: $" + data.getPersonalProfit() + "\n");
					bw.write("Concrete Price: $" + data.getConcretePrice() + "\n");
					bw.write("Total $" + data.getTotal() + "\n");
					bw.close();
				} catch(IOException e) {
					e.printStackTrace();
				}
			}
		
		}
		
	}
	
	// displays menu, deals with invalid inputs and quits program if user chooses to
	public static int menu() {
		Scanner inmenu = new Scanner(System.in);
		while(true) {
			// quit option
			System.out.println("MENU\n1. Calculate Yards");
			System.out.println("2. Save Job Data");
			System.out.println("3. QUIT");

			int menu = inmenu.nextInt();
			if (menu < 1 || menu > 3) {
				continue;
			} else if (menu == 3) {
				System.out.println("All data was saved!");
				System.exit(0);
			} else {
				return menu;
			}
		}
	}
	
	
}