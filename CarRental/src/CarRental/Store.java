package CarRental;

import java.util.List;

public class Store {
    
    int id;
    String name;
    List<Reservation> reservations;
    Location location;
    VehicleInventoryManager inventoryManager;

    public Store(int id, String name, Location location) {
        this.id = id;
        this.name = name;
        this.location = location;
    }

    public void  addReservation(Reservation reservation) {
        reservations.add(reservation);
        inventoryManager.removeVehicle(reservation.getVehicle());
    }

    public void removeReservation(Reservation reservation) {
        reservations.remove(reservation);
        inventoryManager.addVehicle(reservation.getVehicle());
    }

    public List<Reservation> getReservations() {
        return reservations;
    }


    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public VehicleInventoryManager getInventoryManager() {
        return inventoryManager;
    }

    public void setInventoryManager(VehicleInventoryManager inventoryManager) {
        this.inventoryManager = inventoryManager;
    }

}
