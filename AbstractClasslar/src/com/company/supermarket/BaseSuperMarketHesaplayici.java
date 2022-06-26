package com.company.supermarket;

public abstract class BaseSuperMarketHesaplayici {

    public double sutHesapla(int sutLitresi) {
        return sutLitresi * 3;
    }
    public abstract double ekmekHesapla(int ekmekAdedi);

    public abstract double domatesHesapla(int domatesKilosu);
}
