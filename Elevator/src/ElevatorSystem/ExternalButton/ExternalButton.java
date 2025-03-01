package ElevatorSystem.ExternalButton;

public class ExternalButton {
    Boolean upButtonClicked = false;
    Boolean downButtonClicked = false;
    ExternalButtonDispatcher dispatcher;
    int floor;

    public int getFloor() {
        return floor;
    }

    public Boolean getUpButtonClicked() {
        return upButtonClicked;
    }

    public Boolean getDownButtonClicked() {
        return downButtonClicked;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public void setUpButtonClicked(Boolean upButtonClicked) {
        this.upButtonClicked = upButtonClicked;
    }

    public void setDownButtonClicked(Boolean downButtonClicked) {
        this.downButtonClicked = downButtonClicked;
    }
    
}
