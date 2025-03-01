package ElevatorSystem.InternalButton;

import java.util.List;

import ElevatorSystem.Display.Button;

public class InternalButton {
    List<Button> button;
    InternalButtonDispatcher dispatcher;

    public InternalButton(List<Button> button, InternalButtonDispatcher dispatcher) {
        this.button = button;
        this.dispatcher = dispatcher;
    }

    public void pressButton(int floor) {
        for(int i=0;i<button.size();i++) {
            if(button.get(i).getFloor() == floor) {
                button.get(i).setIsClicked(true);
            }
        }
    }
}
