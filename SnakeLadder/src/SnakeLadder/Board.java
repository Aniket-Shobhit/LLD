package SnakeLadder;

import java.util.*;

public class Board {
    int totalSquares;
    List<GamePiece> pieces;
    List<Obstacle> obstacles;

    public Board(int totalSquares) {
        this.totalSquares = totalSquares;
        setObstacles();
    }

    private void setObstacles() {
        if(this.obstacles != null) {
            return;
        }
        List<Obstacle> obstacles = new ArrayList<>();
        obstacles.add(new Obstacle(8, 27, ObstacleTypeEnum.LADDER));
        obstacles.add(new Obstacle(20, 29, ObstacleTypeEnum.LADDER));
        obstacles.add(new Obstacle(30, 50, ObstacleTypeEnum.LADDER));
        obstacles.add(new Obstacle(17, 69, ObstacleTypeEnum.LADDER));
        obstacles.add(new Obstacle(11, 5, ObstacleTypeEnum.SNAKE));
        obstacles.add(new Obstacle(17, 4, ObstacleTypeEnum.SNAKE));
        obstacles.add(new Obstacle(77, 12, ObstacleTypeEnum.SNAKE));
        obstacles.add(new Obstacle(97, 44, ObstacleTypeEnum.SNAKE));
        this.obstacles = obstacles;
    }

    public List<Obstacle> getObstacles() {
        return this.obstacles;
    }

    public int getTotalSquares() {
        return this.totalSquares;
    }

    public List<GamePiece> getPieces() {
        return this.pieces;
    }

    public void setPieces(List<GamePiece> pieces) {
        this.pieces = pieces;
    }
}
