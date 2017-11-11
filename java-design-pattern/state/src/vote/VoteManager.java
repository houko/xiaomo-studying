package vote;

import vote.impl.NormalVoteState;
import vote.impl.RepeatVoteState;
import vote.impl.SpiteVoteState;
import vote.impl.VoteState;

import java.util.HashMap;
import java.util.Map;

/**
 * 把今天最好的表现当作明天最新的起点．．～
 * いま 最高の表現 として 明日最新の始発．．～
 * Today the best performance  as tomorrow newest starter!
 *
 * @author : xiaomo
 * github  : https://github.com/xiaomoinfo
 * email   : xiaomo@xiaomo.info
 * QQ      : 83387856
 * Date    : 2017/11/9 16:02
 * desc    :
 * Copyright(©) 2017 by xiaomo.
 */
public class VoteManager {
    private static VoteManager ourInstance = new VoteManager();

    private VoteState voteState = null;

    private Map<String, String> voteMap = new HashMap<>();

    private Map<String, Integer> mapVoteCount = new HashMap<>();

    private VoteManager() {
    }

    public static VoteManager getInstance() {
        return ourInstance;
    }

    /**
     * 每次投票之后检测状态
     *
     * @param user     user
     * @param voteItem voteItem
     */
    public void vote(String user, String voteItem) {
        Integer count = mapVoteCount.get(user);
        if (count == null) {
            count = 0;
        }
        count += 1;
        mapVoteCount.put(user, count);

        checkState(count);

        // 执行对应状态的操作
        voteState.handle(user, voteItem);
    }

    /**
     * 修改状态
     *
     * @param count count
     */
    private void checkState(Integer count) {
        int one = 1;
        int five = 5;
        int eight = 8;
        if (count == one) {
            voteState = new NormalVoteState();
        } else if (count >= one && count <= five) {
            voteState = new RepeatVoteState();
        } else if (count >= five && count <= eight) {
            voteState = new SpiteVoteState();
        }
    }


    public void cancelVote(String user) {
        voteMap.remove(user);
        System.out.println("恭喜你投票成功！");
    }

}
