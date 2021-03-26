package hu.nive.ujratervezes.zarovizsga.aquarium;

public class Clownfish extends Fish {

    public Clownfish(String name, int weight, String color) {
        super(name, weight, color);
        this.memoryLoss = false;
    }

    public void feed() {
        super.weight += 1;
    }
}
