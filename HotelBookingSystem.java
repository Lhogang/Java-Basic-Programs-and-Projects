package hotelbookingsystem;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Room {
    private String type;
    private double price;
    private boolean availability;

    public Room(String type, double price, boolean availability) {
        this.type = type;
        this.price = price;
        this.availability = availability;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }
}

class Customer {
    private String name;
    private Room room;

    public Customer(String name, Room room) {
        this.name = name;
        this.room = room;
    }

    public String getName() {
        return name;
    }

    public Room getRoom() {
        return room;
    }
}

public class HotelBookingSystem {
    private List<Room> rooms;
    private List<Customer> customers;

    public HotelBookingSystem() {
        this.rooms = new ArrayList<>();
        this.customers = new ArrayList<>();

        // Initialize rooms
        rooms.add(new Room("Single", 100, true));
        rooms.add(new Room("Double", 150, true));
        rooms.add(new Room("Deluxe", 200, true));
        rooms.add(new Room("Single", 100, true));
        rooms.add(new Room("Double", 150, true));
        rooms.add(new Room("Deluxe", 200, true));
        rooms.add(new Room("Single", 100, true));
        rooms.add(new Room("Double", 150, true));
        rooms.add(new Room("Deluxe", 200, true));
        rooms.add(new Room("Single", 100, true));
    }

    public void displayRooms() {
        System.out.println("Available Rooms:");
        for (Room room : rooms) {
            if (room.isAvailability()) {
                System.out.println("Type: " + room.getType() + ", Price: " + room.getPrice());
            }
        }
    }

    public void bookRoom() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = scanner.nextLine();
        System.out.println("Enter your preferred room type (Single, Double, Deluxe):");
        String type = scanner.nextLine();

        Room room = null;
        for (Room r : rooms) {
            if (r.isAvailability() && r.getType().equals(type)) {
                room = r;
                break;
            }
        }

        if (room != null) {
            room.setAvailability(false);
            Customer customer = new Customer(name, room);
            customers.add(customer);
            System.out.println("Room booked successfully!");
        } else {
            System.out.println("Sorry, no " + type + " room is available.");
        }
    }

    public void generateBill() {
        if (customers.size() > 0) {
            Customer customer = customers.get(0);
            customers.remove(0);
            Room room = customer.getRoom();
            double totalCost = room.getPrice() * 1.13; // 13% VAT
            double tourismFund = room.getPrice() * 0.05;
            System.out.println("Bill for " + customer.getName());
            System.out.println("Room Charges: " + room.getPrice());
            System.out.println("Tax (13% VAT): " + room.getPrice() * 0.13);
            System.out.println("Tourism Fund (5%): " + tourismFund);
            System.out.println("Total Payment Due: " + totalCost);
        } else {
            System.out.println("No bookings available.");
        }
    }

    public static void main(String[] args) {
        HotelBookingSystem hotel = new HotelBookingSystem();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Display Rooms");
            System.out.println("2. Book Room");
            System.out.println("3. Generate Bill");
            System.out.println("4. Exit");
            System.out.println("Enter your choice:");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    hotel.displayRooms();
                    break;
                case 2:
                    hotel.bookRoom();
                    break;
                case 3:
                    hotel.generateBill();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}