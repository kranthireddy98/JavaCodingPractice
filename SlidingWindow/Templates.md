## Templates

Once you recognize which template a problem belongs to, the solution almost writes itself.

There are ONLY three sliding window templates you must master.

| Template                            | Window Size    | Typical Question                     |
| ----------------------------------- | -------------- | ------------------------------------ |
| **1. Fixed Size**                   | Constant (`k`) | Max / Min / Avg of k elements        |
| **2. Variable (Expand & Contract)** | Dynamic        | Smallest window satisfying condition |
| **3. Variable (Global Max)**        | Dynamic        | Longest valid window                 |

### Template 1 : Fixed Size Sliding Window

Definition

The window size is constant (`k`)

You slide it one step at a time.

Examples:

* Maximum sum of `k` consecutive elements
* Average of `k` numbers
* Maximum in every window of size `k`

