package com.iweb.learn0714;
/*
*
* 扑克牌形式的数组测试
* @time 2023.7.14
 */


import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PokerGame {
    public void CreateCard(){
        String[] suits = {"♠", "♥", "♣", "♦"};
        String[] ranks = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};

        int numSuits = suits.length;
        int numRanks = ranks.length;

        int count = 0; // 计数器

        for (int suitIndex = 0; suitIndex < numSuits; suitIndex++) {
            for (int rankIndex = 0; rankIndex < numRanks; rankIndex++) {
                System.out.print(suits[suitIndex] + ranks[rankIndex] + " ");
                count++;

                if (count >= numRanks * (numSuits - 1)) {
                    break;
                }

                if (count % numRanks == 0) {
                    System.out.println();
                }

                if (count == numRanks * (numSuits - 1)) {
                    System.out.println(suits[numSuits - 1] + "Joker");
                }
            }
        }
    }

    public void CreateCardA(){
        String[] box = new String[54];
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
            box[count++] = "♥" + cn;
            box[count++] = "♣" + cn;
            box[count++] = "♦" + cn;
            box[count++] = "♠" + cn;

            if (count % 4 == 0) {
                System.out.println(box[count - 4] + "\t" + box[count - 3] + "\t" + box[count - 2] + "\t" + box[count - 1]);
            }
        }
        box[52] = "♥Joker";
        box[53] = "♠Joker";

        // 输出剩余的大小王
        System.out.println(box[52] + "\t" + box[53]);


        //在已有扑克牌中，将牌分发给三个用户，以 ABC,ABC轮巡的方式分发
        List<String> pokerList = Arrays.asList(box);

        // 打乱牌的顺序
        Collections.shuffle(pokerList);

// 将列表转换回数组
        pokerList.toArray(box);

        String[] users = {"A", "B", "C"};
        int numUsers = users.length;
        int numCardsPerUser = 18;

        // 分发扑克牌给用户
        for (int i = 0; i < numCardsPerUser; i++) {
            for (int j = 0; j < numUsers; j++) {
                String card = box[i * numUsers + j];
                String user = users[j];
                System.out.println("将牌 " + card + " 分发给用户 " + user);
            }
        }
        // 输出 A、B、C 三人的牌面
        for (int i = 0; i < numUsers; i++) {
            StringBuilder cards = new StringBuilder();
            for (int j = 0; j < numCardsPerUser; j++) {
                String card = box[i * numCardsPerUser + j];
                cards.append(card).append(" ");
            }
            System.out.println(users[i] + "的牌面为：" + cards.toString());
        }


    }

    public static void main(String[] args){
        PokerGame pg = new PokerGame();
        pg.CreateCardA();
    }
}
