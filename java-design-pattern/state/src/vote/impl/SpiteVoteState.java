package vote.impl;

import vote.VoteManager;

/**
 * 把今天最好的表现当作明天最新的起点．．～
 * いま 最高の表現 として 明日最新の始発．．～
 * Today the best performance  as tomorrow newest starter!
 *
 * @author : xiaomo
 * github  : https://github.com/xiaomoinfo
 * email   : xiaomo@xiaomo.info
 * QQ      : 83387856
 * Date    : 2017/11/9 16:06
 * desc    :
 * Copyright(©) 2017 by xiaomo.
 */
public class SpiteVoteState implements VoteState {
    @Override
    public void handle(String user, String voteItem) {
        System.out.println("恶意刷票，取消投票资格");
        VoteManager.getInstance().cancelVote(user);
    }
}
