package randoopTests;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    public void assertBooleanArrayEquals(boolean[] expectedArray, boolean[] actualArray) {
        if (expectedArray.length != actualArray.length) {
            throw new AssertionError("Array lengths differ: " + expectedArray.length + " != " + actualArray.length);
        }
        for (int i = 0; i < expectedArray.length; i++) {
            if (expectedArray[i] != actualArray[i]) {
                throw new AssertionError("Arrays differ at index " + i + ": " + expectedArray[i] + " != " + actualArray[i]);
            }
        }
    }

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        int int0 = ar.edu.unrc.game2048.Board.DEFAULT_SIZE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        ar.edu.unrc.game2048.Board.Direction direction0 = ar.edu.unrc.game2048.Board.Direction.UP;
        org.junit.Assert.assertTrue("'" + direction0 + "' != '" + ar.edu.unrc.game2048.Board.Direction.UP + "'", direction0.equals(ar.edu.unrc.game2048.Board.Direction.UP));
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.moveDown();
        ar.edu.unrc.game2048.Cell cell4 = null;
        // The following exception was thrown during execution in test generation
        try {
            board0.setCell((int) (byte) 10, (int) (byte) 10, cell4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (10, 10) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
// flaky "1) test003(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        java.lang.Object obj2 = null;
        boolean boolean3 = board0.equals(obj2);
        ar.edu.unrc.game2048.Cell cell6 = null;
        // The following exception was thrown during execution in test generation
        try {
            board0.setCell((int) (short) 0, (int) (short) 10, cell6);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (0, 10) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        ar.edu.unrc.game2048.Board.Direction direction0 = ar.edu.unrc.game2048.Board.Direction.DOWN;
        org.junit.Assert.assertTrue("'" + direction0 + "' != '" + ar.edu.unrc.game2048.Board.Direction.DOWN + "'", direction0.equals(ar.edu.unrc.game2048.Board.Direction.DOWN));
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board size must be positive: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        int int0 = ar.edu.unrc.game2048.Board.WINNING_VALUE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2048 + "'", int0 == 2048);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(4, 0);
        int int3 = position2.row;
        java.lang.String str4 = position2.toString();
        int int5 = position2.col;
        java.lang.String str6 = position2.toString();
        boolean boolean8 = position2.equals((java.lang.Object) (short) 100);
        java.lang.String str9 = position2.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(4, 0)" + "'", str4, "(4, 0)");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(4, 0)" + "'", str6, "(4, 0)");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "(4, 0)" + "'", str9, "(4, 0)");
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.isWinningBoard();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        ar.edu.unrc.game2048.Board.Direction direction0 = ar.edu.unrc.game2048.Board.Direction.RIGHT;
        org.junit.Assert.assertTrue("'" + direction0 + "' != '" + ar.edu.unrc.game2048.Board.Direction.RIGHT + "'", direction0.equals(ar.edu.unrc.game2048.Board.Direction.RIGHT));
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(4, 0);
        int int3 = position2.row;
        java.lang.String str4 = position2.toString();
        int int5 = position2.col;
        java.lang.String str6 = position2.toString();
        boolean boolean8 = position2.equals((java.lang.Object) (short) 100);
        int int9 = position2.row;
        int int10 = position2.row;
        int int11 = position2.col;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(4, 0)" + "'", str4, "(4, 0)");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(4, 0)" + "'", str6, "(4, 0)");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        boolean boolean2 = board0.isLosingBoard();
        int int3 = board0.getScore();
        ar.edu.unrc.game2048.Board.Position position6 = new ar.edu.unrc.game2048.Board.Position(4, 0);
        int int7 = position6.row;
        java.lang.String str8 = position6.toString();
        int int9 = position6.col;
        java.lang.String str10 = position6.toString();
        boolean boolean12 = position6.equals((java.lang.Object) (short) 100);
        boolean boolean13 = board0.equals((java.lang.Object) boolean12);
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board();
        boolean boolean15 = board14.hasEmptyCells();
        java.lang.Object obj16 = null;
        boolean boolean17 = board14.equals(obj16);
        java.lang.String str18 = board14.toString();
        boolean boolean19 = board14.isFull();
        ar.edu.unrc.game2048.Board board20 = new ar.edu.unrc.game2048.Board(board14);
        boolean boolean21 = board0.equals((java.lang.Object) board20);
        boolean boolean22 = board20.isWinningBoard();
        boolean boolean23 = board20.moveDown();
        ar.edu.unrc.game2048.Cell cell26 = null;
        // The following exception was thrown during execution in test generation
        try {
            board20.setCell(0, (int) (byte) -1, cell26);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (0, -1) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "(4, 0)" + "'", str8, "(4, 0)");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "(4, 0)" + "'", str10, "(4, 0)");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
// flaky "2) test012(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|    4|     |     |     |\n+-----+-----+-----+-----+\n" + "'", str18, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|    4|     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
// flaky "1) test012(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        java.lang.Object obj2 = null;
        boolean boolean3 = board0.equals(obj2);
        java.lang.String str4 = board0.toString();
        java.lang.Class<?> wildcardClass5 = board0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "3) test013(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        int int1 = board0.getScore();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean4 = board0.equals((java.lang.Object) "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |    2|\n+-----+-----+-----+-----+\n");
        boolean boolean5 = board0.moveDown();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "1) test014(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        boolean boolean2 = board0.isLosingBoard();
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        boolean boolean5 = board0.equals((java.lang.Object) (byte) 1);
        boolean boolean6 = board0.isLosingBoard();
        int int7 = board0.getSize();
        ar.edu.unrc.game2048.Cell cell10 = null;
        // The following exception was thrown during execution in test generation
        try {
            board0.setCell((int) (short) 1, 2048, cell10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (1, 2048) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        boolean boolean2 = board0.isLosingBoard();
        int int3 = board0.getScore();
        ar.edu.unrc.game2048.Cell cell6 = null;
        // The following exception was thrown during execution in test generation
        try {
            board0.setCell((int) (byte) 0, 2048, cell6);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (0, 2048) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) '#', 0);
        ar.edu.unrc.game2048.Board.Position position5 = new ar.edu.unrc.game2048.Board.Position(2048, (int) (short) 10);
        boolean boolean6 = position2.equals((java.lang.Object) 2048);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        java.lang.Object obj2 = null;
        boolean boolean3 = board0.equals(obj2);
        boolean boolean4 = board0.isFull();
        boolean boolean5 = board0.isWinningBoard();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board size must be positive: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Cell cell4 = null;
        // The following exception was thrown during execution in test generation
        try {
            board0.setCell((int) '4', 4, cell4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (52, 4) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        boolean boolean2 = board0.isLosingBoard();
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        boolean boolean5 = board0.equals((java.lang.Object) (byte) 1);
        boolean boolean6 = board0.isLosingBoard();
        int int7 = board0.getSize();
        ar.edu.unrc.game2048.Cell cell10 = null;
        // The following exception was thrown during execution in test generation
        try {
            board0.setCell(10, (int) 'a', cell10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (10, 97) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(2048, (int) (short) 10);
        java.lang.Class<?> wildcardClass3 = position2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board0.getEmptyPositions();
        java.lang.String str3 = board0.toString();
        ar.edu.unrc.game2048.Cell cell6 = null;
        // The following exception was thrown during execution in test generation
        try {
            board0.setCell(1, (int) ' ', cell6);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (1, 32) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(positionSet2);
// flaky "4) test023(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str3, "Score: 0\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        int int1 = board0.getScore();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean3 = board0.moveUp();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        int int1 = board0.getScore();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell4 = board0.getCell((int) (byte) 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (100, 1) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isWinningBoard();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        boolean boolean2 = board0.isLosingBoard();
        int int3 = board0.getScore();
        ar.edu.unrc.game2048.Board.Position position6 = new ar.edu.unrc.game2048.Board.Position(4, 0);
        int int7 = position6.row;
        java.lang.String str8 = position6.toString();
        int int9 = position6.col;
        java.lang.String str10 = position6.toString();
        boolean boolean12 = position6.equals((java.lang.Object) (short) 100);
        boolean boolean13 = board0.equals((java.lang.Object) boolean12);
        boolean boolean14 = board0.moveDown();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell17 = board0.getCell((int) (short) -1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (-1, 1) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "(4, 0)" + "'", str8, "(4, 0)");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "(4, 0)" + "'", str10, "(4, 0)");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
// flaky "1) test027(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 0, (int) (byte) 0);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.isLosingBoard();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        boolean boolean2 = board0.isLosingBoard();
        int int3 = board0.getScore();
        ar.edu.unrc.game2048.Board.Position position6 = new ar.edu.unrc.game2048.Board.Position(4, 0);
        int int7 = position6.row;
        java.lang.String str8 = position6.toString();
        int int9 = position6.col;
        java.lang.String str10 = position6.toString();
        boolean boolean12 = position6.equals((java.lang.Object) (short) 100);
        boolean boolean13 = board0.equals((java.lang.Object) boolean12);
        boolean boolean14 = board0.moveDown();
        ar.edu.unrc.game2048.Cell cell17 = null;
        // The following exception was thrown during execution in test generation
        try {
            board0.setCell((int) (byte) 10, (int) (short) -1, cell17);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (10, -1) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "(4, 0)" + "'", str8, "(4, 0)");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "(4, 0)" + "'", str10, "(4, 0)");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
// flaky "1) test030(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) 10, (int) (byte) 100);
        boolean boolean4 = position2.equals((java.lang.Object) "Score: 0\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        java.lang.String str5 = position2.toString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(10, 100)" + "'", str5, "(10, 100)");
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        boolean boolean2 = board0.isLosingBoard();
        int int3 = board0.getScore();
        boolean boolean4 = board0.repOK();
        java.lang.Class<?> wildcardClass5 = board0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(4, 0);
        int int3 = position2.row;
        java.lang.String str4 = position2.toString();
        int int5 = position2.col;
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board();
        boolean boolean7 = board6.hasEmptyCells();
        boolean boolean8 = board6.isLosingBoard();
        int int9 = board6.getScore();
        boolean boolean10 = board6.repOK();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(board6);
        boolean boolean12 = position2.equals((java.lang.Object) board11);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell15 = board11.getCell((int) ' ', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (32, 0) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(4, 0)" + "'", str4, "(4, 0)");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(4, 0);
        int int3 = position2.row;
        java.lang.String str4 = position2.toString();
        int int5 = position2.col;
        java.lang.String str6 = position2.toString();
        boolean boolean8 = position2.equals((java.lang.Object) (short) 100);
        int int9 = position2.row;
        int int10 = position2.col;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(4, 0)" + "'", str4, "(4, 0)");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(4, 0)" + "'", str6, "(4, 0)");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        boolean boolean2 = board0.repOK();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        boolean boolean2 = board0.isLosingBoard();
        java.lang.Class<?> wildcardClass3 = board0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, (int) (byte) 10);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        boolean boolean2 = board0.isLosingBoard();
        int int3 = board0.getScore();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell6 = board0.getCell((int) (byte) 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (1, 32) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        int int2 = board1.getScore();
        boolean boolean3 = board1.hasEmptyCells();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell6 = board1.getCell((int) (short) 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (100, 97) is out of bounds for board size 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        int int2 = board1.getScore();
        boolean boolean3 = board1.hasEmptyCells();
        boolean boolean4 = board1.repOK();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) 10, (int) (byte) 100);
        int int3 = position2.col;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        java.lang.Object obj2 = null;
        boolean boolean3 = board0.equals(obj2);
        java.lang.String str4 = board0.toString();
        boolean boolean5 = board0.isWinningBoard();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Cell cell9 = null;
        // The following exception was thrown during execution in test generation
        try {
            board0.setCell((-1), 10, cell9);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (-1, 10) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "5) test042(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        int int1 = board0.getScore();
        int int2 = board0.getScore();
        boolean boolean3 = board0.moveUp();
        ar.edu.unrc.game2048.Cell cell6 = null;
        // The following exception was thrown during execution in test generation
        try {
            board0.setCell(4, (int) (byte) 0, cell6);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (4, 0) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        java.lang.Object obj2 = null;
        boolean boolean3 = board0.equals(obj2);
        java.lang.String str4 = board0.toString();
        boolean boolean5 = board0.isFull();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Board.Position position9 = new ar.edu.unrc.game2048.Board.Position(4, 0);
        int int10 = position9.row;
        java.lang.String str11 = position9.toString();
        int int12 = position9.col;
        boolean boolean13 = board6.equals((java.lang.Object) int12);
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board();
        boolean boolean15 = board14.hasEmptyCells();
        boolean boolean16 = board14.isLosingBoard();
        int int17 = board14.getScore();
        ar.edu.unrc.game2048.Board.Position position20 = new ar.edu.unrc.game2048.Board.Position(4, 0);
        int int21 = position20.row;
        java.lang.String str22 = position20.toString();
        int int23 = position20.col;
        java.lang.String str24 = position20.toString();
        boolean boolean26 = position20.equals((java.lang.Object) (short) 100);
        boolean boolean27 = board14.equals((java.lang.Object) boolean26);
        ar.edu.unrc.game2048.Board board28 = new ar.edu.unrc.game2048.Board();
        boolean boolean29 = board28.hasEmptyCells();
        java.lang.Object obj30 = null;
        boolean boolean31 = board28.equals(obj30);
        java.lang.String str32 = board28.toString();
        boolean boolean33 = board28.isFull();
        ar.edu.unrc.game2048.Board board34 = new ar.edu.unrc.game2048.Board(board28);
        boolean boolean35 = board14.equals((java.lang.Object) board34);
        boolean boolean36 = board6.equals((java.lang.Object) board34);
        java.lang.Class<?> wildcardClass37 = board6.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "6) test044(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(4, 0)" + "'", str11, "(4, 0)");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "(4, 0)" + "'", str22, "(4, 0)");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "(4, 0)" + "'", str24, "(4, 0)");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
// flaky "2) test044(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |    2|\n+-----+-----+-----+-----+\n" + "'", str32, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |    2|\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 0);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        java.lang.Object obj2 = null;
        boolean boolean3 = board0.equals(obj2);
        java.lang.String str4 = board0.toString();
        boolean boolean5 = board0.isWinningBoard();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean7 = board0.repOK();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "7) test046(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        int int1 = board0.getScore();
        boolean boolean2 = board0.isLosingBoard();
        java.lang.String str3 = board0.toString();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky "8) test047(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |    4|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str3, "Score: 0\n+-----+-----+-----+-----+\n|     |     |    4|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        int int1 = board0.getScore();
        int int2 = board0.getScore();
        boolean boolean3 = board0.moveUp();
        int int4 = board0.getScore();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "9) test048(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky "1) test048(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        int int1 = board0.getScore();
        java.lang.String str2 = board0.toString();
        boolean boolean3 = board0.isWinningBoard();
        java.lang.Class<?> wildcardClass4 = board0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
// flaky "10) test049(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    4|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str2, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    4|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        int int1 = board0.getScore();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean3 = board2.repOK();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        boolean boolean2 = board0.isLosingBoard();
        int int3 = board0.getScore();
        ar.edu.unrc.game2048.Board.Position position6 = new ar.edu.unrc.game2048.Board.Position(4, 0);
        int int7 = position6.row;
        java.lang.String str8 = position6.toString();
        int int9 = position6.col;
        java.lang.String str10 = position6.toString();
        boolean boolean12 = position6.equals((java.lang.Object) (short) 100);
        boolean boolean13 = board0.equals((java.lang.Object) boolean12);
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board();
        boolean boolean15 = board14.hasEmptyCells();
        java.lang.Object obj16 = null;
        boolean boolean17 = board14.equals(obj16);
        java.lang.String str18 = board14.toString();
        boolean boolean19 = board14.isFull();
        ar.edu.unrc.game2048.Board board20 = new ar.edu.unrc.game2048.Board(board14);
        boolean boolean21 = board0.equals((java.lang.Object) board20);
        boolean boolean22 = board20.isWinningBoard();
        boolean boolean23 = board20.isWinningBoard();
        boolean boolean24 = board20.moveDown();
        int int25 = board20.getScore();
        java.lang.String str26 = board20.toString();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "(4, 0)" + "'", str8, "(4, 0)");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "(4, 0)" + "'", str10, "(4, 0)");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
// flaky "11) test051(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |    4|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str18, "Score: 0\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |    4|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
// flaky "2) test051(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
// flaky "3) test051(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |    2|     |    4|\n+-----+-----+-----+-----+\n" + "'", str26, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |    2|     |    4|\n+-----+-----+-----+-----+\n");
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        boolean boolean2 = board0.isLosingBoard();
        int int3 = board0.getScore();
        ar.edu.unrc.game2048.Board.Position position6 = new ar.edu.unrc.game2048.Board.Position(4, 0);
        int int7 = position6.row;
        java.lang.String str8 = position6.toString();
        int int9 = position6.col;
        java.lang.String str10 = position6.toString();
        boolean boolean12 = position6.equals((java.lang.Object) (short) 100);
        boolean boolean13 = board0.equals((java.lang.Object) boolean12);
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board();
        boolean boolean15 = board14.hasEmptyCells();
        java.lang.Object obj16 = null;
        boolean boolean17 = board14.equals(obj16);
        java.lang.String str18 = board14.toString();
        boolean boolean19 = board14.isFull();
        ar.edu.unrc.game2048.Board board20 = new ar.edu.unrc.game2048.Board(board14);
        boolean boolean21 = board0.equals((java.lang.Object) board20);
        boolean boolean22 = board0.isFull();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell25 = board0.getCell(100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (100, -1) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "(4, 0)" + "'", str8, "(4, 0)");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "(4, 0)" + "'", str10, "(4, 0)");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
// flaky "12) test052(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str18, "Score: 0\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
// flaky "1) test052(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(10);
        boolean boolean2 = board1.hasEmptyCells();
        boolean boolean3 = board1.moveUp();
        ar.edu.unrc.game2048.Cell cell6 = null;
        // The following exception was thrown during execution in test generation
        try {
            board1.setCell(4, 10, cell6);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (4, 10) is out of bounds for board size 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
// flaky "1) test053(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        boolean boolean2 = board0.hasEmptyCells();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board();
        int int4 = board3.getScore();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(board3);
        boolean boolean6 = board0.equals((java.lang.Object) board5);
        ar.edu.unrc.game2048.Cell cell9 = null;
        // The following exception was thrown during execution in test generation
        try {
            board5.setCell(4, (-1), cell9);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (4, -1) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) 10, (int) (byte) 100);
        boolean boolean4 = position2.equals((java.lang.Object) "Score: 0\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        int int5 = position2.row;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        boolean boolean2 = board0.isLosingBoard();
        int int3 = board0.getScore();
        ar.edu.unrc.game2048.Board.Position position6 = new ar.edu.unrc.game2048.Board.Position(4, 0);
        int int7 = position6.row;
        java.lang.String str8 = position6.toString();
        int int9 = position6.col;
        java.lang.String str10 = position6.toString();
        boolean boolean12 = position6.equals((java.lang.Object) (short) 100);
        boolean boolean13 = board0.equals((java.lang.Object) boolean12);
        boolean boolean14 = board0.moveDown();
        ar.edu.unrc.game2048.Cell cell17 = null;
        // The following exception was thrown during execution in test generation
        try {
            board0.setCell((int) ' ', (int) ' ', cell17);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (32, 32) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "(4, 0)" + "'", str8, "(4, 0)");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "(4, 0)" + "'", str10, "(4, 0)");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
// flaky "1) test056(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        boolean boolean2 = board0.isLosingBoard();
        boolean boolean3 = board0.moveUp();
        boolean boolean5 = board0.equals((java.lang.Object) "Score: 0\n+-----+-----+-----+-----+\n|    4|     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        java.lang.Class<?> wildcardClass6 = board0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        java.lang.Object obj2 = null;
        boolean boolean3 = board0.equals(obj2);
        boolean boolean4 = board0.isFull();
        boolean boolean5 = board0.isLosingBoard();
        boolean boolean6 = board0.moveRight();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky "1) test058(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        boolean boolean2 = board0.hasEmptyCells();
        int int3 = board0.getSize();
        ar.edu.unrc.game2048.Cell cell6 = null;
        // The following exception was thrown during execution in test generation
        try {
            board0.setCell(100, (int) (short) 1, cell6);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (100, 1) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        int int1 = board0.getScore();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean4 = board0.equals((java.lang.Object) "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |    2|\n+-----+-----+-----+-----+\n");
        boolean boolean5 = board0.moveRight();
        boolean boolean6 = board0.moveUp();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "2) test060(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board0.getEmptyPositions();
        boolean boolean3 = board0.moveRight();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet4 = board0.getEmptyPositions();
        java.lang.Class<?> wildcardClass5 = positionSet4.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(positionSet2);
// flaky "1) test061(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(positionSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board size must be positive: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        java.lang.Object obj2 = null;
        boolean boolean3 = board0.equals(obj2);
        java.lang.String str4 = board0.toString();
        boolean boolean5 = board0.isFull();
        boolean boolean6 = board0.isLosingBoard();
        boolean boolean7 = board0.moveLeft();
        ar.edu.unrc.game2048.Board.Position position10 = new ar.edu.unrc.game2048.Board.Position(4, 0);
        int int11 = position10.row;
        java.lang.String str12 = position10.toString();
        int int13 = position10.col;
        java.lang.String str14 = position10.toString();
        boolean boolean15 = board0.equals((java.lang.Object) position10);
        boolean boolean17 = position10.equals((java.lang.Object) "Score: 0\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n");
        int int18 = position10.col;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "13) test063(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "3) test063(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(4, 0)" + "'", str12, "(4, 0)");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "(4, 0)" + "'", str14, "(4, 0)");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 100, (int) (short) 10);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        int int2 = board1.getScore();
        ar.edu.unrc.game2048.Cell cell5 = null;
        // The following exception was thrown during execution in test generation
        try {
            board1.setCell((int) 'a', (int) (byte) -1, cell5);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (97, -1) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        int int2 = board1.getScore();
        int int3 = board1.getSize();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        int int1 = board0.getScore();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean4 = board0.equals((java.lang.Object) "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |    2|\n+-----+-----+-----+-----+\n");
        ar.edu.unrc.game2048.Cell cell7 = null;
        // The following exception was thrown during execution in test generation
        try {
            board0.setCell(100, 0, cell7);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (100, 0) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        int int1 = board0.getScore();
        int int2 = board0.getScore();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell5 = board0.getCell(1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (1, 52) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        java.lang.Object obj2 = null;
        boolean boolean3 = board0.equals(obj2);
        java.lang.String str4 = board0.toString();
        boolean boolean6 = board0.equals((java.lang.Object) (-1));
        int int7 = board0.getScore();
        boolean boolean8 = board0.moveRight();
        boolean boolean9 = board0.moveLeft();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell12 = board0.getCell((int) (byte) 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (1, 97) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "14) test069(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        boolean boolean2 = board0.isLosingBoard();
        int int3 = board0.getScore();
        boolean boolean4 = board0.repOK();
        boolean boolean5 = board0.isWinningBoard();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        boolean boolean2 = board0.isLosingBoard();
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        boolean boolean5 = board0.equals((java.lang.Object) (byte) 1);
        boolean boolean6 = board0.isLosingBoard();
        int int7 = board0.getSize();
        boolean boolean9 = board0.equals((java.lang.Object) "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |    4|     |     |\n+-----+-----+-----+-----+\n");
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet10 = board0.getEmptyPositions();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(positionSet10);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        java.lang.Object obj2 = null;
        boolean boolean3 = board0.equals(obj2);
        boolean boolean4 = board0.moveUp();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "1) test072(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        java.lang.Object obj2 = null;
        boolean boolean3 = board0.equals(obj2);
        java.lang.String str4 = board0.toString();
        boolean boolean5 = board0.isFull();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean7 = board0.hasEmptyCells();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "15) test073(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        java.lang.Object obj2 = null;
        boolean boolean3 = board0.equals(obj2);
        java.lang.String str4 = board0.toString();
        boolean boolean5 = board0.isWinningBoard();
        int int6 = board0.getScore();
        boolean boolean7 = board0.hasEmptyCells();
        int int8 = board0.getSize();
        boolean boolean9 = board0.repOK();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "16) test074(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |    4|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |    4|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        java.lang.Object obj2 = null;
        boolean boolean3 = board0.equals(obj2);
        java.lang.String str4 = board0.toString();
        boolean boolean5 = board0.isFull();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean7 = board0.isFull();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet8 = board0.getEmptyPositions();
        boolean boolean9 = board0.moveDown();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "17) test075(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|    2|     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|    2|     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(positionSet8);
// flaky "4) test075(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        java.lang.Object obj2 = null;
        boolean boolean3 = board0.equals(obj2);
        java.lang.String str4 = board0.toString();
        boolean boolean5 = board0.isWinningBoard();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean7 = board6.moveLeft();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet8 = board6.getEmptyPositions();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "18) test076(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    4|     |     |     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    4|     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky "5) test076(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(positionSet8);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        boolean boolean2 = board0.isLosingBoard();
        boolean boolean3 = board0.moveUp();
        boolean boolean5 = board0.equals((java.lang.Object) "Score: 0\n+-----+-----+-----+-----+\n|    4|     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        boolean boolean6 = board0.moveLeft();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky "6) test077(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        java.lang.Object obj2 = null;
        boolean boolean3 = board0.equals(obj2);
        java.lang.String str4 = board0.toString();
        boolean boolean5 = board0.isFull();
        boolean boolean6 = board0.isLosingBoard();
        boolean boolean7 = board0.moveLeft();
        ar.edu.unrc.game2048.Cell cell10 = null;
        // The following exception was thrown during execution in test generation
        try {
            board0.setCell((int) '#', (int) (byte) 0, cell10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (35, 0) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "19) test078(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    4|     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    4|     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "7) test078(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.moveDown();
        boolean boolean2 = board0.repOK();
        int int3 = board0.getScore();
// flaky "1) test079(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
// flaky "20) test079(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        boolean boolean2 = board0.isLosingBoard();
        int int3 = board0.getScore();
        boolean boolean4 = board0.repOK();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(board0);
        int int6 = board0.getScore();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board0.getEmptyPositions();
        boolean boolean3 = board0.moveRight();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet4 = board0.getEmptyPositions();
        boolean boolean5 = board0.moveRight();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(positionSet2);
// flaky "1) test081(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(positionSet4);
// flaky "1) test081(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        boolean boolean2 = board0.isLosingBoard();
        int int3 = board0.getScore();
        ar.edu.unrc.game2048.Board.Position position6 = new ar.edu.unrc.game2048.Board.Position(4, 0);
        int int7 = position6.row;
        java.lang.String str8 = position6.toString();
        int int9 = position6.col;
        java.lang.String str10 = position6.toString();
        boolean boolean12 = position6.equals((java.lang.Object) (short) 100);
        boolean boolean13 = board0.equals((java.lang.Object) boolean12);
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board();
        boolean boolean15 = board14.hasEmptyCells();
        java.lang.Object obj16 = null;
        boolean boolean17 = board14.equals(obj16);
        java.lang.String str18 = board14.toString();
        boolean boolean19 = board14.isFull();
        ar.edu.unrc.game2048.Board board20 = new ar.edu.unrc.game2048.Board(board14);
        boolean boolean21 = board0.equals((java.lang.Object) board20);
        boolean boolean22 = board20.moveLeft();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "(4, 0)" + "'", str8, "(4, 0)");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "(4, 0)" + "'", str10, "(4, 0)");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
// flaky "21) test082(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |    2|     |\n+-----+-----+-----+-----+\n" + "'", str18, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |    2|     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
// flaky "2) test082(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        boolean boolean2 = board0.isLosingBoard();
        boolean boolean3 = board0.moveUp();
        boolean boolean4 = board0.moveLeft();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet5 = board0.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell8 = null;
        // The following exception was thrown during execution in test generation
        try {
            board0.setCell((int) (byte) 0, (int) (byte) 1, cell8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cell cannot be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky "22) test083(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(positionSet5);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        java.lang.Object obj2 = null;
        boolean boolean3 = board0.equals(obj2);
        boolean boolean4 = board0.hasEmptyCells();
        boolean boolean5 = board0.isWinningBoard();
        boolean boolean6 = board0.repOK();
        boolean boolean7 = board0.moveDown();
        java.lang.Class<?> wildcardClass8 = board0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky "1) test084(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        boolean boolean2 = board0.isLosingBoard();
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        boolean boolean5 = board0.equals((java.lang.Object) (byte) 1);
        boolean boolean6 = board0.isLosingBoard();
        int int7 = board0.getSize();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell10 = board0.getCell((int) (byte) 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (10, 32) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        java.lang.String str2 = board1.toString();
        boolean boolean3 = board1.moveRight();
        boolean boolean4 = board1.moveLeft();
// flaky "4) test086(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Score: 0\n+-----+\n|    2|\n+-----+\n" + "'", str2, "Score: 0\n+-----+\n|    2|\n+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        int int1 = board0.getScore();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean3 = board0.hasEmptyCells();
        boolean boolean4 = board0.moveUp();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet5 = board0.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell8 = null;
        // The following exception was thrown during execution in test generation
        try {
            board0.setCell((int) (byte) 100, (int) (short) 1, cell8);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (100, 1) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky "1) test087(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(positionSet5);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        int int1 = board0.getScore();
        boolean boolean2 = board0.isLosingBoard();
        boolean boolean3 = board0.moveDown();
        boolean boolean4 = board0.hasEmptyCells();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky "2) test088(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        java.lang.Object obj2 = null;
        boolean boolean3 = board0.equals(obj2);
        java.lang.String str4 = board0.toString();
        boolean boolean6 = board0.equals((java.lang.Object) (-1));
        int int7 = board0.getScore();
        boolean boolean8 = board0.moveRight();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet9 = board0.getEmptyPositions();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "23) test089(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
// flaky "1) test089(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(positionSet9);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        java.lang.Object obj2 = null;
        boolean boolean3 = board0.equals(obj2);
        java.lang.String str4 = board0.toString();
        boolean boolean5 = board0.isFull();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet6 = board0.getEmptyPositions();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "24) test090(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(positionSet6);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        java.lang.Object obj2 = null;
        boolean boolean3 = board0.equals(obj2);
        java.lang.String str4 = board0.toString();
        boolean boolean5 = board0.isFull();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Board.Position position9 = new ar.edu.unrc.game2048.Board.Position(4, 0);
        int int10 = position9.row;
        java.lang.String str11 = position9.toString();
        int int12 = position9.col;
        boolean boolean13 = board6.equals((java.lang.Object) int12);
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board();
        boolean boolean15 = board14.hasEmptyCells();
        boolean boolean16 = board14.isLosingBoard();
        int int17 = board14.getScore();
        ar.edu.unrc.game2048.Board.Position position20 = new ar.edu.unrc.game2048.Board.Position(4, 0);
        int int21 = position20.row;
        java.lang.String str22 = position20.toString();
        int int23 = position20.col;
        java.lang.String str24 = position20.toString();
        boolean boolean26 = position20.equals((java.lang.Object) (short) 100);
        boolean boolean27 = board14.equals((java.lang.Object) boolean26);
        ar.edu.unrc.game2048.Board board28 = new ar.edu.unrc.game2048.Board();
        boolean boolean29 = board28.hasEmptyCells();
        java.lang.Object obj30 = null;
        boolean boolean31 = board28.equals(obj30);
        java.lang.String str32 = board28.toString();
        boolean boolean33 = board28.isFull();
        ar.edu.unrc.game2048.Board board34 = new ar.edu.unrc.game2048.Board(board28);
        boolean boolean35 = board14.equals((java.lang.Object) board34);
        boolean boolean36 = board6.equals((java.lang.Object) board34);
        boolean boolean37 = board6.moveDown();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "25) test091(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(4, 0)" + "'", str11, "(4, 0)");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "(4, 0)" + "'", str22, "(4, 0)");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "(4, 0)" + "'", str24, "(4, 0)");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
// flaky "8) test091(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|    4|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str32, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|    4|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
// flaky "1) test091(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board0.getEmptyPositions();
        java.lang.String str3 = board0.toString();
        boolean boolean4 = board0.isLosingBoard();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(positionSet2);
// flaky "26) test092(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n" + "'", str3, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) 10, (int) (byte) 100);
        boolean boolean4 = position2.equals((java.lang.Object) "Score: 0\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        int int5 = position2.col;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        boolean boolean2 = board0.isLosingBoard();
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        boolean boolean5 = board0.equals((java.lang.Object) (byte) 1);
        boolean boolean6 = board0.isLosingBoard();
        int int7 = board0.getScore();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        boolean boolean2 = board0.isLosingBoard();
        boolean boolean3 = board0.moveUp();
        boolean boolean4 = board0.moveRight();
        ar.edu.unrc.game2048.Board.Position position7 = new ar.edu.unrc.game2048.Board.Position((int) '#', 0);
        int int8 = position7.col;
        int int9 = position7.row;
        boolean boolean10 = board0.equals((java.lang.Object) position7);
        int int11 = position7.row;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky "2) test095(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        boolean boolean2 = board0.isLosingBoard();
        boolean boolean3 = board0.moveUp();
        boolean boolean4 = board0.isWinningBoard();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell7 = board0.getCell((int) (byte) 100, 2048);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (100, 2048) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky "9) test096(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        int int1 = board0.getScore();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean3 = board0.moveLeft();
        boolean boolean4 = board0.moveLeft();
        java.lang.String str5 = board0.toString();
        int int6 = board0.getScore();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
// flaky "3) test097(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky "2) test097(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
// flaky "27) test097(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Score: 4\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    4|     |     |     |\n+-----+-----+-----+-----+\n" + "'", str5, "Score: 4\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    4|     |     |     |\n+-----+-----+-----+-----+\n");
// flaky "2) test097(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.isLosingBoard();
        int int3 = board1.getSize();
        boolean boolean4 = board1.isWinningBoard();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        java.lang.Object obj2 = null;
        boolean boolean3 = board0.equals(obj2);
        java.lang.String str4 = board0.toString();
        boolean boolean5 = board0.isFull();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet7 = board0.getEmptyPositions();
        boolean boolean8 = board0.moveUp();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board0);
        java.lang.Class<?> wildcardClass10 = board9.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "28) test099(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(positionSet7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.moveDown();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell4 = board0.getCell(35, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (35, 10) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
// flaky "4) test100(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        java.lang.Object obj2 = null;
        boolean boolean3 = board0.equals(obj2);
        java.lang.String str4 = board0.toString();
        boolean boolean5 = board0.isFull();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet7 = board0.getEmptyPositions();
        boolean boolean8 = board0.isFull();
        int int9 = board0.getScore();
        java.lang.String str10 = board0.toString();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "29) test102(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(positionSet7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
// flaky "10) test102(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n" + "'", str10, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n");
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        int int1 = board0.getScore();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean4 = board0.equals((java.lang.Object) "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |    2|\n+-----+-----+-----+-----+\n");
        boolean boolean5 = board0.moveRight();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell8 = board0.getCell(0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (0, 10) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "3) test103(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) ' ', (int) 'a');
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board();
        boolean boolean4 = board3.hasEmptyCells();
        java.lang.Object obj5 = null;
        boolean boolean6 = board3.equals(obj5);
        java.lang.String str7 = board3.toString();
        boolean boolean8 = board3.isWinningBoard();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board3);
        boolean boolean10 = board9.moveLeft();
        boolean boolean11 = position2.equals((java.lang.Object) boolean10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "30) test104(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |    4|\n+-----+-----+-----+-----+\n" + "'", str7, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |    4|\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky "1) test104(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        int int1 = board0.getScore();
        boolean boolean2 = board0.moveUp();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
// flaky "31) test105(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) ' ', (int) (byte) 100);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(board1);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        java.lang.Object obj2 = null;
        boolean boolean3 = board0.equals(obj2);
        java.lang.String str4 = board0.toString();
        boolean boolean6 = board0.equals((java.lang.Object) (-1));
        boolean boolean7 = board0.moveDown();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "32) test108(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |    4|     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |    4|     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "3) test108(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        boolean boolean2 = board0.isLosingBoard();
        int int3 = board0.getScore();
        ar.edu.unrc.game2048.Board.Position position6 = new ar.edu.unrc.game2048.Board.Position(4, 0);
        int int7 = position6.row;
        java.lang.String str8 = position6.toString();
        int int9 = position6.col;
        java.lang.String str10 = position6.toString();
        boolean boolean12 = position6.equals((java.lang.Object) (short) 100);
        boolean boolean13 = board0.equals((java.lang.Object) boolean12);
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board();
        boolean boolean15 = board14.hasEmptyCells();
        java.lang.Object obj16 = null;
        boolean boolean17 = board14.equals(obj16);
        java.lang.String str18 = board14.toString();
        boolean boolean19 = board14.isFull();
        ar.edu.unrc.game2048.Board board20 = new ar.edu.unrc.game2048.Board(board14);
        boolean boolean21 = board0.equals((java.lang.Object) board20);
        boolean boolean22 = board20.isWinningBoard();
        boolean boolean23 = board20.moveDown();
        boolean boolean24 = board20.hasEmptyCells();
        boolean boolean25 = board20.isLosingBoard();
        boolean boolean26 = board20.moveLeft();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "(4, 0)" + "'", str8, "(4, 0)");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "(4, 0)" + "'", str10, "(4, 0)");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
// flaky "33) test109(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |    4|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str18, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |    4|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
// flaky "3) test109(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
// flaky "2) test109(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) '#');
        ar.edu.unrc.game2048.Board.Direction direction2 = ar.edu.unrc.game2048.Board.Direction.LEFT;
        boolean boolean3 = board1.equals((java.lang.Object) direction2);
        org.junit.Assert.assertTrue("'" + direction2 + "' != '" + ar.edu.unrc.game2048.Board.Direction.LEFT + "'", direction2.equals(ar.edu.unrc.game2048.Board.Direction.LEFT));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        int int1 = board0.getScore();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board();
        boolean boolean4 = board0.equals((java.lang.Object) board3);
        boolean boolean5 = board3.isLosingBoard();
        boolean boolean6 = board3.moveUp();
        java.lang.String str7 = board3.toString();
        ar.edu.unrc.game2048.Cell cell10 = null;
        // The following exception was thrown during execution in test generation
        try {
            board3.setCell((int) (byte) 10, (int) (short) 10, cell10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (10, 10) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky "2) test111(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky "34) test111(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |    4|     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str7, "Score: 0\n+-----+-----+-----+-----+\n|     |    4|     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        java.lang.Object obj2 = null;
        boolean boolean3 = board0.equals(obj2);
        java.lang.String str4 = board0.toString();
        boolean boolean5 = board0.isWinningBoard();
        int int6 = board0.getScore();
        boolean boolean7 = board0.hasEmptyCells();
        boolean boolean9 = board0.equals((java.lang.Object) (byte) 1);
        boolean boolean10 = board0.moveLeft();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "35) test112(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky "4) test112(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) '#', 97);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(4, 0);
        int int3 = position2.row;
        java.lang.String str4 = position2.toString();
        int int5 = position2.col;
        java.lang.String str6 = position2.toString();
        boolean boolean8 = position2.equals((java.lang.Object) (byte) 0);
        int int9 = position2.col;
        ar.edu.unrc.game2048.Board.Position position12 = new ar.edu.unrc.game2048.Board.Position(4, 0);
        int int13 = position12.row;
        int int14 = position12.col;
        java.lang.String str15 = position12.toString();
        int int16 = position12.row;
        boolean boolean17 = position2.equals((java.lang.Object) int16);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(4, 0)" + "'", str4, "(4, 0)");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(4, 0)" + "'", str6, "(4, 0)");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "(4, 0)" + "'", str15, "(4, 0)");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        boolean boolean2 = board0.isLosingBoard();
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        boolean boolean5 = board0.equals((java.lang.Object) (byte) 1);
        boolean boolean6 = board0.isLosingBoard();
        java.lang.String str7 = board0.toString();
        boolean boolean8 = board0.moveUp();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board();
        int int10 = board9.getScore();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(board9);
        boolean boolean12 = board9.moveLeft();
        boolean boolean13 = board9.moveLeft();
        java.lang.String str14 = board9.toString();
        boolean boolean15 = board0.equals((java.lang.Object) board9);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "36) test116(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n" + "'", str7, "Score: 0\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n");
// flaky "5) test116(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
// flaky "1) test116(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
// flaky "1) test116(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
// flaky "11) test116(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|    4|     |     |    2|\n+-----+-----+-----+-----+\n" + "'", str14, "Score: 0\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|    4|     |     |    2|\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        boolean boolean2 = board0.isLosingBoard();
        int int3 = board0.getScore();
        ar.edu.unrc.game2048.Board.Position position6 = new ar.edu.unrc.game2048.Board.Position(4, 0);
        int int7 = position6.row;
        java.lang.String str8 = position6.toString();
        int int9 = position6.col;
        java.lang.String str10 = position6.toString();
        boolean boolean12 = position6.equals((java.lang.Object) (short) 100);
        boolean boolean13 = board0.equals((java.lang.Object) boolean12);
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board();
        boolean boolean15 = board14.hasEmptyCells();
        java.lang.Object obj16 = null;
        boolean boolean17 = board14.equals(obj16);
        java.lang.String str18 = board14.toString();
        boolean boolean19 = board14.isFull();
        ar.edu.unrc.game2048.Board board20 = new ar.edu.unrc.game2048.Board(board14);
        boolean boolean21 = board0.equals((java.lang.Object) board20);
        boolean boolean22 = board20.isWinningBoard();
        boolean boolean23 = board20.moveDown();
        boolean boolean24 = board20.isWinningBoard();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "(4, 0)" + "'", str8, "(4, 0)");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "(4, 0)" + "'", str10, "(4, 0)");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
// flaky "37) test117(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    4|\n+-----+-----+-----+-----+\n" + "'", str18, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    4|\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
// flaky "2) test117(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
// flaky "1) test117(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        int int1 = board0.getScore();
        int int2 = board0.getScore();
        ar.edu.unrc.game2048.Cell cell5 = null;
        // The following exception was thrown during execution in test generation
        try {
            board0.setCell((int) (short) 0, (int) (byte) 1, cell5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cell cannot be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        boolean boolean2 = board0.isLosingBoard();
        int int3 = board0.getScore();
        ar.edu.unrc.game2048.Board.Position position6 = new ar.edu.unrc.game2048.Board.Position(4, 0);
        int int7 = position6.row;
        java.lang.String str8 = position6.toString();
        int int9 = position6.col;
        java.lang.String str10 = position6.toString();
        boolean boolean12 = position6.equals((java.lang.Object) (short) 100);
        boolean boolean13 = board0.equals((java.lang.Object) boolean12);
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board();
        boolean boolean15 = board14.hasEmptyCells();
        java.lang.Object obj16 = null;
        boolean boolean17 = board14.equals(obj16);
        java.lang.String str18 = board14.toString();
        boolean boolean19 = board14.isFull();
        ar.edu.unrc.game2048.Board board20 = new ar.edu.unrc.game2048.Board(board14);
        boolean boolean21 = board0.equals((java.lang.Object) board20);
        boolean boolean22 = board20.isWinningBoard();
        boolean boolean23 = board20.moveDown();
        boolean boolean24 = board20.hasEmptyCells();
        boolean boolean25 = board20.moveRight();
        int int26 = board20.getScore();
        java.lang.Class<?> wildcardClass27 = board20.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "(4, 0)" + "'", str8, "(4, 0)");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "(4, 0)" + "'", str10, "(4, 0)");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
// flaky "38) test119(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str18, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
// flaky "1) test119(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
// flaky "4) test119(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int26 + "' != '" + 4 + "'", int26 == 4);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        boolean boolean2 = board0.isLosingBoard();
        int int3 = board0.getScore();
        ar.edu.unrc.game2048.Board.Position position6 = new ar.edu.unrc.game2048.Board.Position(4, 0);
        int int7 = position6.row;
        java.lang.String str8 = position6.toString();
        int int9 = position6.col;
        java.lang.String str10 = position6.toString();
        boolean boolean12 = position6.equals((java.lang.Object) (short) 100);
        boolean boolean13 = board0.equals((java.lang.Object) boolean12);
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board();
        boolean boolean15 = board14.hasEmptyCells();
        java.lang.Object obj16 = null;
        boolean boolean17 = board14.equals(obj16);
        java.lang.String str18 = board14.toString();
        boolean boolean19 = board14.isFull();
        ar.edu.unrc.game2048.Board board20 = new ar.edu.unrc.game2048.Board(board14);
        boolean boolean21 = board0.equals((java.lang.Object) board20);
        boolean boolean22 = board20.isWinningBoard();
        boolean boolean23 = board20.isWinningBoard();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell26 = board20.getCell((int) (short) 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (100, 100) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "(4, 0)" + "'", str8, "(4, 0)");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "(4, 0)" + "'", str10, "(4, 0)");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
// flaky "39) test120(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |    2|     |\n+-----+-----+-----+-----+\n" + "'", str18, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |    2|     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        boolean boolean2 = board0.isLosingBoard();
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        boolean boolean5 = board0.equals((java.lang.Object) (byte) 1);
        boolean boolean6 = board0.isLosingBoard();
        java.lang.String str7 = board0.toString();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell10 = board0.getCell(35, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (35, 4) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "40) test121(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n" + "'", str7, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n");
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        int int2 = board1.getScore();
        boolean boolean3 = board1.hasEmptyCells();
        int int4 = board1.getScore();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        int int1 = board0.getScore();
        java.lang.String str2 = board0.toString();
        boolean boolean3 = board0.isWinningBoard();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet4 = board0.getEmptyPositions();
        boolean boolean5 = board0.isFull();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
// flaky "41) test123(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str2, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(positionSet4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        java.lang.Object obj2 = null;
        boolean boolean3 = board0.equals(obj2);
        java.lang.String str4 = board0.toString();
        boolean boolean5 = board0.isFull();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet7 = board0.getEmptyPositions();
        boolean boolean8 = board0.isFull();
        int int9 = board0.getScore();
        boolean boolean10 = board0.isFull();
        boolean boolean11 = board0.isWinningBoard();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "42) test124(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(positionSet7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        java.lang.Object obj2 = null;
        boolean boolean3 = board0.equals(obj2);
        java.lang.String str4 = board0.toString();
        boolean boolean5 = board0.isWinningBoard();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean7 = board0.isLosingBoard();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "43) test125(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|    4|     |     |     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|    4|     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        java.lang.Object obj2 = null;
        boolean boolean3 = board0.equals(obj2);
        java.lang.String str4 = board0.toString();
        boolean boolean5 = board0.isFull();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean7 = board6.hasEmptyCells();
        boolean boolean8 = board6.moveRight();
        int int9 = board6.getSize();
        boolean boolean10 = board6.hasEmptyCells();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "44) test126(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |    4|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |    4|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
// flaky "1) test126(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) 10, (int) '#');
        java.lang.String str3 = position2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(10, 35)" + "'", str3, "(10, 35)");
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        int int2 = board1.getScore();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell5 = board1.getCell(97, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (97, 97) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board size must be positive: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(10, (int) (byte) 10);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board();
        int int4 = board3.getScore();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(board3);
        boolean boolean6 = board3.hasEmptyCells();
        int int7 = board3.getScore();
        boolean boolean8 = position2.equals((java.lang.Object) board3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        java.lang.String str2 = board1.toString();
        java.lang.Class<?> wildcardClass3 = board1.getClass();
// flaky "45) test131(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Score: 0\n+-----+\n|    4|\n+-----+\n" + "'", str2, "Score: 0\n+-----+\n|    4|\n+-----+\n");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) ' ', (int) 'a');
        int int3 = position2.col;
        int int4 = position2.row;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        java.lang.Object obj2 = null;
        boolean boolean3 = board0.equals(obj2);
        boolean boolean4 = board0.isFull();
        boolean boolean5 = board0.isLosingBoard();
        java.lang.String str6 = board0.toString();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board();
        boolean boolean8 = board7.hasEmptyCells();
        boolean boolean9 = board7.isLosingBoard();
        int int10 = board7.getScore();
        boolean boolean11 = board7.repOK();
        boolean boolean12 = board0.equals((java.lang.Object) boolean11);
        int int13 = board0.getSize();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky "46) test133(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str6, "Score: 0\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        boolean boolean2 = board0.isLosingBoard();
        int int3 = board0.getScore();
        ar.edu.unrc.game2048.Board.Position position6 = new ar.edu.unrc.game2048.Board.Position(4, 0);
        int int7 = position6.row;
        java.lang.String str8 = position6.toString();
        int int9 = position6.col;
        java.lang.String str10 = position6.toString();
        boolean boolean12 = position6.equals((java.lang.Object) (short) 100);
        boolean boolean13 = board0.equals((java.lang.Object) boolean12);
        boolean boolean14 = board0.moveDown();
        java.lang.String str15 = board0.toString();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "(4, 0)" + "'", str8, "(4, 0)");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "(4, 0)" + "'", str10, "(4, 0)");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
// flaky "47) test134(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |    2|\n+-----+-----+-----+-----+\n" + "'", str15, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |    2|\n+-----+-----+-----+-----+\n");
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        int int2 = board1.getScore();
        boolean boolean3 = board1.isWinningBoard();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(4, 0);
        int int3 = position2.row;
        java.lang.String str4 = position2.toString();
        int int5 = position2.col;
        java.lang.String str6 = position2.toString();
        boolean boolean8 = position2.equals((java.lang.Object) (short) 100);
        int int9 = position2.row;
        java.lang.String str10 = position2.toString();
        int int11 = position2.row;
        int int12 = position2.col;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(4, 0)" + "'", str4, "(4, 0)");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(4, 0)" + "'", str6, "(4, 0)");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "(4, 0)" + "'", str10, "(4, 0)");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        java.lang.Object obj2 = null;
        boolean boolean3 = board0.equals(obj2);
        java.lang.String str4 = board0.toString();
        boolean boolean5 = board0.isFull();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean7 = board6.hasEmptyCells();
        boolean boolean8 = board6.moveRight();
        ar.edu.unrc.game2048.Cell cell11 = null;
        // The following exception was thrown during execution in test generation
        try {
            board6.setCell((int) (byte) 0, (int) (byte) 1, cell11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cell cannot be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "48) test137(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |    2|    4|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |    2|    4|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
// flaky "12) test137(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        int int1 = board0.getScore();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(board0);
        int int3 = board2.getSize();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        int int1 = board0.getScore();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean3 = board0.hasEmptyCells();
        int int4 = board0.getScore();
        boolean boolean5 = board0.hasEmptyCells();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) ' ', (int) 'a');
        int int3 = position2.col;
        java.lang.String str4 = position2.toString();
        java.lang.String str5 = position2.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(32, 97)" + "'", str4, "(32, 97)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(32, 97)" + "'", str5, "(32, 97)");
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        int int1 = board0.getScore();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board();
        boolean boolean4 = board0.equals((java.lang.Object) board3);
        boolean boolean5 = board3.isLosingBoard();
        int int6 = board3.getScore();
        boolean boolean7 = board3.hasEmptyCells();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board();
        boolean boolean9 = board8.hasEmptyCells();
        boolean boolean10 = board8.isLosingBoard();
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        boolean boolean13 = board8.equals((java.lang.Object) (byte) 1);
        boolean boolean14 = board8.isLosingBoard();
        int int15 = board8.getSize();
        boolean boolean16 = board3.equals((java.lang.Object) board8);
        boolean boolean17 = board8.moveLeft();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
// flaky "2) test141(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        int int1 = board0.getScore();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board();
        boolean boolean4 = board0.equals((java.lang.Object) board3);
        boolean boolean5 = board3.isLosingBoard();
        boolean boolean6 = board3.moveUp();
        boolean boolean7 = board3.moveLeft();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(100);
        ar.edu.unrc.game2048.Cell cell14 = board11.getCell(1, 10);
        // The following exception was thrown during execution in test generation
        try {
            board3.setCell(4, (int) 'a', cell14);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (4, 97) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky "5) test142(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(cell14);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        int int1 = board0.getScore();
        boolean boolean2 = board0.isLosingBoard();
        boolean boolean3 = board0.moveRight();
        boolean boolean4 = board0.moveUp();
        boolean boolean5 = board0.isFull();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(4, 0);
        java.lang.String str3 = position2.toString();
        int int4 = position2.col;
        boolean boolean6 = position2.equals((java.lang.Object) "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |    2|\n+-----+-----+-----+-----+\n");
        java.lang.String str7 = position2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(4, 0)" + "'", str3, "(4, 0)");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "(4, 0)" + "'", str7, "(4, 0)");
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        boolean boolean2 = board0.isLosingBoard();
        boolean boolean3 = board0.moveUp();
        boolean boolean4 = board0.moveLeft();
        int int5 = board0.getSize();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky "2) test145(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.moveLeft();
        boolean boolean2 = board0.hasEmptyCells();
// flaky "49) test146(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        boolean boolean2 = board0.isLosingBoard();
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        boolean boolean5 = board0.equals((java.lang.Object) (byte) 1);
        boolean boolean6 = board0.isLosingBoard();
        java.lang.String str7 = board0.toString();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell10 = board0.getCell((int) (byte) 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (100, -1) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "50) test147(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n" + "'", str7, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n");
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board size must be positive: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        int int1 = board0.getScore();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board();
        boolean boolean4 = board0.equals((java.lang.Object) board3);
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean6 = board0.isFull();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) '#', 0);
        int int3 = position2.col;
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        java.lang.String str6 = board5.toString();
        boolean boolean7 = board5.moveUp();
        boolean boolean8 = board5.moveRight();
        boolean boolean9 = position2.equals((java.lang.Object) boolean8);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
// flaky "5) test150(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Score: 0\n+-----+\n|    2|\n+-----+\n" + "'", str6, "Score: 0\n+-----+\n|    2|\n+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (byte) 10);
        boolean boolean2 = board1.isWinningBoard();
        int int3 = board1.getScore();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 0, 10);
        int int3 = position2.row;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(0, 4);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.isLosingBoard();
        boolean boolean3 = board1.moveLeft();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky "1) test154(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) 10, (int) '#');
        java.lang.Class<?> wildcardClass3 = position2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        java.lang.Object obj2 = null;
        boolean boolean3 = board0.equals(obj2);
        java.lang.String str4 = board0.toString();
        boolean boolean5 = board0.isWinningBoard();
        int int6 = board0.getScore();
        boolean boolean7 = board0.hasEmptyCells();
        boolean boolean9 = board0.equals((java.lang.Object) (byte) 1);
        java.lang.String str10 = board0.toString();
        boolean boolean11 = board0.isLosingBoard();
        int int12 = board0.getSize();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "51) test156(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky "13) test156(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str10, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(4, 0);
        int int3 = position2.row;
        java.lang.String str4 = position2.toString();
        int int5 = position2.col;
        java.lang.String str6 = position2.toString();
        java.lang.String str7 = position2.toString();
        java.lang.String str8 = position2.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(4, 0)" + "'", str4, "(4, 0)");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(4, 0)" + "'", str6, "(4, 0)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "(4, 0)" + "'", str7, "(4, 0)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "(4, 0)" + "'", str8, "(4, 0)");
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        java.lang.Object obj2 = null;
        boolean boolean3 = board0.equals(obj2);
        java.lang.String str4 = board0.toString();
        boolean boolean5 = board0.isFull();
        boolean boolean6 = board0.isLosingBoard();
        boolean boolean7 = board0.moveLeft();
        ar.edu.unrc.game2048.Board.Position position10 = new ar.edu.unrc.game2048.Board.Position(4, 0);
        int int11 = position10.row;
        java.lang.String str12 = position10.toString();
        int int13 = position10.col;
        java.lang.String str14 = position10.toString();
        boolean boolean15 = board0.equals((java.lang.Object) position10);
        int int16 = position10.col;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "52) test158(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|    4|     |     |     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|    4|     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "2) test158(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(4, 0)" + "'", str12, "(4, 0)");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "(4, 0)" + "'", str14, "(4, 0)");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        java.lang.Object obj2 = null;
        boolean boolean3 = board0.equals(obj2);
        java.lang.String str4 = board0.toString();
        boolean boolean5 = board0.isWinningBoard();
        boolean boolean6 = board0.moveUp();
        java.lang.String str7 = board0.toString();
        java.lang.Class<?> wildcardClass8 = board0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "53) test159(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky "14) test159(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |    2|    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n" + "'", str7, "Score: 0\n+-----+-----+-----+-----+\n|     |    2|    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        java.lang.Object obj2 = null;
        boolean boolean3 = board0.equals(obj2);
        java.lang.String str4 = board0.toString();
        boolean boolean5 = board0.isFull();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet7 = board0.getEmptyPositions();
        boolean boolean8 = board0.moveDown();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet9 = board0.getEmptyPositions();
        java.lang.String str10 = board0.toString();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "54) test160(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(positionSet7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(positionSet9);
// flaky "15) test160(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str10, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|    2|     |     |\n+-----+-----+-----+-----+\n");
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        boolean boolean2 = board0.isLosingBoard();
        int int3 = board0.getScore();
        ar.edu.unrc.game2048.Board.Position position6 = new ar.edu.unrc.game2048.Board.Position(4, 0);
        int int7 = position6.row;
        java.lang.String str8 = position6.toString();
        int int9 = position6.col;
        java.lang.String str10 = position6.toString();
        boolean boolean12 = position6.equals((java.lang.Object) (short) 100);
        boolean boolean13 = board0.equals((java.lang.Object) boolean12);
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board();
        boolean boolean15 = board14.hasEmptyCells();
        java.lang.Object obj16 = null;
        boolean boolean17 = board14.equals(obj16);
        java.lang.String str18 = board14.toString();
        boolean boolean19 = board14.isFull();
        ar.edu.unrc.game2048.Board board20 = new ar.edu.unrc.game2048.Board(board14);
        boolean boolean21 = board0.equals((java.lang.Object) board20);
        boolean boolean22 = board20.isWinningBoard();
        boolean boolean23 = board20.moveDown();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell26 = board20.getCell(35, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (35, 0) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "(4, 0)" + "'", str8, "(4, 0)");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "(4, 0)" + "'", str10, "(4, 0)");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
// flaky "55) test161(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str18, "Score: 0\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
// flaky "2) test161(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(4, 0);
        int int3 = position2.row;
        java.lang.String str4 = position2.toString();
        int int5 = position2.col;
        java.lang.String str6 = position2.toString();
        int int7 = position2.row;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(4, 0)" + "'", str4, "(4, 0)");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(4, 0)" + "'", str6, "(4, 0)");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        boolean boolean2 = board0.isLosingBoard();
        int int3 = board0.getScore();
        ar.edu.unrc.game2048.Board.Position position6 = new ar.edu.unrc.game2048.Board.Position(4, 0);
        int int7 = position6.row;
        java.lang.String str8 = position6.toString();
        int int9 = position6.col;
        java.lang.String str10 = position6.toString();
        boolean boolean12 = position6.equals((java.lang.Object) (short) 100);
        boolean boolean13 = board0.equals((java.lang.Object) boolean12);
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board();
        boolean boolean15 = board14.hasEmptyCells();
        java.lang.Object obj16 = null;
        boolean boolean17 = board14.equals(obj16);
        java.lang.String str18 = board14.toString();
        boolean boolean19 = board14.isFull();
        ar.edu.unrc.game2048.Board board20 = new ar.edu.unrc.game2048.Board(board14);
        boolean boolean21 = board0.equals((java.lang.Object) board20);
        boolean boolean22 = board0.moveLeft();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "(4, 0)" + "'", str8, "(4, 0)");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "(4, 0)" + "'", str10, "(4, 0)");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
// flaky "56) test163(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str18, "Score: 0\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        boolean boolean2 = board0.isLosingBoard();
        boolean boolean3 = board0.moveUp();
        boolean boolean4 = board0.isWinningBoard();
        int int5 = board0.getScore();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky "2) test164(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "57) test164(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.moveDown();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(100);
        ar.edu.unrc.game2048.Cell cell9 = board6.getCell(1, 10);
        // The following exception was thrown during execution in test generation
        try {
            board2.setCell((int) (byte) 0, 32, cell9);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (0, 32) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
// flaky "3) test165(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cell9);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(10);
        boolean boolean2 = board1.moveLeft();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (short) 1);
        boolean boolean2 = board1.isLosingBoard();
        int int3 = board1.getSize();
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(board1);
        boolean boolean5 = board1.hasEmptyCells();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        java.lang.Object obj2 = null;
        boolean boolean3 = board0.equals(obj2);
        java.lang.String str4 = board0.toString();
        boolean boolean5 = board0.isFull();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Board.Position position9 = new ar.edu.unrc.game2048.Board.Position(4, 0);
        int int10 = position9.row;
        java.lang.String str11 = position9.toString();
        int int12 = position9.col;
        boolean boolean13 = board6.equals((java.lang.Object) int12);
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board();
        boolean boolean15 = board14.hasEmptyCells();
        boolean boolean16 = board14.isLosingBoard();
        int int17 = board14.getScore();
        ar.edu.unrc.game2048.Board.Position position20 = new ar.edu.unrc.game2048.Board.Position(4, 0);
        int int21 = position20.row;
        java.lang.String str22 = position20.toString();
        int int23 = position20.col;
        java.lang.String str24 = position20.toString();
        boolean boolean26 = position20.equals((java.lang.Object) (short) 100);
        boolean boolean27 = board14.equals((java.lang.Object) boolean26);
        ar.edu.unrc.game2048.Board board28 = new ar.edu.unrc.game2048.Board();
        boolean boolean29 = board28.hasEmptyCells();
        java.lang.Object obj30 = null;
        boolean boolean31 = board28.equals(obj30);
        java.lang.String str32 = board28.toString();
        boolean boolean33 = board28.isFull();
        ar.edu.unrc.game2048.Board board34 = new ar.edu.unrc.game2048.Board(board28);
        boolean boolean35 = board14.equals((java.lang.Object) board34);
        boolean boolean36 = board6.equals((java.lang.Object) board34);
        boolean boolean37 = board34.moveRight();
        java.lang.Class<?> wildcardClass38 = board34.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "58) test168(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|    4|     |     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|    4|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(4, 0)" + "'", str11, "(4, 0)");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "(4, 0)" + "'", str22, "(4, 0)");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "(4, 0)" + "'", str24, "(4, 0)");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
// flaky "16) test168(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|    4|     |\n+-----+-----+-----+-----+\n" + "'", str32, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|    4|     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
// flaky "3) test168(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        java.lang.Object obj2 = null;
        boolean boolean3 = board0.equals(obj2);
        java.lang.String str4 = board0.toString();
        boolean boolean5 = board0.isFull();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet7 = board0.getEmptyPositions();
        boolean boolean8 = board0.isFull();
        int int9 = board0.getScore();
        boolean boolean10 = board0.isFull();
        boolean boolean11 = board0.isLosingBoard();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "59) test169(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(positionSet7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        int int1 = board0.getScore();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board();
        boolean boolean4 = board0.equals((java.lang.Object) board3);
        boolean boolean5 = board3.isLosingBoard();
        int int6 = board3.getScore();
        int int7 = board3.getSize();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        java.lang.Object obj2 = null;
        boolean boolean3 = board0.equals(obj2);
        java.lang.String str4 = board0.toString();
        boolean boolean5 = board0.isFull();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean7 = board6.hasEmptyCells();
        boolean boolean8 = board6.moveRight();
        boolean boolean9 = board6.hasEmptyCells();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "60) test171(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
// flaky "1) test171(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.isLosingBoard();
        boolean boolean2 = board0.moveDown();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell5 = board0.getCell((int) (short) -1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (-1, 0) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "3) test172(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.moveDown();
        boolean boolean2 = board0.repOK();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell5 = board0.getCell((int) 'a', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (97, -1) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
// flaky "61) test173(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        boolean boolean2 = board0.isLosingBoard();
        int int3 = board0.getScore();
        ar.edu.unrc.game2048.Board.Position position6 = new ar.edu.unrc.game2048.Board.Position(4, 0);
        int int7 = position6.row;
        java.lang.String str8 = position6.toString();
        int int9 = position6.col;
        java.lang.String str10 = position6.toString();
        boolean boolean12 = position6.equals((java.lang.Object) (short) 100);
        boolean boolean13 = board0.equals((java.lang.Object) boolean12);
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board();
        boolean boolean15 = board14.hasEmptyCells();
        java.lang.Object obj16 = null;
        boolean boolean17 = board14.equals(obj16);
        java.lang.String str18 = board14.toString();
        boolean boolean19 = board14.isFull();
        ar.edu.unrc.game2048.Board board20 = new ar.edu.unrc.game2048.Board(board14);
        boolean boolean21 = board0.equals((java.lang.Object) board20);
        boolean boolean22 = board20.isWinningBoard();
        boolean boolean23 = board20.isWinningBoard();
        ar.edu.unrc.game2048.Board board24 = new ar.edu.unrc.game2048.Board();
        boolean boolean25 = board24.hasEmptyCells();
        java.lang.Object obj26 = null;
        boolean boolean27 = board24.equals(obj26);
        java.lang.String str28 = board24.toString();
        boolean boolean29 = board24.isFull();
        ar.edu.unrc.game2048.Board board30 = new ar.edu.unrc.game2048.Board(board24);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet31 = board24.getEmptyPositions();
        boolean boolean32 = board24.moveUp();
        boolean boolean33 = board24.moveRight();
        boolean boolean34 = board20.equals((java.lang.Object) boolean33);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "(4, 0)" + "'", str8, "(4, 0)");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "(4, 0)" + "'", str10, "(4, 0)");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
// flaky "62) test174(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str18, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
// flaky "17) test174(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |    2|\n+-----+-----+-----+-----+\n" + "'", str28, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |    2|\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(positionSet31);
// flaky "4) test174(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(4, 0);
        int int3 = position2.row;
        int int4 = position2.col;
        java.lang.String str5 = position2.toString();
        int int6 = position2.row;
        java.lang.Class<?> wildcardClass7 = position2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(4, 0)" + "'", str5, "(4, 0)");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        boolean boolean2 = board0.isLosingBoard();
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        boolean boolean5 = board0.equals((java.lang.Object) (byte) 1);
        boolean boolean6 = board0.isLosingBoard();
        java.lang.String str7 = board0.toString();
        boolean boolean8 = board0.moveUp();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean10 = board0.repOK();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "63) test176(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    4|     |     |\n+-----+-----+-----+-----+\n" + "'", str7, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    4|     |     |\n+-----+-----+-----+-----+\n");
// flaky "2) test176(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        int int1 = board0.getScore();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(board0);
        java.lang.Class<?> wildcardClass3 = board0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        int int1 = board0.getScore();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board();
        int int4 = board3.getScore();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(board3);
        boolean boolean6 = board3.hasEmptyCells();
        boolean boolean7 = board3.moveUp();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet8 = board3.getEmptyPositions();
        boolean boolean9 = board2.equals((java.lang.Object) positionSet8);
        boolean boolean10 = board2.hasEmptyCells();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky "4) test178(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(positionSet8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        boolean boolean2 = board0.isLosingBoard();
        int int3 = board0.getScore();
        ar.edu.unrc.game2048.Board.Position position6 = new ar.edu.unrc.game2048.Board.Position(4, 0);
        int int7 = position6.row;
        java.lang.String str8 = position6.toString();
        int int9 = position6.col;
        java.lang.String str10 = position6.toString();
        boolean boolean12 = position6.equals((java.lang.Object) (short) 100);
        boolean boolean13 = board0.equals((java.lang.Object) boolean12);
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board();
        boolean boolean15 = board14.hasEmptyCells();
        java.lang.Object obj16 = null;
        boolean boolean17 = board14.equals(obj16);
        java.lang.String str18 = board14.toString();
        boolean boolean19 = board14.isFull();
        ar.edu.unrc.game2048.Board board20 = new ar.edu.unrc.game2048.Board(board14);
        boolean boolean21 = board0.equals((java.lang.Object) board20);
        boolean boolean22 = board20.isWinningBoard();
        boolean boolean23 = board20.isWinningBoard();
        boolean boolean24 = board20.hasEmptyCells();
        boolean boolean25 = board20.moveDown();
        boolean boolean26 = board20.isFull();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "(4, 0)" + "'", str8, "(4, 0)");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "(4, 0)" + "'", str10, "(4, 0)");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
// flaky "64) test179(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |    2|     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str18, "Score: 0\n+-----+-----+-----+-----+\n|     |    2|     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
// flaky "5) test179(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        java.lang.Object obj2 = null;
        boolean boolean3 = board0.equals(obj2);
        java.lang.String str4 = board0.toString();
        boolean boolean5 = board0.isFull();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet7 = board0.getEmptyPositions();
        boolean boolean8 = board0.moveUp();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean10 = board0.moveRight();
        int int11 = board0.getSize();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "65) test180(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(positionSet7);
// flaky "6) test180(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky "6) test180(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.moveDown();
        boolean boolean2 = board0.repOK();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(100);
        ar.edu.unrc.game2048.Cell cell9 = board6.getCell(1, 10);
        // The following exception was thrown during execution in test generation
        try {
            board0.setCell(97, (int) (short) 10, cell9);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (97, 10) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
// flaky "3) test181(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(cell9);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(4, 0);
        int int3 = position2.row;
        java.lang.String str4 = position2.toString();
        int int5 = position2.col;
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board();
        boolean boolean7 = board6.hasEmptyCells();
        boolean boolean8 = board6.isLosingBoard();
        int int9 = board6.getScore();
        boolean boolean10 = board6.repOK();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(board6);
        boolean boolean12 = position2.equals((java.lang.Object) board11);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet13 = board11.getEmptyPositions();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(4, 0)" + "'", str4, "(4, 0)");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(positionSet13);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        java.lang.String str2 = board0.toString();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
// flaky "66) test183(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str2, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        java.lang.Object obj2 = null;
        boolean boolean3 = board0.equals(obj2);
        java.lang.String str4 = board0.toString();
        boolean boolean5 = board0.isFull();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean7 = board0.isFull();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet8 = board0.getEmptyPositions();
        boolean boolean9 = board0.repOK();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell12 = board0.getCell(0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (0, 100) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "67) test184(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(positionSet8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(4, 0);
        int int3 = position2.row;
        int int4 = position2.col;
        int int5 = position2.row;
        int int6 = position2.row;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(2048, (int) (byte) 0);
        boolean boolean4 = position2.equals((java.lang.Object) "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        java.lang.Object obj2 = null;
        boolean boolean3 = board0.equals(obj2);
        java.lang.String str4 = board0.toString();
        boolean boolean5 = board0.isFull();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Board.Position position9 = new ar.edu.unrc.game2048.Board.Position(4, 0);
        int int10 = position9.row;
        java.lang.String str11 = position9.toString();
        int int12 = position9.col;
        boolean boolean13 = board6.equals((java.lang.Object) int12);
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board();
        boolean boolean15 = board14.hasEmptyCells();
        boolean boolean16 = board14.isLosingBoard();
        int int17 = board14.getScore();
        ar.edu.unrc.game2048.Board.Position position20 = new ar.edu.unrc.game2048.Board.Position(4, 0);
        int int21 = position20.row;
        java.lang.String str22 = position20.toString();
        int int23 = position20.col;
        java.lang.String str24 = position20.toString();
        boolean boolean26 = position20.equals((java.lang.Object) (short) 100);
        boolean boolean27 = board14.equals((java.lang.Object) boolean26);
        ar.edu.unrc.game2048.Board board28 = new ar.edu.unrc.game2048.Board();
        boolean boolean29 = board28.hasEmptyCells();
        java.lang.Object obj30 = null;
        boolean boolean31 = board28.equals(obj30);
        java.lang.String str32 = board28.toString();
        boolean boolean33 = board28.isFull();
        ar.edu.unrc.game2048.Board board34 = new ar.edu.unrc.game2048.Board(board28);
        boolean boolean35 = board14.equals((java.lang.Object) board34);
        boolean boolean36 = board6.equals((java.lang.Object) board34);
        boolean boolean37 = board34.moveRight();
        boolean boolean38 = board34.isFull();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "68) test187(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(4, 0)" + "'", str11, "(4, 0)");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "(4, 0)" + "'", str22, "(4, 0)");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "(4, 0)" + "'", str24, "(4, 0)");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
// flaky "18) test187(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n" + "'", str32, "Score: 0\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        int int2 = board1.getScore();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(100);
        ar.edu.unrc.game2048.Cell cell9 = board6.getCell(1, 10);
        // The following exception was thrown during execution in test generation
        try {
            board1.setCell(1, (int) '4', cell9);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (1, 52) is out of bounds for board size 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(cell9);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        java.lang.Object obj2 = null;
        boolean boolean3 = board0.equals(obj2);
        java.lang.String str4 = board0.toString();
        boolean boolean5 = board0.isWinningBoard();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean7 = board6.moveRight();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "69) test189(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky "3) test189(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        int int2 = board1.getScore();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.isLosingBoard();
        boolean boolean2 = board0.moveDown();
        boolean boolean3 = board0.isFull();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        java.lang.Object obj2 = null;
        boolean boolean3 = board0.equals(obj2);
        java.lang.String str4 = board0.toString();
        boolean boolean5 = board0.isFull();
        boolean boolean6 = board0.isLosingBoard();
        boolean boolean7 = board0.moveLeft();
        ar.edu.unrc.game2048.Board.Position position10 = new ar.edu.unrc.game2048.Board.Position(4, 0);
        int int11 = position10.row;
        java.lang.String str12 = position10.toString();
        int int13 = position10.col;
        java.lang.String str14 = position10.toString();
        boolean boolean15 = board0.equals((java.lang.Object) position10);
        ar.edu.unrc.game2048.Board board16 = new ar.edu.unrc.game2048.Board();
        int int17 = board16.getScore();
        ar.edu.unrc.game2048.Board board18 = new ar.edu.unrc.game2048.Board(board16);
        ar.edu.unrc.game2048.Board board19 = new ar.edu.unrc.game2048.Board();
        int int20 = board19.getScore();
        ar.edu.unrc.game2048.Board board21 = new ar.edu.unrc.game2048.Board(board19);
        boolean boolean22 = board19.hasEmptyCells();
        boolean boolean23 = board19.moveUp();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet24 = board19.getEmptyPositions();
        boolean boolean25 = board18.equals((java.lang.Object) positionSet24);
        boolean boolean26 = board0.equals((java.lang.Object) boolean25);
        boolean boolean27 = board0.isWinningBoard();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "70) test192(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(4, 0)" + "'", str12, "(4, 0)");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "(4, 0)" + "'", str14, "(4, 0)");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
// flaky "2) test192(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(positionSet24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        int int1 = board0.getScore();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean3 = board0.hasEmptyCells();
        int int4 = board0.getScore();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board();
        boolean boolean6 = board5.hasEmptyCells();
        java.lang.Object obj7 = null;
        boolean boolean8 = board5.equals(obj7);
        java.lang.String str9 = board5.toString();
        boolean boolean10 = board5.isFull();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(board5);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet12 = board5.getEmptyPositions();
        boolean boolean13 = board5.moveUp();
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board(board5);
        boolean boolean15 = board5.moveRight();
        boolean boolean16 = board0.equals((java.lang.Object) board5);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky "71) test193(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |    4|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |    4|     |\n+-----+-----+-----+-----+\n" + "'", str9, "Score: 0\n+-----+-----+-----+-----+\n|     |    4|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |    4|     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(positionSet12);
// flaky "3) test193(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
// flaky "6) test193(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(4, 0);
        int int3 = position2.row;
        java.lang.String str4 = position2.toString();
        int int5 = position2.col;
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board();
        boolean boolean7 = board6.hasEmptyCells();
        boolean boolean8 = board6.isLosingBoard();
        int int9 = board6.getScore();
        boolean boolean10 = board6.repOK();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(board6);
        boolean boolean12 = position2.equals((java.lang.Object) board11);
        int int13 = position2.row;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(4, 0)" + "'", str4, "(4, 0)");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        int int1 = board0.getScore();
        java.lang.String str2 = board0.toString();
        boolean boolean3 = board0.isWinningBoard();
        boolean boolean4 = board0.moveLeft();
        boolean boolean5 = board0.hasEmptyCells();
        boolean boolean6 = board0.hasEmptyCells();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
// flaky "72) test195(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str2, "Score: 0\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "4) test195(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((-1), (int) (byte) -1);
        int int3 = position2.row;
        int int4 = position2.row;
        java.lang.String str5 = position2.toString();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board();
        boolean boolean9 = board8.hasEmptyCells();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet10 = board8.getEmptyPositions();
        boolean boolean11 = board8.moveRight();
        boolean boolean12 = board7.equals((java.lang.Object) boolean11);
        boolean boolean13 = board7.moveDown();
        boolean boolean14 = position2.equals((java.lang.Object) board7);
        boolean boolean15 = board7.moveRight();
        boolean boolean16 = board7.moveLeft();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(-1, -1)" + "'", str5, "(-1, -1)");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(positionSet10);
// flaky "73) test196(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(4, 0);
        int int3 = position2.row;
        java.lang.String str4 = position2.toString();
        int int5 = position2.col;
        java.lang.String str6 = position2.toString();
        boolean boolean8 = position2.equals((java.lang.Object) (byte) 0);
        int int9 = position2.row;
        int int10 = position2.row;
        int int11 = position2.row;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(4, 0)" + "'", str4, "(4, 0)");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(4, 0)" + "'", str6, "(4, 0)");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        java.lang.Object obj2 = null;
        boolean boolean3 = board0.equals(obj2);
        java.lang.String str4 = board0.toString();
        boolean boolean5 = board0.isWinningBoard();
        int int6 = board0.getScore();
        boolean boolean7 = board0.hasEmptyCells();
        boolean boolean9 = board0.equals((java.lang.Object) (byte) 1);
        java.lang.String str10 = board0.toString();
        boolean boolean11 = board0.isLosingBoard();
        boolean boolean12 = board0.moveRight();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "74) test198(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky "19) test198(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str10, "Score: 0\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
// flaky "3) test198(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        boolean boolean2 = board0.isLosingBoard();
        int int3 = board0.getScore();
        boolean boolean4 = board0.moveDown();
        boolean boolean5 = board0.isLosingBoard();
        boolean boolean6 = board0.moveRight();
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board(100);
        ar.edu.unrc.game2048.Cell cell13 = board10.getCell(1, 10);
        // The following exception was thrown during execution in test generation
        try {
            board0.setCell(52, 32, cell13);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (52, 32) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
// flaky "7) test199(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky "2) test199(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(cell13);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(4, 0);
        java.lang.String str3 = position2.toString();
        int int4 = position2.col;
        int int5 = position2.col;
        int int6 = position2.row;
        java.lang.Class<?> wildcardClass7 = position2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(4, 0)" + "'", str3, "(4, 0)");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        java.lang.Object obj2 = null;
        boolean boolean3 = board0.equals(obj2);
        java.lang.String str4 = board0.toString();
        boolean boolean5 = board0.isFull();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Board.Position position9 = new ar.edu.unrc.game2048.Board.Position(4, 0);
        int int10 = position9.row;
        java.lang.String str11 = position9.toString();
        int int12 = position9.col;
        boolean boolean13 = board6.equals((java.lang.Object) int12);
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board();
        boolean boolean15 = board14.hasEmptyCells();
        boolean boolean16 = board14.isLosingBoard();
        int int17 = board14.getScore();
        ar.edu.unrc.game2048.Board.Position position20 = new ar.edu.unrc.game2048.Board.Position(4, 0);
        int int21 = position20.row;
        java.lang.String str22 = position20.toString();
        int int23 = position20.col;
        java.lang.String str24 = position20.toString();
        boolean boolean26 = position20.equals((java.lang.Object) (short) 100);
        boolean boolean27 = board14.equals((java.lang.Object) boolean26);
        ar.edu.unrc.game2048.Board board28 = new ar.edu.unrc.game2048.Board();
        boolean boolean29 = board28.hasEmptyCells();
        java.lang.Object obj30 = null;
        boolean boolean31 = board28.equals(obj30);
        java.lang.String str32 = board28.toString();
        boolean boolean33 = board28.isFull();
        ar.edu.unrc.game2048.Board board34 = new ar.edu.unrc.game2048.Board(board28);
        boolean boolean35 = board14.equals((java.lang.Object) board34);
        boolean boolean36 = board6.equals((java.lang.Object) board34);
        boolean boolean37 = board34.isFull();
        boolean boolean38 = board34.isWinningBoard();
        boolean boolean39 = board34.repOK();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "75) test201(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(4, 0)" + "'", str11, "(4, 0)");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "(4, 0)" + "'", str22, "(4, 0)");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "(4, 0)" + "'", str24, "(4, 0)");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
// flaky "20) test201(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n" + "'", str32, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        java.lang.Object obj2 = null;
        boolean boolean3 = board0.equals(obj2);
        java.lang.String str4 = board0.toString();
        boolean boolean5 = board0.isFull();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board0);
        int int7 = board0.getScore();
        boolean boolean8 = board0.isLosingBoard();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell11 = board0.getCell((-1), (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (-1, 35) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "76) test202(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |    4|     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |    4|     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (byte) 10);
        boolean boolean2 = board1.moveUp();
        boolean boolean3 = board1.moveUp();
// flaky "5) test203(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
// flaky "2) test203(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.isLosingBoard();
        boolean boolean3 = board1.hasEmptyCells();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.moveDown();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean4 = board0.equals((java.lang.Object) 100.0f);
        int int5 = board0.getScore();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "77) test205(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(1);
        int int2 = board1.getScore();
        boolean boolean3 = board1.repOK();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        java.lang.Object obj2 = null;
        boolean boolean3 = board0.equals(obj2);
        java.lang.String str4 = board0.toString();
        boolean boolean6 = board0.equals((java.lang.Object) (-1));
        int int7 = board0.getScore();
        boolean boolean8 = board0.moveRight();
        boolean boolean9 = board0.moveUp();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "78) test207(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
// flaky "5) test207(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        java.lang.Object obj2 = null;
        boolean boolean3 = board0.equals(obj2);
        java.lang.String str4 = board0.toString();
        boolean boolean5 = board0.isFull();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean7 = board6.hasEmptyCells();
        boolean boolean8 = board6.moveRight();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board6);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "79) test208(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
// flaky "3) test208(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(4, 0);
        int int3 = position2.row;
        java.lang.String str4 = position2.toString();
        int int5 = position2.col;
        java.lang.String str6 = position2.toString();
        boolean boolean8 = position2.equals((java.lang.Object) (short) 100);
        int int9 = position2.col;
        int int10 = position2.col;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(4, 0)" + "'", str4, "(4, 0)");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(4, 0)" + "'", str6, "(4, 0)");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        java.lang.Object obj2 = null;
        boolean boolean3 = board0.equals(obj2);
        java.lang.String str4 = board0.toString();
        boolean boolean5 = board0.isWinningBoard();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean7 = board0.moveDown();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "80) test210(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |    4|     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |    4|     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky "2) test210(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(4, 0);
        int int3 = position2.row;
        java.lang.String str4 = position2.toString();
        int int5 = position2.col;
        java.lang.String str6 = position2.toString();
        boolean boolean8 = position2.equals((java.lang.Object) (short) 100);
        int int9 = position2.row;
        java.lang.Class<?> wildcardClass10 = position2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(4, 0)" + "'", str4, "(4, 0)");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(4, 0)" + "'", str6, "(4, 0)");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        boolean boolean2 = board0.isLosingBoard();
        boolean boolean3 = board0.moveUp();
        boolean boolean4 = board0.moveLeft();
        java.lang.String str5 = board0.toString();
        boolean boolean6 = board0.isFull();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet7 = board0.getEmptyPositions();
        boolean boolean8 = board0.isLosingBoard();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
// flaky "81) test212(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Score: 4\n+-----+-----+-----+-----+\n|    4|     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str5, "Score: 4\n+-----+-----+-----+-----+\n|    4|     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(positionSet7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        java.lang.Object obj2 = null;
        boolean boolean3 = board0.equals(obj2);
        java.lang.String str4 = board0.toString();
        boolean boolean5 = board0.isFull();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet7 = board0.getEmptyPositions();
        boolean boolean8 = board0.isFull();
        int int9 = board0.getScore();
        boolean boolean10 = board0.isFull();
        boolean boolean11 = board0.moveDown();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "82) test213(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(positionSet7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky "6) test213(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) '4', 10);
        int int3 = position2.col;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(97, (int) '#');
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(0, (int) ' ');
        java.lang.String str3 = position2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(0, 32)" + "'", str3, "(0, 32)");
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        java.lang.Object obj2 = null;
        boolean boolean3 = board0.equals(obj2);
        java.lang.String str4 = board0.toString();
        boolean boolean5 = board0.isWinningBoard();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet7 = board6.getEmptyPositions();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "83) test217(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    4|     |     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    4|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(positionSet7);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(52, (int) (byte) 10);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        boolean boolean2 = board0.isLosingBoard();
        int int3 = board0.getScore();
        boolean boolean4 = board0.isFull();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet6 = board5.getEmptyPositions();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(positionSet6);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        java.lang.Object obj2 = null;
        boolean boolean3 = board0.equals(obj2);
        java.lang.String str4 = board0.toString();
        boolean boolean5 = board0.isWinningBoard();
        int int6 = board0.getScore();
        boolean boolean7 = board0.hasEmptyCells();
        boolean boolean9 = board0.equals((java.lang.Object) (byte) 1);
        java.lang.String str10 = board0.toString();
        boolean boolean11 = board0.isLosingBoard();
        boolean boolean12 = board0.moveLeft();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "84) test220(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky "21) test220(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str10, "Score: 0\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
// flaky "3) test220(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) 10, (int) '4');
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        boolean boolean2 = board0.isLosingBoard();
        int int3 = board0.getScore();
        ar.edu.unrc.game2048.Board.Position position6 = new ar.edu.unrc.game2048.Board.Position(4, 0);
        int int7 = position6.row;
        java.lang.String str8 = position6.toString();
        int int9 = position6.col;
        java.lang.String str10 = position6.toString();
        boolean boolean12 = position6.equals((java.lang.Object) (short) 100);
        boolean boolean13 = board0.equals((java.lang.Object) boolean12);
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board();
        boolean boolean15 = board14.hasEmptyCells();
        java.lang.Object obj16 = null;
        boolean boolean17 = board14.equals(obj16);
        java.lang.String str18 = board14.toString();
        boolean boolean19 = board14.isFull();
        ar.edu.unrc.game2048.Board board20 = new ar.edu.unrc.game2048.Board(board14);
        boolean boolean21 = board0.equals((java.lang.Object) board20);
        boolean boolean22 = board20.isWinningBoard();
        boolean boolean23 = board20.moveDown();
        boolean boolean24 = board20.hasEmptyCells();
        boolean boolean25 = board20.moveRight();
        ar.edu.unrc.game2048.Board board26 = new ar.edu.unrc.game2048.Board(board20);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet27 = board26.getEmptyPositions();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "(4, 0)" + "'", str8, "(4, 0)");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "(4, 0)" + "'", str10, "(4, 0)");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
// flaky "85) test222(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str18, "Score: 0\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
// flaky "3) test222(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(positionSet27);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        boolean boolean2 = board0.isLosingBoard();
        int int3 = board0.getScore();
        ar.edu.unrc.game2048.Board.Position position6 = new ar.edu.unrc.game2048.Board.Position(4, 0);
        int int7 = position6.row;
        java.lang.String str8 = position6.toString();
        int int9 = position6.col;
        java.lang.String str10 = position6.toString();
        boolean boolean12 = position6.equals((java.lang.Object) (short) 100);
        boolean boolean13 = board0.equals((java.lang.Object) boolean12);
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board();
        boolean boolean15 = board14.hasEmptyCells();
        java.lang.Object obj16 = null;
        boolean boolean17 = board14.equals(obj16);
        java.lang.String str18 = board14.toString();
        boolean boolean19 = board14.isFull();
        ar.edu.unrc.game2048.Board board20 = new ar.edu.unrc.game2048.Board(board14);
        boolean boolean21 = board0.equals((java.lang.Object) board20);
        boolean boolean22 = board20.isWinningBoard();
        boolean boolean23 = board20.moveDown();
        boolean boolean24 = board20.hasEmptyCells();
        boolean boolean25 = board20.moveRight();
        boolean boolean26 = board20.isFull();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "(4, 0)" + "'", str8, "(4, 0)");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "(4, 0)" + "'", str10, "(4, 0)");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
// flaky "86) test223(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str18, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
// flaky "3) test223(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(0, (int) '4');
        int int3 = position2.row;
        int int4 = position2.row;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.moveDown();
        boolean boolean2 = board0.hasEmptyCells();
// flaky "1) test225(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        java.lang.Object obj2 = null;
        boolean boolean3 = board0.equals(obj2);
        java.lang.String str4 = board0.toString();
        boolean boolean6 = board0.equals((java.lang.Object) (-1));
        int int7 = board0.getScore();
        boolean boolean8 = board0.moveRight();
        java.lang.Class<?> wildcardClass9 = board0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "87) test226(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |    4|     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |    4|     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
// flaky "7) test226(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        java.lang.Object obj2 = null;
        boolean boolean3 = board0.equals(obj2);
        java.lang.String str4 = board0.toString();
        boolean boolean6 = board0.equals((java.lang.Object) (-1));
        int int7 = board0.getScore();
        boolean boolean8 = board0.moveRight();
        boolean boolean9 = board0.moveLeft();
        boolean boolean10 = board0.moveDown();
        int int11 = board0.getSize();
        boolean boolean12 = board0.moveDown();
        boolean boolean13 = board0.moveDown();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "88) test227(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
// flaky "2) test227(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
// flaky "22) test227(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
// flaky "7) test227(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        java.lang.Object obj2 = null;
        boolean boolean3 = board0.equals(obj2);
        java.lang.String str4 = board0.toString();
        boolean boolean6 = board0.equals((java.lang.Object) (-1));
        int int7 = board0.getScore();
        boolean boolean8 = board0.moveRight();
        boolean boolean9 = board0.moveLeft();
        boolean boolean10 = board0.moveDown();
        int int11 = board0.getSize();
        boolean boolean12 = board0.moveRight();
        boolean boolean13 = board0.isLosingBoard();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "89) test228(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
// flaky "4) test228(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        boolean boolean2 = board0.isLosingBoard();
        int int3 = board0.getScore();
        boolean boolean4 = board0.repOK();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean7 = board0.moveUp();
        boolean boolean8 = board0.moveLeft();
        boolean boolean9 = board0.isLosingBoard();
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board(100);
        ar.edu.unrc.game2048.Cell cell16 = board13.getCell(1, 10);
        // The following exception was thrown during execution in test generation
        try {
            board0.setCell((int) ' ', (int) (byte) -1, cell16);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (32, -1) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
// flaky "4) test229(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(cell16);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        int int1 = board0.getScore();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean3 = board0.hasEmptyCells();
        boolean boolean4 = board0.moveUp();
        boolean boolean5 = board0.moveLeft();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky "90) test230(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        boolean boolean2 = board0.isLosingBoard();
        int int3 = board0.getScore();
        boolean boolean4 = board0.moveDown();
        boolean boolean5 = board0.isLosingBoard();
        boolean boolean6 = board0.moveRight();
        boolean boolean7 = board0.isFull();
        boolean boolean8 = board0.moveUp();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
// flaky "4) test231(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(4, 0);
        java.lang.String str3 = position2.toString();
        int int4 = position2.col;
        int int5 = position2.col;
        int int6 = position2.row;
        int int7 = position2.col;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(4, 0)" + "'", str3, "(4, 0)");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        int int1 = board0.getScore();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean3 = board0.moveLeft();
        boolean boolean4 = board0.moveLeft();
        boolean boolean5 = board0.isWinningBoard();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell8 = board0.getCell((int) ' ', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (32, 52) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
// flaky "2) test233(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky "7) test233(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        int int1 = board0.getScore();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board();
        boolean boolean4 = board0.equals((java.lang.Object) board3);
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean6 = board0.moveLeft();
        int int7 = board0.getSize();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "2) test234(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        java.lang.Object obj2 = null;
        boolean boolean3 = board0.equals(obj2);
        java.lang.String str4 = board0.toString();
        boolean boolean5 = board0.isFull();
        boolean boolean6 = board0.isLosingBoard();
        boolean boolean7 = board0.moveLeft();
        ar.edu.unrc.game2048.Board.Position position10 = new ar.edu.unrc.game2048.Board.Position(4, 0);
        int int11 = position10.row;
        java.lang.String str12 = position10.toString();
        int int13 = position10.col;
        java.lang.String str14 = position10.toString();
        boolean boolean15 = board0.equals((java.lang.Object) position10);
        ar.edu.unrc.game2048.Board board16 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean17 = board16.moveDown();
        boolean boolean18 = board16.isFull();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "91) test235(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "2) test235(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(4, 0)" + "'", str12, "(4, 0)");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "(4, 0)" + "'", str14, "(4, 0)");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        java.lang.Object obj2 = null;
        boolean boolean3 = board0.equals(obj2);
        java.lang.String str4 = board0.toString();
        boolean boolean5 = board0.isFull();
        boolean boolean6 = board0.isLosingBoard();
        boolean boolean7 = board0.moveLeft();
        ar.edu.unrc.game2048.Board.Position position10 = new ar.edu.unrc.game2048.Board.Position(4, 0);
        int int11 = position10.row;
        java.lang.String str12 = position10.toString();
        int int13 = position10.col;
        java.lang.String str14 = position10.toString();
        boolean boolean15 = board0.equals((java.lang.Object) position10);
        ar.edu.unrc.game2048.Board board16 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean17 = board0.moveRight();
        ar.edu.unrc.game2048.Board.Position position20 = new ar.edu.unrc.game2048.Board.Position(4, 0);
        int int21 = position20.row;
        int int22 = position20.col;
        int int23 = position20.row;
        java.lang.String str24 = position20.toString();
        boolean boolean25 = board0.equals((java.lang.Object) str24);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "92) test236(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "23) test236(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(4, 0)" + "'", str12, "(4, 0)");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "(4, 0)" + "'", str14, "(4, 0)");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 4 + "'", int23 == 4);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "(4, 0)" + "'", str24, "(4, 0)");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        boolean boolean2 = board0.isLosingBoard();
        int int3 = board0.getScore();
        ar.edu.unrc.game2048.Board.Position position6 = new ar.edu.unrc.game2048.Board.Position(4, 0);
        int int7 = position6.row;
        java.lang.String str8 = position6.toString();
        int int9 = position6.col;
        java.lang.String str10 = position6.toString();
        boolean boolean12 = position6.equals((java.lang.Object) (short) 100);
        boolean boolean13 = board0.equals((java.lang.Object) boolean12);
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board();
        boolean boolean15 = board14.hasEmptyCells();
        java.lang.Object obj16 = null;
        boolean boolean17 = board14.equals(obj16);
        java.lang.String str18 = board14.toString();
        boolean boolean19 = board14.isFull();
        ar.edu.unrc.game2048.Board board20 = new ar.edu.unrc.game2048.Board(board14);
        boolean boolean21 = board0.equals((java.lang.Object) board20);
        boolean boolean22 = board20.isWinningBoard();
        boolean boolean23 = board20.isWinningBoard();
        boolean boolean24 = board20.hasEmptyCells();
        boolean boolean25 = board20.hasEmptyCells();
        boolean boolean26 = board20.moveRight();
        boolean boolean27 = board20.moveDown();
        boolean boolean28 = board20.isFull();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "(4, 0)" + "'", str8, "(4, 0)");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "(4, 0)" + "'", str10, "(4, 0)");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
// flaky "93) test237(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str18, "Score: 0\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
// flaky "5) test237(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
// flaky "4) test237(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        java.lang.Object obj2 = null;
        boolean boolean3 = board0.equals(obj2);
        java.lang.String str4 = board0.toString();
        boolean boolean5 = board0.isFull();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean7 = board6.hasEmptyCells();
        boolean boolean8 = board6.moveRight();
        boolean boolean9 = board6.moveDown();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "94) test238(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
// flaky "6) test238(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky "2) test238(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) '#', 0);
        java.lang.String str3 = position2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(35, 0)" + "'", str3, "(35, 0)");
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        boolean boolean2 = board0.isLosingBoard();
        int int3 = board0.getScore();
        ar.edu.unrc.game2048.Board.Position position6 = new ar.edu.unrc.game2048.Board.Position(4, 0);
        int int7 = position6.row;
        java.lang.String str8 = position6.toString();
        int int9 = position6.col;
        java.lang.String str10 = position6.toString();
        boolean boolean12 = position6.equals((java.lang.Object) (short) 100);
        boolean boolean13 = board0.equals((java.lang.Object) boolean12);
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board();
        boolean boolean15 = board14.hasEmptyCells();
        java.lang.Object obj16 = null;
        boolean boolean17 = board14.equals(obj16);
        java.lang.String str18 = board14.toString();
        boolean boolean19 = board14.isFull();
        ar.edu.unrc.game2048.Board board20 = new ar.edu.unrc.game2048.Board(board14);
        boolean boolean21 = board0.equals((java.lang.Object) board20);
        boolean boolean22 = board20.isWinningBoard();
        boolean boolean23 = board20.moveDown();
        boolean boolean24 = board20.hasEmptyCells();
        ar.edu.unrc.game2048.Board board25 = new ar.edu.unrc.game2048.Board(board20);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "(4, 0)" + "'", str8, "(4, 0)");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "(4, 0)" + "'", str10, "(4, 0)");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
// flaky "95) test240(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str18, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
// flaky "3) test240(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) '4', 2048);
        java.lang.Class<?> wildcardClass3 = position2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 10, 4);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        int int1 = board0.getScore();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean4 = board0.equals((java.lang.Object) "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |    2|\n+-----+-----+-----+-----+\n");
        boolean boolean5 = board0.moveRight();
        boolean boolean6 = board0.isFull();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "6) test243(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        int int1 = board0.getScore();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean3 = board0.moveLeft();
        boolean boolean4 = board0.moveLeft();
        boolean boolean5 = board0.isWinningBoard();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet6 = board0.getEmptyPositions();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
// flaky "96) test244(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "24) test244(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(positionSet6);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        boolean boolean2 = board0.isLosingBoard();
        int int3 = board0.getScore();
        boolean boolean4 = board0.repOK();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board0);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell9 = board6.getCell((int) (byte) 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (10, 100) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        boolean boolean2 = board0.isLosingBoard();
        int int3 = board0.getScore();
        ar.edu.unrc.game2048.Board.Position position6 = new ar.edu.unrc.game2048.Board.Position(4, 0);
        int int7 = position6.row;
        java.lang.String str8 = position6.toString();
        int int9 = position6.col;
        java.lang.String str10 = position6.toString();
        boolean boolean12 = position6.equals((java.lang.Object) (short) 100);
        boolean boolean13 = board0.equals((java.lang.Object) boolean12);
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board();
        boolean boolean15 = board14.hasEmptyCells();
        java.lang.Object obj16 = null;
        boolean boolean17 = board14.equals(obj16);
        java.lang.String str18 = board14.toString();
        boolean boolean19 = board14.isFull();
        ar.edu.unrc.game2048.Board board20 = new ar.edu.unrc.game2048.Board(board14);
        boolean boolean21 = board0.equals((java.lang.Object) board20);
        boolean boolean22 = board20.isWinningBoard();
        boolean boolean23 = board20.moveDown();
        boolean boolean24 = board20.hasEmptyCells();
        boolean boolean25 = board20.isLosingBoard();
        boolean boolean26 = board20.isFull();
        boolean boolean27 = board20.moveUp();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "(4, 0)" + "'", str8, "(4, 0)");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "(4, 0)" + "'", str10, "(4, 0)");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
// flaky "97) test246(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str18, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
// flaky "5) test246(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
// flaky "8) test246(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        java.lang.Object obj2 = null;
        boolean boolean3 = board0.equals(obj2);
        java.lang.String str4 = board0.toString();
        boolean boolean5 = board0.isFull();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board0);
        int int7 = board0.getScore();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell10 = board0.getCell(35, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (35, 1) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "98) test247(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (short) 1);
        boolean boolean2 = board1.isLosingBoard();
        int int3 = board1.getSize();
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(board1);
        boolean boolean5 = board1.moveUp();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.isLosingBoard();
        boolean boolean2 = board0.moveDown();
        boolean boolean3 = board0.moveDown();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "25) test249(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky "8) test249(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        boolean boolean2 = board0.isLosingBoard();
        int int3 = board0.getScore();
        ar.edu.unrc.game2048.Board.Position position6 = new ar.edu.unrc.game2048.Board.Position(4, 0);
        int int7 = position6.row;
        java.lang.String str8 = position6.toString();
        int int9 = position6.col;
        java.lang.String str10 = position6.toString();
        boolean boolean12 = position6.equals((java.lang.Object) (short) 100);
        boolean boolean13 = board0.equals((java.lang.Object) boolean12);
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board();
        boolean boolean15 = board14.hasEmptyCells();
        java.lang.Object obj16 = null;
        boolean boolean17 = board14.equals(obj16);
        java.lang.String str18 = board14.toString();
        boolean boolean19 = board14.isFull();
        ar.edu.unrc.game2048.Board board20 = new ar.edu.unrc.game2048.Board(board14);
        boolean boolean21 = board0.equals((java.lang.Object) board20);
        boolean boolean22 = board20.isWinningBoard();
        boolean boolean23 = board20.moveDown();
        ar.edu.unrc.game2048.Board board24 = new ar.edu.unrc.game2048.Board(board20);
        ar.edu.unrc.game2048.Board board25 = new ar.edu.unrc.game2048.Board(board20);
        ar.edu.unrc.game2048.Board board26 = new ar.edu.unrc.game2048.Board(board25);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "(4, 0)" + "'", str8, "(4, 0)");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "(4, 0)" + "'", str10, "(4, 0)");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
// flaky "99) test250(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |    2|     |\n+-----+-----+-----+-----+\n" + "'", str18, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |    2|     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
// flaky "26) test250(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        int int1 = board0.getScore();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board();
        boolean boolean4 = board0.equals((java.lang.Object) board3);
        boolean boolean5 = board0.moveDown();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "8) test251(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(35, (int) (short) 0);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board();
        boolean boolean4 = board3.hasEmptyCells();
        java.lang.Object obj5 = null;
        boolean boolean6 = board3.equals(obj5);
        java.lang.String str7 = board3.toString();
        boolean boolean8 = board3.isFull();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board3);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet10 = board3.getEmptyPositions();
        boolean boolean11 = board3.moveUp();
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board(board3);
        int int13 = board3.getSize();
        boolean boolean14 = board3.moveUp();
        boolean boolean15 = position2.equals((java.lang.Object) board3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "100) test252(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n" + "'", str7, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(positionSet10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
// flaky "7) test252(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) '4', 10);
        int int3 = position2.row;
        int int4 = position2.col;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        int int1 = board0.getScore();
        java.lang.String str2 = board0.toString();
        boolean boolean3 = board0.isWinningBoard();
        boolean boolean4 = board0.moveLeft();
        boolean boolean5 = board0.hasEmptyCells();
        java.lang.Class<?> wildcardClass6 = board0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
// flaky "101) test254(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str2, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        boolean boolean2 = board0.isLosingBoard();
        int int3 = board0.getScore();
        ar.edu.unrc.game2048.Board.Position position6 = new ar.edu.unrc.game2048.Board.Position(4, 0);
        int int7 = position6.row;
        java.lang.String str8 = position6.toString();
        int int9 = position6.col;
        java.lang.String str10 = position6.toString();
        boolean boolean12 = position6.equals((java.lang.Object) (short) 100);
        boolean boolean13 = board0.equals((java.lang.Object) boolean12);
        boolean boolean15 = board0.equals((java.lang.Object) (-1));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "(4, 0)" + "'", str8, "(4, 0)");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "(4, 0)" + "'", str10, "(4, 0)");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        java.lang.Object obj2 = null;
        boolean boolean3 = board0.equals(obj2);
        java.lang.String str4 = board0.toString();
        boolean boolean5 = board0.isWinningBoard();
        int int6 = board0.getScore();
        boolean boolean7 = board0.hasEmptyCells();
        boolean boolean9 = board0.equals((java.lang.Object) (byte) 1);
        java.lang.String str10 = board0.toString();
        boolean boolean11 = board0.isLosingBoard();
        boolean boolean12 = board0.isWinningBoard();
        boolean boolean13 = board0.moveRight();
        boolean boolean14 = board0.moveUp();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "102) test256(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky "27) test256(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n" + "'", str10, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
// flaky "6) test256(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (byte) -1, (int) ' ');
        int int3 = position2.row;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        java.lang.Object obj2 = null;
        boolean boolean3 = board0.equals(obj2);
        boolean boolean4 = board0.isFull();
        boolean boolean5 = board0.isLosingBoard();
        java.lang.String str6 = board0.toString();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board();
        boolean boolean8 = board7.hasEmptyCells();
        boolean boolean9 = board7.isLosingBoard();
        int int10 = board7.getScore();
        boolean boolean11 = board7.repOK();
        boolean boolean12 = board0.equals((java.lang.Object) boolean11);
        boolean boolean13 = board0.moveDown();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky "103) test258(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str6, "Score: 0\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
// flaky "9) test258(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(4, 0);
        java.lang.String str3 = position2.toString();
        int int4 = position2.col;
        int int5 = position2.row;
        java.lang.String str6 = position2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(4, 0)" + "'", str3, "(4, 0)");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(4, 0)" + "'", str6, "(4, 0)");
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        java.lang.Object obj2 = null;
        boolean boolean3 = board0.equals(obj2);
        java.lang.String str4 = board0.toString();
        boolean boolean6 = board0.equals((java.lang.Object) (-1));
        int int7 = board0.getScore();
        boolean boolean8 = board0.moveRight();
        boolean boolean9 = board0.moveLeft();
        boolean boolean10 = board0.moveDown();
        int int11 = board0.getSize();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell14 = board0.getCell((int) (byte) 1, 2048);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (1, 2048) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "104) test260(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
// flaky "9) test260(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
// flaky "4) test260(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        java.lang.Object obj2 = null;
        boolean boolean3 = board0.equals(obj2);
        java.lang.String str4 = board0.toString();
        boolean boolean5 = board0.isFull();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet7 = board0.getEmptyPositions();
        boolean boolean8 = board0.moveUp();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board0);
        int int10 = board0.getSize();
        boolean boolean11 = board0.moveUp();
        boolean boolean12 = board0.hasEmptyCells();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "105) test261(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(positionSet7);
// flaky "4) test261(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
// flaky "7) test261(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        java.lang.Class<?> wildcardClass2 = board1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        boolean boolean2 = board0.isLosingBoard();
        int int3 = board0.getScore();
        ar.edu.unrc.game2048.Board.Position position6 = new ar.edu.unrc.game2048.Board.Position(4, 0);
        int int7 = position6.row;
        java.lang.String str8 = position6.toString();
        int int9 = position6.col;
        java.lang.String str10 = position6.toString();
        boolean boolean12 = position6.equals((java.lang.Object) (short) 100);
        boolean boolean13 = board0.equals((java.lang.Object) boolean12);
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board();
        boolean boolean15 = board14.hasEmptyCells();
        java.lang.Object obj16 = null;
        boolean boolean17 = board14.equals(obj16);
        java.lang.String str18 = board14.toString();
        boolean boolean19 = board14.isFull();
        ar.edu.unrc.game2048.Board board20 = new ar.edu.unrc.game2048.Board(board14);
        boolean boolean21 = board0.equals((java.lang.Object) board20);
        boolean boolean22 = board20.isWinningBoard();
        boolean boolean23 = board20.moveDown();
        ar.edu.unrc.game2048.Board board24 = new ar.edu.unrc.game2048.Board(board20);
        ar.edu.unrc.game2048.Board board25 = new ar.edu.unrc.game2048.Board(board20);
        boolean boolean26 = board25.moveLeft();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "(4, 0)" + "'", str8, "(4, 0)");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "(4, 0)" + "'", str10, "(4, 0)");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
// flaky "106) test263(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str18, "Score: 0\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
// flaky "9) test263(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
// flaky "10) test263(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        java.lang.Object obj2 = null;
        boolean boolean3 = board0.equals(obj2);
        boolean boolean4 = board0.hasEmptyCells();
        int int5 = board0.getSize();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) ' ', (int) 'a');
        int int3 = position2.col;
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board();
        boolean boolean5 = board4.hasEmptyCells();
        java.lang.Object obj6 = null;
        boolean boolean7 = board4.equals(obj6);
        java.lang.String str8 = board4.toString();
        boolean boolean9 = board4.isFull();
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board(board4);
        boolean boolean11 = board4.isFull();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet12 = board4.getEmptyPositions();
        boolean boolean13 = position2.equals((java.lang.Object) positionSet12);
        int int14 = position2.row;
        int int15 = position2.row;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
// flaky "107) test265(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str8, "Score: 0\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(positionSet12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        java.lang.Object obj2 = null;
        boolean boolean3 = board0.equals(obj2);
        java.lang.String str4 = board0.toString();
        boolean boolean5 = board0.isWinningBoard();
        int int6 = board0.getScore();
        boolean boolean7 = board0.moveLeft();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "108) test266(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|    4|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|    4|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
// flaky "4) test266(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        java.lang.Object obj2 = null;
        boolean boolean3 = board0.equals(obj2);
        java.lang.String str4 = board0.toString();
        boolean boolean6 = board0.equals((java.lang.Object) (-1));
        int int7 = board0.getScore();
        boolean boolean8 = board0.moveRight();
        boolean boolean9 = board0.moveLeft();
        boolean boolean10 = board0.moveDown();
        int int11 = board0.getSize();
        boolean boolean12 = board0.isFull();
        ar.edu.unrc.game2048.Board.Position position15 = new ar.edu.unrc.game2048.Board.Position(10, (int) (byte) 10);
        boolean boolean16 = board0.equals((java.lang.Object) (byte) 10);
        ar.edu.unrc.game2048.Board board17 = new ar.edu.unrc.game2048.Board();
        boolean boolean18 = board17.hasEmptyCells();
        java.lang.Object obj19 = null;
        boolean boolean20 = board17.equals(obj19);
        java.lang.String str21 = board17.toString();
        boolean boolean22 = board17.isFull();
        ar.edu.unrc.game2048.Board board23 = new ar.edu.unrc.game2048.Board(board17);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet24 = board17.getEmptyPositions();
        boolean boolean25 = board17.isFull();
        boolean boolean26 = board0.equals((java.lang.Object) board17);
        boolean boolean27 = board17.moveUp();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "109) test267(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
// flaky "11) test267(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
// flaky "5) test267(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
// flaky "28) test267(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |    4|     |     |\n+-----+-----+-----+-----+\n" + "'", str21, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |    4|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(positionSet24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
// flaky "5) test267(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(0, (int) '4');
        int int3 = position2.row;
        boolean boolean5 = position2.equals((java.lang.Object) "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    4|\n+-----+-----+-----+-----+\n");
        int int6 = position2.col;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        java.lang.Object obj2 = null;
        boolean boolean3 = board0.equals(obj2);
        java.lang.String str4 = board0.toString();
        boolean boolean5 = board0.isFull();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board0);
        int int7 = board0.getScore();
        boolean boolean8 = board0.isLosingBoard();
        boolean boolean9 = board0.moveRight();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "110) test269(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky "3) test269(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        java.lang.Object obj2 = null;
        boolean boolean3 = board0.equals(obj2);
        java.lang.String str4 = board0.toString();
        boolean boolean5 = board0.isFull();
        boolean boolean6 = board0.moveLeft();
        java.lang.String str7 = board0.toString();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "111) test270(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky "4) test270(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky "29) test270(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|    4|     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str7, "Score: 0\n+-----+-----+-----+-----+\n|    4|     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        int int1 = board0.getScore();
        boolean boolean2 = board0.isLosingBoard();
        boolean boolean3 = board0.moveRight();
        boolean boolean4 = board0.moveRight();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board5);
        boolean boolean7 = board6.isLosingBoard();
        boolean boolean8 = board0.equals((java.lang.Object) boolean7);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky "10) test271(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky "12) test271(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(0, 32);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        java.lang.Object obj2 = null;
        boolean boolean3 = board0.equals(obj2);
        java.lang.String str4 = board0.toString();
        boolean boolean5 = board0.isFull();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean7 = board0.isFull();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet8 = board0.getEmptyPositions();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "112) test273(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(positionSet8);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        java.lang.Object obj2 = null;
        boolean boolean3 = board0.equals(obj2);
        java.lang.String str4 = board0.toString();
        boolean boolean5 = board0.isFull();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean7 = board6.hasEmptyCells();
        boolean boolean8 = board6.moveRight();
        int int9 = board6.getScore();
        boolean boolean10 = board6.isFull();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "113) test274(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |    4|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |    4|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
// flaky "5) test274(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky "6) test274(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        java.lang.String str2 = board1.toString();
        boolean boolean3 = board1.moveDown();
// flaky "13) test275(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Score: 0\n+-----+\n|    2|\n+-----+\n" + "'", str2, "Score: 0\n+-----+\n|    2|\n+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(4, 0);
        int int3 = position2.row;
        java.lang.String str4 = position2.toString();
        int int5 = position2.col;
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board();
        boolean boolean7 = board6.hasEmptyCells();
        boolean boolean8 = board6.isLosingBoard();
        int int9 = board6.getScore();
        boolean boolean10 = board6.repOK();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(board6);
        boolean boolean12 = position2.equals((java.lang.Object) board11);
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board();
        boolean boolean14 = board13.hasEmptyCells();
        java.lang.Object obj15 = null;
        boolean boolean16 = board13.equals(obj15);
        boolean boolean17 = board13.isFull();
        boolean boolean18 = board13.isLosingBoard();
        boolean boolean19 = position2.equals((java.lang.Object) boolean18);
        int int20 = position2.row;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(4, 0)" + "'", str4, "(4, 0)");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        boolean boolean2 = board0.isLosingBoard();
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        boolean boolean5 = board0.equals((java.lang.Object) (byte) 1);
        boolean boolean6 = board0.isLosingBoard();
        int int7 = board0.getSize();
        boolean boolean9 = board0.equals((java.lang.Object) "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |    4|     |     |\n+-----+-----+-----+-----+\n");
        boolean boolean10 = board0.isWinningBoard();
        int int11 = board0.getSize();
        int int12 = board0.getSize();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        int int1 = board0.getScore();
        boolean boolean2 = board0.isLosingBoard();
        boolean boolean3 = board0.moveRight();
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean5 = board4.isWinningBoard();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet6 = board4.getEmptyPositions();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky "114) test278(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(positionSet6);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) 1, (int) '4');
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (byte) 10);
        boolean boolean2 = board1.isWinningBoard();
        boolean boolean3 = board1.hasEmptyCells();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        boolean boolean2 = board0.isLosingBoard();
        int int3 = board0.getScore();
        boolean boolean4 = board0.repOK();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean6 = board0.moveRight();
        java.lang.String str7 = board0.toString();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet8 = board0.getEmptyPositions();
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board(100);
        ar.edu.unrc.game2048.Cell cell15 = board12.getCell(1, 10);
        ar.edu.unrc.game2048.Cell cell18 = board12.getCell(0, 1);
        // The following exception was thrown during execution in test generation
        try {
            board0.setCell((int) '#', (int) (short) -1, cell18);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (35, -1) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
// flaky "11) test281(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky "115) test281(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str7, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertNotNull(positionSet8);
        org.junit.Assert.assertNotNull(cell15);
        org.junit.Assert.assertNotNull(cell18);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        boolean boolean2 = board0.isLosingBoard();
        boolean boolean3 = board0.moveUp();
        boolean boolean4 = board0.moveLeft();
        java.lang.String str5 = board0.toString();
        boolean boolean7 = board0.equals((java.lang.Object) "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky "8) test282(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
// flaky "116) test282(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Score: 4\n+-----+-----+-----+-----+\n|    4|     |     |     |\n+-----+-----+-----+-----+\n|    2|     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str5, "Score: 4\n+-----+-----+-----+-----+\n|    4|     |     |     |\n+-----+-----+-----+-----+\n|    2|     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        boolean boolean2 = board0.isLosingBoard();
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        boolean boolean5 = board0.equals((java.lang.Object) (byte) 1);
        boolean boolean6 = board0.isLosingBoard();
        java.lang.String str7 = board0.toString();
        boolean boolean8 = board0.moveUp();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board0);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell12 = board9.getCell((int) 'a', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (97, 32) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "117) test283(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |    2|     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str7, "Score: 0\n+-----+-----+-----+-----+\n|     |    2|     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
// flaky "30) test283(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        java.lang.Object obj2 = null;
        boolean boolean3 = board0.equals(obj2);
        java.lang.String str4 = board0.toString();
        boolean boolean5 = board0.isWinningBoard();
        boolean boolean6 = board0.isWinningBoard();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "118) test284(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(52);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(10, (int) (byte) 10);
        int int3 = position2.col;
        int int4 = position2.col;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        java.lang.Object obj2 = null;
        boolean boolean3 = board0.equals(obj2);
        java.lang.String str4 = board0.toString();
        boolean boolean5 = board0.isFull();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Board.Position position9 = new ar.edu.unrc.game2048.Board.Position(4, 0);
        int int10 = position9.row;
        java.lang.String str11 = position9.toString();
        int int12 = position9.col;
        boolean boolean13 = board6.equals((java.lang.Object) int12);
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board();
        boolean boolean15 = board14.hasEmptyCells();
        boolean boolean16 = board14.isLosingBoard();
        int int17 = board14.getScore();
        ar.edu.unrc.game2048.Board.Position position20 = new ar.edu.unrc.game2048.Board.Position(4, 0);
        int int21 = position20.row;
        java.lang.String str22 = position20.toString();
        int int23 = position20.col;
        java.lang.String str24 = position20.toString();
        boolean boolean26 = position20.equals((java.lang.Object) (short) 100);
        boolean boolean27 = board14.equals((java.lang.Object) boolean26);
        ar.edu.unrc.game2048.Board board28 = new ar.edu.unrc.game2048.Board();
        boolean boolean29 = board28.hasEmptyCells();
        java.lang.Object obj30 = null;
        boolean boolean31 = board28.equals(obj30);
        java.lang.String str32 = board28.toString();
        boolean boolean33 = board28.isFull();
        ar.edu.unrc.game2048.Board board34 = new ar.edu.unrc.game2048.Board(board28);
        boolean boolean35 = board14.equals((java.lang.Object) board34);
        boolean boolean36 = board6.equals((java.lang.Object) board34);
        boolean boolean37 = board34.isFull();
        boolean boolean38 = board34.hasEmptyCells();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "119) test287(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |    4|     |     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |    4|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(4, 0)" + "'", str11, "(4, 0)");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "(4, 0)" + "'", str22, "(4, 0)");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "(4, 0)" + "'", str24, "(4, 0)");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
// flaky "31) test287(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |    4|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    4|\n+-----+-----+-----+-----+\n" + "'", str32, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |    4|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    4|\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
// flaky "3) test287(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        boolean boolean2 = board0.isLosingBoard();
        boolean boolean3 = board0.moveUp();
        boolean boolean4 = board0.moveDown();
        boolean boolean5 = board0.moveUp();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(0, (int) '4');
        java.lang.String str3 = position2.toString();
        int int4 = position2.row;
        int int5 = position2.col;
        int int6 = position2.row;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(0, 52)" + "'", str3, "(0, 52)");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        java.lang.Object obj2 = null;
        boolean boolean3 = board0.equals(obj2);
        java.lang.String str4 = board0.toString();
        boolean boolean6 = board0.equals((java.lang.Object) (-1));
        int int7 = board0.getScore();
        boolean boolean8 = board0.moveRight();
        boolean boolean9 = board0.moveLeft();
        boolean boolean10 = board0.moveDown();
        int int11 = board0.getSize();
        boolean boolean12 = board0.isFull();
        ar.edu.unrc.game2048.Board.Position position15 = new ar.edu.unrc.game2048.Board.Position(10, (int) (byte) 10);
        boolean boolean16 = board0.equals((java.lang.Object) (byte) 10);
        ar.edu.unrc.game2048.Board board17 = new ar.edu.unrc.game2048.Board();
        boolean boolean18 = board17.hasEmptyCells();
        java.lang.Object obj19 = null;
        boolean boolean20 = board17.equals(obj19);
        java.lang.String str21 = board17.toString();
        boolean boolean22 = board17.isFull();
        ar.edu.unrc.game2048.Board board23 = new ar.edu.unrc.game2048.Board(board17);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet24 = board17.getEmptyPositions();
        boolean boolean25 = board17.isFull();
        boolean boolean26 = board0.equals((java.lang.Object) board17);
        ar.edu.unrc.game2048.Board board27 = new ar.edu.unrc.game2048.Board();
        boolean boolean28 = board27.hasEmptyCells();
        java.lang.Object obj29 = null;
        boolean boolean30 = board27.equals(obj29);
        java.lang.String str31 = board27.toString();
        boolean boolean32 = board27.isFull();
        ar.edu.unrc.game2048.Board board33 = new ar.edu.unrc.game2048.Board(board27);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet34 = board27.getEmptyPositions();
        boolean boolean35 = board27.moveUp();
        ar.edu.unrc.game2048.Board board36 = new ar.edu.unrc.game2048.Board();
        boolean boolean37 = board36.hasEmptyCells();
        boolean boolean38 = board36.isLosingBoard();
        ar.edu.unrc.game2048.Board board40 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        boolean boolean41 = board36.equals((java.lang.Object) (byte) 1);
        boolean boolean42 = board36.isLosingBoard();
        int int43 = board36.getSize();
        boolean boolean44 = board27.equals((java.lang.Object) int43);
        boolean boolean45 = board0.equals((java.lang.Object) board27);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "120) test290(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
// flaky "5) test290(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
// flaky "2) test290(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
// flaky "32) test290(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str21, "Score: 0\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(positionSet24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
// flaky "14) test290(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str31, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(positionSet34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 4 + "'", int43 == 4);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        java.lang.Object obj2 = null;
        boolean boolean3 = board0.equals(obj2);
        java.lang.String str4 = board0.toString();
        boolean boolean5 = board0.isFull();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Board.Position position9 = new ar.edu.unrc.game2048.Board.Position(4, 0);
        int int10 = position9.row;
        java.lang.String str11 = position9.toString();
        int int12 = position9.col;
        boolean boolean13 = board6.equals((java.lang.Object) int12);
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board();
        boolean boolean15 = board14.hasEmptyCells();
        boolean boolean16 = board14.isLosingBoard();
        int int17 = board14.getScore();
        ar.edu.unrc.game2048.Board.Position position20 = new ar.edu.unrc.game2048.Board.Position(4, 0);
        int int21 = position20.row;
        java.lang.String str22 = position20.toString();
        int int23 = position20.col;
        java.lang.String str24 = position20.toString();
        boolean boolean26 = position20.equals((java.lang.Object) (short) 100);
        boolean boolean27 = board14.equals((java.lang.Object) boolean26);
        ar.edu.unrc.game2048.Board board28 = new ar.edu.unrc.game2048.Board();
        boolean boolean29 = board28.hasEmptyCells();
        java.lang.Object obj30 = null;
        boolean boolean31 = board28.equals(obj30);
        java.lang.String str32 = board28.toString();
        boolean boolean33 = board28.isFull();
        ar.edu.unrc.game2048.Board board34 = new ar.edu.unrc.game2048.Board(board28);
        boolean boolean35 = board14.equals((java.lang.Object) board34);
        boolean boolean36 = board6.equals((java.lang.Object) board34);
        boolean boolean37 = board34.isFull();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell40 = board34.getCell((int) (byte) 100, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (100, 32) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "121) test291(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |    2|    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |     |    2|    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(4, 0)" + "'", str11, "(4, 0)");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "(4, 0)" + "'", str22, "(4, 0)");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "(4, 0)" + "'", str24, "(4, 0)");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
// flaky "33) test291(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str32, "Score: 0\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
// flaky "9) test291(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
// flaky "6) test291(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(100, 97);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        boolean boolean2 = board0.isLosingBoard();
        int int3 = board0.getScore();
        ar.edu.unrc.game2048.Board.Position position6 = new ar.edu.unrc.game2048.Board.Position(4, 0);
        int int7 = position6.row;
        java.lang.String str8 = position6.toString();
        int int9 = position6.col;
        java.lang.String str10 = position6.toString();
        boolean boolean12 = position6.equals((java.lang.Object) (short) 100);
        boolean boolean13 = board0.equals((java.lang.Object) boolean12);
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board();
        boolean boolean15 = board14.hasEmptyCells();
        java.lang.Object obj16 = null;
        boolean boolean17 = board14.equals(obj16);
        java.lang.String str18 = board14.toString();
        boolean boolean19 = board14.isFull();
        ar.edu.unrc.game2048.Board board20 = new ar.edu.unrc.game2048.Board(board14);
        boolean boolean21 = board0.equals((java.lang.Object) board20);
        boolean boolean22 = board20.isWinningBoard();
        boolean boolean23 = board20.moveDown();
        boolean boolean24 = board20.hasEmptyCells();
        boolean boolean25 = board20.moveRight();
        ar.edu.unrc.game2048.Board board26 = new ar.edu.unrc.game2048.Board(board20);
        ar.edu.unrc.game2048.Board board27 = new ar.edu.unrc.game2048.Board();
        int int28 = board27.getScore();
        ar.edu.unrc.game2048.Board board29 = new ar.edu.unrc.game2048.Board(board27);
        ar.edu.unrc.game2048.Board board30 = new ar.edu.unrc.game2048.Board();
        int int31 = board30.getScore();
        ar.edu.unrc.game2048.Board board32 = new ar.edu.unrc.game2048.Board(board30);
        boolean boolean33 = board30.hasEmptyCells();
        boolean boolean34 = board30.moveUp();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet35 = board30.getEmptyPositions();
        boolean boolean36 = board29.equals((java.lang.Object) positionSet35);
        boolean boolean37 = board29.repOK();
        boolean boolean38 = board29.repOK();
        boolean boolean39 = board20.equals((java.lang.Object) boolean38);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "(4, 0)" + "'", str8, "(4, 0)");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "(4, 0)" + "'", str10, "(4, 0)");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
// flaky "122) test293(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str18, "Score: 0\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
// flaky "10) test293(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
// flaky "4) test293(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
// flaky "6) test293(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(positionSet35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.moveUp();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        boolean boolean2 = board0.isLosingBoard();
        int int3 = board0.getScore();
        boolean boolean4 = board0.moveDown();
        boolean boolean5 = board0.isLosingBoard();
        int int6 = board0.getSize();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        java.lang.Object obj2 = null;
        boolean boolean3 = board0.equals(obj2);
        java.lang.String str4 = board0.toString();
        boolean boolean5 = board0.isFull();
        boolean boolean6 = board0.isLosingBoard();
        boolean boolean7 = board0.repOK();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "123) test296(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        java.lang.Object obj2 = null;
        boolean boolean3 = board0.equals(obj2);
        java.lang.String str4 = board0.toString();
        boolean boolean5 = board0.isFull();
        boolean boolean6 = board0.isLosingBoard();
        boolean boolean7 = board0.moveLeft();
        ar.edu.unrc.game2048.Board.Position position10 = new ar.edu.unrc.game2048.Board.Position(4, 0);
        int int11 = position10.row;
        java.lang.String str12 = position10.toString();
        int int13 = position10.col;
        java.lang.String str14 = position10.toString();
        boolean boolean15 = board0.equals((java.lang.Object) position10);
        int int16 = position10.row;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "124) test297(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "4) test297(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(4, 0)" + "'", str12, "(4, 0)");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "(4, 0)" + "'", str14, "(4, 0)");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(4, 0);
        int int3 = position2.row;
        java.lang.String str4 = position2.toString();
        int int5 = position2.col;
        int int6 = position2.col;
        int int7 = position2.row;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(4, 0)" + "'", str4, "(4, 0)");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(32, (int) '#');
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) 'a', (int) '#');
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        boolean boolean2 = board0.isLosingBoard();
        int int3 = board0.getScore();
        ar.edu.unrc.game2048.Board.Position position6 = new ar.edu.unrc.game2048.Board.Position(4, 0);
        int int7 = position6.row;
        java.lang.String str8 = position6.toString();
        int int9 = position6.col;
        java.lang.String str10 = position6.toString();
        boolean boolean12 = position6.equals((java.lang.Object) (short) 100);
        boolean boolean13 = board0.equals((java.lang.Object) boolean12);
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board();
        boolean boolean15 = board14.hasEmptyCells();
        java.lang.Object obj16 = null;
        boolean boolean17 = board14.equals(obj16);
        java.lang.String str18 = board14.toString();
        boolean boolean19 = board14.isFull();
        ar.edu.unrc.game2048.Board board20 = new ar.edu.unrc.game2048.Board(board14);
        boolean boolean21 = board0.equals((java.lang.Object) board20);
        boolean boolean22 = board20.isWinningBoard();
        boolean boolean23 = board20.isWinningBoard();
        boolean boolean24 = board20.hasEmptyCells();
        boolean boolean25 = board20.moveDown();
        boolean boolean26 = board20.hasEmptyCells();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "(4, 0)" + "'", str8, "(4, 0)");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "(4, 0)" + "'", str10, "(4, 0)");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
// flaky "125) test301(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str18, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        java.lang.Object obj2 = null;
        boolean boolean3 = board0.equals(obj2);
        java.lang.String str4 = board0.toString();
        boolean boolean5 = board0.isFull();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean7 = board0.moveUp();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "126) test302(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky "12) test302(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        java.lang.Object obj2 = null;
        boolean boolean3 = board0.equals(obj2);
        java.lang.String str4 = board0.toString();
        boolean boolean6 = board0.equals((java.lang.Object) (-1));
        int int7 = board0.getScore();
        boolean boolean8 = board0.moveRight();
        boolean boolean9 = board0.moveLeft();
        boolean boolean10 = board0.moveDown();
        int int11 = board0.getSize();
        boolean boolean12 = board0.moveUp();
        int int13 = board0.getScore();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "127) test303(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |    4|\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |    4|\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
// flaky "4) test303(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
// flaky "5) test303(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
// flaky "34) test303(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 12 + "'", int13 == 12);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        int int1 = board0.getScore();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board();
        int int4 = board3.getScore();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(board3);
        boolean boolean6 = board3.hasEmptyCells();
        boolean boolean7 = board3.moveUp();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet8 = board3.getEmptyPositions();
        boolean boolean9 = board2.equals((java.lang.Object) positionSet8);
        int int10 = board2.getSize();
        int int11 = board2.getSize();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky "6) test304(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(positionSet8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.hasEmptyCells();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board();
        boolean boolean6 = board5.hasEmptyCells();
        java.lang.Object obj7 = null;
        boolean boolean8 = board5.equals(obj7);
        java.lang.String str9 = board5.toString();
        boolean boolean10 = board5.isFull();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(board5);
        int int12 = board5.getScore();
        ar.edu.unrc.game2048.Board board16 = new ar.edu.unrc.game2048.Board(100);
        ar.edu.unrc.game2048.Cell cell19 = board16.getCell(1, 10);
        board5.setCell(0, 1, cell19);
        // The following exception was thrown during execution in test generation
        try {
            board1.setCell((int) (short) 10, 4, cell19);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (10, 4) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky "128) test305(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n" + "'", str9, "Score: 0\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(cell19);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        boolean boolean2 = board0.isLosingBoard();
        int int3 = board0.getScore();
        boolean boolean4 = board0.repOK();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet7 = board6.getEmptyPositions();
        boolean boolean8 = board6.moveDown();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(positionSet7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        int int1 = board0.getScore();
        int int2 = board0.getScore();
        boolean boolean3 = board0.moveUp();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet4 = board0.getEmptyPositions();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "3) test307(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(positionSet4);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(4, 0);
        int int3 = position2.row;
        java.lang.String str4 = position2.toString();
        int int5 = position2.col;
        java.lang.String str6 = position2.toString();
        boolean boolean8 = position2.equals((java.lang.Object) (byte) 0);
        int int9 = position2.col;
        boolean boolean11 = position2.equals((java.lang.Object) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(4, 0)" + "'", str4, "(4, 0)");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(4, 0)" + "'", str6, "(4, 0)");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        boolean boolean2 = board0.isLosingBoard();
        int int3 = board0.getScore();
        ar.edu.unrc.game2048.Board.Position position6 = new ar.edu.unrc.game2048.Board.Position(4, 0);
        int int7 = position6.row;
        java.lang.String str8 = position6.toString();
        int int9 = position6.col;
        java.lang.String str10 = position6.toString();
        boolean boolean12 = position6.equals((java.lang.Object) (short) 100);
        boolean boolean13 = board0.equals((java.lang.Object) boolean12);
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board();
        boolean boolean15 = board14.hasEmptyCells();
        java.lang.Object obj16 = null;
        boolean boolean17 = board14.equals(obj16);
        java.lang.String str18 = board14.toString();
        boolean boolean19 = board14.isFull();
        ar.edu.unrc.game2048.Board board20 = new ar.edu.unrc.game2048.Board(board14);
        boolean boolean21 = board0.equals((java.lang.Object) board20);
        boolean boolean22 = board20.isWinningBoard();
        boolean boolean23 = board20.moveDown();
        ar.edu.unrc.game2048.Board board24 = new ar.edu.unrc.game2048.Board(board20);
        boolean boolean25 = board20.isFull();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "(4, 0)" + "'", str8, "(4, 0)");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "(4, 0)" + "'", str10, "(4, 0)");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
// flaky "129) test309(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str18, "Score: 0\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
// flaky "7) test309(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(97, (int) 'a');
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.isLosingBoard();
        boolean boolean3 = board1.moveRight();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky "130) test311(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) 10, (int) (short) 0);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        java.lang.Object obj2 = null;
        boolean boolean3 = board0.equals(obj2);
        int int4 = board0.getSize();
        boolean boolean5 = board0.isLosingBoard();
        int int6 = board0.getSize();
        java.lang.String str7 = board0.toString();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
// flaky "131) test313(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    4|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n" + "'", str7, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    4|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n");
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        boolean boolean2 = board0.isLosingBoard();
        int int3 = board0.getScore();
        boolean boolean4 = board0.moveDown();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board();
        boolean boolean8 = board7.hasEmptyCells();
        java.lang.Object obj9 = null;
        boolean boolean10 = board7.equals(obj9);
        java.lang.String str11 = board7.toString();
        boolean boolean12 = board7.isFull();
        ar.edu.unrc.game2048.Cell cell15 = board7.getCell((int) (short) 1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            board0.setCell((-1), 100, cell15);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (-1, 100) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
// flaky "4) test314(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky "132) test314(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str11, "Score: 0\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(cell15);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        boolean boolean2 = board0.isLosingBoard();
        int int3 = board0.getScore();
        boolean boolean4 = board0.isFull();
        boolean boolean5 = board0.moveUp();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "5) test315(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        boolean boolean2 = board1.isWinningBoard();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board1.getEmptyPositions();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet4 = board1.getEmptyPositions();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertNotNull(positionSet4);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        boolean boolean2 = board0.isLosingBoard();
        int int3 = board0.getScore();
        ar.edu.unrc.game2048.Board.Position position6 = new ar.edu.unrc.game2048.Board.Position(4, 0);
        int int7 = position6.row;
        java.lang.String str8 = position6.toString();
        int int9 = position6.col;
        java.lang.String str10 = position6.toString();
        boolean boolean12 = position6.equals((java.lang.Object) (short) 100);
        boolean boolean13 = board0.equals((java.lang.Object) boolean12);
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board();
        boolean boolean15 = board14.hasEmptyCells();
        java.lang.Object obj16 = null;
        boolean boolean17 = board14.equals(obj16);
        java.lang.String str18 = board14.toString();
        boolean boolean19 = board14.isFull();
        ar.edu.unrc.game2048.Board board20 = new ar.edu.unrc.game2048.Board(board14);
        boolean boolean21 = board0.equals((java.lang.Object) board20);
        boolean boolean22 = board20.isWinningBoard();
        boolean boolean23 = board20.isWinningBoard();
        boolean boolean24 = board20.hasEmptyCells();
        boolean boolean25 = board20.hasEmptyCells();
        boolean boolean26 = board20.moveRight();
        boolean boolean27 = board20.moveDown();
        boolean boolean28 = board20.moveUp();
        boolean boolean29 = board20.isWinningBoard();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "(4, 0)" + "'", str8, "(4, 0)");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "(4, 0)" + "'", str10, "(4, 0)");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
// flaky "133) test317(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |    2|    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str18, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |    2|    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
// flaky "8) test317(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
// flaky "15) test317(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        int int1 = board0.getScore();
        boolean boolean2 = board0.isLosingBoard();
        boolean boolean3 = board0.moveRight();
        boolean boolean4 = board0.moveUp();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell7 = board0.getCell((int) (byte) 0, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (0, 52) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky "16) test318(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        int int1 = board0.getScore();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean3 = board0.hasEmptyCells();
        boolean boolean4 = board0.moveUp();
        boolean boolean5 = board0.moveLeft();
        boolean boolean6 = board0.repOK();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky "3) test319(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        boolean boolean2 = board0.isLosingBoard();
        int int3 = board0.getScore();
        ar.edu.unrc.game2048.Board.Position position6 = new ar.edu.unrc.game2048.Board.Position(4, 0);
        int int7 = position6.row;
        java.lang.String str8 = position6.toString();
        int int9 = position6.col;
        java.lang.String str10 = position6.toString();
        boolean boolean12 = position6.equals((java.lang.Object) (short) 100);
        boolean boolean13 = board0.equals((java.lang.Object) boolean12);
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board();
        boolean boolean15 = board14.hasEmptyCells();
        java.lang.Object obj16 = null;
        boolean boolean17 = board14.equals(obj16);
        java.lang.String str18 = board14.toString();
        boolean boolean19 = board14.isFull();
        ar.edu.unrc.game2048.Board board20 = new ar.edu.unrc.game2048.Board(board14);
        boolean boolean21 = board0.equals((java.lang.Object) board20);
        boolean boolean22 = board20.isWinningBoard();
        boolean boolean23 = board20.isWinningBoard();
        boolean boolean24 = board20.hasEmptyCells();
        boolean boolean25 = board20.moveUp();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet26 = board20.getEmptyPositions();
        java.lang.Class<?> wildcardClass27 = board20.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "(4, 0)" + "'", str8, "(4, 0)");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "(4, 0)" + "'", str10, "(4, 0)");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
// flaky "134) test320(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str18, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
// flaky "17) test320(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
// flaky "5) test320(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(positionSet26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        java.lang.Object obj2 = null;
        boolean boolean3 = board0.equals(obj2);
        java.lang.String str4 = board0.toString();
        boolean boolean5 = board0.isWinningBoard();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean7 = board6.moveLeft();
        int int8 = board6.getScore();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board6);
        int int10 = board9.getSize();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "135) test321(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
// flaky "10) test321(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        java.lang.Object obj2 = null;
        boolean boolean3 = board0.equals(obj2);
        java.lang.String str4 = board0.toString();
        boolean boolean5 = board0.isWinningBoard();
        boolean boolean6 = board0.hasEmptyCells();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "136) test322(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(100);
        ar.edu.unrc.game2048.Cell cell4 = board1.getCell(1, 10);
        ar.edu.unrc.game2048.Cell cell7 = board1.getCell(0, 1);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet8 = board1.getEmptyPositions();
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertNotNull(cell7);
        org.junit.Assert.assertNotNull(positionSet8);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        java.lang.Object obj2 = null;
        boolean boolean3 = board0.equals(obj2);
        java.lang.String str4 = board0.toString();
        boolean boolean5 = board0.isWinningBoard();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean7 = board6.moveLeft();
        int int8 = board6.getScore();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board6);
        boolean boolean10 = board6.moveLeft();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "137) test324(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    4|     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    4|     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky "35) test324(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
// flaky "11) test324(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
// flaky "18) test324(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        boolean boolean2 = board0.isLosingBoard();
        int int3 = board0.getScore();
        boolean boolean4 = board0.repOK();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet7 = board6.getEmptyPositions();
        boolean boolean8 = board6.hasEmptyCells();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(positionSet7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.moveDown();
        boolean boolean2 = board0.repOK();
        boolean boolean3 = board0.moveUp();
// flaky "7) test326(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(2048);
    }
}
