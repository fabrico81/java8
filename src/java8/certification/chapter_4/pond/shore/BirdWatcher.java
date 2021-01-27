package java8.certification.chapter_4.pond.shore;

/**
 * @author faber
 */

public class BirdWatcher {
    public void watchBird() {
        Bird bird = new Bird();
        bird.floatInWater(); // calling protected member
        System.out.println(bird.text); // calling protected member
    } }
