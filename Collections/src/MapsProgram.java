import java.util.HashMap;
import java.util.Map;

public class MapsProgram {

    public static void main(String[] args) {

        Map<String, String> lenguages = new HashMap<>();

        if (lenguages.containsKey("JAVA")) {
            System.out.println("Java already exist");
        }else {
            lenguages.put("JAVA", "I am java");
        }
        lenguages.put("PYTHON", "I am python");
        lenguages.put("ALGOL", "I am algol");

        System.out.println(lenguages.put("BASI", "I am basi"));
        System.out.println(lenguages.put("LIPS", "I am Lips"));
        System.out.println("===============================================================");
        for (String key: lenguages.keySet()) {
            System.out.println(key + ": " + lenguages.get(key));
        }
        lenguages.put("JAVA", "I am javfds");
        System.out.println("===============================================================");
        for (String key: lenguages.keySet()) {
            System.out.println(key + ": " + lenguages.get(key));
        }
        if (lenguages.containsKey("JAVA")) {
            System.out.println("Java already exist");
        }else {
            lenguages.put("JAVA", "I am java");
        }

        System.out.println("===============================================================");

        System.out.println(lenguages.remove("BASI"));

        for (String key: lenguages.keySet()) {
            System.out.println(key + ": " + lenguages.get(key));
        }



    }
}
