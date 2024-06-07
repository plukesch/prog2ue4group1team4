package at.ac.fhcampuswien.fhmdb;

import javafx.util.Callback;
import java.util.HashMap;
import java.util.Map;

public class ControllerFactory implements Callback<Class<?>, Object> {
    private final Map<Class<?>, Object> instances = new HashMap<>();

    @Override
    public Object call(Class<?> type) {
        return instances.computeIfAbsent(type, k -> {
            try {
                return type.getDeclaredConstructor().newInstance();
            } catch (Exception e) {
                throw new RuntimeException("Controller kann nicht instanziiert werden", e);
            }
        });
    }
}
