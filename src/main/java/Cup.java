public class Cup {
    public static void main(String[] args) {
        final int GLASS_VOLUME = 200;
        final double GLASS_FULL = 51.2;
        final double VOLUME_WATERS = (GLASS_VOLUME * GLASS_FULL) / 100;

        System.out.println("Объем стакана - " + GLASS_VOLUME + " мл.");
        System.out.println("Стакан заполнен в " + GLASS_FULL + "%");
        System.out.println("Сейчас в стакане " + VOLUME_WATERS + " мл. воды.");
    }
}