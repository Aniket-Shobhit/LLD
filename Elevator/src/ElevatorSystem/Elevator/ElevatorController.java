package ElevatorSystem.Elevator;

import ElevatorSystem.Display.DirectionEnum;
import java.util.*;


public class ElevatorController {
    int elevatorId;
    Elevator elevator;
    PriorityQueue<Integer> upQueue = new PriorityQueue<>();     //holds the requests for the elevator to go up
    PriorityQueue<Integer> downQueue = new PriorityQueue<>(Collections.reverseOrder());     //holds the requests for the elevator to go down
    Queue<Integer> currentQueue = new LinkedList<>();   //holds the requests for going in same direction but too late as the elevator past that floor ( elevator going above and currently at 4th floor, request come to go up from 3rd floor)

    public ElevatorController(Elevator elevator, int elevatorId) {
        this.elevatorId = elevatorId;
        this.elevator = elevator;
    }

    public Elevator getElevator() {
        return elevator;
    }

    public int getElevatorId() {
        return elevatorId;
    }

    public void submitNewRequest(int floor, DirectionEnum direction) {
        if(direction == DirectionEnum.UP) {
            if(elevator.getDirection() == DirectionEnum.UP && elevator.getCurrentFloor() > floor) {
                currentQueue.add(floor);
            }
            else {
                upQueue.add(floor);
            }
        } 
        else {
            if(elevator.getDirection() == DirectionEnum.DOWN && elevator.getCurrentFloor() < floor) {
                currentQueue.add(floor);
            }
            else {
                downQueue.add(floor);
            }
        }
    }

    public void moveElevator() {
        if(isRequestPending() == false) {
            System.out.println("No pending request for this elevator to fulfull!");
        }
        int targetFloor = -1;
        if(elevator.getDirection() == DirectionEnum.UP) {
            if(upQueue.size() == 0) {
                elevator.setDirection(DirectionEnum.DOWN);
                while(currentQueue.size() > 0) {
                    upQueue.add(currentQueue.poll());
                }
                moveElevator();
            }
            else {
                targetFloor = upQueue.poll();
            }
        }
        else {
            if(downQueue.size() == 0) {
                elevator.setDirection(DirectionEnum.UP);
                while(currentQueue.size() > 0) {
                    downQueue.add(currentQueue.poll());
                }
                moveElevator();
            }
            else {
                targetFloor = downQueue.poll();
            }
        }
        elevator.setCurrentFloor(targetFloor);
    }

    public Boolean isRequestPending() {
        if(currentQueue.size() + upQueue.size() + downQueue.size() == 0) return false;
        return true;
    }
}
