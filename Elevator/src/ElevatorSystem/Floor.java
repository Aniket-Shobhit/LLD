package ElevatorSystem;

import ElevatorSystem.ExternalButton.ExternalButton;

public class Floor {
    int floor;
    ExternalButton externalButton;

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

    public void setExternalButton(ExternalButton externalButton) {
        this.externalButton = externalButton;
    }
}
