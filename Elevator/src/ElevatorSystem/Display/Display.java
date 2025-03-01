package ElevatorSystem.Display;

public class Display {
    int currentFloor;
    DirectionEnum direction;
    StatusEnum status;

    public Display() {
        this.currentFloor = 0;
        this.direction = DirectionEnum.UP;
        this.status = StatusEnum.IDLE;
    }

    public int getCurrentFloor() {
        return this.currentFloor;
    }

    public void setCurrentFloor(int currentFloor) {
        this.currentFloor = currentFloor;
    }

    public DirectionEnum getDirection() {
        return this.direction;
    }

    public void setDirection(DirectionEnum direction) {
        this.direction = direction;
    }

    public StatusEnum getStatus() {
        return this.status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }
}


