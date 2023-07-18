package com.iweb.learn0718;

import com.iweb.learn0717.PokerCards;

import java.util.Random;

/**
 * 根据PokerCards类声明对象完成扑克牌
 */
public class PokerByCards {
    public static void main( String[] args ) {
        PokerByCards pc = new PokerByCards();
        pc.create();
        pc.publish();
        pc.show();
    }

    PokerCards[] box = new PokerCards[54];//用来存储所有牌
    PokerCards[] p1 = new PokerCards[18];//玩家1
    PokerCards[] p2 = new PokerCards[18];//玩家2
    PokerCards[] p3 = new PokerCards[18];//玩家3

    /**
     * 创建牌
     */
    public void create() {
        int count = 0;
        for ( int i = 0; i < 13; i++ ) {
            String cn = "";
            int level = 0;
            switch ( i ) {
                case 0:             //A
                    cn = "A";
                    level = 15;
                    break;
                case 1:             //2
                    cn = "2";
                    level = 16;
                    break;
                case 10:            //J
                    cn = "J";
                    level = 11;
                    break;
                case 11:            //Q
                    cn = "Q";
                    level = 12;
                    break;
                case 12:            //K
                    cn = "K";
                    level = 13;
                    break;
                default:
                    cn = (i+1) + "";
                    level = (i+1);
            }
            box[count++] = new PokerCards("♠", cn,level);
            box[count++] = new PokerCards("♥", cn,level);
            box[count++] = new PokerCards("♣", cn,level);
            box[count++] = new PokerCards("♦", cn,level);
        }
        box[52] = new PokerCards("♠","小王",20);
        box[53] = new PokerCards("♠","大王",21);
        for ( PokerCards p : box ){
            System.out.println(p.varity+p.number+"\t\t"+p.level);
        }
    }
    /**
     * 分发牌
     */
    public void publish(){
        Random r = new Random();//取随机数
        int t_idx = 0;
        while ( box.length > 0 ) {
            int idx = r.nextInt(box.length);//牌盒中随机取一张
            PokerCards card = box[idx];

            switch ( box.length % 3 ) {//三个一组，模3计算
                case 0:
                    p1[t_idx] = card;
                    break;
                case 2:
                    p2[t_idx] = card;
                    break;
                case 1:// 1 为最后一个，因此1 结束后用户ID t_idx 加1
                    p3[t_idx] = card;
                    t_idx++;
                    break;
            }
            //将牌移除
            PokerCards[] temp = new PokerCards[box.length - 1];//临时数组
            System.arraycopy(box, 0, temp, 0, idx);//拷贝前半牌组
            System.arraycopy(box, idx + 1, temp, idx, temp.length - idx);//拷贝后半
            box = temp;//替换原pc
        }
    }
    /**
     * 展示牌
     */
    public void show(){
        sort(p1);
        sort(p2);
        sort(p3);
        System.out.print("\nPlayerA: ");
        for ( PokerCards p : p1 ) {
            System.out.print(p.varity + p.number + "  \t");
        }
        System.out.print("\nPlayerB: ");
        for ( PokerCards p : p2 ) {
            System.out.print(p.varity + p.number + "  \t");
        }
        System.out.print("\nPlayerC: ");
        for ( PokerCards p : p3 ) {
            System.out.print(p.varity + p.number + "  \t");
        }
    }
    /**
     * 对手牌排序
     */
    public void sort(PokerCards[] player){
        for ( int i = 0; i < player.length; i++ ) {
            for ( int j = 0; j < player.length - i -1; j++ ) {
                PokerCards p;

                PokerCards c1 = player[j];
                PokerCards c2 = player[j+1];

                if ( c1.level > c2.level ) {
                    p = player[j];
                    player[j] = player[j+1];
                    player[j + 1] = p;
                }
            }
        }
    }
}
