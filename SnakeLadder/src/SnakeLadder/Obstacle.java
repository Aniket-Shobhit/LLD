package SnakeLadder;

public class Obstacle {
    int start;
    int end;
    ObstacleTypeEnum obstacleType;

    public Obstacle(int start, int end, ObstacleTypeEnum obstacleType) {
        this.start = start;
        this.end = end;
        this.obstacleType = obstacleType;
    }

    public int getStart() {
        return this.start;
    }

    public int getEnd() {
        return this.end;
    }

    public ObstacleTypeEnum getObstacleType() {
        return this.obstacleType;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    public void setObstacleType(ObstacleTypeEnum obstacleType) {
        this.obstacleType = obstacleType;
    }

}
