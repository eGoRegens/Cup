package Cup;

public class CupLiquid {
    public static void main(String[] args) {
        final int glassVolumeMilliliters = 200;
        final double glassFull = 51.2;

        final double volumeWater = (glassVolumeMilliliters * glassFull) / 100;

        System.out.println("Объем стакана - " + glassVolumeMilliliters + " мл.");
        System.out.println("Стакан заполнен в " + glassFull + "%");
        System.out.println("Сейчас в стакане " + volumeWater + " мл. воды.");
    }
}