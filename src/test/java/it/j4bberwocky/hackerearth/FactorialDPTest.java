package it.j4bberwocky.hackerearth;

import java.util.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.*;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Test;

class FactorialDPTest {

    @Test
    void test1() {

        List<String> lines = Collections.emptyList();
        String expected = "";

        try {
            lines = Files.readAllLines(Paths.get("src/test/resources/it/j4bberwocky/hackerearth/011620fe-0-input-0115ba1.txt"), StandardCharsets.UTF_8);
            expected = new String(Files.readAllBytes(Paths.get("src/test/resources/it/j4bberwocky/hackerearth/01abfff2-0-output-0115bc7.txt")));
        } catch (IOException e) {
            e.printStackTrace();
        }

        List<Long> input = lines.stream().map(Long::parseLong).collect(Collectors.toList());
        
        Long max = input.stream()
            .mapToLong(v -> v)
            .max().orElseThrow(NoSuchElementException::new);

        assertEquals(expected, FactorialDP.evaluate(input, max));
        
    }

}
