package Model;

import java.util.ArrayList;
import java.util.List;

import java.util.*;
// import com.sun.tools.javac.util.Pair;

// Board "has-a" 2D array of PlayingPiece objects
public class Board {

    public int size;
    public PlayingPiece[][] board;

    public Board(int size) {
        this.size = size;
        board = new PlayingPiece[size][size];
    }

    public void printBoard() {
        for(int i=0;i<size;i++) {
            for(int j=0;j<size;j++) {
                System.out.print((board[i][j] != null ? board[i][j].pieceType : " ") + "|  ");
            }
            System.out.println("");
        }
    }

    public boolean addPiece(int rowIndex, int columnIndex, PlayingPiece playingPiece) {
        if(board[rowIndex][columnIndex] == null) {
            board[rowIndex][columnIndex] = playingPiece;
            return true;
        }
        else {
            return false;
        }
    }

    public List<Pair<Integer, Integer>> getFreeCells() {
        List<Pair<Integer, Integer>> freeCells = new ArrayList<>();

        for(int i=0;i<size;i++) {
            for(int j=0;j<size;j++) {
                if(board[i][j] == null) {
                    Pair<Integer, Integer> rowColumn = new Pair<>(i,j);
                    freeCells.add(rowColumn);
                }
            }
        }

        return freeCells;
    }

}
