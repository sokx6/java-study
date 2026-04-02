/*
1）某城市水价实行阶梯收费：
（1）每户每月用水量在10吨及以下，则每吨2.3元；
（2）超过10且小于等于25吨的部分：每吨2.8元：
（3）超过25吨的部分，每吨3.6元：
（4）另外，无论用多少吨水，每吨水再另外加收0.3元的污水处理费，
输人桌户桌月的用水量（整数触），计算孩缴的总费用。输出的水费保留1位小数
输出格式为：该户本月用水?？吨，应缴水费？？.？元
 */

import java.util.Scanner;

public class WaterCalculator {
    int water;
    double price;

    public WaterCalculator() {
        water = 0;
        price = 0;
        System.out.print("正在创建WaterCounter对象，接下来请输入水量:");
    }

    public void setWater(int water) {
        this.water = water;
    }

    public void calculate() {
        if (water <= 10) {
            price = water * 2.3;
        } else if (water <= 25) {
            price = (10 * 2) + (water - 10) * 2.8;
        } else {
            price = (10 * 2) + (25 - 10) * 2.8 + (water - 25) * 3.6;
        }
    }

    public void getWaterAndPrice() {
        Scanner sc = new Scanner(System.in);
        water = sc.nextInt();
        setWater(water);
        calculate();
    }
    public void print() {
        System.out.printf("该户本月用水%d吨，应缴水费%.1f元", water, price);
    }

}
