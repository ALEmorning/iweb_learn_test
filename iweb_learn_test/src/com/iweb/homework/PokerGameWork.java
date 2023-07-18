package com.iweb.homework;

import com.iweb.learn0717.PokerCards;

import java.util.Random;

/*
 *
 * 1 使用二维数组重新改造扑克牌的发牌程序
 * 2 对玩家获得的牌进行由大到小的排序
 * 3 撰写一个简单的程序用于录入用户信息，并展示出来，要有简单的功能菜单
 */
public class PokerGameWork {
    PokerCards[] pc = new PokerCards[54];//所有牌的存储盒子
    PokerCards[] p1 = new PokerCards[18];//玩家1
    PokerCards[] p2 = new PokerCards[18];//玩家2
    PokerCards[] p3 = new PokerCards[18];//玩家3

    int i = 0;
//    String[][] box = new String[54][];//全局变量，为一副扑克牌创建二维数组
//    //为玩家创建手牌二维数组
//    String[][] playA = new String[18][];
//    String[][] playB = new String[18][];
//    String[][] playC = new String[18][];

    public static void main( String[] args ) {
        PokerGameWork pw = new PokerGameWork();
        pw.createCards();//创建扑克牌，将其存入pc
        pw.publisher();//发牌
        pw.showCards();//展示手牌
    }

    public void createCards() {//将所有牌存入二维数组
        int count = 0;
        for ( int i = 1; i <= 13; i++ ) {
            String cn = "";
            switch ( i ) {
                case 1:
                    cn = "A";
                    break;
                case 11:
                    cn = "J";
                    break;
                case 12:
                    cn = "Q";
                    break;
                case 13:
                    cn = "K";
                    break;
                default:
                    cn = i + "";
            }
            pc[count++] = new PokerCards("♠", cn,0);
            pc[count++] = new PokerCards("♥", cn,0);
            pc[count++] = new PokerCards("♣", cn,0);
            pc[count++] = new PokerCards("♦", cn,0);
//            box[count++] = new String[] {"♠",cn};
//            box[count++] = new String[] {"♥",cn};
//            box[count++] = new String[] {"♣",cn};
//            box[count++] = new String[] {"♦",cn};

        }
        pc[52] = new PokerCards("♥小王", "66",0);
        pc[53] = new PokerCards("♠大王", "88",0);
//        box[52] = new String[] {"♥小王","66"};
//        box[53] = new String[] {"♠大王","88"};


        for ( PokerCards p : pc ) {
            System.out.print(p.varity + p.number + "\t");
            i++;
            if ( (i) % 4 == 0 ) {
                System.out.println();
            }
        }
    }

    public void publisher() {//将牌按照 A B C 的形式随机发放
        Random r = new Random();
        int t_idx = 0;
        while ( pc.length > 0 ) {
            int idx = r.nextInt(pc.length);
            PokerCards card = pc[idx];

            switch ( pc.length % 3 ) {//三个一组，模3计算
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
            PokerCards[] temp = new PokerCards[pc.length - 1];//临时数组
            System.arraycopy(pc, 0, temp, 0, idx);//拷贝前半牌组
            System.arraycopy(pc, idx + 1, temp, idx, temp.length - idx);//拷贝后半
            pc = temp;//替换原pc
        }
    }

    public void showCards() {
        sorter(p1);
        sorter(p2);
        sorter(p3);

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

    public void sorter( PokerCards[] player ) {//对玩家手牌进行冒泡排序，降序排列
        for ( int i = 0; i < player.length; i++ ) {
            for ( int j = player.length - 1; j > 0; j-- ) {
                PokerCards p;
                int c1 = covert(player[j].number);
                int c2 = covert(player[j - 1].number);


                if ( c1 > c2 ) {
                    p = player[j];
                    player[j] = player[j - 1];
                    player[j - 1] = p;
                }

            }
        }
    }

    public int covert( String value ) {//将牌组中二维数组的数字为取出，转换格式进行比较
        switch ( value ) {
            case "A":
                return 14;
            case "2":
                return 15;
            case "J":
                return 11;
            case "Q":
                return 12;
            case "K":
                return 13;
            default:
                return Integer.parseInt(value);
        }
    }

}
