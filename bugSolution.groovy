```groovy
def myMethod(List<String> strings) {
  strings.collect { it.toUpperCase() } //Creates a new list
}

List<String> myList = ['apple', 'banana', 'cherry']
println myMethod(myList) //Prints [APPLE, BANANA, CHERRY]
println myList //Prints the original list: [apple, banana, cherry]
```