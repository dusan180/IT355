package com.metropolitan;

public class JednakostranicniTrougao implements Oblik {
    private double stranica;

    public JednakostranicniTrougao(double stranica) {
        this.stranica = stranica;
    }

    @Override
    public double obim() {
        return 3 * stranica;
    }

    @Override
    public double povrsina() {
        return (Math.sqrt(3) / 4) * stranica * stranica;
    }
}