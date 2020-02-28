package com.company;

import java.util.Scanner;

public class Main {
      private static   Scanner tara=new Scanner(System.in);
    public static void main(String[] args) {


	telefonuBaslat();
	menuyuGoster();
	boolean cikis=false;
	while (!cikis){
        System.out.println("SEÇİMİNİZ: (menüyü görmek için 5'e basınız");
        int secim=tara.nextInt();
        switch (secim){

            case 0:
                System.out.println("çıkış yapılıyor..");
                cikis=true;
                break;
            case 5:
                menuyuGoster();
                break;
            default:
                System.out.println("düzgün bir seçim yapınız.");
        }


    }

    }

    private static void telefonuBaslat() {
        System.out.println("telefon başlatılıyor..");
    }
    private static void menuyuGoster(){
        System.out.println("******Menu******");
        System.out.println("0 çıkış\n"
                            +"1 -- tüm kişileri listele\n"
                            +"2--yeni kişi ekle\n"
                            +"3--kişi güncelle\n"
                            +"4--kişi sil\n"
                            +"5-- menüyü göster");
    }
}
