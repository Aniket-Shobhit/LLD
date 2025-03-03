package ElevatorSystem.InternalButton;

import java.util.List;
import ElevatorSystem.Elevator.ElevatorController;
import ElevatorSystem.Display.DirectionEnum;

public class InternalButtonDispatcher {
    List<ElevatorController> elevatorControllers;

    public void dispatchButton(int floor, int elevatorId) {
        for(ElevatorController controller : elevatorControllers) {
            if(controller.getElevator().getId() == elevatorId) {
                if(controller.getElevator().getCurrentFloor() < floor) {
                    controller.submitNewRequest(floor, DirectionEnum.UP);
                } else {
                    controller.submitNewRequest(floor, DirectionEnum.DOWN);
                }
            }
        }
    }
}


