package CarRental;

import java.util.List;
import CarRental.Product.Vehicle;

public class VehicleInventoryManager {
    List<Vehicle> vehicles; 
    
    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public void removeVehicle(Vehicle vehicle) {
        vehicles.remove(vehicle);
    }

}
