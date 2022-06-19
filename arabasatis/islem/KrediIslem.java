package com.mehmetnuri.arabasatis.islem;

public class KrediIslem {

    private Double anaPara;
    private Double faizOrani;
    private Long taksit;


    //Anapara X Faiz oranıX Vade (gün) / 36500
    public Double faizHesapla() {

        return (anaPara * faizOrani * (30 * taksit) / 36500);
    }


    public Double getAnaPara() {
        return anaPara;
    }

    public void setAnaPara(Double anaPara) {
        this.anaPara = anaPara;
    }

    public Double getFaizOrani() {
        return faizOrani;
    }

    public void setFaizOrani(Double faizOrani) {
        this.faizOrani = faizOrani;
    }

    public Long getTaksit() {
        return taksit;
    }

    public void setTaksit(Long taksit) {
        this.taksit = taksit;
    }
}
