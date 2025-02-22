package ParkingLot.ParkingSpot.ParkingManager;

import java.util.*;
import ParkingLot.ParkingSpot.FourWheelerParkingSpot;
import ParkingLot.ParkingSpot.ParkingSpot;

public class FourWheelerParkingSpotManager extends ParkingSpotManager {

    static List<ParkingSpot> parkingSpots;

    public FourWheelerParkingSpotManager() {
        int size = 5;
        if(parkingSpots == null) {
            parkingSpots = new ArrayList<>(size);
            this.spots = parkingSpots;
            for(int i=0;i<size;i++) {
                this.spots.add(new FourWheelerParkingSpot());
            }    
        }
        else {
            this.spots = parkingSpots;
        }
    }

    public void addParkingSpot() {
        this.spots.add(new FourWheelerParkingSpot());
    }
}
