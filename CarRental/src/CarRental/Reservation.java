package CarRental;

import  CarRental.Product.Vehicle;
import java.util.Date;

public class Reservation {
    private static int idCounter = 0;
    int reservationId;
    User user;
    Vehicle vehicle;
    Store store;
    Date rentDateFrom = new Date();
    Date rentDateTo = new Date();
    Location pickupLocation;
    Location dropLocation;
    ReservationStatusEnum reservationStatus;

    public Reservation(User user, Vehicle vehicle, Store store, int daysRented) {
        this.reservationId = generateId();
        this.user = user;
        this.vehicle = vehicle;
        this.rentDateFrom = new Date();
        this.rentDateTo.setDate(this.rentDateFrom.getDate() + daysRented);
        this.pickupLocation = store.getLocation();
        this.store = store;
    }

    private synchronized int generateId() {
        return ++idCounter;
    }

    public int getReservationId() {
        return reservationId;
    }

    public Store getStore() {
        return store;
    }

    public User getUser() {
        return user;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public Date getRentDateFrom() {
        return rentDateFrom;
    }

    public void setRentDateFrom(Date rentDateFrom) {
        this.rentDateFrom = rentDateFrom;
    }

    public Date getRentDateTo() {
        return rentDateTo;
    }

    public void setRentDateTo(Date rentDateTo) {
        this.rentDateTo = rentDateTo;
    }

    public Location getPickupLocation() {
        return pickupLocation;
    }

    public void setPickupLocation(Location pickupLocation) {
        this.pickupLocation = pickupLocation;
    }

    public Location getDropLocation() {
        return dropLocation;
    }

    public void setDropLocation(Location dropLocation) {
        this.dropLocation = dropLocation;
    }

    public ReservationStatusEnum getReservationStatus() {
        return reservationStatus;
    }

    public void setReservationStatus(ReservationStatusEnum reservationStatus) {
        this.reservationStatus = reservationStatus;
    }

    public void addVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void addLocation(Location location) {
        this.pickupLocation = location;
    }

    public void addDropLocation(Location location) {
        this.dropLocation = location;
    }

}
