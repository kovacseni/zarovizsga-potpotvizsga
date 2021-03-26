package hu.nive.ujratervezes.zarovizsga.countchars;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class DaVinciCode {

    public int encode(String file, char c) {
        if (c == '0' || c == '1' || c == 'x') {
            return decode(file, c);
        } else {
            throw new IllegalArgumentException("Not valid character!");
        }
    }

    private int decode(String file, char c) {
        try (BufferedReader br = Files.newBufferedReader(Path.of(file))) {
            return countChar(br, c);
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file.", ioe);
        }
    }

    private int countChar(BufferedReader br, char c) throws IOException {
        int count = 0;
        int nextChar;
        while ((nextChar = br.read()) != -1) {
            if ((char) nextChar == c) {
                count++;
            }
        }
        return count;
    }
}
