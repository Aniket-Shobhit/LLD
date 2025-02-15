import java.util.*;
import Model.*;

public class TicTacToeGame {
    
    Deque<Player> players;
    Board gameBoard;

    TicTacToeGame() {
        initGame();
    }

    public void initGame() {
        players = new LinkedList<>();
        
        PlayingPieceX crossPiece = new PlayingPieceX();
        Player player1 = new Player("Player 1", crossPiece);

        PlayingPieceO circlePiece = new PlayingPieceO();
        Player player2 = new Player("Player 2", circlePiece);

        players.add(player1);
        players.add(player2);

        gameBoard = new Board(3);
    } 

    public String startGame() {
        boolean noWinner = true;
        while(noWinner) {
            Player currentPlayer = players.removeFirst();

            gameBoard.printBoard();
            List<Pair<Integer, Integer>> freeCells = gameBoard.getFreeCells();
            if(freeCells.isEmpty()) {
                noWinner = false;
                continue;
            }

            System.out.print("Player:" + currentPlayer.getName() + " Enter row, column: ");
            Scanner scanner = new Scanner(System.in);
            String s = scanner.nextLine();
            String[] values = s.split(",");
            int inputRow = Integer.valueOf(values[0]);
            int inputColumn = Integer.valueOf(values[1]);

            boolean pieceAddedSuccessfully = gameBoard.addPiece(inputRow, inputColumn, currentPlayer.playingPiece);
            if(!pieceAddedSuccessfully) {
                System.out.println("Incorrect position chosen, try again!");
                players.addFirst(currentPlayer);
                continue;
            }
            players.addLast(currentPlayer);

            Boolean winner = isThereWinner(inputRow, inputColumn, currentPlayer.playingPiece.pieceType);
            if(winner) {
                return currentPlayer.name;
            }
        }
        return "Tie";
    }

    public boolean isThereWinner(int row, int column, PieceType pieceType) {
        Boolean rowMatch = true;
        Boolean columnMatch = true;
        Boolean diagonalMatch = true;
        Boolean antiDiagonalMatch = true;
        for(int i=0;i<gameBoard.size;i++) {
            if(gameBoard.board[row][i] == null || gameBoard.board[row][i].pieceType != pieceType) {
                rowMatch = false;
                break;
            }
        }
        for(int i=0;i<gameBoard.size;i++) {
            if(gameBoard.board[i][column] == null || gameBoard.board[i][column].pieceType != pieceType) {
                columnMatch = false;
                break;
            }
        }
        for(int i=0;i<gameBoard.size;i++) {
            if(gameBoard.board[i][i] == null || gameBoard.board[i][i].pieceType != pieceType) {
                diagonalMatch = false;
                break;
            }
        }
        for(int i=0;i<gameBoard.size;i++) {
            if(gameBoard.board[gameBoard.size-i-1][i] == null || gameBoard.board[gameBoard.size-i-1][i].pieceType != pieceType) {
                antiDiagonalMatch = false;
                break;
            }
        }
        return rowMatch || columnMatch || diagonalMatch || antiDiagonalMatch;
    }
}
