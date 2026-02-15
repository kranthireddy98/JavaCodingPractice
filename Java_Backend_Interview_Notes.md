# Java Backend Interview Preparation Notes

------------------------------------------------------------------------

## 1. How does HashMap work internally?

### Core Idea

HashMap uses an internal array of buckets. Each bucket stores entries
based on hashCode.

### Steps

1.  hashCode() generates hash
2.  Bucket index calculated
3.  If collision → linked list or tree (Java 8+)
4.  equals() checks logical equality

### Complexity

-   get/put → O(1) average
-   Resize → O(n)

------------------------------------------------------------------------

## 2. HashMap vs ConcurrentHashMap

  Feature       HashMap                ConcurrentHashMap
  ------------- ---------------------- --------------------------
  Thread-safe   No                     Yes
  Locking       None                   Fine-grained
  Null key      1 allowed              Not allowed
  Performance   Fast (single thread)   Scales under concurrency

------------------------------------------------------------------------

## 3. Why String is Immutable?

Reasons: - Security - String Pool - Thread safety - Reliable hashing

Example:

``` java
String s = "Hello";
s.concat("World"); // Creates new object
```

------------------------------------------------------------------------

## 4. What happens if two threads modify HashMap?

-   Data corruption
-   Infinite loop during resize (older versions)
-   Inconsistent reads

Solution → Use ConcurrentHashMap

------------------------------------------------------------------------

## 5. equals() and hashCode() contract

Rules: - If equals() returns true → hashCode must be same - Consistent -
Reflexive, symmetric, transitive

Example:

``` java
@Override
public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof User)) return false;
    User user = (User) o;
    return id == user.id;
}

@Override
public int hashCode() {
    return Objects.hash(id);
}
```

------------------------------------------------------------------------

## 6. JVM Memory Model

Memory Areas: - Heap (objects) - Stack (method calls) - Metaspace (class
metadata) - PC Register - Native Stack

------------------------------------------------------------------------

## 7. Stack vs Heap

  Stack             Heap
  ----------------- ------------
  Method calls      Objects
  Thread-specific   Shared
  Fast              GC managed

------------------------------------------------------------------------

## 8. Garbage Collection

-   Removes unreachable objects
-   Generational model (Young & Old)
-   Minor, Major, Full GC

------------------------------------------------------------------------

## 9. volatile keyword

Guarantees: - Visibility - Ordering

Does NOT guarantee: - Atomicity

Example:

``` java
volatile boolean running = true;
```

------------------------------------------------------------------------

## 10. Can we override static method?

No. Static methods are hidden, not overridden.

------------------------------------------------------------------------

## 11. synchronized vs Lock

  synchronized   Lock
  -------------- ------------------
  Automatic      Manual
  Simple         Flexible
  No timeout     Supports timeout

------------------------------------------------------------------------

## 12. ThreadPoolExecutor working

Execution Flow: 1. Use core threads 2. Queue tasks 3. Expand to max
threads 4. Apply rejection policy

------------------------------------------------------------------------

## 13. Deadlock & Prevention

Conditions: - Mutual exclusion - Hold and wait - No preemption -
Circular wait

Prevention: - Lock ordering - Timeout locks - Avoid nested locks

------------------------------------------------------------------------

## 14. Debug deadlock in production

Steps: 1. Identify hang 2. Take thread dump (jstack) 3. Look for
circular wait 4. Fix lock ordering

------------------------------------------------------------------------

## 15. Callable vs Runnable

  Runnable               Callable
  ---------------------- ---------------
  No return              Returns value
  No checked exception   Can throw

------------------------------------------------------------------------

## 16. CompletableFuture

Features: - Async execution - Chaining (thenApply, thenCompose) -
Combining tasks - Exception handling

Example:

``` java
CompletableFuture.supplyAsync(() -> "Hello")
    .thenApply(s -> s + " World");
```

------------------------------------------------------------------------

## 17. What happens when thread pool queue is full?

-   Task rejected
-   Rejection policy applied
-   Protects system from overload

------------------------------------------------------------------------

## 18. Parallel Stream vs Executor

  Parallel Stream      Executor
  -------------------- -------------------
  Less control         Full control
  Shared pool          Custom pool
  Good for CPU tasks   Good for IO tasks

------------------------------------------------------------------------

## 19. How ConcurrentHashMap achieves thread safety

-   Fine-grained locking
-   Lock-free reads
-   CAS operations

------------------------------------------------------------------------

## 20. Happens-before relationship

Guarantees visibility & ordering between threads.

------------------------------------------------------------------------

## 21. Can thread pool cause memory leak?

Yes, due to: - ThreadLocal misuse - Unbounded queue - Not shutting down
executor

------------------------------------------------------------------------

## 22. ArrayList vs LinkedList

  ArrayList               LinkedList
  ----------------------- ----------------------
  Dynamic array           Doubly linked list
  O(1) access             O(n) access
  Better cache locality   More memory overhead

------------------------------------------------------------------------

## 23. TreeMap vs HashMap

  HashMap      TreeMap
  ------------ ----------------
  O(1)         O(log n)
  No order     Sorted
  Hash table   Red-Black tree

------------------------------------------------------------------------

## 24. LRU Cache

Uses: - HashMap - Doubly linked list

Evicts least recently used item.

------------------------------------------------------------------------

## 25. HashMap resizing

-   Capacity doubles
-   All entries rehashed
-   O(n) operation

------------------------------------------------------------------------

## 26. Fail-fast vs Fail-safe iterator

  Fail-fast          Fail-safe
  ------------------ -------------------
  Throws exception   Works on snapshot
  ArrayList          ConcurrentHashMap

------------------------------------------------------------------------

## 27. CopyOnWriteArrayList

-   Copies array on write
-   Lock-free reads
-   Good for read-heavy systems

------------------------------------------------------------------------

## 28. Why Set doesn't allow duplicates

Uses: - hashCode() - equals()

Internally backed by HashMap (in HashSet).

------------------------------------------------------------------------

# End of Notes
