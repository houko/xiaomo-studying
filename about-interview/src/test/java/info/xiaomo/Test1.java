package info.xiaomo;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Test1 {

    public int add(int a, int b) {
        return a + b;
    }

    public int reduce(int a, int b) {
        return a - b;
    }

    @Test
    public void t1() {
        assertEquals(3, add(1, 2));
    }

    @Test
    public void t2() {
        assertEquals(-1, reduce(1, 2));
    }
}
