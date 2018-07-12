package p10_Tuple;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] line1 = reader.readLine().split("\\s+");
        Tuple<String, String> t1 = new Tuple<String, String>(line1[0] + " " + line1[1], line1[2]);

        String[] line2 = reader.readLine().split("\\s+");
        Tuple<String, Integer> t2 = new Tuple<String, Integer>(line2[0] , Integer.valueOf(line2[1]));

        String[] line3 = reader.readLine().split("\\s+");
        Tuple<Integer, Double> t3 = new Tuple<>(Integer.valueOf(line3[0]), Double.valueOf(line3[1]));

        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
    }
}
