package p11_Threeuple;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] line1 = reader.readLine().split("\\s+");
        Threeuple<String, String, String> t1 =
                new Threeuple<String, String, String>(line1[0] + " " + line1[1], line1[2], line1[3]);

        String[] line2 = reader.readLine().split("\\s+");
        Threeuple<String, Integer, String> t2 =
                new Threeuple<String, Integer, String>(
                        line2[0],
                        Integer.valueOf(line2[1]),
                        line2[2].equals("drunk") ? "true" : "false");

        String[] line3 = reader.readLine().split("\\s+");
        Threeuple<String, Double, String> t3 =
                new Threeuple<>(line3[0], Double.valueOf(line3[1]), line3[2]);

        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
    }
}
