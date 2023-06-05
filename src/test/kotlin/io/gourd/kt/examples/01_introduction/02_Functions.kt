package io.gourd.kt.examples.`01_introduction`

import kotlin.test.Test

class `02_Functions` {

    @Test
    fun `operator`() {
        operator fun Int.times(str: String) = str.repeat(this) // 1
        println(2 * "Bye ") // 2

        operator fun String.get(range: IntRange) = substring(range) // 3
        val str = "Always forgive your enemies; nothing annoys them so much."
        println(str[0..14]) // 4
    }

    @Test
    fun `Adding 1 and 3 should be equal to 4`() {
        fun printAll(vararg messages: String) { // 1
            for (m in messages) println(m)
        }
        printAll("Hello", "Hallo", "Salut", "Hola", "你好") // 2

        fun printAllWithPrefix(vararg messages: String, prefix: String) { // 3
            for (m in messages) println(prefix + m)
        }
        printAllWithPrefix(
            "Hello",
            "Hallo",
            "Salut",
            "Hola",
            "你好",
            prefix = "Greeting: " // 4
        )

        fun log(vararg entries: String) {
            printAll(*entries) // 5
        }
        log("Hello", "Hallo", "Salut", "Hola", "你好")
    }
}
