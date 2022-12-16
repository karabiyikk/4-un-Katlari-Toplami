package Donguler;
//Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden
// girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.

import java.util.Scanner;

public class Uygulama {
    public static void main(String[] args) {
        int i, toplam = 0;

        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Sayı Giriniz : ");
            i = input.nextInt();
            if (i % 4 == 0) {
                toplam += i;
            }
        } while (i % 2 == 0);
        System.out.println("Toplam : " + toplam);
    }
}
