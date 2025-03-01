package ElevatorSystem.Elevator;

import ElevatorSystem.Display.Display;
import ElevatorSystem.Door.Door;
import ElevatorSystem.InternalButton.InternalButton;
import ElevatorSystem.InternalButton.InternalButtonDispatcher;
import ElevatorSystem.Display.Button;
import java.util.List;

public class Elevator {
    Display display;
    int currentFloor;
    Door door;
    InternalButton buttons;

    public Elevator(List<Button> buttons, InternalButtonDispatcher dispatcher) {
        this.display = new Display();
        this.currentFloor = 0;
        this.door = new Door();
        this.buttons = new InternalButton(buttons, dispatcher);
    }
    
    public int getCurrentFloor() {
        return currentFloor;
    }

    public void setCurrentFloor(int currentFloor) {
        this.currentFloor = currentFloor;
    }

    public void move(int floor) {
        
    }
}
