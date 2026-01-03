package ArraysAssignment;

import java.util.Map;
import java.util.TreeMap;

public class MaxPopulation {
    public static void main(String[] args) {
    int [][] logs = {{1950,1961},{1960,1971},{1970,1981}};
        System.out.println( maximumPopulation(logs));
        System.out.println( maximumPopulationTre(logs));
    }

    public static int maximumPopulationTre(int[][] logs) {
        // TreeMap keeps the years sorted automatically
        TreeMap<Integer, Integer> map = new TreeMap<>();

        for (int[] log : logs) {
            int birth = log[0];
            int death = log[1];

            // Add 1 to population at birth year
            map.put(birth, map.getOrDefault(birth, 0) + 1);
            // Subtract 1 from population at death year
            map.put(death, map.getOrDefault(death, 0) - 1);
        }

        int maxPop = 0;
        int currentPop = 0;
        int maxYear = 0;

        // Iterate through the sorted map entries
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int year = entry.getKey();
            int change = entry.getValue();

            currentPop += change;

            // We want the EARLIEST year with max population
            if (currentPop > maxPop) {
                maxPop = currentPop;
                maxYear = year;
            }
        }

        return maxYear;
    }
    public static int maximumPopulation(int[][] logs) {
        // Range is 1950 to 2050
        int[] years = new int[101];

        // 1. Mark the changes
        for(int[] person : logs)
        {
            years[person[0] -1950] ++;
            years[person[1] -1950]--;
        }

        // 2. Find the max population using prefix sum
        int maxyear= 1950;
        int current = 0;
        int max = 0;
        for(int i =1950;i<2050;i++)
        {
            current += years[i-1950];
            if(current>max)
            {
                max =current;
                maxyear = i;
            }

        }

        return maxyear;
    }
}
