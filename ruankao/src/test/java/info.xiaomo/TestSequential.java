package info.xiaomo;

import info.xiaomo.linklist.LinerList;
import info.xiaomo.linklist.Sequential;
import org.junit.Test;


public class TestSequential {

    @Test
    public void testSeq() throws Exception {
        LinerList seq = new Sequential(10);
        seq.insert(0, "xiaomo0");
        seq.insert(1, "xiaomo1");
        seq.insert(2, "xiaomo2");
        seq.insert(3, "xiaomo3");
        System.out.println("get: " + seq.get(1));
        seq.delete(2);
        seq.show();
    }
}
