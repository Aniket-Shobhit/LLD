package ParkingLot;

import ParkingLot.ParkingSpot.ParkingSpot;
import ParkingLot.Vehicle.Vehicle;

public class Ticket {
    ParkingSpot spot;
    Vehicle vehicle;
    Long startTime;

    public Ticket() {
    }

    public Ticket(Vehicle vehicle, Long startTime, ParkingSpot spot) {
        this.vehicle = vehicle;
        this.startTime = startTime;
        this.spot = spot;
    }
    
    public Vehicle getVehicle(Vehicle vehicle) {
        return this.vehicle;
    }
    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public ParkingSpot getSpot() {
        return this.spot;
    }
    public void setSpot(ParkingSpot spot) {
        this.spot = spot;
    }

    public Long getStartTime() {
        return this.startTime;
    }
    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

}
