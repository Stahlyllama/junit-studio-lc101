package test;

import main.BonusBinarySearch;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public  class BonusBinarySearchTest {


    @Test
    public void intInArrayReturnsIndex(){
        int[] sortedArr = {3, 5, 7, 23, 45};
        assertEquals(3, BonusBinarySearch.binarySearch(sortedArr, 23));

    }

}
