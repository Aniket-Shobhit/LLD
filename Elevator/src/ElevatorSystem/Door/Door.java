package ElevatorSystem.Door;

public class Door {
    DoorStatusEnum doorStatus;

    public Door() {
        this.doorStatus = DoorStatusEnum.CLOSE;
    }

    public DoorStatusEnum getDoorStatus() {
        return doorStatus;
    }

    public void setDoorStatus(DoorStatusEnum doorStatus) {
        this.doorStatus = doorStatus;
    }
}
