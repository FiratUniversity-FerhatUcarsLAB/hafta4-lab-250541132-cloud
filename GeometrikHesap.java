import java.util.Scanner;
import java.lang.Math;
import java.text.DecimalFormat;

public class GeometrikHesap {

    private static final double PI = 3.14159;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("--- Geometrik Hesaplama Programı ---");
        System.out.print("Lütfen daire yarıçapını (r) giriniz: ");

        double yaricap = scanner.nextDouble();

        double yaricapKare = Math.pow(yaricap, 2);
        double yaricapKup = Math.pow(yaricap, 3);
        double daireAlani = PI * yaricapKare;
        double daireCevresi = 2 * PI * yaricap;
        double daireCapi = 2 * yaricap;
        double kureHacmi = (4.0 / 3.0) * PI * yaricapKup;
        double kureYuzeyAlani = 4 * PI * yaricapKare;
        String formatBaslik = "%-20s";
        String formatDeger = "%10s";

        System.out.println("\n--- Hesaplama Sonuçları (Yarıçap = " + df.format(yaricap) + ") ---");
        System.out.println("------------------------------------");

        System.out.printf(formatBaslik + formatDeger + "\n", "Daire Alanı:", df.format(daireAlani));
        System.out.printf(formatBaslik + formatDeger + "\n", "Daire Çevresi:", df.format(daireCevresi));
        System.out.printf(formatBaslik + formatDeger + "\n", "Daire Çapı:", df.format(daireCapi));
        System.out.printf(formatBaslik + formatDeger + "\n", "Küre Hacmi:", df.format(kureHacmi));
        System.out.printf(formatBaslik + formatDeger + "\n", "Küre Yüzey Alanı:", df.format(kureYuzeyAlani));

        System.out.println("------------------------------------");

        scanner.close();
    }
}
