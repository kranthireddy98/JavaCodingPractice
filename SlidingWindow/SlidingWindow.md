## Sliding Window

### Prerequisites
Before we even say the words "Sliding window', you must be rock-solid oon three ideas.

**1. Time Complexity**
* The Brute Force Habit
```
for(in ti =0; i<n; i++){
    for (j =i; j<n;j++){
        
        }
        }
```
Time Complexity:
* Outer Loop -> n
* Inner Loop -> upto n
* Total -> O(n^2)

This works for:
* n ==1,000 maybe okay
* n = 100,000 -> TLE

**The Core Optimization Goal**

Try to touch each element as few times as possible (ideally once).

That's how we move from:
* O(n^2) to O(n)

Sliding window is one of the most powerful tool to achieve this.

**2. Two Pointers (The Physical Movement)**

Think of two fingers on an Array

You place:
* Left pointer (L) -> start of the range
* Right pointer (R) -> end of range

You move them forward, never backward.

``` 
Index:  0  1  2  3  4  5
Array: [2, 1, 5, 1, 3, 2]
         L        R
```
Key Rules:
* `L` and `R` only move forward
* Each pointer moves at most `n` times
* Total operations -> O(n)

**_This "No backward movement" rule is what enables sliding window._**

**3. Hashing/Frequency Maps (Tracking What's inside the window)**

When the window needs conditions, we must track elements.

Examples:
* count characters in a substring
* Track how many distinct elements
* Check duplicates

Example: Frequency Map

```java
import java.util.HashMap;
import java.util.Map;

Map<character, Integer> frq = new HashMap<>();

freq.put('a',freq.getOrDefault('a',0) +1);

```

This lets us answer questions about the current window in O(1):
* How many unique characters?
* Is there a duplicate?
* Does Frequency exceed k?

without hashing, sliding window breaks for many problems

**4. Sliding window == moving magnifying Glass**

Imagine:
* you have a magnifying glass
* it shows a contiguous portion of the array
* You slide it forward, not pick it up and restart

``` 
Array:     [2, 1, 5, 1, 3, 2]
Window:        [1, 5, 1]
```
You reuse previous work instead of recalculating from scratch.

This is the heart of why:
* Nested loops -- Redo work
* Sliding window -- reuse work

Summary :  

| Concept         | Why It Matters                 |
| --------------- | ------------------------------ |
| Time Complexity | Motivation to avoid O(n²)      |
| Two Pointers    | Controlled forward movement    |
| Hashing         | Track window state efficiently |
| Mental Model    | Intuition for sliding          |




## Theoretical Foundation
Why Sliding window Works (O(n^2)) -> O(n)

### The core Problem with nested Loops
```java
for (int i = 0; i < n; i++) {
    for (int j = i; j < n; j++) {
        // process subarray [i...j]
    }
}
```
What's Happening?
* For `i  =0 ` you process
  * `[0..0,[0..1],[0..2],...,[0..n-1]`
* For `i = 1`
  * `[1..1],[1..2],[1..3],...,[1..n-1]`

Notice:
* Subarrays like `[1..3]` are computed from scratch, even though they overlap heavily with `[0.3]`

### The Key Insight 

Subarray overlap

So why are we recomputing overlapping work?

If two subarrays differ by only one element, we should:
* Add one element 
* Remove one element
* Not recompute everything

This single idea gives birth to sliding window.

### Sliding Window = Reuse + Adjustment

instead of:
* Recalculating everything for each new subarray

We say:
* Adjust the previous answer slightly

That's the shift from:
* Recomputation to Incremental update

### Pointer-Based Interpretation
Let's define:
* `L` = left boundary
* `R` = right boundary

At any time:
``` 
window = elements from L to R (inclusive)
```
How the window Moves
* Move `R` -> expand the window
* Move `L` -> shrink the window

Critical Rule:
* `L` and `R` never move backward.


### Why time complexity Becomes O(n)
Count Pointer Movements 
* `R` moves from `0 -> n-1` -> n steps
* `L` moves from `0 -> n-1` -> n steps

Total operations:
``` 
n (right moves) + n (left moves) = 2n
```
Time : O(n)

No Matter how complex the logic inside,

pointer movement dominates the time complexity.

### Why Sliding Instead of Restarting?
Visual Analogy (Magnifying glass)

Think of  reading a book with a magnifying glass:
* brute force : pick it up, go back, reread everything
* Sliding window: Slide it forward smoothly 

### General Condition-Based View

Sliding window problems usually look like:

Find a subarray/substring such that condition X is satisfied

Examples:
* sum >= s
* At most K distinct characters
* No duplicates
* Exactly K odd numbers

Strategy
1. Expand until condition is violated
2. Shrink until condition becomes valid
3. Record answer

This expand Shrink rhythm is the heart of sliding window.

### When Sliding Window is applicable
Sliding window works only if all are true:

* Data is linear (array/string)
* We deal with contiguous subarrays/substrings
* Window can be adjusted incrementally
* Pointers move only forward

If any of these fail -> sliding window not applicable

























