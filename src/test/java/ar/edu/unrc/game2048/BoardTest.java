package ar.edu.unrc.game2048;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.Test;

import ar.edu.unrc.game2048.Board.Position;

public class BoardTest{

    private Board emptyBoard(int size) {
        Board board = new Board(size);
            for (int row = 0; row < size; row++) {
                for (int col = 0; col < size; col++) {
                    board.setCell(row, col, Cell.EMPTY);
            }
        }
        return board;
    }
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

        @Test
    public void TestGetSize(){
        Board board = new Board(7);
        assertEquals(7, board.getSize());
    }

    @Test
    public void TestGetScore(){
        Board board = new Board();
        assertEquals(0, board.getScore());
    }

    @Test
    public void TestGetCell(){
        Board board = new Board(4);
        Cell cell = new Cell(8);
        board.setCell(3, 3, cell);
        assertEquals(cell, board.getCell(3, 3));
    }

    @Test
    public void TestSetCell(){
        Board board = new Board(4);
        Cell cell = new Cell(8);
        assertThrows(IndexOutOfBoundsException.class, () -> board.setCell(22, 67, cell));
    }

    @Test
    public void TestGetEmptyPositions(){
        Board board = emptyBoard(2);
        Cell Cell1 = new Cell(2);
        Cell Cell2 = new Cell(2);
        board.setCell(0, 0, Cell1);
        board.setCell(0, 1, Cell2);
        Set<Position> actual = board.getEmptyPositions();
        Set<Position> expected = new HashSet<>();
        expected.add(new Position(1,0));
        expected.add(new Position(1,1));
        assertEquals(expected, actual);

    }

    @Test
    public void TestHasEmptyCells(){
        Board board = emptyBoard(4);
        assertTrue(board.hasEmptyCells());
    }

    @Test
    public void TestIsWinningBoard(){
        Board board = new Board(4);
        board.setCell(0, 0, new Cell(2048));
    }

    @Test
    public void TestIsLosingBoard(){
        Board board = new Board(4);
        board.setCell(0, 0, new Cell(2));
        board.setCell(1, 0, new Cell(4));
        board.setCell(2, 0, new Cell(2));
        board.setCell(3, 0, new Cell(4));
        board.setCell(0, 1, new Cell(4));
        board.setCell(1, 1, new Cell(2));
        board.setCell(2, 1, new Cell(4));
        board.setCell(3, 1, new Cell(2));
        board.setCell(0, 2, new Cell(8));
        board.setCell(1, 2, new Cell(4));
        board.setCell(2, 2, new Cell(2));
        board.setCell(3, 2, new Cell(4));
        board.setCell(0, 3, new Cell(8));
        board.setCell(1, 3, new Cell(2));
        board.setCell(2, 3, new Cell(4));
        board.setCell(3, 3, new Cell(2));
        assertFalse(board.isLosingBoard());
    }

    @Test
    public void TestIsFull(){
        Board board = new Board(2);
        board.setCell(0, 0, new Cell(2));
        board.setCell(1, 0, new Cell(2));
        board.setCell(0, 1, new Cell(2));
        board.setCell(1, 1, new Cell(2));
        assertTrue(board.isFull());
    }

    @Test
    public void TestMoveUp() {
        Board board = emptyBoard(4);
        board.setCell(2, 0, new Cell(2));
        board.setCell(3, 0, new Cell(2));

        assertTrue(board.moveUp());
        assertEquals(4, board.getCell(0, 0).getValue());
        assertEquals(4, board.getScore());
    }

    @Test
    public void TestMoveDown() {
        Board board = emptyBoard(4);
        board.setCell(0, 0, new Cell(2));
        board.setCell(1, 0, new Cell(2));

        assertTrue(board.moveDown());
        assertEquals(4, board.getCell(3, 0).getValue());
        assertEquals(4, board.getScore());
    }
    @Test
    public void TestMoveLeft() {
        Board board = emptyBoard(4);
        board.setCell(0, 2, new Cell(2));
        board.setCell(0, 3, new Cell(2));
    
        assertTrue(board.moveLeft());
        assertEquals(4, board.getCell(0, 0).getValue());
        assertEquals(4, board.getScore());
    }
    
    @Test
    public void TestMoveRight() {
        Board board = emptyBoard(4);
        board.setCell(0, 0, new Cell(2));
        board.setCell(0, 1, new Cell(2));
    
        assertTrue(board.moveRight());
        assertEquals(4, board.getCell(0, 3).getValue());
        assertEquals(4, board.getScore());
    }

    
}