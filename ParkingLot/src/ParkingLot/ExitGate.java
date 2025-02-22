package ParkingLot;

import ParkingLot.ParkingSpot.ParkingSpot;
import ParkingLot.ParkingSpot.ParkingSpotFactory;
import ParkingLot.ParkingSpot.ParkingManager.ParkingSpotManager;

public class ExitGate {
    Ticket ticket;
    ParkingSpotFactory parkingSpotFactory;
    ParkingSpot parkingSpot;
    ParkingSpotManager parkingSpotManager;
    int price;
    // no need of end time though, the current time is actually the end time
    Long endTime;

    public ExitGate() {
    }

    public ExitGate(Ticket ticket, Long endTime) {
        this.parkingSpotFactory = new ParkingSpotFactory(ticket.vehicle.getVehicleType());
        this.ticket = ticket;
        this.parkingSpot = ticket.spot;
        this.parkingSpotManager = this.parkingSpotFactory.getManager();
        this.endTime = endTime;
    }

    public Long priceCalculate() {
        //can use different pricing strategy too, make multiple classes of different pricing strategy and make a factory class for it accordingly then call its calc method
        Long price = (endTime-ticket.startTime+1)*10;
        return price;
    }

    public void removeVehicle() {
        this.parkingSpotManager.removeVehicle(parkingSpot);
    }

    public void payment() {
        System.out.println("Payment of ₹" + priceCalculate() + " has been done via Online Payment");
    }

    public void exit() {
        removeVehicle();
        payment();
    }
}
