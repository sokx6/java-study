/*
2）2001年，美国国家气象服务(NWS)利用温度和风速计算新的风寒温度，来衡量寒冷程度。
计算公式如下所示:
Twc = 35.74 + 0.6215 * ta - 35.75 * v ** 0.16 + 0.4275 * ta * v ** 0.16，
其中:ta是室外的温度，以华氏度为单位; v是风的速度，以mph英里/每小时为单位，twc是风寒温度。
该公式不适用于风速低于2mph(mile/hour)，或温度在-58F(华氏度)以下或41F(华氏度)以上的情况。
编写程序，要求:
1.	用户在一行内输入室外温度（华氏度数）和风速（mph），用逗号隔开。
2.	如果温度不在[-58F,41F之间，或者风速小于2mph，显示为：温度为??，温度需要在 [-58F,41F]之间。风速为??，风速需大于等于2mph。程序结束。
3.	如果输入符合要求，计算风寒温度(保留小数点后2位)。显示为:温度为??，风速为??，风寒温度为??.??。程序结束。说明:输出的风寒温度，小数点后保留两位。
注意:无论输入如何，最后显示的信息均有:程序结束。
 */
import java.util.Scanner;

public class WeatherCalculator {
    double ta;
    double v;
    public void getTaAndV() {
        System.out.print("请输入室外温度和风速(逗号隔开):");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] inputs = input.split(",");
        ta = Double.parseDouble(inputs[0]);
        v = Double.parseDouble(inputs[1]);
        calculate();
    }
    public void calculate() {
        if (ta < -58 || ta > 41 || v < 2) {
            System.out.printf("温度为%.1f，温度需要在 [-58F,41F]之间。风速为%.1f，风速需大于等于2mph。程序结束。", ta, v);
        } else {
            double twc = 35.74 + 0.6215 * ta - 35.75 * Math.pow(v, 0.16) + 0.4275 * ta * Math.pow(v,0.16);
            System.out.printf("温度为%.1f，风速为%.1f，风寒温度为%.2f。程序结束。", ta, v, twc);
        }
    }
}
