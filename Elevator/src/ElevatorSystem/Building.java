package ElevatorSystem;

import java.util.List;  
import ElevatorSystem.Elevator.Elevator;

public class Building {
    List<Floor> floors;
    List<Elevator> elevators;

    public Building(int floorCount, List<Elevator> elevators) {
        for(int i=0;i<floorCount;i++) {
            floors.add(new Floor(i));
        }
        this.elevators = elevators;
    }

    public List<Floor> getFloors() {
        return floors;
    }

    public List<Elevator> getElevators() {
        return elevators;
    }
}
