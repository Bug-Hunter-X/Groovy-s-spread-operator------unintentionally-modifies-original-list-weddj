```groovy
def myMethod(List<String> strings) {
  strings*.toUpperCase() //This line unintentionally modifies the original list
}

List<String> myList = ['apple', 'banana', 'cherry']
myMethod(myList)
println myList //Prints [APPLE, BANANA, CHERRY], not the original list
```