package com.company;

import java.util.ArrayList;

public class CepTelefonuRehber {
    private ArrayList<Kisi> rehber;
    private String kendinumaram;
    public CepTelefonuRehber(String kendinumaram){
        this.kendinumaram=kendinumaram;
        this.rehber=new ArrayList<>();
    }
    public boolean ekleYeniKisi(Kisi yeniKisi){
        if (kisiBul(yeniKisi.getIsim())>=0){
            System.out.println(yeniKisi.getIsim()+" değeri zaten rehberde var");
        return false;
        }

        this.rehber.add(yeniKisi);
        return true;
    }
    public int kisiBul(Kisi aranacakKisi){
        return this.rehber.indexOf(aranacakKisi);
    }
    public int kisiBul(String isim){
        for (int i=0;i<this.rehber.size();i++){
            Kisi oAnkiKisiNesnesi=this.rehber.get(i);
            if (oAnkiKisiNesnesi.getIsim().equals(isim)){
                return i;
            }
        }
        return -1;
    }

}
