import java.util.Scanner;

class MovieTicket {
    private String customerName;
    private int phoneNumber;
    private String email;
    private String cinema;
    private int seatNumber;
    private String snacks;
    private double ticketPrice;
    private double snacksPrice;

    
    public MovieTicket(String customerName, int phoneNumber2, String email, String cinema,
                       int seatNumber2, String snacks, double ticketPrice, double snacksPrice) {
    	
        this.customerName = customerName;
        this.phoneNumber = phoneNumber2;
        this.email = email;
        this.cinema = cinema;
        this.seatNumber = seatNumber2;
        this.snacks = snacks;
        this.ticketPrice = ticketPrice;
        this.snacksPrice = snacksPrice;
    }

    public MovieTicket(String customerName2, int phoneNumber2, String email2, String cinema2, String seatNumber2,
			String snacks2, double ticketPrice2, double snacksPrice2) {
		// TODO Auto-generated constructor stub
	}

	public double calculateTotalBill() {
        return ticketPrice + snacksPrice;
    }

    public void printTicket() {
       
        System.out.println("-------------------- MOVIE TICKET -----------------");
        System.out.println("Customer Name: " + customerName);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Email ID: " + email);
        System.out.println("Cinema: " + cinema);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Snacks: " + snacks);
        System.out.println("Ticket Price: " + ticketPrice);
        System.out.println("Snacks Price: " + snacksPrice);
        System.out.println("--------------------   Total    -------------------");
        System.out.println("Total Bill: " + calculateTotalBill());
        System.out.println("--------------------------------------------------");
    }
}

public class Movie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--------------------------------------------------");
        System.out.println("-------------------- WELCOME TO CITY PRIDE  -----------------");
        System.out.println("--------------------------------------------------");
        System.out.print("Enter customer name: ");
        String customerName = scanner.nextLine();

        System.out.print("Enter phone number: ");
        int phoneNumber = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter email ID: ");
        String email = scanner.nextLine();

        System.out.print("Enter cinema name: ");
        String cinema = scanner.nextLine();

        System.out.print("Enter seat number: ");
        int seatNumber = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter snacks (e.g., Popcorn, Nachos, etc.): ");
        String snacks = scanner.nextLine();

        System.out.print("Enter ticket price: ");
        double ticketPrice = scanner.nextDouble();

        System.out.print("Enter snacks price: ");
        double snacksPrice = scanner.nextDouble();

        MovieTicket movieTicket = new MovieTicket(customerName, phoneNumber, email, cinema,
                seatNumber, snacks, ticketPrice, snacksPrice);

        
        movieTicket.printTicket();
    }
}
