

``` 
prefixSum[i] = sum of elements from 0 to i

If:
prefixSum[j] - prefixSum[i] = k
Then:
subarray (i+1 to j) sum = k

```

### Template

```java
import java.util.*;

public class PrefixSumTemplate {

    public static int solve(int[] nums, int k) {

        // Map: prefixSum -> index OR count
        Map<Integer, Integer> map = new HashMap<>();

        int prefixSum = 0;
        int result = 0;

        // IMPORTANT: base case
        map.put(0, 1); // or (0, -1) depending on problem

        for (int i = 0; i < nums.length; i++) {
            prefixSum += nums[i];

            // 1️⃣ Check condition
            if (map.containsKey(prefixSum - k)) {
                // depends on problem
            }

            // 2️⃣ Update map
            map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
        }

        return result;
    }
}

```