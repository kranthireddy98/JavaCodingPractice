### What changes compared to Fixed Window?
**Fixed Window**
* Size if forced (k)
* No decision-making
* Pure arithmetic

**Variable Window (Expand & Contract)**
* Size is dynamic
* Window validity depends on a condition
* You must decide when to shrink

### Canonical Problem Type

Find the smallest subarray / substring that satisfies a condition.

Examples:
* Smallest subarray with sum>= S
* Minimum window substring
* Smallest window with all required characters

### The Core strategy

**Expand Until Valid -> Shrink to minimize**

Think like a scientist:
1. Expand window until condition becomes true
2. Try shrinking from the left while condition stays true
3. Record the smallest valid window

### Warm-up Problem

* Smallest subarray with sum >= S
``` 
Input : arr = [2,1,5,2,3,2], S = 7

Output: 2 // [5,2]
```
```java
int minLen = Integer.MAX_VALUE;

for(int i =0; i<arr.length; i++){
    int sum =0;
    for(int j = i; j<arr.length;j++){
        sum+= arr[j];
        if(sum >= S){
            minLen = max.Min(minLen,j - i + 1);
            break;
        }
        }
        }
```
* Time: O(n^2)
* Recomputes overlapping sums
* Useless for large inputs

### Sliding Window Insight
Instead of restarting j every time:
* Let right expand continuously
* Use left only when condition is satisfied

This avoids recomputation.

### Expand & Contract Template
``` 
left = 0;
right = 0;
answer = infinity

for right from 0 to n-1:
    sum += arr[right] ///EXPAND
    
    while(sum>=S): // CONDITON MET
        answer = min(answer,right-left+1)
        sum -= arr[left]  // CONTRACT
        left++
```
* While loop is mandatory
* Shrinking happens only when condition is valid

### Dry Run
``` 
arr = [2,1,5,-8,2,3,2], S = 7
```

| left | right | window  | sum | action  |
| ---- | ----- | ------- | --- | ------- |
| 0    | 0     | [2]     | 2   | expand  |
| 0    | 1     | [2,1]   | 3   | expand  |
| 0    | 2     | [2,1,5] | 8   | ✅ valid |
| 1    | 2     | [1,5]   | 6   | shrink  |
| 1    | 3     | [1,5,2] | 8   | ✅ valid |
| 2    | 3     | [5,2]   | 7   | ✅ best  |
| 3    | 3     | [2]     | 2   | invalid |

```java
public static int smallestSubarrayWithSum(int[] arr, int S) {
    int left = 0;
    int sum = 0;
    int minLen = Integer.MAX_VALUE;

    for (int right = 0; right < arr.length; right++) {
        sum += arr[right];

        while (sum >= S) {
            minLen = Math.min(minLen, right - left + 1);
            sum -= arr[left];
            left++;
        }
    }

    return minLen == Integer.MAX_VALUE ? 0 : minLen;
}
```


### Why the While Loop is CRITICAL

This is a common trap:

Using if instead of while:
* Shrinks only once
* Misses smaller valid windows

`while`:
* Shrinks as much as possible
* Guarantees minimum window

### When to USE Expand & Contract

| Keyword            | Meaning           |
| ------------------ | ----------------- |
| smallest / minimum | Expand & Contract |
| at least           | Expand & Contract |
| ≥ S                | Expand & Contract |
| contains all       | Expand & Contract |






## Variable Size Window: Global Maximum (Longest Valid Window)

### How this Template is Different

Expand & Contract 
* Goal: longest/maximum
* Shrink only when invalid

This Single difference changes everything.

### Canonical Problem Typee

Find the longest subarray / substring that satisfies a condition

Examples:
* Longest substring without repeating characters
* Longest substring with at most `k` distinct characters
* Longest subarray with sum <= k (non-negative array)

### The Core Law

Expand Greedily

Shrink only to restore validity

Update answer only when valid.

This is opposite of minimize

### Warm-Up Problem

Longest substring without repeating characters

``` 
Input : "abcabcbb"

Output : "abc"
```

### Brute Force

```java
int maxLen = 0;

for (int i = 0; i < n; i++) {
Set<Character> set = new HashSet<>();
    for (int j = i; j < n; j++) {
        if (set.contains(s.charAt(j))) break;
        set.add(s.charAt(j));
maxLen = Math.max(maxLen, j - i + 1);
    }
            }

```
* O (n^2)
* Repeated scanning
* Repeated set scanning

### Sliding Window Insight

Instead of restarting:
* Keep one window
* Track duplicates with hashing
* Shrink only when invalid

### Template
``` 
left = 0
for right from 0 to n-1:
    add s[right] to map

    while (window is invalid):
        remove s[left] from map
        left++

    answer = max(answer, right - left + 1)

```
Compare with previous template:
* While is for fixing invalidity, not minimizing
* Answer updated after validity restored

### Dry Run
``` 
s = "abcabcbb"

```
| left | right | window | valid? | max |
| ---- | ----- | ------ | ------ | --- |
| 0    | 0     | a      | ✅      | 1   |
| 0    | 1     | ab     | ✅      | 2   |
| 0    | 2     | abc    | ✅      | 3   |
| 1    | 3     | bca    | ✅      | 3   |
| 2    | 4     | cab    | ✅      | 3   |
| 3    | 5     | abc    | ✅      | 3   |
| 5    | 6     | cb     | ✅      | 3   |
| 7    | 7     | b      | ✅      | 3   |

Notice:
* Window is allowed to grow freely
* Shrinking only happens when duplicate appears

### Optimized Java Code

```java
public static int lengthOfLongestSubstring(String s) {
    Map<Character, Integer> freq = new HashMap<>();
    int left = 0, maxLen = 0;

    for (int right = 0; right < s.length(); right++) {
        char c = s.charAt(right);
        freq.put(c, freq.getOrDefault(c, 0) + 1);

        while (freq.get(c) > 1) {
            char leftChar = s.charAt(left);
            freq.put(leftChar, freq.get(leftChar) - 1);
            left++;
        }

        maxLen = Math.max(maxLen, right - left + 1);
    }
    return maxLen;
}
```
### Fixed vs Expand-Contract vs Global Max (One Table)

| Goal       | Shrink Logic  | Answer Update |
| ---------- | ------------- | ------------- |
| Fixed Size | math only     | exact size    |
| Smallest   | while valid   | during shrink |
| Longest    | while invalid | after shrink  |


### At Most K Distinct
``` 
left = 0
for right = 0 → n-1:
    add s[right]
    if freq[s[right]] == 1:
        distinctCount++

    while (distinctCount > K):
        remove s[left]
        if freq[s[left]] == 0:
            distinctCount--
        left++

    maxLen = max(maxLen, right - left + 1)

```



























