package pl.sda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> lista = Arrays.asList("Ala ma kota", "Samochód", "Kleszcz", "Lego są fajne");
        System.out.println(lista);
//        lista.sort(new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.compareToIgnoreCase(o2);
//            }
//        });

        lista.sort((o1, o2) -> o1.compareToIgnoreCase(o2));
        System.out.println(lista);

        //lista.sort();

    }
}
