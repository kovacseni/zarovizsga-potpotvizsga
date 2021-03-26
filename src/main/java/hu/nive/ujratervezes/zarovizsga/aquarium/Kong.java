package hu.nive.ujratervezes.zarovizsga.aquarium;

public class Kong extends Fish {

    public Kong(String name, int weight, String color) {
        super(name, weight, color);
        this.memoryLoss = false;
    }

    public void feed() {
        super.weight += 2;
    }
}
