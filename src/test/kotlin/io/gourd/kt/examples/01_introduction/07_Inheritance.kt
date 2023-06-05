package io.gourd.kt.examples.`01_introduction`

/**
 * @author Li.Wei by 2023/6/5
 */
class `07_Inheritance` {
    open class Tiger(private val origin: String, val age: Int) {

        constructor(origin: String) : this(origin, 1)

        fun sayHello() {
            println("A tiger from $origin says: grrhhh!")
        }
    }

    class SiberianTiger1 : Tiger("Siberia", 10) // 1
    class SiberianTiger2 : Tiger(origin = "Siberia") // 1
    class SiberianTiger3(origin: String, age: Int) : Tiger(origin, age)

    fun main() {
        val tiger: Tiger = SiberianTiger1()
        tiger.sayHello()
    }
}
