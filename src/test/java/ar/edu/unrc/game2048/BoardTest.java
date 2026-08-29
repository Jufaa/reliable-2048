package ar.edu.unrc.game2048;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class BoardTest{

    @Test
    public void TestConstructorEmpty(){
        Board board = new Board();
        assertEquals(Board.DEFAULT_SIZE, board.getSize());
        assertEquals(2, Board.DEFAULT_SIZE * Board.DEFAULT_SIZE - board.getEmptyPositions().size());
    }

    @Test
    public void TestConstructorSize(){
        Board board = new Board(6);
        assertEquals(6, board.getSize());
        assertEquals(2, 6 * 6 - board.getEmptyPositions().size());
    }

    @Test
    public void TestConstructorBoard(){
        Board boardToCopy = new Board();
        Board copiedBoard = new Board(boardToCopy);
        assertTrue(boardToCopy.equals(copiedBoard));
    }

}