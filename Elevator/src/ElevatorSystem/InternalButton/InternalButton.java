package ElevatorSystem.InternalButton;

import java.util.List;

import ElevatorSystem.Display.Button;

public class InternalButton {
    int elevatorId;
    List<Button> buttons;
    InternalButtonDispatcher dispatcher;

    public InternalButton(List<Button> buttons, InternalButtonDispatcher dispatcher, int elevatorId) {
        this.elevatorId = elevatorId;
        this.buttons = buttons;
        this.dispatcher = dispatcher;
    }

    public void pressButton(int floor) {
        for(int i=0;i<buttons.size();i++) {
            Button button = buttons.get(i);
            if(button.getFloor() == floor) {
                if(button.isClicked()) {
                    return;
                }
                dispatcher.dispatchButton(floor, elevatorId);
                button.setIsClicked(true);
            }
        }
    }

    public int getTotalFloors() {
        return this.buttons.size();
    }
}
