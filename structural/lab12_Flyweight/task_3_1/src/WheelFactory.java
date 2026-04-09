import java.util.HashMap;
import java.util.Map;

public class WheelFactory {

    private static final Map<String, Wheel> cache = new HashMap<>();

    public static Wheel getWheel(int diameter) {
        String key = String.valueOf(diameter);

        if (!cache.containsKey(key)) {
            System.out.println("Creating new Wheel: " + key);
            cache.put(key, new Wheel(diameter));
        }

        return cache.get(key);
    }
}
