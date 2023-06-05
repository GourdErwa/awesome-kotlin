package io.gourd.kt.lang

/**
 * @author Li.Wei by 2023/6/5
 */
object ObjectExpression {
    fun rentPrice(standardDays: Int, festivityDays: Int, specialDays: Int) { // 1

        val dayRates = object { // 该处会编译出一个内部类替代，相当于 java 匿名类
            var standard: Int = 30 * standardDays
            var festivity: Int = 50 * festivityDays
            var special: Int = 100 * specialDays
        }

        val total = dayRates.standard + dayRates.festivity + dayRates.special // 3

        println("Total price: $$total") // 4
    }
}

fun main() {
    ObjectExpression.rentPrice(100, 2, 1) // 5
}
