package day35;

public class Aslan extends Hayvan implements Avci, Yuzucu{

    @Override
    public void avlan() {
        System.out.println("Aslan avlaniyor.");
    }

    @Override
    public void yuz() {
        System.out.println("Aslan yüzüyor.");
    }
}
