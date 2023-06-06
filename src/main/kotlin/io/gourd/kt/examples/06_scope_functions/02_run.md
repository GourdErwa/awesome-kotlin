# run

Like [`let`](01_let), `run` is another scoping function from the standard library. Basically, it does the same: executes
a code block and returns its result.
The difference is that inside `run` the object is accessed by `this`. This is useful when you want to call the object's
methods rather than pass it as an argument.

与 `let` 一样，`run` 是标准库中的另一个范围函数。基本上，它做同样的事情：执行一个代码块并返回其结果。
不同之处在于，在 `run` 中，对象由 `this` 访问。当您想要调用对象的方法而不是将其作为参数传递时，这很有用。

```kotlin

fun main() {
//sampleStart
    fun getNullableLength(ns: String?) {
        println("for \"$ns\":")
        ns?.run {                                                  // 1
            println("\tis empty? " + isEmpty())                    // 2
            println("\tlength = $length")                           
            length                                                 // 3
        }
    }
    getNullableLength(null)
    getNullableLength("")
    getNullableLength("some string with Kotlin")
//sampleEnd
}
```

1. Calls the given block on a nullable variable.
2. Inside `run`, the object's members are accessed without its name.
3. `run` returns the `length` of the given `String` if it's not `null`.     
