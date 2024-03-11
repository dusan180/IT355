package org.example;

public class Kvadrat implements Oblik {
    private double stranica;

    public Kvadrat(double stranica) {
        this.stranica = stranica;
    }

    @Override
    public double obim() {
        return 4 * stranica;
    }

    @Override
    public double povrsina() {
        return stranica * stranica;
    }
}
