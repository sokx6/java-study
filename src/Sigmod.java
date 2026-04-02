/*
3）人工智能AI与大数据分析越米越受到人们的关注，神经网络模型的提出极大地推动了AI的快速发展。神经网络是一种模仿人类神经系统的计算模型，其通过对大量数据的学习和处理，实现了对于各种类别事物的识别、分类、预测等能力。
神经网络往往采用一种线性函数（例如，sigmoid函数）来处理接收到的信号，sigmoid函数的输入x和输出v之间的关系如下：
v =1/ (1+ exp(-x)
其中，exp（-x)是指e的-x次幂，e是目然对数
编写程序，输入任意x的值，计算并输出v的值，V的值保留两位小数，第三位小数四舍五入
 */

import java.util.Scanner;

public class Sigmod {
    double x;
    double v;
    public void getXAndCalculate(){
        System.out.print("请输入x的值：");
        Scanner sc = new Scanner(System.in);
        x = sc.nextDouble();
        calculateV();
        System.out.printf("v的值是: %.2f", v);
    }
    public void calculateV() {
        v = 1 / (1 + Math.exp(-x));
        System.out.printf("%.2f", v);
    }
}
