package com.iweb.homework;

import java.util.Random;

/*
*
* 1 使用二维数组重新改造扑克牌的发牌程序
* 2 对玩家获得的牌进行由大到小的排序
* 3 撰写一个简单的程序用于录入用户信息，并展示出来，要有简单的功能菜单
 */
public class PokerGameWork {
    String[][] box = new String[54][];//全局变量，为一副扑克牌创建二维数组
    //为玩家创建手牌二维数组
    String[][] playA = new String[18][];
    String[][] playB = new String[18][];
    String[][] playC = new String[18][];

    public static void main( String[] args ) {
        PokerGameWork pw = new PokerGameWork();
        pw.createCards();//创建扑克牌，将其存入box
        pw.publisher();//发牌
        pw.showCards();//展示手牌

    }

    public void createCards(){//将所有牌存入二维数组
        int count = 0;
        for ( int i = 1 ;i<=13;i++ ){
            String cn = "";
            switch ( i ){
                case 1:
                    cn="A";
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
                    cn = i+"";
            }
            box[count++] = new String[] {"♠",cn};
            box[count++] = new String[] {"♥",cn};
            box[count++] = new String[] {"♣",cn};
            box[count++] = new String[] {"♦",cn};

        }
        box[52] = new String[] {"♥小王","66"};
        box[53] = new String[] {"♠大王","88"};


        for (int i = 0; i < box.length; i++) {
            System.out.print(box[i][0] + box[i][1] + "\t");
            if ((i + 1) % 4 == 0) {
                System.out.println();
            }
        }
    }

    public void publisher(){//将牌按照 A B C 的形式随机发放
        Random r = new Random();
        int t_idx = 0;
        while ( box.length > 0 ){
            int idx = r.nextInt(box.length);
            String[] card = box[idx];

            switch ( box.length % 3 ){//三个一组，模3计算
                case 0:
                    playA[t_idx]=card;
                    break;
                case 2:
                    playB[t_idx]=card;
                    break;
                case 1:// 1 为最后一个，因此1 结束后用户ID t_idx 加1
                    playC[t_idx]=card;
                    t_idx++;
                    break;
            }
            //将牌移除
            String[][] temp = new String[box.length-1][];//临时数组
            System.arraycopy(box,0,temp,0,idx);//拷贝前半牌组
            System.arraycopy(box,idx+1,temp,idx,temp.length-idx);//拷贝后半
            box = temp;//替换原box
        }
    }

    public void showCards(){
        sorter(playA);
        sorter(playB);
        sorter(playC);

        System.out.print("\nPlayerA: ");
        for(String[] every : playA) {
            System.out.print(every[0]+every[1]+"\t");
        }
        System.out.print("\nPlayerB: ");
        for(String[] every : playB) {
            System.out.print(every[0]+every[1]+"\t");
        }
        System.out.print("\nPlayerC: ");
        for(String[] every : playC) {
            System.out.print(every[0]+every[1]+"\t");
        }

    }

    public void sorter(String[][] player) {//对玩家手牌进行冒泡排序，降序排列
        for(int i = 0; i< player.length; i++) {
            for(int j = player.length - 1; j > 0; j--) {
                String[] c1 = player[j];
                String[] c2 = player[j-1];

                int a = covert(c1[1]);
                int b = covert(c2[1]);

                if(a > b) {
                    player[j] = c2;
                    player[j-1] = c1;
                }

            }
        }
    }

    public int covert(String value){//将牌组中二维数组的数字为取出，转换格式进行比较
        switch(value) {
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
