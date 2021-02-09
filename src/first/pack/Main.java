package first.pack;

public class Main {
    public static void main(String[] args) {

        Rogue rogue = new Rogue(36);
        rogue.steer(45);
        rogue.accelerate(30);
        rogue.accelerate(20);
        rogue.accelerate(-43);
    }
}
