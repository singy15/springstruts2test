package singy.springstruts2test.utils;

import java.util.List;
import java.util.Map;

public class PrintUtil {
    public static void PrintHashMap(List<Map<String, Object>> result) {
        result.forEach(row -> {
            System.out.println("---------------");
            row.forEach((columnName, value) -> {
                System.out.printf("columnName=%s, value=%s%n", columnName, value);
            });
        });
    }
}
