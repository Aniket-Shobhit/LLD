import SnakeLadder.Board;
import SnakeLadder.GamePiece;
import SnakeLadder.Player;
import java.util.List;
import SnakeLadder.Game;

public class App {
    public static void main(String[] args) throws Exception {
        Board board = new Board(100);
       
        Player player1 = new Player("Player 1");
        Player player2 = new Player("Player 2");
        
        GamePiece piece1 = new GamePiece(player1);
        GamePiece piece2 = new GamePiece(player2);
        
        player1.setPiece(piece1);
        player2.setPiece(piece2);
        
        Game game = new Game(board);
        game.addPlayers(List.of(player1, player2));
        game.playGame();
    }
}
