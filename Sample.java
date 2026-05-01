import ea.*;

public class Sample extends Game {
    private Maus meineMaus;
    private Bild box;
    
    public static void main(String[] args) {
        new Sample();
    }

    public Sample() {

        super(1920 , 1080,false);

        
        Bild mausBild = new Bild(60, 60, "mauszeiger.png");
        box = new Bild(10,10,"charakter.png");
        Punkt hotspot = new Punkt(0, 0);
        meineMaus = new Maus(mausBild, hotspot, false, false);
        
        iconSetzen(box);
        wurzel.add(box);
        mausAnmelden(meineMaus);
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
