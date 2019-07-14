package radix;

import gui.Controller;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import java.util.Vector;

public class IntRadixSorterTest {
    private final Vector<Integer> test = new Vector<>();
    Controller control = new Controller();
    IntRadixSorter sort1  = new IntRadixSorter();


    @Before
    public void setUp() throws Exception {
        sort1.setController(control);
         Integer[] arr = {1, 23, 113, 8, 6};
        for(int i = 0; i < arr.length; i++)
            test.add(arr[i]);
        sort1.load(test);

    }

    @After
    public void tearDown() throws Exception {
        test.clear();
    }


    @Test
    public void getCategoryArray() {
        sort1.doStep();
        sort1.doStep();
        sort1.doStep();
        Vector<Integer> arr = sort1.getCategoryArray(3);
        Integer[] actual = new Integer[arr.size()];
        for(int i = 0; i < arr.size(); i++) {
            actual[i] = arr.elementAt(i);
        }
        Integer[] expected = {23, 113};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void doStep() {
        int actual = sort1.doStep();
        assertEquals(1, actual);
        actual = sort1.doStep();
        assertEquals(3, actual);
        while(sort1.doStep() != 2){

        }
        Integer[] expectedDigits = {1, 6, 8, 23, 113};
        Vector<Integer> workingArray = sort1.getWorkingArray();
        Integer[] actualDigits = new Integer[workingArray.size()];
        for(int i = 0; i < workingArray.size(); i++){
            actualDigits[i] = workingArray.elementAt(i);
        }
        assertArrayEquals(expectedDigits, actualDigits);
    }
}