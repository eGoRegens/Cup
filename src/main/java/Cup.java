public class Cup {
    public static void main(String[] args) {
        final int Glass_Volume_Milliliters = 200;
        final double  Glass_Full = 51.2;
        double volumeWater = (Glass_Volume_Milliliters * Glass_Full) / 100;

        System.out.println("Объем стакана - " + Glass_Volume_Milliliters + " мл.");
        System.out.println("Стакан заполнен в " + Glass_Full + "%");
        System.out.println("Сейчас в стакане " + volumeWater + " мл воды.");
    }
}