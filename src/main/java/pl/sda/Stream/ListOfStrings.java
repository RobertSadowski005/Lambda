package pl.sda.Stream;

import java.util.Arrays;
import java.util.List;

public class ListOfStrings {

    public static void main(String[] args) {
        List<String> napisy = Arrays.asList("Klawisze", "Pies", "Samochód", "Kloecki lego", "Ala ma kota 11", "Jutro idę do kina 17");

        napisy.stream().sorted().forEach(t-> System.out.println(t + " " + t.length()));
    }
}
