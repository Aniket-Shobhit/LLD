package ParkingLot.Vehicle;

public class Vehicle {
    Long vehicleNumber;
    VehicleTypeEnum vehicleType; 

    public Vehicle() {
    }

    public Vehicle(Long vehicleNumber, VehicleTypeEnum vehicleType) {
        this.vehicleNumber = vehicleNumber;
        this.vehicleType = vehicleType;
    }

    public Long getVehicleNumber() {
        return this.vehicleNumber;
    }

    public void setVehicleNumber(Long vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }
    
    public VehicleTypeEnum getVehicleType() {
        return this.vehicleType;
    }

}
