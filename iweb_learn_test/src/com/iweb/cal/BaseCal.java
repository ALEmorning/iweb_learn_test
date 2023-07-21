package com.iweb.cal;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public final class BaseCal {
    public static final BigDecimal add(BigDecimal a,BigDecimal b){
        return a.add(b);
    }
    public static final BigDecimal subtract(BigDecimal a,BigDecimal b){
        return a.subtract(b);
    }
    public static final BigDecimal multiply(BigDecimal a,BigDecimal b){
        return a.multiply(b);
    }
    public static final BigDecimal divide(BigDecimal a,BigDecimal b){
        return a.divide(b,25,BigDecimal.ROUND_FLOOR);
    }


    public static final BigDecimal modulus(BigDecimal a, BigDecimal b) {
        return a.remainder(b);
    }

    public static final BigDecimal square(BigDecimal a) {
        return a.multiply(a);
    }

    public static final BigDecimal power(BigDecimal base, BigDecimal exponent) {

        double baseDouble = base.doubleValue();
        double exponentDouble = exponent.doubleValue();
        double resultDouble = Math.pow(baseDouble, exponentDouble);
        return BigDecimal.valueOf(resultDouble);

//        return base.pow(exponent.intValue(), new MathContext(25, RoundingMode.HALF_EVEN));
    }

    public static final BigDecimal factorial( BigDecimal n) {
        if (n.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("阶乘不支持负数！");
        }
        if (n.scale() > 0) {
            // 将小数部分舍去，取整数部分进行阶乘计算
            n = n.setScale(0, RoundingMode.DOWN);
        }
        BigDecimal result = BigDecimal.ONE;
        for (BigDecimal i = BigDecimal.valueOf(2); i.compareTo(n) <= 0; i = i.add(BigDecimal.ONE)) {
            result = result.multiply(i);
        }
        return result;
    }



}
