package info.xiaomo.threadprint;

import lombok.Data;

@Data
public class PrintOu implements Runnable {

    final Num num;

    public PrintOu(Num num) {
        this.num = num;
    }

    public void run() {
        while (num.i < 100) {
            synchronized (num) {
                if (!num.flag) {
                    try {
                        num.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    System.out.println("偶数：" + num.i);
                    num.i++;
                    num.flag = false;
                    num.notify();
                }
            }

        }
    }
}
