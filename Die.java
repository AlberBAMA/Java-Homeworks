import java.util.Random;

public class Die {
    private int faces;
    private int value;

    // Faces num constructor and roll the dice
    public Die(int sidesN) {
        faces = sidesN;
        roll();
    }
    // Generate a random number for the faces
    public void roll() {
        Random rand = new Random();
        value = rand.nextInt(faces) + 1;
    }
    // Get the dice value
    public int getValue() {
        return value;
    }
}
