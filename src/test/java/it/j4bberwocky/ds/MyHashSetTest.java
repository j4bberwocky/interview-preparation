package it.j4bberwocky.ds;

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

class MyHashSetTest {
    
    private static Map<String, Method> instanceMethods;
    private MyHashSet instance;

    @BeforeEach
    void instanceSetUp() {
        instance = new MyHashSet();
    }

    @BeforeAll
    static void methodsSetUp() {
        instanceMethods = Arrays
            .stream(MyHashSet.class.getDeclaredMethods())
            .collect(Collectors.toMap(Method::getName, Function.identity()));
    }

    private Boolean[] output(String[] inputMethods, int[] inputParam) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Boolean[] output = new Boolean[inputMethods.length];
        for (int i = 0; i < inputMethods.length; i++) {
            Method method = instanceMethods.get(inputMethods[i]);
            Class<?>[] parameterTypes = method.getParameterTypes();
            if (parameterTypes.length == 0) {
                method.invoke(instance);
            } else {
                output[i] = (Boolean) method.invoke(instance, inputParam[i]);
            }
        }
        return output;
    }

    @Test
    void test1() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        String[] inputMethods = {"add", "add", "contains", "contains", "add", "contains", "remove", "contains"};
        int[] inputParam = {1, 1000000, 1, 3, 2, 2, 2, 2}; 
        Boolean[] expected = {null, null, true, false, null, true, null, false};
        Boolean[] output = output(inputMethods, inputParam);
        assertArrayEquals(expected, output);
    }

    @Test
    void test2() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        String[] inputMethods = {"add", "add", "contains", "contains", "add", "contains", "remove", "contains"};
        int[] inputParam = {1, 2, 1, 3, 2, 2, 2, 2}; 
        Boolean[] expected = {null, null, true, false, null, true, null, false};
        Boolean[] output = output(inputMethods, inputParam);
        assertArrayEquals(expected, output);
    }

    @Test
    void test3() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        String[] inputMethods = {"remove","add","contains","add","contains","add","add","add","add","contains","remove","contains","contains","contains","add","contains","add","remove","add","add","remove","contains","add","contains","add","add","add","add","remove","add","remove","add","remove","contains","contains","add","add","add","add","add","contains","remove","add","add","add","contains","contains","add","add","contains","remove","add","contains","add","remove","remove","add","contains","add","add","add","add","add","remove","add","add","contains","contains","contains","add","add","contains","contains","add","add","add","contains","contains","add","add","remove","add","add","contains","add","remove","add","contains","contains","remove","remove","add","contains","remove","contains","add","add","contains","add","add"};
        int[] inputParam = {28,82,82,15,82,33,7,93,61,93,15,33,6,15,7,15,89,66,16,7,81,89,98,98,40,88,29,81,17,83,33,44,22,82,82,8,63,13,19,89,41,67,37,17,57,41,30,23,82,23,51,80,81,15,95,45,49,93,7,45,86,74,85,69,7,2,13,92,3,40,32,29,74,37,66,14,91,82,99,84,87,56,49,85,34,32,38,76,34,19,81,83,30,15,41,42,5,19,26,33}; 
        Boolean[] expected = {null,null,true,null,true,null,null,null,null,true,null,true,false,false,null,false,null,null,null,null,null,true,null,true,null,null,null,null,null,null,null,null,null,true,true,null,null,null,null,null,false,null,null,null,null,false,false,null,null,true,null,null,true,null,null,null,null,true,null,null,null,null,null,null,null,null,true,false,false,null,null,true,true,null,null,null,false,true,null,null,null,null,null,true,null,null,null,false,true,null,null,null,false,null,false,null,null,false,null,null};
        Boolean[] output = output(inputMethods, inputParam);
        assertArrayEquals(expected, output);
    }
}
