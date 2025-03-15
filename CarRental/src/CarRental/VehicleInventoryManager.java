package CarRental;

import java.util.*;
import CarRental.Product.Vehicle;

public class VehicleInventoryManager {
    List<Vehicle> vehicles; 

    public VehicleInventoryManager() {
        this.vehicles = new ArrayList<Vehicle>();
    }
    
    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public void removeVehicle(Vehicle vehicle) {
        vehicles.remove(vehicle);
    }

}
