# Groovy Spread Operator Gotcha

This repository demonstrates a subtle but common error when using Groovy's spread operator (`*.`) with methods that modify list elements in place.  The spread operator implicitly uses the `each` method, which modifies the original list. This can be unexpected and lead to hard-to-debug errors.

## Bug
The `bug.groovy` file contains a function `myMethod` that intends to uppercase each string within the list. However, the use of `strings*.toUpperCase()` inadvertently modifies the original list. 

## Solution
The `bugSolution.groovy` file shows a corrected version using the `collect` method. `collect` creates a new list, leaving the original list unchanged.

## How to Reproduce
1. Clone this repository.
2. Run `groovy bug.groovy`. Observe the output.
3. Run `groovy bugSolution.groovy`. Observe the different output.

This demonstrates the importance of understanding the difference between `each` (in-place modification) and `collect` (new list creation) when working with Groovy lists.