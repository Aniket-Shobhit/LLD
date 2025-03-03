package ElevatorSystem;

import java.util.List;  
import java.util.ArrayList;
import ElevatorSystem.Elevator.Elevator;
import ElevatorSystem.ExternalButton.ExternalButtonDispatcher;

public class Building {
    List<Floor> floors;
    List<Elevator> elevators;

    public Building(int floorCount, List<Elevator> elevators, ExternalButtonDispatcher dispatcher) {
        floors = new ArrayList<>();
        for(int i=0;i<floorCount;i++) {
            this.floors.add(new Floor(i, dispatcher));
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
