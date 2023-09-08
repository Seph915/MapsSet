import java.util.*;

public class Main {
    public static void main(String[] args) {

        Map<String, Integer> months = new LinkedHashMap<>();
        months.put("Gennaio", 1);
        months.put("Febbraio", 2);
        months.put("Marzo", 3);
        months.put("Aprile", 4);
        months.put("Maggio", 5);
        months.put("Giugno", 6);
        months.put("Luglio", 7);
        months.put("Agosto", 8);
        months.put("Settembre", 9);
        months.put("Ottobre", 10);
        months.put("Novembre", 11);
        months.put("Dicembre", 12);

        for (String month : months.keySet()) {
            System.out.println(month);
        }

        List<Integer> cardinalMonth = new ArrayList<>();
        cardinalMonth.addAll(months.values());
        System.out.println(cardinalMonth);

        Integer[] cardinalMonthArray = months.values().toArray(new Integer[0]);
        System.out.println(Arrays.toString(cardinalMonthArray));
    }
}
