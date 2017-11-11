package vote.impl;

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
public class NormalVoteState implements VoteState {
    @Override
    public void handle(String user, String voteItem) {
        System.out.println("恭喜你投票成功");
    }
}
