package ElevatorSystem.Elevator;

import ElevatorSystem.Display.Display;
import ElevatorSystem.Door.Door;
import ElevatorSystem.InternalButton.InternalButton;
import ElevatorSystem.InternalButton.InternalButtonDispatcher;
import ElevatorSystem.Display.Button;
import ElevatorSystem.Display.DirectionEnum;
import java.util.List;
import java.util.ArrayList;

public class Elevator {
    int id;
    Display display;
    int currentFloor;
    Door door;
    DirectionEnum direction;
    InternalButton buttons;

    public Elevator(int id, InternalButtonDispatcher dispatcher) {
        this.id = id;
        this.display = new Display();
        this.currentFloor = 0;
        this.door = new Door();
        List<Button> buttons = new ArrayList<Button>();
        for(int i=0;i<10;i++) {
            Button btn = new Button(i+1);
            buttons.add(btn);
        }
        this.buttons = new InternalButton(buttons, dispatcher, id);
        this.direction = DirectionEnum.STATIONARY;
    }
    
    public int getCurrentFloor() {
        return currentFloor;
    }

    public int getId() {
        return id;
    }

    public void setDirection(DirectionEnum direction) {
        this.direction = direction;
    }

    public DirectionEnum getDirection() {
        return direction;
    }

    public void setCurrentFloor(int currentFloor) {
        this.currentFloor = currentFloor;
    }

    public void move(int floor) {
        
    }

    public int getTotalFloors() {
        return buttons.getTotalFloors();
    }
}

