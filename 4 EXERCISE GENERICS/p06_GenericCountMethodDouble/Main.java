package p06_GenericCountMethodDouble;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int countOfBoxes = Integer.parseInt(reader.readLine());

        List<Box<Double>> boxes = new ArrayList<>();

        while (countOfBoxes -- > 0){
            Double input = Double.valueOf(reader.readLine());

            Box<Double> box = new Box<>();
            box.setValue(input);

            boxes.add(box);
        }

        Box<Double> box = new Box<>();
        box.setValue(Double.valueOf(reader.readLine()));

        System.out.println(getCountOfGreaterElements(boxes, box));
    }

    private static <T extends Comparable<T>> int getCountOfGreaterElements(List<Box<T>> elements, Box<T> singleElement){
        return elements
                .stream()
                .filter(element -> element.compareTo(singleElement) > 0)
                .collect(Collectors.toList())
                .size();
    }
}
