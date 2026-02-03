## Sliding Window --- Hashing 

## The core question Hashing answers

whenever we use a sliding window, we must answer questions like:

What is currently inside my window?

Hashing gives instant answer to questions that would take O(window size) time

Without hashing -> siding window collapses back into O(n^2)

### Types of questions Hashing Solves in sliding window
**Use Case 1: Existence / Duplicate Checking**

Problem type:
* Longest substring without repeating characters
* Check if window has duplicates

Why Hashing?

If you don't hash:
* To check duplicates -> scan window -> O(n)

with Hashing:
``` 
freq[c] > 1   // duplicate detected in O(1)
```
Hashing answers:
* Is this element inside my window?

**Use case 2: Frequency Constraints**

problem type
* Longest substring with at most k occurrences
* Replace at most `k` characters
* Anagrams in a string

Window is valid if no character appears more than `k` times
``` 
if (freq[c] > k) {
    // window invalid
}
```

Hashing answers:

how many times does this element appear in the window?

**Use Case 3: Distinct Count Tracking**

Problem Type
* Longest substring with K unique characters
* Subarrays with exactly K distinct integers

Without Hashing

Count Distinct -> Scan window -> O(n)

With Hashing:
``` 
if (freq[c] == 1) distinct++;
if (freq[c] == 0) distinct--;
```
Hashing answers:
* How many distinct elements are in the window?

**Use Case 4: Pattern matching**

Problem type
* find all anagrams of a pattern in a string

Trick
* Maintain frequency map of pattern
* Maintain frequency map of window
* Compare maps

Efficiently done using hashing + counters

Hashing answers:

Does my window match a required frequency pattern?

### Hashing turns Window Validation into 0(1)

Without Hashing 
``` 
Every time window moves →
Scan entire window →
Check condition →
O(n) per step
```

With Hashing
```
Add one element →
Update map →
Remove one element →
Update map →
Check condition in O(1)
```
This is why sliding window is O(n), not magic

### Sliding window + hashing = stateful window
Think of window having memory

| Action              | Hashing Effect          |
| ------------------- | ----------------------- |
| Expand window (R++) | Add element to map      |
| Shrink window (L++) | Remove element from map |
| Validate window     | Read counters           |

### Mental Model 
Window = container + Dashboard

* Window -> elements between L and J
* HashMap -> dashboard showing:
  * Frequencies
  * Distinct count
  * Violations

You don't look inside the container every time.

You just look at the dashboard

### Common Hashing Structure Used

| Data              | Best Structure                |
| ----------------- | ----------------------------- |
| Lowercase letters | `int[26]`                     |
| ASCII characters  | `int[128]`                    |
| Unicode           | `HashMap<Character, Integer>` |
| Integers          | `HashMap<Integer, Integer>`   |

prefer array to maps when possible


### When hashing not needed
Fixed size window with simple/max/min

Example:
* maximum sum of `k`consecutive elements

Here :
* No duplicates
* No uniqueness constraints
* No frequency tracking

**Hashing is optional**






1. Why does sliding window become O(n²) without hashing? 
2. What exactly do we update in the hash map when:
   * Right pointer moves? 
   * Left pointer moves?
3. Can sliding window work without hashing in some problems? When?




















