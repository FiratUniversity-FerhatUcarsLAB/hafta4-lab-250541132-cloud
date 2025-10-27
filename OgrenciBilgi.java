import java.util.Scanner;

public class OgrenciBilgi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Adınızı giriniz: ");
        String ad = input.nextLine();

        System.out.print("Soyadınızı giriniz: ");
        String soyad = input.nextLine();

        System.out.print("Oğrenci numaranızı giriniz: ");
        int numara = input.nextInt();

        System.out.print("Yasinizi giriniz: ");
        int yas = input.nextInt();

        System.out.print("GPA (0.00-4.00): ");
        double gpa = input.nextDouble();

        System.out.printf("Adı %s\n:" ,ad);
        System.out.printf("Soyad %s\n:" ,soyad);
        System.out.printf("Numara %d:\n" ,numara);
        System.out.printf("Yas %d:\n" ,yas);
        System.out.printf("GPA %.2f\n" ,gpa);
    }
}

