import ea.*;

public class Sample extends Game {
    public static void main(String[] args) {
        new Sample();
    }

    private Bild box = new Bild(10,10,"tomas.png");
    private Game g;
    public Sample() {
        super(1920 , 1080,true);

        box = new Bild(10,10,"tomas.png");

        wurzel.add(box);
    }

    @Override
    public void tasteReagieren(int code) {
        switch(code) {
            case Taste.OBEN:   box.verschieben(+0, -10); break;
            case Taste.RECHTS: box.verschieben(+10, +0); break;
            case Taste.UNTEN:  box.verschieben(+0, +10); break;
            case Taste.LINKS:  box.verschieben(-10, +0); break;
        }
    }    
}