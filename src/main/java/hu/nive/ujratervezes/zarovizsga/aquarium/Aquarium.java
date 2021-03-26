package hu.nive.ujratervezes.zarovizsga.aquarium;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Aquarium {

    private List<Fish> fishList = new ArrayList<>();

    public void addFish(Fish fish) {
        fishList.add(fish);
    }

    public void feed() {
        for (Fish f : fishList) {
            f.feed();
        }
    }

    public void removeFish() {
        for (Iterator<Fish> iter = fishList.iterator(); iter.hasNext(); ) {
            Fish nextFish = iter.next();
            if (nextFish.getWeight() >= 11) {
                iter.remove();
            }
        }
    }

    public List<String> getStatus() {
        List<String> result = new ArrayList<>();
        for (Fish f : fishList) {
            result.add(f.status());
        }
        return result;
    }
}
