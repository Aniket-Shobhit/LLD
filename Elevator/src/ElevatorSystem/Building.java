package ElevatorSystem;

import java.util.List;  
import ElevatorSystem.Elevator.Elevator;

public class Building {
    List<Floor> floors;
    List<Elevator> elevators;

    Building(List<Floor> floors, List<Elevator> elevators) {
        this.floors = floors;
        this.elevators = elevators;
    }
}
