package it.j4bberwocky.codility;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TelBill {

    private final DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    public long calculate(String csv) {
        long max = 0L;
        long sum = 0L;
        try (Scanner scanner = new Scanner(new File(csv))) {
            while (scanner.hasNext()) {
                String[] data = scanner.nextLine().split(",");
                Date begin = df.parse(data[1]);
                Date end = df.parse(data[2]);
                long duration = end.getTime() - begin.getTime();
                long cost = Math.min(duration/1000L, 5L*60L)*2L + Math.max(0, duration/1000L - 5L*60L);
                max = Math.max(max, cost);
                sum += cost;
            }
        } catch (FileNotFoundException | ParseException e) {
            e.printStackTrace();
        }
        return sum - max;
    }

}