package SnakeLadder;

import java.util.*;

public class Game {
    List<Player> players = new ArrayList<>();
    Board board;
    Player winner;
    GameStatusEnum gameStatus;

    public Game() {
        this.gameStatus = GameStatusEnum.RUNNING;
    }

    public Game(Board board) {
        this.board = board;
        this.gameStatus = GameStatusEnum.RUNNING;
    }

    public void addPlayers(List<Player> players) {
        this.players.addAll(players);
    }

    public List<Player> getPlayers() {
        return this.players;
    }

    public void initBoard(Board board) {
        this.board = board;
    }

    public void playGame() throws InterruptedException {
        if(this.board == null) {
            System.out.println("Board not initialized");
            return;
        }
        if(this.players.size() == 0) {
            System.out.println("No players added to the game");
            return;
        }
        int rounds = 1;
        while(this.gameStatus == GameStatusEnum.RUNNING) {
            Thread.sleep(2000);
            System.out.println("Game is running: Round " + rounds++);
            for(Player player: this.players) {
                int diceValue = player.rollDice();
                System.out.println("Player " + player.id + " at position **" + player.getPiece().getPosition() + "** rolled dice: " + diceValue);
                int newPosition = player.getPiece().move(diceValue);
                if(newPosition >= this.board.getTotalSquares()) {
                    this.gameStatus = GameStatusEnum.COMPLETED;
                    this.winner = player;
                    System.out.println("Player " + player.id + " won the game");
                    break;
                }
                for(Obstacle obstacle: this.board.getObstacles()) {
                    if(obstacle.start == newPosition) {
                        if(obstacle.getObstacleType() == ObstacleTypeEnum.LADDER) {
                            player.getPiece().jump(obstacle.end);
                            System.out.println("Player " + player.id + " climbed the ladder from " + obstacle.start + " to " + obstacle.end);
                        } else {
                            player.getPiece().jump(obstacle.end);
                            System.out.println("Player " + player.id + " got bitten by snake from " + obstacle.start + " to " + obstacle.end);
                        }
                    }
                }
                Thread.sleep(500);
            }
        }
    }
}
