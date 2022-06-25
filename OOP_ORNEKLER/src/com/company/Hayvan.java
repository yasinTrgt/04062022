package com.company;

public class Hayvan {

    private int yas;
    private boolean cinsiyet;
    private String cinsi;
    private int ayakSayisi;
    private String ses;
    private String deriRengi;
    private boolean tuyDurumu;
    private boolean kanatDurumu;
    private String beslenmeSekli;

    public Hayvan() {
    }

    public Hayvan(int yas, boolean cinsiyet, String cinsi, int ayakSayisi, String ses, String deriRengi, boolean tuyDurumu, boolean kanatDurumu, String beslenmeSekli) {
        this.yas = yas;
        this.cinsiyet = cinsiyet;
        this.cinsi = cinsi;
        this.ayakSayisi = ayakSayisi;
        this.ses = ses;
        this.deriRengi = deriRengi;
        this.tuyDurumu = tuyDurumu;
        this.kanatDurumu = kanatDurumu;
        this.beslenmeSekli = beslenmeSekli;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public boolean isCinsiyet() {
        return cinsiyet;
    }

    public void setCinsiyet(boolean cinsiyet) {
        this.cinsiyet = cinsiyet;
    }

    public String getCinsi() {
        return cinsi;
    }

    public void setCinsi(String cinsi) {
        this.cinsi = cinsi;
    }

    public int getAyakSayisi() {
        return ayakSayisi;
    }

    public void setAyakSayisi(int ayakSayisi) {
        this.ayakSayisi = ayakSayisi;
    }

    public String getSes() {
        return ses;
    }

    public void setSes(String ses) {
        this.ses = ses;
    }

    public String getDeriRengi() {
        return deriRengi;
    }

    public void setDeriRengi(String deriRengi) {
        this.deriRengi = deriRengi;
    }

    public boolean isTuyDurumu() {
        return tuyDurumu;
    }

    public void setTuyDurumu(boolean tuyDurumu) {
        this.tuyDurumu = tuyDurumu;
    }

    public boolean isKanatDurumu() {
        return kanatDurumu;
    }

    public void setKanatDurumu(boolean kanatDurumu) {
        this.kanatDurumu = kanatDurumu;
    }

    public String getBeslenmeSekli() {
        return beslenmeSekli;
    }

    public void setBeslenmeSekli(String beslenmeSekli) {
        this.beslenmeSekli = beslenmeSekli;
    }

    @Override
    public String toString() {
        return "Hayvan{" +
                "yas=" + yas +
                ", cinsiyet=" + cinsiyet +
                ", cinsi='" + cinsi + '\'' +
                ", ayakSayisi=" + ayakSayisi +
                ", ses='" + ses + '\'' +
                ", deriRengi='" + deriRengi + '\'' +
                ", tuyDurumu=" + tuyDurumu +
                ", kanatDurumu=" + kanatDurumu +
                ", beslenmeSekli='" + beslenmeSekli + '\'' +
                '}';
    }
}
