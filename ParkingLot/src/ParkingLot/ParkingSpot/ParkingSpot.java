package ParkingLot.ParkingSpot;

import ParkingLot.Vehicle.Vehicle;

public class ParkingSpot {

    private static long idCounter = 0;

    private Long id;
    private Boolean isEmpty;
    private Vehicle vehicle;

    public ParkingSpot() {
        this.id = generateId();
        this.isEmpty = true;
    }

    private static synchronized long generateId() {
        idCounter++;
        return idCounter;
    }

    public Long getId() {
        return id;
    }

    public Boolean getIsEmpty() {
        return isEmpty;
    }
    public void setIsEmpty(Boolean isEmpty) {
        this.isEmpty = isEmpty;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }
    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void parkVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
        this.isEmpty = false;
    }

    public void removeVehicle() {
        this.vehicle = null;
        this.isEmpty = true;
    }

}
