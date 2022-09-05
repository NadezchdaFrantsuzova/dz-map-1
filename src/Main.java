import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < text.length(); i++) {
            char charText = text.charAt(i);

            if (Character.isLetter(charText)) {
                if (!map.containsKey(charText)) {
                    map.put(charText, 1);
                } else {
                    int count = map.get(charText);
                    map.put(charText, ++count);
                }
            }
        }
        maxCount(map);
        minCount(map);
    }

    public static void maxCount(Map<Character, Integer> map) {
        int intMaxCount = -1;
        char result = 0;
        for (Map.Entry<Character, Integer> max : map.entrySet()) {
            if (intMaxCount < max.getValue()) {
                result = max.getKey();
                intMaxCount = max.getValue();
            }
        }
        System.out.println("Чаще всего встречается буква: " + result + " - " + intMaxCount + " раз(а).");
    }

    public static void minCount(Map<Character, Integer> map) {
        int intMinCount = Integer.MAX_VALUE;
        char result = 0;
        for (Map.Entry<Character, Integer> min : map.entrySet()) {
            if (intMinCount > min.getValue()) {
                result = min.getKey();
                intMinCount = min.getValue();
            }
        }
        System.out.println("Реже всего встречается буква: " + result + " - " + intMinCount + " раз(а).");
    }

    public static String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit," +
            " sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. " +
            "Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi" +
            " ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit" +
            " in voluptate velit esse cillum dolore eu fugiat nulla pariatur." +
            " Excepteur sint occaecat cupidatat non proident, sunt in culpa qui " +
            "officia deserunt mollit anim id est laborum.";
}