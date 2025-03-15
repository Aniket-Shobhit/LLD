package CarRental;

import java.util.*;
import CarRental.Product.Vehicle;

public class VehicleRentalSystem {
    List<User> users;
    List<Store> stores;   

    public VehicleRentalSystem() {
        this.users = new ArrayList<User>();
        this.stores = new ArrayList<Store>();
    }

    public Store getStore(Location location) {
        for (Store store : stores) {
            if (store.location == location) {
                return store;
            }
        }
        return null;
    }

    public void addStore(Store store) {
        stores.add(store);
    }

    public void removeStore(Store store) {
        stores.remove(store);
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void removeUser(User user) {
        users.remove(user);
    }

    public List<User> getUsers() {
        return users;
    }

    public List<Store> getStores() {
        return stores;
    }

    public Reservation createReservation(User user, Store store, Vehicle vehicle, int daysRented) {
        Reservation reservation = new Reservation(user, vehicle, store, daysRented);
        store.addReservation(reservation);
        System.out.println("Reservation Id: " + reservation.getReservationId());
        // print details of which car is taken from which store for how many days
        System.out.println("Vehicle: " + vehicle.getVehicleName() + " " + vehicle.getCompanyName());
        System.out.println("Store: " + store.name);
        System.out.println("Days: " + daysRented);
        return reservation;
    }

    public Bill completeReservation(Reservation reservation) {
        Bill bill = new Bill(reservation);
        reservation.getStore().removeReservation(reservation);
        System.out.println("Bill Amount: " + bill.getBillAmount());
        bill.printBill();
        return bill;
    }
}

