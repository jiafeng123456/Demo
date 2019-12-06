package com.example.time.test;

import java.math.BigDecimal;

/*
 *@description:
 *@author jiafeng
 *@date 2019/11/15 0015 08:55
 */
public class Redpack {
    public static void main(String[] args) {
        Integer remainSize = 100;
    }

    public static RedPackage  getRandomMoney(int remainSize, BigDecimal remainMoney) {
        // remainSize 剩余的红包数量
        // remainMoney 剩余的钱
        RedPackage redPackage = new RedPackage();
        if (remainSize == 1) {
            remainSize--;
            redPackage.setRemainSize(remainSize);
            redPackage.setRemainMoney(remainMoney.setScale(2,BigDecimal.ROUND_DOWN));
            return redPackage;
        }

        BigDecimal random = BigDecimal.valueOf(Math.random());
        BigDecimal min   = BigDecimal.valueOf(1.00);

        BigDecimal halfRemainSize = BigDecimal.valueOf(remainSize).divide(new BigDecimal(2), BigDecimal.ROUND_UP);
        BigDecimal max1 = remainMoney.divide(halfRemainSize, BigDecimal.ROUND_DOWN);
        BigDecimal minRemainAmount = min.multiply(BigDecimal.valueOf(remainSize - 1)).setScale(2, BigDecimal.ROUND_DOWN);
        BigDecimal max2 = remainMoney.subtract(minRemainAmount);
        BigDecimal max = (max1.compareTo(max2) < 0) ? max1 : max2;

        BigDecimal money = random.multiply(max).setScale(2, BigDecimal.ROUND_DOWN);
        money = money.compareTo(min) < 0 ? min: money;
        redPackage.setRemainMoney(money);
        return redPackage;
    }

    static class RedPackage {
        int    remainSize;
        BigDecimal remainMoney;

        public int getRemainSize() {
            return remainSize;
        }

        public void setRemainSize(int remainSize) {
            this.remainSize = remainSize;
        }

        public BigDecimal getRemainMoney() {
            return remainMoney;
        }

        public void setRemainMoney(BigDecimal remainMoney) {
            this.remainMoney = remainMoney;
        }
    }
}
