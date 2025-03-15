import CarRental.VehicleRentalSystem;
import CarRental.Product.Vehicle;
import CarRental.User;
import CarRental.Store;
import CarRental.Location;
import CarRental.VehicleInventoryManager;
import CarRental.Reservation;
import CarRental.Bill;

public class App {


    public static void main(String[] args) throws Exception {
        System.out.println("Vehicle Rental System!");

        VehicleRentalSystem vehicleRentalSystem = new VehicleRentalSystem();
        User user1 = new User(1, "John");
        User user2 = new User(2, "Doe");

        vehicleRentalSystem.addUser(user1);
        vehicleRentalSystem.addUser(user2);

        Store store1 = new Store(1, "Store1", new Location("New Delhi", "Delhi", "India"));
        Store store2 = new Store(2, "Store2", new Location("Mumbai", "Maharashtra", "India"));

        VehicleInventoryManager vehicleInventoryManager1 = new VehicleInventoryManager();
        VehicleInventoryManager vehicleInventoryManager2 = new VehicleInventoryManager();

        Vehicle vehicle1 = new Vehicle(1, "Fortuner", "Toyota", 25);
        Vehicle vehicle2 = new Vehicle(2, "Creta", "Hyundai", 20);
        Vehicle vehicle3 = new Vehicle(3, "XUV", "Mahindra", 15);
        Vehicle vehicle4 = new Vehicle(4, "Innova", "Toyota", 30);
        Vehicle vehicle5 = new Vehicle(5, "Swift", "Maruti", 10);
        Vehicle vehicle6 = new Vehicle(6, "Baleno", "Maruti", 12);
        Vehicle vehicle7 = new Vehicle(7, "XUV", "Mahindra", 15);
        Vehicle vehicle8 = new Vehicle(8, "Innova", "Toyota", 30);

        vehicleInventoryManager1.addVehicle(vehicle1);
        vehicleInventoryManager1.addVehicle(vehicle2);
        vehicleInventoryManager1.addVehicle(vehicle3);
        vehicleInventoryManager1.addVehicle(vehicle4);

        vehicleInventoryManager2.addVehicle(vehicle5);
        vehicleInventoryManager2.addVehicle(vehicle6);
        vehicleInventoryManager2.addVehicle(vehicle7);
        vehicleInventoryManager2.addVehicle(vehicle8);

        store1.setInventoryManager(vehicleInventoryManager1);
        store2.setInventoryManager(vehicleInventoryManager2);

        vehicleRentalSystem.addStore(store1);
        vehicleRentalSystem.addStore(store2);

        Reservation reservation = vehicleRentalSystem.createReservation(user1, store1, vehicle2, 2);

        Bill bill = vehicleRentalSystem.completeReservation(reservation);
        
    }
    
}
