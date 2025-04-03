package io.gourd.kt.lang

/**
 * Java record
 *
 * @author Li.Wei by 2023/6/2
 */
data class EmployeeRecord(
    val firstName: String,
    val surname: String,
    val age: Int,
    val address: AddressRecord,
    val salary: Double,
)

data class AddressRecord(
    val firstLine: String = "DEFAULT_ZG",
    val secondLine: String = "DEFAULT_SD",
    val postCode: String,
)

fun main() {
    println(AddressRecord(secondLine = "JN", postCode = "100000"))
    println(AddressRecord(firstLine = "SD", secondLine = "JN", postCode = "100000"))
    println(AddressRecord(secondLine = "JN", postCode = "100000"))
    // println(AddressRecord(postCode = "100000"))

    // 析构
    val (firstLine, secondLine, postCode) = AddressRecord(firstLine = "SD", secondLine = "JN", postCode = "100000")
    println("$firstLine $secondLine $postCode")
}
