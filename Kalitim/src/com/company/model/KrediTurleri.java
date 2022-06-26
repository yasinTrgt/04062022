package com.company.model;

public class KrediTurleri {

    private Long taksitSayisi;
    private boolean vadeFarkiVarMi;
    private double faizOrani;
    private double krediTutari;


    public double odenecekTutar() {

        return krediTutari + (krediTutari / taksitSayisi) * faizOrani * taksitSayisi;
    }

    public KrediTurleri() {
    }

    public Long getTaksitSayisi() {
        return taksitSayisi;
    }

    public void setTaksitSayisi(Long taksitSayisi) {
        this.taksitSayisi = taksitSayisi;
    }

    public boolean isVadeFarkiVarMi() {
        return vadeFarkiVarMi;
    }

    public void setVadeFarkiVarMi(boolean vadeFarkiVarMi) {
        this.vadeFarkiVarMi = vadeFarkiVarMi;
    }

    public double getFaizOrani() {
        return faizOrani;
    }

    public void setFaizOrani(double faizOrani) {
        this.faizOrani = faizOrani;
    }

    public double getKrediTutari() {
        return krediTutari;
    }

    public void setKrediTutari(double krediTutari) {
        this.krediTutari = krediTutari;
    }
}
