package radix;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import radix.StringRadixSorter;

import java.util.Vector;

import static org.junit.Assert.*;

public class StringRadixSorterTest {
    StringRadixSorter test1 = new StringRadixSorter();
    StringRadixSorter test2 = new StringRadixSorter();

    @Before
    public void setUp() throws Exception{
        Vector<String> arr1 = new Vector<>();
        arr1.add("js qffffq aa a");
        test1.load(arr1);

        Vector<String> arr2 = new Vector<>();
        arr2.add("sad 111 hf aaugfwu ajhakfakh");
        test2.load(arr2);
    }

    @After
    public void teatDown() throws Exception{
        test1.clear();
        test2.clear();
    }

    @Test
    public void getCategoryArray() {
        test1.doStep();
        Vector<String> arr1 = test1.getCategoryArray(29);
        String[] actual1 = new String[arr1.size()];
        String[] expected1 = {"js"};
        for(int i = 0; i < arr1.size(); i++){
            actual1[i] = arr1.elementAt(i);
        }
        assertArrayEquals(expected1, actual1);

    }

    @Test
    public void doStep() {
        while(test1.doStep() != 2){
        }
        String[] expected1 = {"a", "aa", "js", "qffffq"};
        String[] actual1 = new String[test1.getWorkingArray().size()];
        for(int i = 0; i < test1.getWorkingArray().size(); i++){
            actual1[i] = test1.getWorkingArray().elementAt(i);
        }
        assertArrayEquals(expected1, actual1);
    }
}