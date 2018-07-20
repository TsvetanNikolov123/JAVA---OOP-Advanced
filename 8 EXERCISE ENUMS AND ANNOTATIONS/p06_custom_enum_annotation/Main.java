package p06_custom_enum_annotation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static final String OUTPUT = "Type = %s, Description = %s";
    private static final String RANK_TYPE = "Rank";
    private static final String SUIT_TYPE = "Suit";

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String input = reader.readLine();

        if (RANK_TYPE.equals(input)) {
            Class<Rank> rankClass = Rank.class;
            printCustomEnumAnnotation(rankClass);
        } else if (SUIT_TYPE.equals(input)) {
            Class<Suit> suitClass = Suit.class;
            printCustomEnumAnnotation(suitClass);
        }
    }

    private static void printCustomEnumAnnotation(Class<?> clazz) {
        if (clazz.isAnnotationPresent(CustomEnumAnnotation.class)) {
            CustomEnumAnnotation annotation = clazz.getAnnotation(CustomEnumAnnotation.class);
            System.out.println(String.format(OUTPUT, annotation.type(), annotation.description()));
        }
    }
}
