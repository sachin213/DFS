package agoda;

import java.util.*;

public class SortByFrequency {
    public List<Integer> frequencySort(List<Integer> nums) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }


        return nums.stream()
                .sorted(Comparator.comparingInt((Integer n) -> freqMap.get(n))
                        .thenComparing(Comparator.reverseOrder()))
                .toList();
    }

    public static void main(String[] args) {
        SortByFrequency sol = new SortByFrequency();
        List<Integer> result = sol.frequencySort(List.of(1, 1, 2, 2, 2, 3));
        System.out.println(result);
        // Output: [3, 1, 1, 2, 2, 2]
    }
}