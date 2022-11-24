package day35;

public class Kartal extends Hayvan implements Avci, Ucucu{

    @Override
    public void avlan() {
        System.out.println("Kartal avlaniyor.");
    }

    @Override
    public void uc() {
        System.out.println("Kartal ucuyor.");
    }
}
