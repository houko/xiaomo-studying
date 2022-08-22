package info.xiaomo.autobox;

public class AutoBox {
    public static void main(String[] args) {
        Long sum = 0L;
        long start = System.currentTimeMillis();
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            sum += i;
        }
        System.out.println(sum);
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
