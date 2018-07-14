package pl.sda.tdd;

import org.jcp.xml.dsig.internal.dom.Utils;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;

import java.util.Arrays;
//import org.junit.Assert.assertEquals;
//import org.junit.Assert.assertNull;
import static org.junit.Assert.*;
import static junit.framework.TestCase.assertEquals;


public class MedianTest {
    private Median median;

    @Before
    public void setup() {
        this.median = new Median();
    }

    @Test
    public void shouldReturnNullWhenArrayEmpty() {
        int[] emptyArray = new int[0];
        assertNull(median.find(emptyArray));
    }

    @Test
    public void shouldReturnNullWhenArrayNull() {
        int[] emptyArray = new int[0];
        assertNull(median.find(null));
    }

    @Test
    public void shouldReturnNullWhenEvanArray() {
        int[] evenArray = {1, 2, 3, 4, 5, 6};
        assertEquals(Integer.valueOf(3), median.find(evenArray));
    }

    @Test
    public void shouldReturnElementWhenOddArray() {
        int[] oddArray = {1, 2, 3, 4, 5};
        assertEquals(Integer.valueOf(3), median.find(oddArray));
    }
}