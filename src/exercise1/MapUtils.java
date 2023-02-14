package exercise1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MapUtils {

    public static void printMap(Map<String, Integer> mapToPrint) {
        Set<Map.Entry<String, Integer>> entries = mapToPrint.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey() + " has a grade of " + entry.getValue());
        }
    }

    public static List<String> findHighestGrade(Map<String, Integer> mapToPrint) {
        List<String> results = new ArrayList<>();
        int highestGrade = 0;

        Set<Map.Entry<String, Integer>> entries = mapToPrint.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            if (entry.getValue() > highestGrade) {
                highestGrade = entry.getValue();
                results.clear();
                results.add(entry.getKey());
            } else if (entry.getValue() == highestGrade) {
                results.add(entry.getKey());
            }
        }
        return results;
    }
}
