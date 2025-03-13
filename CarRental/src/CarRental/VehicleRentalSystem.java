package CarRental;

import java.util.List;
import CarRental.Product.Vehicle;

public class VehicleRentalSystem {
    List<User> users;
    List<Store> stores;   

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
        Reservation reservation = new Reservation(user, vehicle, daysRented);
        store.addReservation(reservation);
        return reservation;
    }
}

