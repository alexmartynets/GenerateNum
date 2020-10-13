package test;

import java.util.List;
import java.util.TreeSet;

public class GenerateNum {
    public static String generateNum(List<Integer> numbers) {
        TreeSet<Integer> treeSet = new TreeSet<>(numbers);
        if (numbers.size() >= 2) {
            return treeSet.stream()
                    .reduce((a, b) -> Math.abs(a - b) > 1 ? Math.min(a, b) : Math.max(a, b))
                    .map(i -> i + 1)
                    .map(GenerateNum::getStringFormat)
                    .orElseGet(() -> getStringFormat(treeSet.last() + 1));
        } else if (numbers.get(0) == 1) {
            return getStringFormat(2);
        }
        return getStringFormat(1);
    }

    private static String getStringFormat(Integer result) {
        return String.format("%03d", result);
    }
}