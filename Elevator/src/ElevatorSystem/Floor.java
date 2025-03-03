package ElevatorSystem;

import ElevatorSystem.ExternalButton.ExternalButton;
import ElevatorSystem.ExternalButton.ExternalButtonDispatcher;

public class Floor {
    int floor;
    ExternalButton externalButton;

    public Floor(int floor, ExternalButtonDispatcher dispatcher) {
        this.floor = floor;
        this.externalButton = new ExternalButton(floor, dispatcher);
    }

    public Floor(int floor, ExternalButton externalButton) {
        this.floor = floor;
        this.externalButton = externalButton;
    }

    public int getFloor() {
        return floor;
    }

    public ExternalButton getExternalButton() {
        return externalButton;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

}
