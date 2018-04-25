package prog.prak;

import org.junit.Test;
import static org.junit.Assert.*;

public class ArrayInterleaveTest {
    @Test
    public void testInterleaveFreshResult() {
        int[] a = new int[]{1, 3, 5};
        int[] b = new int[]{2, 4, 6};
        int[] result;
        result = ArrayInterleave.interleave(a, new int[0]);
        if (result == a) fail("interleave soll ein neues Array zurückgeben");
        result = ArrayInterleave.interleave(new int[0], b);
        if (result == b) fail("interleave soll ein neues Array zurückgeben");
    }

    @Test
    public void testInterleaveEmptyEmpty() {
        assertArrayEquals(new int[0], ArrayInterleave.interleave(new int[0], new int[0]));
    }

    @Test
    public void testInterleaveEmptyA() {
        assertArrayEquals(new int[]{4, 5, 6}, ArrayInterleave.interleave(new int[0], new int[]{4, 5, 6}));
    }

    @Test
    public void testInterleaveEmptyB() {
        assertArrayEquals(new int[]{4, 5, 6}, ArrayInterleave.interleave(new int[]{4, 5, 6}, new int[0]));
    }

    @Test
    public void testInterleaveSameLength() {
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, ArrayInterleave.interleave(new int[]{1, 3, 5}, new int[]{2, 4, 6}));
    }

    @Test
    public void testInterleaveALonger() {
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, ArrayInterleave.interleave(new int[]{1, 3, 5}, new int[]{2, 4}));
    }

    @Test
    public void testInterleaveBLonger() {
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, ArrayInterleave.interleave(new int[]{1, 3}, new int[]{2, 4, 5}));
    }
}
