package info.xiaomo.rental.util;

/**
 * 服务器配置
 *
 * @author Administrator
 */
public class IDUtil {

    /**
     * 2017年1月1日0点整
     */
    public static final long TIME_MILLS_2017_4_1_0_0_0_0 = 1483200000000L;
    /**
     * 计数器
     */
    private static int id = 0;

    /**
     * 当前秒数
     */
    private static long curSec = getTimeStampFrom20170101();

    /**
     * 锁对象
     */

    private final static Object OBJ = new Object();

    /**
     * 获取一个唯一ID ID 是一个64位long 19位服务器id + 29位时间秒数 + 16位自增ID.
     * <p>
     * 1、服务器id出掉符号位以后实际使用18位，如果用到19位，那么生产出来的id会为负数,id允许负数最大支持524287个服务器，否则减半<br/>
     * 2、29位秒数最多支持约20年
     * </p>
     * <p>
     * 生成规则：<br/>
     * 1、服务器id不变 <br/>
     * 2、时间随着当前时间更新<br/>
     * 3、自增id如果从1到65000后，ID复位，此时需要时间增1防止重复<br/>
     * 4、自增后的时间小于了当前时间，那么就更新当前时间<br/>
     * </p>
     *
     * @return
     */
    public static long getId() {
        int nowId;
        long nowCurSec = getTimeStampFrom20170101();
        synchronized (OBJ) {
            // ID增1
            id += 1;
            // 当前ID赋值id
            nowId = id;

            int max = 65535;
            if (id > max) {
                // 如果ID大于65535 这里其实是 2的16次方 = 65535 因为自增ID只能占16位，所以不能超过65000
                // ID大于65535后id复位，如果时间不增1，那么将会产生重复
                id = 0;
                // 每过65000当前秒数就增1
                curSec += 1L;
            }

            if (nowCurSec > curSec) {
                // 自增后的时间小于了当前时间，那么就更新自增时间为当前时间
                curSec = nowCurSec;
            } else {
                // 自增时间大于当前时间（这种情况在id获取速度过快，1秒中内获取了额超过65535个id的时候会出现），那么就以自增时间为准
                nowCurSec = curSec;
            }
        }
        return (1 & 0x7_FFFFL) << 45 | (nowCurSec << 16) | (nowId & 0xFFFF);
    }


    /**
     * 获取基于2017年1月1日0点整的时间秒数
     *
     * @return long 秒数
     */
    private static long getTimeStampFrom20170101() {
        return (System.currentTimeMillis() - TIME_MILLS_2017_4_1_0_0_0_0) / 1000L;
    }


}