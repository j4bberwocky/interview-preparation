package it.j4bberwocky.leetcode;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MyHashMapTest {
    
    private static Map<String, Method> instanceMethods;
    private MyHashMap instance;

    @BeforeAll
    static void methodsSetUp() {
        instanceMethods = Arrays
            .stream(MyHashMap.class.getDeclaredMethods())
            .collect(Collectors.toMap(Method::getName, Function.identity()));
    }

    @BeforeEach
    void instanceSetUp() {
        instance = new MyHashMap();
    }

    private Integer[] output(String[] inputMethods, int[][] inputParam) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Integer[] output = new Integer[inputMethods.length];
        for (int i = 0; i < inputMethods.length; i++) {
            Method method = instanceMethods.get(inputMethods[i]);
            if (method.getName().equals("put")) {
                System.out.println("put(" + inputParam[i][0] + ", " + inputParam[i][1] + ")");
                method.invoke(instance, inputParam[i][0], inputParam[i][1]);
            } else if (method.getName().equals("remove")) {
                System.out.println("remove(" + inputParam[i][0] + ")");
                method.invoke(instance, inputParam[i][0]);
            } else { // get
                System.out.println("get(" + inputParam[i][0] + ")");
                output[i] =  (Integer) method.invoke(instance, inputParam[i][0]);
            }
        }
        return output;
    }

    @Test
    void test1() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        String[] inputMethods = {"put", "put", "get", "get", "put", "get", "remove", "get"};
        int[][] inputParam = { {1, 1}, {2, 2}, {1}, {3}, {2, 1}, {2}, {2}, {2}}; 
        Integer[] expected = {null, null, 1, -1, null, 1, null, -1};
        Integer[] output = output(inputMethods, inputParam);
        assertArrayEquals(expected, output);
    }

}
