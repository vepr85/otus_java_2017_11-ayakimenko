package ru.otus.hw8.ajson.wrapper;

import ru.otus.hw8.ajson.strategy.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by abyakimenko on 27.01.2018.
 */
public class ProcessorFactory {

    private static final List<FieldJsonStrategy> processors = new ArrayList<>();

    private ProcessorFactory() {
    }

    static {
        processors.add(new NullJsonStrategy());
        processors.add(new NumericJsonStrategy());
        processors.add(new BooleanJsonStrategy());
        processors.add(new StringJsonStrategy());
        processors.add(new CharacterJsonStrategy());
        processors.add(new ArrayJsonStrategy());
        processors.add(new IterableJsonStrategy());
        processors.add(new ObjectJsonStrategy());
    }

    public static List<FieldJsonStrategy> getProcessors() {
        return processors;
    }
}
