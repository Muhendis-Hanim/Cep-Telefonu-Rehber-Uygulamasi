package com.company;

public class Kisi {
   private String isim;
    private  String  telNumara;

    public Kisi(String isim,String telNumara) {
        this.isim=isim;
        this.telNumara=telNumara;

    }

    public String getIsim() {
        return isim;
    }

    public String getTelNumara() {
        return telNumara;
    }

    public static Kisi olustur(String isim,String telNumara){
        return new Kisi(isim,telNumara);
    }
}
