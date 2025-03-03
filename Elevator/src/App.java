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
        for(int i=0;i<numberOfElevators;i++) {
            Elevator elevator = new Elevator(i);
            ElevatorController elevatorController = new ElevatorController(elevator,i);
            elevators.add(elevator);
            elevatorControllers.add(elevatorController);
        }

        Building building = new Building(10, elevators);
        System.out.println("Building created with " + building.getFloors().size() + " floors and " + building.getElevators().size() + " elevators");

        // Simulate a scenario where an external button is pressed
        ExternalButtonDispatcher externalButtonDispatcher = new ExternalButtonDispatcher();
        externalButtonDispatcher.dispatchUpButton(5);


        // Simulate a scenario where an internal button is pressed
        InternalButtonDispatcher internalButtonDispatcher = new InternalButtonDispatcher();
        internalButtonDispatcher.dispatchButton(5, 1);
    }
}
