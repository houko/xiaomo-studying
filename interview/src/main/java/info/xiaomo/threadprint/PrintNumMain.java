package info.xiaomo.threadprint;

/***
 * 线程交替打印
 */
public class PrintNumMain {
    public static void main(String[] args) {
        Num num = new Num();
        int loopCount = 5;
        PrintJi ji = new PrintJi(num, loopCount);
        PrintOu ou = new PrintOu(num, loopCount);

        Thread jiThread = new Thread(ji);
        Thread ouThread = new Thread(ou);
        jiThread.start();
        ouThread.start();


    }
}
