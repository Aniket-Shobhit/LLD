import ParkingLot.Vehicle.*;
import ParkingLot.*;
import ParkingLot.ParkingSpot.ParkingSpot;
import ParkingLot.ParkingSpot.ParkingManager.ParkingSpotManager;

public class App {
    public static void main(String[] args) throws Exception {
        
        EntryGate bike1 = new EntryGate(1234L, VehicleTypeEnum.TWO_WHEELER,47L);
        EntryGate bike2 = new EntryGate(4827L,VehicleTypeEnum.TWO_WHEELER,59L);
        EntryGate bike3 = new EntryGate(5134L,VehicleTypeEnum.TWO_WHEELER,18L);
        EntryGate bike4 = new EntryGate(2754L,VehicleTypeEnum.TWO_WHEELER,68L);

        EntryGate car1 = new EntryGate(1355L, VehicleTypeEnum.FOUR_WHEELER, 83L);
        EntryGate car2 = new EntryGate(8426L, VehicleTypeEnum.FOUR_WHEELER, 23L);
        EntryGate car3 = new EntryGate(2842L, VehicleTypeEnum.FOUR_WHEELER, 66L);


        ParkingSpot bikeSpot1 = bike1.findSpace();
        if(bikeSpot1 != null) {
            bike1.bookSpot(bikeSpot1);
        }
        ParkingSpot bikeSpot2 = bike2.findSpace();
        if(bikeSpot2 != null) {
            bike2.bookSpot(bikeSpot2);
        }
        ParkingSpot bikeSpot3 = bike3.findSpace();
        if(bikeSpot3 != null) {
            bike3.bookSpot(bikeSpot3);
        }
        ParkingSpot bikeSpot4 = bike4.findSpace();
        if(bikeSpot4 != null) {
            bike4.bookSpot(bikeSpot4);
        }
        Ticket bikeTicket1 = bike1.generateTicket(bikeSpot1);
        Ticket bikeTicket2 = bike2.generateTicket(bikeSpot2);
        Ticket bikeTicket3 = bike3.generateTicket(bikeSpot3);
        Ticket bikeTicket4 = bike4.generateTicket(bikeSpot4);


        //this 'space checking and then booking' can be done inside parkingManager class also
        ParkingSpot carSpot1 = car1.findSpace();
        if(carSpot1 != null) {
            car1.bookSpot(carSpot1);
        }
        ParkingSpot carSpot2 = car2.findSpace();
        if(carSpot2 != null) {
            car2.bookSpot(carSpot2);
        }
        ParkingSpot carSpot3 = car3.findSpace();
        if(carSpot3 != null) {
            car3.bookSpot(carSpot3);
        }


        ParkingSpotManager manager2 = bike2.getParkingSpotManager();
        // manager2.showParkingSpaceLayout();
        // ParkingSpotManager manager1 = bike1.getParkingSpotManager();
        // manager1.showParkingSpaceLayout();
        manager2.showParkingSpaceLayout();
        ParkingSpotManager manager3 = car1.getParkingSpotManager();
        manager3.showParkingSpaceLayout();

        ExitGate bikeExit1 = new ExitGate(bikeTicket1, 100L);
        ExitGate bikeExit2 = new ExitGate(bikeTicket2, 100L);
        ExitGate bikeExit3 = new ExitGate(bikeTicket3, 100L);

        bikeExit1.exit();
        bikeExit2.exit();
        
        manager2.showParkingSpaceLayout();
        bikeExit3.exit();

        ExitGate carExit1 = new ExitGate(car1.generateTicket(carSpot1), 100L);
        ExitGate carExit2 = new ExitGate(car2.generateTicket(carSpot2), 100L);
        ExitGate carExit3 = new ExitGate(car3.generateTicket(carSpot3), 100L);

        carExit1.exit();
        carExit2.exit();
        manager3.showParkingSpaceLayout();
        carExit3.exit();
    }
}
