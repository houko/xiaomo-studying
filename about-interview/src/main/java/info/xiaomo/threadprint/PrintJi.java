package info.xiaomo.threadprint;

import lombok.Data;

@Data
public class PrintJi implements Runnable {

    final Num num;

    int loopCount = 100;

    public PrintJi(Num num, int loopCount) {
        this.num = num;
        this.loopCount = loopCount;
    }

    public PrintJi(Num num) {
        this.num = num;
    }

    public void run() {
        while (num.i < loopCount) {
            synchronized (num) {
                if (num.flag) {
                    try {
                        num.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    System.out.println("奇数：" + num.i);
                    num.i++;
                    num.flag = true;
                    num.notify();
                }
            }
        }
    }
}
