*/
*Ad Soyad: [ESMANUR ULU]
*Ogrenci No: [250541132]
*Tarih: [04.11.2025]
*Aciklama: [MaasHesap]
*/
import java.util.Scanner;

public class MaasHesap {
    // Sabit oranlar
    public static final double SGK_ORANI = 0.14;
    public static final double GELIR_VERGISI_ORANI = 0.15;
    public static final double DAMGA_VERGISI_ORANI = 0.00759;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Çalışanın Adı ve Soyadı: ");
        String adSoyad = input.nextLine();

        System.out.print("Aylık Brüt Maaş (TL): ");
        double brutMaas = input.nextDouble();

        System.out.print("Haftalık Çalışma Saati: ");
        int haftalikSaat = input.nextInt();

        System.out.print("Aylık Mesai Saati: ");
        int mesaiSaati = input.nextInt();

        // --- Hesaplamalar ---
        // 1. Toplam Gelir
        double mesaiUcreti = (brutMaas / 160) * mesaiSaati * 1.5;
        double toplamGelir = brutMaas + mesaiUcreti;

        // 2. Kesintiler
        double sgkKesintisi = toplamGelir * SGK_ORANI;
        double gelirVergisi = toplamGelir * GELIR_VERGISI_ORANI;
        double damgaVergisi = toplamGelir * DAMGA_VERGISI_ORANI;
        double toplamKesinti = sgkKesintisi + gelirVergisi + damgaVergisi;

        // 3. Net Maaş
        double netMaas = toplamGelir - toplamKesinti;

        // 4. İstatistikler
        double kesintiOrani = (toplamKesinti / toplamGelir) * 100;
        double saatlikNetKazanc = netMaas / (haftalikSaat * 4); // yaklaşık 4 hafta varsayımı
        double gunlukNetKazanc = netMaas / 22; // 22 iş günü varsayımı

        // --- Bordro Çıktısı ---
        System.out.println("\n======================================");
        System.out.println("         MAAŞ BORDROSU");
        System.out.println("======================================");
        System.out.printf("Çalışan: %-25s\n", adSoyad);
        System.out.println("--------------------------------------");
        System.out.printf("Aylık Brüt Maaş:        %10.2f TL\n", brutMaas);
        System.out.printf("Mesai Ücreti:            %10.2f TL\n", mesaiUcreti);
        System.out.printf("Toplam Gelir:            %10.2f TL\n", toplamGelir);
        System.out.println("--------------------------------------");
        System.out.printf("SGK Kesintisi (%%14):     %10.2f TL\n", sgkKesintisi);
        System.out.printf("Gelir Vergisi (%%15):     %10.2f TL\n", gelirVergisi);
        System.out.printf("Damga Vergisi (%%0.759):  %10.2f TL\n", damgaVergisi);
        System.out.printf("Toplam Kesinti:          %10.2f TL\n", toplamKesinti);
        System.out.println("--------------------------------------");
        System.out.printf("Net Maaş:                %10.2f TL\n", netMaas);
        System.out.println("--------------------------------------");
        System.out.printf("Kesinti Oranı:           %6.1f %%\n", kesintiOrani);
        System.out.printf("Saatlik Net Kazanç:      %10.2f TL\n", saatlikNetKazanc);
        System.out.printf("Günlük Net Kazanç:       %10.2f TL\n", gunlukNetKazanc);
        System.out.println("======================================");

        input.close();
    }
}

