package ElevatorSystem.Display;

public class Button {
    Boolean isClicked = false;
    int floor;

    public Button(int floor) {
        this.floor = floor;
    }

    public int getFloor() {
        return floor;
    }

    public Boolean getIsClicked() {
        return isClicked;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public void setIsClicked(Boolean isClicked) {
        this.isClicked = isClicked;
    }
}
