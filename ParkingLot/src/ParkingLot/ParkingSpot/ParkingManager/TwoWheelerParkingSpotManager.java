package ParkingLot.ParkingSpot.ParkingManager;

import ParkingLot.ParkingSpot.TwoWheelerParkingSpot;
import ParkingLot.ParkingSpot.ParkingSpot;
import java.util.*;

public class TwoWheelerParkingSpotManager extends ParkingSpotManager {

    static List<ParkingSpot> parkingSpots;
  
    public TwoWheelerParkingSpotManager() {
        int size = 10;
        if(parkingSpots == null) {
            parkingSpots = new ArrayList<>(size);
            this.spots = parkingSpots;
            for(int i=0;i<size;i++) {
                spots.add(new TwoWheelerParkingSpot());
            }
        }
        else {
            this.spots = parkingSpots;
        }
    }

    public void addParkingSpot() {
        this.spots.add(new TwoWheelerParkingSpot());
    }
}
