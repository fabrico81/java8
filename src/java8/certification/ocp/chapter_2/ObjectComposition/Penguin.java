package java8.certification.ocp.chapter_2.ObjectComposition;

public class Penguin {

    private WebbedFeet webbedFeet;
    private Flipper flipper;

    Penguin(){
        this.webbedFeet = new WebbedFeet();
        this.flipper = new Flipper();
    }

    public void flap() {
        this.flipper.flap();
    }

    public void kick() {
        this.webbedFeet.kick();
    }
}
