package com.company.supermarket;

public class SuperMarketHesaplayici extends BaseSuperMarketHesaplayici{


    @Override
    public double ekmekHesapla(int ekmekAdedi) {
        return ekmekAdedi * 5;
    }

    @Override
    public double domatesHesapla(int domatesKilosu) {
        return domatesKilosu * 25;
    }


}
