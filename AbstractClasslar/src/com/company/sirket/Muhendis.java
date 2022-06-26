package com.company.sirket;

public class Muhendis extends Calisan implements ICalisan{

    private String departman;
    private double puantaj;
    private boolean bilgisayariVarMi;

    public Muhendis() {
        super();
    }

    @Override
    public String getAdi() {
        return super.getAd();
    }

    @Override
    public String getSoyadi() {
        return super.getSoyad();
    }

    public String getDepartman() {
        return departman;
    }

    public void setDepartman(String departman) {
        this.departman = departman;
    }

    public double getPuantaj() {
        return puantaj;
    }

    public void setPuantaj(double puantaj) {
        this.puantaj = puantaj;
    }

    public boolean isBilgisayariVarMi() {
        return bilgisayariVarMi;
    }

    public void setBilgisayariVarMi(boolean bilgisayariVarMi) {
        this.bilgisayariVarMi = bilgisayariVarMi;
    }


    @Override
    public String toString() {
        return "Muhendis{" +
                "departman='" + departman + '\'' +
                ", puantaj=" + puantaj +
                ", bilgisayariVarMi=" + bilgisayariVarMi +
                super.toString()+
                '}';
    }



    public String getTemelBilgiler() {

        return " AD: " + super.getAd() +"\n"+
                "SOYAD:  "+super.getSoyad();
    }

    @Override
    public boolean maasAlabilir() {

        return super.getMaas() > 0;
    }

    @Override
    public boolean bilgisayarKullanabilir() {
        return this.bilgisayariVarMi;
    }

    @Override
    public boolean aracKullanabilir() {
        return super.isServisKullanimDurumu();
    }
}
