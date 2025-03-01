public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int numberOfElevators = 4;
        int numberOfFloors = 10;

        // this is not correct, we will just make the elevator, the dispatchr should be made somewhere else
        for(int i=0;i<numberOfElevators;i++) {
            Elevator elevator = new Elevator(i);
            ElevatorController elevatorController = new ElevatorController();
            elevator.setElevatorController(elevatorController);
            elevatorController.setElevator(elevator);
        }
    }
}
