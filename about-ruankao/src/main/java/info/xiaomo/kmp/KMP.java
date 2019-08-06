package info.xiaomo.kmp;

public class KMP {


    /**
     * info.xiaomo.kmp 算法
     *
     * @param s s
     * @param pattern pattern
     * @return position
     */
    public int kmp(String s, String pattern) {
        int i = 0;
        int j = 0;
        int sLen = s.length();
        int pLen = pattern.length();

        int[] next = new int[pLen];

        getNext(pattern, next);

        while (i < sLen && j < pLen) {

            if (s.charAt(i) == pattern.charAt(j)) {
                i++;
                j++;
            } else {
                if (next[j] == -1) {
                    i++;
                    j = 0;
                } else {
                    j = next[j];
                }

            }

            if (j == pLen) {
                return i - j;
            }
        }
        return -1;
    }


    /**
     * 获取下一个next
     *
     * @param pattern pattern
     */
    private void getNext(String pattern, int[] next) {
        int j = 0;
        int k = -1;
        int len = pattern.length();
        next[0] = -1;

        while (j < len - 1) {
            if (k == -1 || pattern.charAt(k) == pattern.charAt(j)) {

                j++;
                k++;
                next[j] = k;
            } else {

                // 比较到第K个字符，说明p[0——k-1]字符串和p[j-k——j-1]字符串相等，而next[k]表示
                // p[0——k-1]的前缀和后缀的最长共有长度，所接下来可以直接比较p[next[k]]和p[j]
                k = next[k];
            }
        }
    }
}
