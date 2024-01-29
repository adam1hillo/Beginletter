import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {



    public static void main(String[] args) {

        String[] woorden = { "een", "twee", "drie",
                "vier", "vijf", "zes", "zeven", "acht", "negen", "tien" };

        Map<Character, Integer> woordenPerChar = new HashMap<>();

        for (String woord : woorden) {
            if (!woordenPerChar.containsKey(woord.charAt(0))) {
                woordenPerChar.put(woord.charAt(0), 1);
            } else {
                woordenPerChar.put(woord.charAt(0), woordenPerChar.get(woord.charAt(0))+1);
            }
        }

        System.out.println("\n*** Woorden per letter ***");
        System.out.println(woordenPerChar);
        System.out.println("Grotte van de HashMap is " + woordenPerChar.size());

        System.out.println("Is de HashMap leeg? " + woordenPerChar.isEmpty());

        System.out.println("\n*** Alle keys van de HashMap ***");
        for (Character c : woordenPerChar.keySet()) {
            System.out.println(c);
        }
        System.out.println("\n*** Alle values van de HashMap ***");
        for (Integer value : woordenPerChar.values()) {
            System.out.println(value);
        }
        System.out.println("\n*** Alle entries van de HashMap ***");
        for (Map.Entry<Character, Integer> characterIntegerEntry : woordenPerChar.entrySet()) {
            System.out.println(characterIntegerEntry);
            System.out.println(characterIntegerEntry.getKey() + " : " + characterIntegerEntry.getValue());
        }
    }
}
