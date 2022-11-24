package day35;

public class KopekBaligi extends Hayvan implements Avci, Yuzucu{

    @Override
    public void avlan() {
        System.out.println("Köpekbaligi avlaniyor");
    }

    @Override
    public void yuz() {
        System.out.println("Köpekbaligi yüzüyor.");
    }
}
