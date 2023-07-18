package com.iweb.learn0717;
/*
*
* 该类为扑克牌类
* @author   luck
* @time     2023.7.17
 */
public class PokerCards {
    public String varity;//扑克牌花色
    public String number;//扑克牌数字

    public int level;//扑克牌对应大小

    public PokerCards(String varity,String number,int level){
        this.varity = varity;
        this.number = number;
        this.level = level;
    }
}
