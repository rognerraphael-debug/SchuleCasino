import ea.*;

public class Sample extends Game {
    private Maus meineMaus;
    private Bild charakter;
    private Bild background;
    private Bild WASD_Schild;
    
    public static void main(String[] args) {
        new Sample();
    }

    public Sample() {

        super(1920 , 1080,false);

        
        Bild mausBild = new Bild(60, 60, "Bilder/mauszeiger.png");
        charakter = new Bild(10,10,"Bilder/charakter.png");
        background = new Bild ("Bilder/Background.png");
        WASD_Schild = new Bild(1800,10,"Bilder/WASD_Schild.png");
        Punkt hotspot = new Punkt(0, 0);
        meineMaus = new Maus(mausBild, hotspot, false, false);
        
        
        hintergrundSetzen(background);
        iconSetzen(charakter);
        wurzel.add(charakter);
        wurzel.add(WASD_Schild);
        mausAnmelden(meineMaus);
    }

    @Override
    public void tasteReagieren(int code) {
        switch(code) {
            case Taste.W:   charakter.verschieben(+0, -10); break;
            case Taste.D: charakter.verschieben(+10, +0); break;
            case Taste.S:  charakter.verschieben(+0, +10); break;
            case Taste.A:  charakter.verschieben(-10, +0); break;
        }

    }    

    } 
