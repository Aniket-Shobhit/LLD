package ParkingLot.ParkingSpot;

import ParkingLot.Vehicle.VehicleTypeEnum;
import ParkingLot.ParkingSpot.ParkingManager.FourWheelerParkingSpotManager;
import ParkingLot.ParkingSpot.ParkingManager.ParkingSpotManager;
import ParkingLot.ParkingSpot.ParkingManager.TwoWheelerParkingSpotManager;

public class ParkingSpotFactory {
    ParkingSpotManager parkingSpotManager;

    public ParkingSpotFactory() {
    }

    public ParkingSpotFactory(VehicleTypeEnum vehicleType) {
        if(vehicleType == VehicleTypeEnum.TWO_WHEELER) {
            this.parkingSpotManager = new TwoWheelerParkingSpotManager();
        }
        else {
            this.parkingSpotManager = new FourWheelerParkingSpotManager();
        }
    }

    public ParkingSpotManager getManager() {
        return this.parkingSpotManager;
    }

}
