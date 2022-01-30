import java.util.Scanner;

public class usluSayiHesapla {
    public static void main(String[] args) {
        double n, r, total = 1;

        Scanner data = new Scanner(System.in);

        System.out.print("Üssü alınacak sayıyı giriniz :");
        n = data.nextInt();
        System.out.print("Üs değerini giriniz :");
        r = data.nextInt();

        if (r < 0) {
            for (int i = -1; i >= r; i--) {
                total *= n;
            }
            System.out.println("Sonuç :" + 1 / total);
        } else {
            for (int i = 1; i <= r; i++) {
                total *= n;
            }
            System.out.println("Sonuç :" + total);
        }
    }
}
