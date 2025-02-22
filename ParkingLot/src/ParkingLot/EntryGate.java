package ParkingLot;

import ParkingLot.Vehicle.Vehicle;
import ParkingLot.ParkingSpot.ParkingSpotFactory;
import ParkingLot.ParkingSpot.ParkingManager.ParkingSpotManager;
import ParkingLot.ParkingSpot.ParkingSpot;
import ParkingLot.Vehicle.VehicleTypeEnum;

public class EntryGate {
    Vehicle vehicle;
    Ticket ticket;
    ParkingSpotFactory parkingSpotFactory;
    ParkingSpotManager parkingSpotManager;
    //no need for startTime also since the current Time will be the start time
    Long startTime;

    public EntryGate() {
    }

    public EntryGate(Long vehicleNumber, VehicleTypeEnum vehicleType, Long startTime) {
        this.vehicle = new Vehicle(vehicleNumber,vehicleType);
        //just create a factory giving the vehicle type, rest it will take care of the type of parking spot required(2 or 4 wheeler), as well the type of manager required
        this.parkingSpotFactory = new ParkingSpotFactory(vehicleType);          
        this.parkingSpotManager = parkingSpotFactory.getManager();
        this.startTime = startTime;
    }

    public ParkingSpot findSpace() {
        return parkingSpotManager.findParkingSpace();
    }

    public ParkingSpot bookSpot(ParkingSpot parkingSpot) {
        if(parkingSpot == null) return null;
        ParkingSpot spot = this.parkingSpotManager.parkVehicle(parkingSpot, vehicle);
        return spot;
    }

    public Ticket generateTicket(ParkingSpot parkingSpot) {
        if(ticket != null) return ticket;
        this.ticket = new Ticket(vehicle, startTime, parkingSpot);
        return ticket;
    }

    public ParkingSpotManager getParkingSpotManager() {
        return parkingSpotManager;
    }
    
}
