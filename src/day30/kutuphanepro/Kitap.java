package day30.kutuphanepro;

public class Kitap {
    private boolean gecerliMi;
    private String adi;
    private String yazari;
    private int sayfaAdedi;

    public Kitap(String adi, String yazari, int sayfaAdedi) {
        gecerliMi = true;
        setAdi(adi);
        setYazari(yazari);
        setSayfaAdedi(sayfaAdedi);
    }

    public Kitap() {
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        if (adi!=null & !adi.isEmpty()&!adi.isBlank()) {
            this.adi = adi;
        } else {
            gecerliMi=false;
            System.out.println("Adi bos olamaz");
        }
    }

    public String getYazari() {
        return yazari;
    }

    public void setYazari(String yazari) {
        if (yazari!=null & !yazari.isEmpty()&!yazari.isBlank()) {
            this.yazari = yazari;
        } else {
            gecerliMi=false;
            System.out.println("Yazari bos olamaz");
        }
    }

    public int getSayfaAdedi() {
        return sayfaAdedi;
    }

    public void setSayfaAdedi(int sayfaAdedi) {
        if (sayfaAdedi>0) {
            this.sayfaAdedi = sayfaAdedi;
        }else {
            gecerliMi = false;
            System.out.println("Sayfa adedi negatif olamaz.");
        }
    }

    public void kaydet() {
        if (gecerliMi) {
            System.out.println(this + " veritabanına kaydedildi.");
        }else {
            System.out.println("Kayit islemi basarisiz.");
        }
    }

    @Override
    public String toString() {
        return String.format("%s (%s : %d)",adi,yazari,sayfaAdedi);
    }
}
