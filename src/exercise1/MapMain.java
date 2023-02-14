package exercise1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapMain {
    public static void main(String[] args) {
        Map<String, Integer> studentGradeMap = new HashMap<>();
        studentGradeMap.put("Ealhstan Saira", 8);
        studentGradeMap.put("Gasparo Sava", 7);
        studentGradeMap.put("Demetria Cosme", 4);
        studentGradeMap.put("Majken Olgica", 10);
        studentGradeMap.put("Miriana Rómulo", 10);

        MapUtils.printMap(studentGradeMap);
        System.out.println("Students with highest grade are: " + MapUtils.findHighestGrade(studentGradeMap));

    }
}
