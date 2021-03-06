package api.example;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertTrue;

public class Example1 {

    @Test
    @SuppressWarnings("ForLoopReplaceableByForEach")
    public void foriLoop() {
        List<String> list = new LinkedList<>(Arrays.asList("1", "2", "3"));

        for (int i = 0; i < list.size(); ++i) {
            assertTrue(list.get(i).length() < 2);
        }
    }

    @Test
    public void foreachLoop() {
        Iterable<String> list = new LinkedList<>(Arrays.asList("1", "2", "3"));

        for (String element : list) {
            assertTrue(element.length() < 2);
        }
    }

    @Test
    public void foreachMethod() {
        Iterable<String> list = new LinkedList<>(Arrays.asList("1", "2", "3"));

        list.forEach(element -> assertTrue(element.length() < 2));
    }
}
