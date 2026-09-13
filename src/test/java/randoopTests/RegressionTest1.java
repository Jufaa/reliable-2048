package randoopTests;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

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
    public void test501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test501");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell((int) (short) 0);
        ar.edu.unrc.game2048.Cell cell2 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell3 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean4 = cell2.canMergeWith(cell3);
        boolean boolean5 = cell1.canMergeWith(cell2);
        boolean boolean6 = cell2.isEmpty();
        ar.edu.unrc.game2048.Cell cell7 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell8 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean9 = cell7.canMergeWith(cell8);
        ar.edu.unrc.game2048.Cell cell10 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell11 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean12 = cell10.canMergeWith(cell11);
        java.lang.Object obj13 = null;
        boolean boolean14 = cell11.equals(obj13);
        int int15 = cell11.getValue();
        boolean boolean16 = cell8.canMergeWith(cell11);
        ar.edu.unrc.game2048.Cell cell18 = new ar.edu.unrc.game2048.Cell((int) (short) 0);
        boolean boolean19 = cell8.canMergeWith(cell18);
        ar.edu.unrc.game2048.Cell cell20 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell21 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean22 = cell20.canMergeWith(cell21);
        int int23 = cell21.getValue();
        boolean boolean24 = cell21.isEmpty();
        boolean boolean25 = cell8.canMergeWith(cell21);
        ar.edu.unrc.game2048.Cell cell27 = new ar.edu.unrc.game2048.Cell((int) (byte) 0);
        boolean boolean28 = cell27.isEmpty();
        boolean boolean29 = cell8.canMergeWith(cell27);
        boolean boolean30 = cell2.equals((java.lang.Object) cell27);
        int int31 = cell2.getValue();
        ar.edu.unrc.game2048.Cell cell32 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell33 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell34 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean35 = cell33.canMergeWith(cell34);
        boolean boolean36 = cell33.isEmpty();
        boolean boolean37 = cell32.canMergeWith(cell33);
        ar.edu.unrc.game2048.Cell cell38 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int39 = cell38.getValue();
        java.lang.String str40 = cell38.toString();
        boolean boolean41 = cell32.canMergeWith(cell38);
        boolean boolean42 = cell32.isEmpty();
        ar.edu.unrc.game2048.Cell cell43 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell44 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean45 = cell43.canMergeWith(cell44);
        java.lang.Object obj46 = null;
        boolean boolean47 = cell44.equals(obj46);
        java.lang.String str48 = cell44.toString();
        boolean boolean50 = cell44.equals((java.lang.Object) (byte) 100);
        ar.edu.unrc.game2048.Cell cell51 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell52 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean53 = cell51.canMergeWith(cell52);
        java.lang.Object obj54 = null;
        boolean boolean55 = cell52.equals(obj54);
        ar.edu.unrc.game2048.Cell cell57 = new ar.edu.unrc.game2048.Cell((int) (byte) 0);
        boolean boolean58 = cell57.isEmpty();
        boolean boolean59 = cell52.canMergeWith(cell57);
        boolean boolean60 = cell44.canMergeWith(cell57);
        java.lang.String str61 = cell57.toString();
        boolean boolean62 = cell32.equals((java.lang.Object) cell57);
        boolean boolean63 = cell32.isEmpty();
        java.lang.Class<?> wildcardClass64 = cell32.getClass();
        boolean boolean65 = cell2.equals((java.lang.Object) wildcardClass64);
        ar.edu.unrc.game2048.Cell cell67 = new ar.edu.unrc.game2048.Cell((int) (byte) 0);
        int int68 = cell67.getValue();
        ar.edu.unrc.game2048.Cell cell69 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int70 = cell69.getValue();
        java.lang.String str71 = cell69.toString();
        ar.edu.unrc.game2048.Cell cell72 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell73 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean74 = cell72.canMergeWith(cell73);
        java.lang.Object obj75 = null;
        boolean boolean76 = cell73.equals(obj75);
        java.lang.String str77 = cell73.toString();
        boolean boolean79 = cell73.equals((java.lang.Object) (byte) 100);
        boolean boolean80 = cell73.isEmpty();
        boolean boolean81 = cell69.equals((java.lang.Object) cell73);
        boolean boolean82 = cell67.canMergeWith(cell69);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell83 = cell2.mergeWith(cell67);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: . and .");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cell2);
        org.junit.Assert.assertNotNull(cell3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(cell7);
        org.junit.Assert.assertNotNull(cell8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(cell10);
        org.junit.Assert.assertNotNull(cell11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(cell20);
        org.junit.Assert.assertNotNull(cell21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(cell32);
        org.junit.Assert.assertNotNull(cell33);
        org.junit.Assert.assertNotNull(cell34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(cell38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "." + "'", str40, ".");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(cell43);
        org.junit.Assert.assertNotNull(cell44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "." + "'", str48, ".");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(cell51);
        org.junit.Assert.assertNotNull(cell52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "." + "'", str61, ".");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(wildcardClass64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertNotNull(cell69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "." + "'", str71, ".");
        org.junit.Assert.assertNotNull(cell72);
        org.junit.Assert.assertNotNull(cell73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "." + "'", str77, ".");
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test502");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell1 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean2 = cell0.canMergeWith(cell1);
        int int3 = cell1.getValue();
        boolean boolean4 = cell1.isEmpty();
        boolean boolean5 = cell1.isEmpty();
        int int6 = cell1.getValue();
        ar.edu.unrc.game2048.Cell cell8 = new ar.edu.unrc.game2048.Cell(0);
        boolean boolean10 = cell8.equals((java.lang.Object) 10L);
        boolean boolean11 = cell1.canMergeWith(cell8);
        ar.edu.unrc.game2048.Cell cell13 = new ar.edu.unrc.game2048.Cell((int) (short) 0);
        ar.edu.unrc.game2048.Cell cell14 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell15 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean16 = cell14.canMergeWith(cell15);
        boolean boolean17 = cell13.canMergeWith(cell14);
        boolean boolean18 = cell14.isEmpty();
        ar.edu.unrc.game2048.Cell cell19 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell20 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean21 = cell19.canMergeWith(cell20);
        ar.edu.unrc.game2048.Cell cell22 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell23 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean24 = cell22.canMergeWith(cell23);
        java.lang.Object obj25 = null;
        boolean boolean26 = cell23.equals(obj25);
        int int27 = cell23.getValue();
        boolean boolean28 = cell20.canMergeWith(cell23);
        ar.edu.unrc.game2048.Cell cell30 = new ar.edu.unrc.game2048.Cell((int) (short) 0);
        boolean boolean31 = cell20.canMergeWith(cell30);
        ar.edu.unrc.game2048.Cell cell32 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell33 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean34 = cell32.canMergeWith(cell33);
        int int35 = cell33.getValue();
        boolean boolean36 = cell33.isEmpty();
        boolean boolean37 = cell20.canMergeWith(cell33);
        ar.edu.unrc.game2048.Cell cell39 = new ar.edu.unrc.game2048.Cell((int) (byte) 0);
        boolean boolean40 = cell39.isEmpty();
        boolean boolean41 = cell20.canMergeWith(cell39);
        boolean boolean42 = cell14.equals((java.lang.Object) cell39);
        ar.edu.unrc.game2048.Cell cell43 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell44 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell45 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean46 = cell44.canMergeWith(cell45);
        boolean boolean47 = cell44.isEmpty();
        boolean boolean48 = cell43.canMergeWith(cell44);
        ar.edu.unrc.game2048.Cell cell49 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int50 = cell49.getValue();
        java.lang.String str51 = cell49.toString();
        boolean boolean52 = cell43.canMergeWith(cell49);
        boolean boolean53 = cell49.isEmpty();
        ar.edu.unrc.game2048.Cell cell54 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int55 = cell54.getValue();
        java.lang.String str56 = cell54.toString();
        int int57 = cell54.getValue();
        boolean boolean58 = cell49.equals((java.lang.Object) cell54);
        boolean boolean59 = cell14.equals((java.lang.Object) cell54);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell60 = cell8.mergeWith(cell14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: . and .");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertNotNull(cell1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(cell14);
        org.junit.Assert.assertNotNull(cell15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(cell19);
        org.junit.Assert.assertNotNull(cell20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(cell22);
        org.junit.Assert.assertNotNull(cell23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(cell32);
        org.junit.Assert.assertNotNull(cell33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(cell43);
        org.junit.Assert.assertNotNull(cell44);
        org.junit.Assert.assertNotNull(cell45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(cell49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "." + "'", str51, ".");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(cell54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "." + "'", str56, ".");
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test503");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell1 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean2 = cell0.canMergeWith(cell1);
        ar.edu.unrc.game2048.Cell cell3 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell4 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean5 = cell3.canMergeWith(cell4);
        java.lang.Object obj6 = null;
        boolean boolean7 = cell4.equals(obj6);
        int int8 = cell4.getValue();
        boolean boolean9 = cell1.canMergeWith(cell4);
        ar.edu.unrc.game2048.Cell cell11 = new ar.edu.unrc.game2048.Cell((int) (short) 0);
        boolean boolean12 = cell1.canMergeWith(cell11);
        ar.edu.unrc.game2048.Cell cell14 = new ar.edu.unrc.game2048.Cell((int) (short) 0);
        ar.edu.unrc.game2048.Cell cell15 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell16 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean17 = cell15.canMergeWith(cell16);
        boolean boolean18 = cell14.canMergeWith(cell15);
        boolean boolean19 = cell1.canMergeWith(cell15);
        boolean boolean20 = cell15.isEmpty();
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertNotNull(cell1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cell3);
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(cell15);
        org.junit.Assert.assertNotNull(cell16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test504");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell((int) (short) 0);
        ar.edu.unrc.game2048.Cell cell2 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell3 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean4 = cell2.canMergeWith(cell3);
        boolean boolean5 = cell1.canMergeWith(cell2);
        boolean boolean6 = cell2.isEmpty();
        ar.edu.unrc.game2048.Cell cell7 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell8 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean9 = cell7.canMergeWith(cell8);
        ar.edu.unrc.game2048.Cell cell10 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell11 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean12 = cell10.canMergeWith(cell11);
        java.lang.Object obj13 = null;
        boolean boolean14 = cell11.equals(obj13);
        int int15 = cell11.getValue();
        boolean boolean16 = cell8.canMergeWith(cell11);
        ar.edu.unrc.game2048.Cell cell18 = new ar.edu.unrc.game2048.Cell((int) (short) 0);
        boolean boolean19 = cell8.canMergeWith(cell18);
        ar.edu.unrc.game2048.Cell cell20 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell21 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean22 = cell20.canMergeWith(cell21);
        int int23 = cell21.getValue();
        boolean boolean24 = cell21.isEmpty();
        boolean boolean25 = cell8.canMergeWith(cell21);
        ar.edu.unrc.game2048.Cell cell27 = new ar.edu.unrc.game2048.Cell((int) (byte) 0);
        boolean boolean28 = cell27.isEmpty();
        boolean boolean29 = cell8.canMergeWith(cell27);
        boolean boolean30 = cell2.equals((java.lang.Object) cell27);
        java.lang.String str31 = cell27.toString();
        org.junit.Assert.assertNotNull(cell2);
        org.junit.Assert.assertNotNull(cell3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(cell7);
        org.junit.Assert.assertNotNull(cell8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(cell10);
        org.junit.Assert.assertNotNull(cell11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(cell20);
        org.junit.Assert.assertNotNull(cell21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "." + "'", str31, ".");
    }
}

