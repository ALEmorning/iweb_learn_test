package com.iweb.learn0715;
/*
* 通过数组的拷贝实现
* 扑克牌游戏测试进阶版
* @time  2023.7.15
 */

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class PokerGames {
    String[] box = new String[54];
    //发牌
    String[] playA = new String[18];
    String[] playB = new String[18];
    String[] playC = new String[18];
    public void CreateCardA(){
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
        box[52] = "♥小王";
        box[53] = "♠大王";

        // 输出剩余的大小王
        System.out.println(box[52] + "\t" + box[53]);


//        //在已有扑克牌中，将牌分发给三个用户，以 ABC,ABC轮巡的方式分发
//        List<String> pokerList = Arrays.asList(box);
//
//        // 打乱牌的顺序
//        Collections.shuffle(pokerList);
//
//        // 将列表转换回数组
//        pokerList.toArray(box);
//
//        String[] users = {"A", "B", "C"};
//        int numUsers = users.length;
//        int numCardsPerUser = 18;
//
//        // 分发扑克牌给用户
//        for (int i = 0; i < numCardsPerUser; i++) {
//            for (int j = 0; j < numUsers; j++) {
//                String card = box[i * numUsers + j];
//                String user = users[j];
//                System.out.println("将牌 " + card + " 分发给用户 " + user);
//            }
//        }
//        // 输出 A、B、C 三人的牌面
//        for (int i = 0; i < numUsers; i++) {
//            StringBuilder cards = new StringBuilder();
//            for (int j = 0; j < numCardsPerUser; j++) {
//                String card = box[i * numCardsPerUser + j];
//                cards.append(card).append(" ");
//            }
//            System.out.println(users[i] + "的牌面为：" + cards.toString());
//        }


    }
    public void Publish(){
        Random r = new Random();
        int t_idx = 0;
        while ( box.length > 0 ){
           int idx = r.nextInt(box.length);
           String card = box[idx];

           switch ( box.length % 3 ){
               case 0:
                   playA[t_idx]=card;
                   break;
               case 2:
                   playB[t_idx]=card;
                   break;
               case 1:
                   playC[t_idx]=card;
                   t_idx++;
                   break;
           }
           //将牌移除
           String[] temp = new String[box.length-1];
           System.arraycopy(box,0,temp,0,idx);
           System.arraycopy(box,idx+1,temp,idx,temp.length-idx);
           box = temp;
        }



    }

    public void ShowCards(){
        System.out.print("PlayA: ");
        for ( String every : Arrays.asList(playA) ){
            System.out.print("   "+every);
        }
        System.out.print("\nPlayB: ");
        for ( String every : Arrays.asList(playB) ){
            System.out.print("   "+every);
        }
        System.out.print("\nPlayC: ");
        for ( String every : Arrays.asList(playC) ){
            System.out.print("   "+every);
        }
    }

    public static void main(String[] args){
        PokerGames pg = new PokerGames();
        pg.CreateCardA();
        //发牌
        pg.Publish();

        //ShowCards
        pg.ShowCards();




    }
}
