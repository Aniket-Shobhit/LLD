package ElevatorSystem.ExternalButton;

import java.util.List;
import ElevatorSystem.Elevator.ElevatorController;
import ElevatorSystem.Display.DirectionEnum;
import ElevatorSystem.Elevator.Elevator;

public class ExternalButtonDispatcher {
    List<ElevatorController> elevatorControllers; 

    public void dispatchUpButton(int floor) {
        // Find the nearest elevator and send it to the floor
        // call the elevatorController acceptNewReq based on the nearest elevator found through the above step
        int distance = Integer.MAX_VALUE;
        int targetElevatorId = 0;
        int totalFloors = elevatorControllers.get(0).getElevator().getTotalFloors();
        for(ElevatorController elevatorController : elevatorControllers) {
            Elevator elevator = elevatorController.getElevator();
            int elevatorFloor = elevator.getCurrentFloor();
            DirectionEnum currentDirection = elevator.getDirection();
            int elevatorDistance = 2*totalFloors;
            if(currentDirection == DirectionEnum.UP) {
                if(elevatorFloor <= floor) {
                    elevatorDistance = floor-elevatorFloor;
                }
                else {
                    elevatorDistance = 2*totalFloors + floor-elevatorFloor;
                }
            }
            else {
                elevatorDistance = elevatorFloor+floor;
            }
            if(distance > elevatorDistance) {
                targetElevatorId = elevator.getId();
                distance = elevatorDistance;
            }
        }
        for(ElevatorController elevatorController : elevatorControllers) {
            if(elevatorController.getElevatorId() == targetElevatorId) {
                elevatorController.submitNewRequest(floor, DirectionEnum.UP);
            }
        }
    }

    public void dispatchDownButton(int floor) {
        // Find the nearest elevator and send it to the floor
        // call the elevatorController acceptNewReq based on the nearest elevator found through the above step
        int distance = Integer.MAX_VALUE;
        int targetElevatorId = 0;
        int totalFloors = elevatorControllers.get(0).getElevator().getTotalFloors();
        for(ElevatorController elevatorController : elevatorControllers) {
            Elevator elevator = elevatorController.getElevator();
            int elevatorFloor = elevator.getCurrentFloor();
            DirectionEnum currentDirection = elevator.getDirection();
            int elevatorDistance = 2*totalFloors;
            if(currentDirection == DirectionEnum.DOWN) {
                if(elevatorFloor >= floor) {
                    elevatorDistance = elevatorFloor - floor;
                }
                else {
                    elevatorDistance = 2*totalFloors + elevatorFloor - floor;
                }
            }
            else {
                elevatorDistance = 2*totalFloors - (elevatorFloor + floor);
            }
            if(distance > elevatorDistance) {
                targetElevatorId = elevator.getId();
                distance = elevatorDistance;
            }
        }
        for(ElevatorController elevatorController : elevatorControllers) {
            if(elevatorController.getElevatorId() == targetElevatorId) {
                elevatorController.submitNewRequest(floor, DirectionEnum.DOWN);
            }
        }
    }
}
