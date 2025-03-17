package SnakeLadder;

import java.util.concurrent.atomic.AtomicInteger;

public class Player {
    int id;
    String name;
    Boolean turn = false;
    GamePiece piece;
    
    private static final AtomicInteger idCounter = new AtomicInteger(1);

    public Player(String name) {
        this.id = idCounter.getAndIncrement();
        this.name = name;
    }

    public int rollDice() {
        return (int) (Math.random() * 6) + 1;
    }

    public void setPiece(GamePiece piece) {
        this.piece = piece;
    }

    public GamePiece getPiece() {
        return this.piece;
    }

    public void changeTurn() {
        this.turn = !this.turn;
    }

    public Boolean getTurn() {
        return this.turn;
    }
}
