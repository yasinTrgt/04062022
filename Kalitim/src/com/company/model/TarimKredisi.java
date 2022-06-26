package com.company.model;

public class TarimKredisi extends KrediTurleri{

    @Override
    public double odenecekTutar() {
        return getKrediTutari() + (getKrediTutari()/getTaksitSayisi()) *getFaizOrani() *12L;
    }
}
