package io.gourd.kt.examples.`03_special_classes`

import org.junit.jupiter.api.Test

/**
 * @author Li.Wei by 2023/6/5
 */
class `04_Object` {

    @Test
    fun `object Expression`() {
        fun rentPrice(standardDays: Int, festivityDays: Int, specialDays: Int) { // 1

            val dayRates = object { // 2
                var standard: Int = 30 * standardDays
                var festivity: Int = 50 * festivityDays
                var special: Int = 100 * specialDays
            }

            val total = dayRates.standard + dayRates.festivity + dayRates.special // 3

            println("Total price: $$total") // 4
        }

        rentPrice(100, 2, 1) // 5
    }
}
