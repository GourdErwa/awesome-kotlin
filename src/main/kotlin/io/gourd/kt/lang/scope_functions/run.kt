package io.gourd.kt.lang.scope_functions

/**
 * @author Li.Wei by 2023/6/6
 */
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
