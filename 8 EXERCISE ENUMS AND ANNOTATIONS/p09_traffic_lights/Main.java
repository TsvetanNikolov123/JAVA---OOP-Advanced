package p09_traffic_lights;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] values = reader.readLine().split("\\s");

        Light[] lights = new Light[values.length];

        for (int i = 0; i < lights.length; i++) {
            lights[i] = Light.valueOf(values[i]);
        }

        int numberToChange = Integer.parseInt(reader.readLine());
        for (int i = 0; i < numberToChange; i++) {
            for (int j = 0; j < lights.length; j++) {
                lights[j] = lights[j].next();
                System.out.print(lights[j] + " ");
            }
            System.out.println();
        }
    }
}
