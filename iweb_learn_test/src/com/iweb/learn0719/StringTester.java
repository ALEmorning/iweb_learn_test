package com.iweb.learn0719;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * String 的功能测试
 * @author Luck
 */
public class StringTester {
    public void test() throws UnsupportedEncodingException {
        String str = "abc";
        String st1 = "你好，你叫啥";
        int i = 1;

        //int  Integer
        //char Character
//        System.out.println(str.charAt(i));//通过数组可以精准查询第几位的字母
//        System.out.println((char) (str.charAt(i)-32));//大小写 英文字母之间 ASII码差32
//        System.out.println(Character.toUpperCase(str.charAt(i)));

//        System.out.println("123".equals(str));
//        System.out.println(str.compareTo("4321"));//英文字母同样可以进行比较

//        str.concat("def");
//        System.out.println(str);
//        System.out.println(str.concat("def"));

//        System.out.println(str.contains("ab"));//是否包含，只能找连续的

//        System.out.println(str.endsWith("c"));//检查以什么结尾，用来检查后缀名
//
//        System.out.println(str.startsWith("a"));//以什么开头，区分大小写

//        System.out.println(str.hashCode());//哈希码
//
//        System.out.println(str.getBytes(StandardCharsets.UTF_8));

        String str1 = new String(new char[]{'a','b','c'},0,2);

//        byte[] a = st1.getBytes();//默认utf-8形式，一个中文字符占3个字节
//        byte[] b = str.getBytes();
//        System.out.println(b.length);
//        System.out.println(a.length);
//        char[] ch = new char[1];
//        st1.getChars(0,ch.length,ch,0);//0 1 包前 不包后
//        System.out.println(new String(ch));
//        int idx = st1.indexOf('你');//无法找不连贯的
//        System.out.println(idx); //找第一个符合条件的值的下标位置
//
//        int ids = st1.lastIndexOf('你');
//        System.out.println(ids);

        String s = "asjkbduqiasdwasd";//不为空（起码有个空白）
        //没有内容 empty   ；没有对象   null
//        str.isEmpty();
//
//        str.length();//此处length为方法
//
//        s.replace('2','4');//不可修改，需要重新覆盖回去
//        s = s.replace('a','A');//可替换所有
//        System.out.println(s);

//        str = "苹果,1.25,100,30,78.2";
//        String[] types = str.split(",");//分割 标志
//        System.out.println(" "+types[0]);
//        str.split(s);

        str = "对不起";
        System.out.println(str.substring(0,2));//截取

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd-hh-mm-ss");
        String base =sdf.format(new Date());
        System.out.println(base);//输出精确到秒的时间

        Math.random();//0.0~1.0,小数点后面10位以上,double类型
        String back = String.valueOf(Math.random()).substring(2,11);
        System.out.println(back);//输出一个9位的随机数

        //可以用来组合生成订单号之类的唯一标志






    }

    public static void main( String[] args ) throws UnsupportedEncodingException {
        StringTester st = new StringTester();
        st.test();
    }
}
