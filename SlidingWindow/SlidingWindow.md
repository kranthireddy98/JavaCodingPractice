
### Keywords:

“longest”

“substring”

“no repeating”

“contiguous”

```
int left = 0, result = 0;
for (int right = 0; right < n; right++) {
    // 1. Add right element to current window state (sum, frequency, etc.)
    
    while (/* condition is invalid OR condition is met and seeking minimum */) {
        // 2. Update result (if looking for minimum)
        // 3. Remove left element from window state
        // 4. left++
    }
    
    // 5. Update result (if looking for maximum)
}
```