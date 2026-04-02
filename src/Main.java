public class Main {
    public static void main(String[] args) {
        WaterCalculator waterCalculator = new WaterCalculator();
        waterCalculator.getWaterAndPrice();
        waterCalculator.print();

        System.out.println();

        WeatherCalculator weatherCalculator = new WeatherCalculator();
        weatherCalculator.getTaAndV();

        System.out.println();

        Sigmod sigmod = new Sigmod();
        sigmod.getXAndCalculate();
    }
}
