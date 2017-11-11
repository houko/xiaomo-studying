package vote.impl;

import lombok.extern.slf4j.Slf4j;

/**
 * 把今天最好的表现当作明天最新的起点．．～
 * いま 最高の表現 として 明日最新の始発．．～
 * Today the best performance  as tomorrow newest starter!
 *
 * @author : xiaomo
 * github  : https://github.com/xiaomoinfo
 * email   : xiaomo@xiaomo.info
 * QQ      : 83387856
 * Date    : 2017/11/9 16:05
 * desc    :
 * Copyright(©) 2017 by xiaomo.
 */

@Slf4j
public class RepeatVoteState implements VoteState {
    @Override
    public void handle(String user, String voteItem) {
        log.info("请不要重复投票");
    }
}
