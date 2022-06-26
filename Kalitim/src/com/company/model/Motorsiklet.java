package com.company.model;

public class Motorsiklet extends Arac{

    private double emisyonOrani;
    private String zincirTipi;
    private double motorHacmi;
    private String seleTipi;
    private Long maximumHiz;


    @Override
    public void bilgiVer() {
        super.bilgiVer();
        System.out.println(this.motorHacmi + " " + this.maximumHiz);
    }

    public double getEmisyonOrani() {
        return emisyonOrani;
    }

    public void setEmisyonOrani(double emisyonOrani) {
        this.emisyonOrani = emisyonOrani;
    }

    public String getZincirTipi() {
        return zincirTipi;
    }

    public void setZincirTipi(String zincirTipi) {
        this.zincirTipi = zincirTipi;
    }

    public double getMotorHacmi() {
        return motorHacmi;
    }

    public void setMotorHacmi(double motorHacmi) {
        this.motorHacmi = motorHacmi;
    }

    public String getSeleTipi() {
        return seleTipi;
    }

    public void setSeleTipi(String seleTipi) {
        this.seleTipi = seleTipi;
    }

    public Long getMaximumHiz() {
        return maximumHiz;
    }

    public void setMaximumHiz(Long maximumHiz) {
        this.maximumHiz = maximumHiz;
    }
}
