import java.util.HashMap;
import java.util.Map;

public class EngineFactory {

    private static final Map<String, Engine> cache = new HashMap<>();

    public static Engine getEngine(int power, Engine.Fuel fuel) {
        String key = power + "_" + fuel;

        if (!cache.containsKey(key)) {
            System.out.println("Creating new Engine: " + key);
            cache.put(key, new Engine(power, fuel));
        }

        return cache.get(key);
    }
}