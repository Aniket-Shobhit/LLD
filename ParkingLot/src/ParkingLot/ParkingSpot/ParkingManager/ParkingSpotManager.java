package ParkingLot.ParkingSpot.ParkingManager;

import java.util.List;
import ParkingLot.ParkingSpot.ParkingSpot;
import ParkingLot.Vehicle.Vehicle;

public class ParkingSpotManager {
    List<ParkingSpot> spots;

    public void removeParkingSpot() {
        this.spots.remove(this.spots.size()-1);
    }

    public void removeVehicle(ParkingSpot spot) {
        for(int i=0;i<this.spots.size();i++) {
            ParkingSpot currentSpot = this.spots.get(i);
            if(currentSpot.getId().equals(spot.getId())) {
                currentSpot.removeVehicle();
                break;
            }
        }
    }

    public ParkingSpot parkVehicle(ParkingSpot spot, Vehicle vehicle) {
        if(spot.getIsEmpty() == false) {
            System.out.println("Space is already occupied");
            return null;
        }
        for(int i=0;i<this.spots.size();i++) {
            ParkingSpot currentSpot = this.spots.get(i);
            if(spot.getId().equals(currentSpot.getId())) {
                currentSpot.parkVehicle(vehicle);
                return currentSpot;
            }
        }
        return null;
    }

    public ParkingSpot findParkingSpace() {
        for(int i=0;i<this.spots.size();i++) {
            ParkingSpot spot = spots.get(i);
            if(spot.getIsEmpty()) {
                return spot;
            }
        }
        return null;
    }

    public void showParkingSpaceLayout() {
        System.out.println("");
        for(int i=0;i<this.spots.size();i++) {
            ParkingSpot spot = this.spots.get(i);
            if(spot.getIsEmpty()) {
                System.out.print("_ ");
            }
            else {
                System.out.print(spot.getVehicle().getVehicleNumber() + " ");
            }
        }
    }
}
