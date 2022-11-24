package day34.polymorfism;

public class Daire extends Sekil{
    private double yaricap;

    public Daire(double yaricap) {
        this.yaricap = yaricap;
    }

    public Daire() {
    }

    public double getYaricap() {
        return yaricap;
    }

    public void setYaricap(double yaricap) {
        this.yaricap = yaricap;
    }

    @Override
    public double alanHesapla() {
        return yaricap*yaricap*Math.PI;
    }

    @Override
    public double cevreHesapla() {
        return 2*yaricap*Math.PI;
    }
}
