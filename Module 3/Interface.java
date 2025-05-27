interface Playable {
    void play();
}

class Guitar implements Playable {
    public void play() {
        System.out.println("Guitar is playing a melody.");
    }
}

class Piano implements Playable {
    public void play() {
        System.out.println("Piano is playing a harmony.");
    }
}

public class Interface {
    public static void main(String[] args) {
        Playable guitar = new Guitar();
        Playable piano = new Piano();

        guitar.play();
        piano.play();
    }
}