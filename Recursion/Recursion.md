### 1. What is recursion?

A function solving big problem by solving a smaller version of same problem.

### 2. the 2 pillars of recursion
    1. Base Case --> Stops recursion
    2. Recursive Case --> Reduces the problem each time.
### 3. Recursion Template
```
returnType solve(input) {
// 1. Base case
  if( input is smallest form)
    return answer
//2. Recursive relation
  smallerInput = reduce(input);
  result = solve(smallerInput)
// 3. post processing
return result
}
```
### Types of Recurrence relations
* Linear recurrence 
* Divide and conquer

### Recursive method 
1. Inputs
2. Return type
3. Body
4. make sure to return the result of function call if it has return type
5. 