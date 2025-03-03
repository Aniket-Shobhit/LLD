import ElevatorSystem.Elevator.Elevator;
import ElevatorSystem.Elevator.ElevatorController;
import ElevatorSystem.Building;
import ElevatorSystem.ExternalButton.ExternalButtonDispatcher;
import ElevatorSystem.InternalButton.InternalButtonDispatcher;
import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {

        int numberOfElevators = 4;
        List<Elevator> elevators = new ArrayList<>();

        List<ElevatorController> elevatorControllers = new ArrayList<>();
        
        ExternalButtonDispatcher externalButtonDispatcher = new ExternalButtonDispatcher();
        InternalButtonDispatcher internalButtonDispatcher = new InternalButtonDispatcher();

        for(int i=0;i<numberOfElevators;i++) {
            Elevator elevator = new Elevator(i, internalButtonDispatcher);
            ElevatorController elevatorController = new ElevatorController(elevator,i);
            elevators.add(elevator);
            elevatorControllers.add(elevatorController);
        }

        Building building = new Building(10, elevators, externalButtonDispatcher);

        externalButtonDispatcher.setElevatorControllers(elevatorControllers);
        internalButtonDispatcher.setElevatorControllers(elevatorControllers);

        System.out.println("Building created with " + building.getFloors().size() + " floors and " + building.getElevators().size() + " elevators");

        // Simulate a scenario where an external button is pressed
        ElevatorController move1 = externalButtonDispatcher.dispatchUpButton(5);
        ElevatorController move2 = externalButtonDispatcher.dispatchUpButton(3);
        move1.moveElevator();
        move2.moveElevator();
        ElevatorController move3 = externalButtonDispatcher.dispatchUpButton(7);
        ElevatorController move4 = externalButtonDispatcher.dispatchDownButton(2);
        move3.moveElevator();
        move4.moveElevator();


        // // Simulate a scenario where an internal button is pressed
        internalButtonDispatcher.dispatchButton(5, 1);
    }
}
