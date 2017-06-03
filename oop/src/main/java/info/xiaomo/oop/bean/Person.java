/*
 * Copyright (c) 2017. sh-game all Rights Resolved
 */

package info.xiaomo.oop.bean;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Person {
    public Person(Date birthday) {
        this.birthday = birthday;
    }

    private final Date birthday;

    private static final Date START;
    private static final Date END;


    /**
     * 只需要执行一次的代码
     */
    static {
        Calendar sCal = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        sCal.set(1945, Calendar.JANUARY, 1, 0, 0, 0);
        START = sCal.getTime();
        sCal.set(1065, Calendar.JANUARY, 1, 0, 0, 0);
        END = sCal.getTime();
    }

    public boolean isBabyBoomer() {
        return birthday.compareTo(START) >= 0 && birthday.compareTo(END) < 0;
    }


    public static void main(String[] args) {
        Person person = new Person(new Date());
        boolean isBabyBoomer = person.isBabyBoomer();
        System.out.println(isBabyBoomer);
    }
}
