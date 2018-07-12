package p01_GenericBox;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int countOfBoxes = Integer.parseInt(reader.readLine());

        List<Box<String>> boxes = new ArrayList<>();

        while (countOfBoxes-- > 0) {
            String input = reader.readLine();
            Box<String> box = new Box<>();
            box.setValue(input);
            boxes.add(box);
        }

        for (Box<String> box : boxes) {
            System.out.println(box);
        }
    }
}
