package SnakeLadder;

import java.util.concurrent.atomic.AtomicInteger;

public class GamePiece {
    int pieceId;
    int position;
    Player player;

    private static final AtomicInteger idCounter = new AtomicInteger(0);

    public GamePiece(Player player) {
        this.pieceId = idCounter.getAndIncrement();
        this.position = 0;
        this.player = player;
    }

    public int move(int steps) {
        this.position += steps;
        return this.position;
    }

    public int getPosition() {
        return this.position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public void jump(int jumpPosition) {
        this.position = jumpPosition;
    }
}
