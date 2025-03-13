package CarRental.Product;
import java.util.Date;

import CarRental.Status;

public class Vehicle {
    int vehicleId;
    int vehicleNumber;
    String vehicleName;
    VehicleTypeEnum vehicleType;
    String companyName;
    String modelNumber;
    int kmDriven;
    Date manufacturingDate;
    int average;
    int cc;
    int rentalDayCost;
    int rentalDailyCost;
    int numberOfSeats;
    Status status;

    public Vehicle(int vehicleId, int vehicleNumber, String vehicleName, VehicleTypeEnum vehicleType, String companyName, String modelNumber, int kmDriven, Date manufacturingDate, int average, int cc, int rentalDayCost, int rentalDailyCost, int numberOfSeats, Status status) {
        this.vehicleId = vehicleId;
        this.vehicleNumber = vehicleNumber;
        this.vehicleName = vehicleName;
        this.vehicleType = vehicleType;
        this.companyName = companyName;
        this.modelNumber = modelNumber;
        this.kmDriven = kmDriven;
        this.manufacturingDate = manufacturingDate;
        this.average = average;
        this.cc = cc;
        this.rentalDayCost = rentalDayCost;
        this.rentalDailyCost = rentalDailyCost;
        this.numberOfSeats = numberOfSeats;
        this.status = status;
    }

    public Vehicle() {
    }

    public Vehicle(int id, String name, String companyName, int rentalDayCost) {
        this.vehicleId = id;
        this.vehicleName = name;
        this.companyName = companyName;
        this.rentalDayCost = rentalDayCost;
    }

    public int getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    public int getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(int vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public VehicleTypeEnum getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleTypeEnum vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    public int getKmDriven() {
        return kmDriven;
    }

    public void setKmDriven(int kmDriven) {
        this.kmDriven = kmDriven;
    }

    public Date getManufacturingDate() {
        return manufacturingDate;
    }

    public void setManufacturingDate(Date manufacturingDate){
        this.manufacturingDate = manufacturingDate;
    }

    public int getAverage() {
        return average;
    }

    public void setAverage(int average) {
        this.average = average;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public int getRentalDayCost() {
        return rentalDayCost;
    }

    public void setRentalDayCost(int rentalDayCost) {
        this.rentalDayCost = rentalDayCost;
    }

    public int getRentalDailyCost() {
        return rentalDailyCost;
    }

    public void setRentalDailyCost(int rentalDailyCost) {
        this.rentalDailyCost = rentalDailyCost;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

}
