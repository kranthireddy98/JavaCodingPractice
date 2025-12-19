package ArraysAssignment;

import java.util.ArrayList;
import java.util.List;

public class KidsGreatestCandies {
    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;

        List<Boolean> result = kidsWithCandies(candies,extraCandies);

        System.out.println(result);

    }
   static public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
    int max = maxCandies(candies);
    List<Boolean> rest = new ArrayList<>();

        for (int i =0;i<candies.length;i++)
    {
        rest.add((candies[i] + extraCandies) >= max);

    }
        return rest;
}

static public int maxCandies(int[] candies)
{
    int max = Integer.MIN_VALUE;

    for(int candy : candies)
    {
        max=Math.max(max,candy);
    }

    return max;
}
}
