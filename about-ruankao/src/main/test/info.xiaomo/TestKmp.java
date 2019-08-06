package info.xiaomo;

import info.xiaomo.kmp.KMP;
import org.junit.Test;

public class TestKmp {

    @Test
    public void testKmp(){
        KMP kmp = new KMP();
        String str = "BBC ABCDAB ABCDABCDABDE";
        String pattern = "ABCDABD";
        int position = kmp.kmp(str, pattern);
        System.out.println("匹配位置:" + position);
        String find = str.substring(position, position + pattern.length());
        System.out.println("结果验证: " + find + ":" + pattern + " => " + find.equals(pattern));
    }

}
