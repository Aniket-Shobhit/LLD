package CarRental;

public class Bill {
    Reservation reservation;
    User user;
    int billAmount;

    public Bill(Reservation reservation) {
        this.reservation = reservation;
        this.user = reservation.getUser();
        this.billAmount = calculateBill();
    }

    private int calculateBill() {
        int days = reservation.getRentDateTo().getDate() - reservation.getRentDateFrom().getDate();
        int bill = days * reservation.getVehicle().getRentalDayCost();
        return bill;
    }

    public int getBillAmount() {
        return billAmount;
    }

    public void setBillAmount(int billAmount) {
        this.billAmount = billAmount;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Reservation getReservation() {
        return reservation;
    }

    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }

    public void printBill() {
        System.out.println("Bill for reservation id: " + reservation.getReservationId());
        System.out.println("User: " + user.getName());
        System.out.println("Vehicle: " + reservation.getVehicle().getVehicleName() + " " + reservation.getVehicle().getCompanyName());
        System.out.println("Rent date: " + reservation.getRentDateFrom());
        System.out.println("Return date: " + reservation.getRentDateTo());
        System.out.println("Amount due: " + billAmount);
    }
}
