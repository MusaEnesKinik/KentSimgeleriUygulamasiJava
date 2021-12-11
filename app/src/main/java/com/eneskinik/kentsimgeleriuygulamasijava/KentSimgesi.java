package com.eneskinik.kentsimgeleriuygulamasijava;

import java.io.Serializable;

public class KentSimgesi implements Serializable {

    String isim;
    String ulke;
    int resim;

    //Constructor (bir sınıftan bir obje çagırılırken ilk oluşturulan method)

    public KentSimgesi(String isim, String ulke, int resim) {
        this.isim = isim;
        this.ulke = ulke;
        this.resim = resim;
    }

}
