import ea.*;

public class Sample extends Game {
    private Maus meineMaus;
    private Bild box;
    private Bild background;
    
    public static void main(String[] args) {
        new Sample();
    }

    public Sample() {

        super(1920 , 1080,false);

        
        Bild mausBild = new Bild(60, 60, "mauszeiger.png");
        box = new Bild(10,10,"charakter.png");
        background = new Bild ("Background.png");
        Punkt hotspot = new Punkt(0, 0);
        meineMaus = new Maus(mausBild, hotspot, false, false);
        
        
        hintergrundSetzen(background);
        iconSetzen(box);
        wurzel.add(box);
        mausAnmelden(meineMaus);
    }

    @Override
    public void tasteReagieren(int code) {
        switch(code) {
            case Taste.W:   box.verschieben(+0, -10); break;
            case Taste.D: box.verschieben(+10, +0); break;
            case Taste.S:  box.verschieben(+0, +10); break;
            case Taste.A:  box.verschieben(-10, +0); break;
        }

    }    

    } 
