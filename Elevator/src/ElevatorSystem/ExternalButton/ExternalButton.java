package ElevatorSystem.ExternalButton;

public class ExternalButton {
    Boolean upButtonClicked = false;
    Boolean downButtonClicked = false;
    ExternalButtonDispatcher dispatcher;
    int floor;


    public ExternalButton(int floor, ExternalButtonDispatcher dispatcher) {
        this.floor = floor;
        this.dispatcher = dispatcher;
    }

    public int getFloor() {
        return floor;
    }

    public ExternalButtonDispatcher getDispatcher() {
        return dispatcher;
    }

    public Boolean isUpButtonClicked() {
        return upButtonClicked;
    }

    public Boolean isDownButtonClicked() {
        return downButtonClicked;
    }

    public void setUpButtonClicked(Boolean upButtonClicked) {
        this.upButtonClicked = upButtonClicked;
        if(upButtonClicked) {
            dispatcher.dispatchUpButton(floor);
        }
    }

    public void setDownButtonClicked(Boolean downButtonClicked) {
        this.downButtonClicked = downButtonClicked;
        if(downButtonClicked) {
            dispatcher.dispatchDownButton(floor);
        }
    }
    
}
