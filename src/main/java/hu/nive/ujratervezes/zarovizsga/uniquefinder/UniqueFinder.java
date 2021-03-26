package hu.nive.ujratervezes.zarovizsga.uniquefinder;

import java.util.ArrayList;
import java.util.List;

public class UniqueFinder {

    public List<Character> uniqueChars(String str) {
        if (str == null) {
            throw new IllegalArgumentException();
        }
        char[] charsOfStr = str.toCharArray();
        List<Character> uniqueCharsOfStr = new ArrayList<>();
        for (char c : charsOfStr) {
            if (!uniqueCharsOfStr.contains(c)) {
                uniqueCharsOfStr.add(c);
            }
        }
        return uniqueCharsOfStr;
    }
}
