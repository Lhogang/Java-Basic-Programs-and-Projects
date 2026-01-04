package bookingsystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookingSystem {
    private List<Room> rooms;
    private List<Booking> bookings;
    private static final double VAT_RATE = 0.13;
    private static final double TOURISM_FUND_RATE = 0.05;

    public BookingSystem() {
        rooms = new ArrayList<>();
        bookings = new ArrayList<>();
        initializeRooms();
    }

    private static class Room {
        private int roomNumber;
        private String type;
        private double price;
        private boolean isAvailable;

        public Room(int roomNumber, String type, double price) {
            this.roomNumber = roomNumber;
            this.type = type;
            this.price = price;
            this.isAvailable = true;
        }

        @Override
        public String toString() {
            return "Room " + roomNumber + " (" + type + ") - Npr" + price + " - " + (isAvailable ? "Available" : "Booked");
        }
    }

    private static class Booking {
        private String customerName;
        private Room room;
        private int numberOfNights;
        private double totalCost;

        public Booking(String customerName, Room room, int numberOfNights) {
            this.customerName = customerName;
            this.room = room;
            this.numberOfNights = numberOfNights;
            this.totalCost = calculateTotalCost(room.price, numberOfNights);
        }

        private double calculateTotalCost(double pricePerNight, int numberOfNights) {
            double roomCharges = pricePerNight * numberOfNights;
            double vat = roomCharges * VAT_RATE;
            double tourismFund = roomCharges * TOURISM_FUND_RATE;
            return roomCharges + vat + tourismFund;
        }

        @Override
        public String toString() {
            double roomCharges = room.price * numberOfNights;
            double vat = roomCharges * VAT_RATE;
            double tourismFund = roomCharges * TOURISM_FUND_RATE;
            return "Customer: " + customerName + "\n" +
                   "Room: " + room + "\n" +
                   "Number of Nights: " + numberOfNights + "\n" +
                   "Room Charges: Npr" + roomCharges + "\n" +
                   "VAT (13%): Npr" + vat + "\n" +
                   "Tourism Fund (5%): Npr" + tourismFund + "\n" +
                   "Total Cost: Npr" + totalCost;
        }
    }

    private void initializeRooms() {
        rooms.add(new Room(101, "Single", 100.0));
        rooms.add(new Room(102, "Double", 150.0));
        rooms.add(new Room(103, "Suite", 200.0));
        rooms.add(new Room(104, "Single", 100.0));
        rooms.add(new Room(105, "Double", 150.0));
        rooms.add(new Room(106, "Suite", 200.0));
        rooms.add(new Room(107, "Single", 100.0));
        rooms.add(new Room(108, "Double", 150.0));
        rooms.add(new Room(109, "Suite", 200.0));
        rooms.add(new Room(110, "Single", 100.0));
    }

    public void displayRooms() {
        System.out.println("Available Rooms:");
        for (Room room : rooms) {
            if (room.isAvailable) {
                System.out.println(room);
            }
        }
    }

    public void bookRoom(String customerName, int roomNumber, int numberOfNights) {
        Room roomToBook = null;
        for (Room room : rooms) {
            if (room.roomNumber == roomNumber && room.isAvailable) {
                roomToBook = room;
                break;
            }
        }

        if (roomToBook != null) {
            roomToBook.isAvailable = false;
            Booking booking = new Booking(customerName, roomToBook, numberOfNights);
            bookings.add(booking);
            System.out.println("Room " + roomNumber + " booked successfully.");
            System.out.println(booking);
        } else {
            System.out.println("Room " + roomNumber + " is not available.");
        }
    }

    public void generateBill() {
        System.out.println("Generating Bill:");
        double totalCost = 0.0;
        for (Booking booking : bookings) {
            System.out.println(booking);
            totalCost += booking.totalCost;
        }
        System.out.println("Total Cost: Npr" + totalCost);
    }

    public void displayProgram() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Display Rooms\n2. Book Room\n3. Generate Bill\n4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    this.displayRooms();
                    break;
                case 2:
                    System.out.print("Enter your name: ");
                    String customerName = scanner.next();
                    System.out.print("Enter room number to book: ");
                    int roomNumber = scanner.nextInt();
                    System.out.print("Enter number of nights: ");
                    int numberOfNights = scanner.nextInt();
                    this.bookRoom(customerName, roomNumber, numberOfNights);
                    break;
                case 3:
                    this.generateBill();
                    break;
                case 4:
                    System.out.println("Exiting the system. Goodbye!");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    public static void main(String[] args) {
        BookingSystem system = new BookingSystem();
        system.displayProgram();
    }
}
