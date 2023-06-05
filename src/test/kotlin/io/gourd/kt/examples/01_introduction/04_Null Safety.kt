package io.gourd.kt.examples.`01_introduction`

import org.junit.jupiter.api.Test

/**
 * @author Li.Wei by 2023/6/5
 */
class `04_Null Safety` {

    @Test
    fun `null safety`() {
        var neverNull: String = "This can't be null" // 1

        //neverNull = null.toString() // 2

        var nullable: String? = "You can keep a null here" // 3

        nullable = null // 4

        var inferredNonNull = "The compiler assumes non-null" // 5

        inferredNonNull = null.toString() // 6

        fun strLength(notNull: String): Int { // 7
            return notNull.length
        }

        strLength(neverNull) // 8
        nullable?.let { strLength(it) } // 9
    }
}
